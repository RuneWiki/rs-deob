import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class24 {

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static int field330 = 0;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "Ldb;")
    public static class102 field327 = new class102(260);

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)I", line = 5)
    public static final int method131(int arg0) {
        field335++;
        return arg0 == -1287809744 ? ((class152.field2352 ? 1 : 0) << 19) + ((class43.field541 ? 1 : 0) << 16) + ((class8.field123 ? 1 : 0) << 9) + ((class322.field4989 ? 1 : 0) << 7) + ((class245.field3863 ? 1 : 0) << 6) + ((class297.field4695 ? 1 : 0) << 5) + ((class273.field4410 ? 1 : 0) << 4) + ((class14.field157 ? 1 : 0) << 3) + ((class149.field2311 & 0x7) - -((class42.field535 ? 1 : 0) << 8)) - (-((class180.field2984 ? 1 : 0) << 10) - (class18.field250 & 0x3 << 11) + -((class322.field4994 ? 1 : 0) << 13) - ((class245.field3872 ? 1 : 0) << 15) - ((class105.field1537 << 17) + (((class261.field4169 == 0 ? 0 : 1) << 20) + ((class210.field3447 == 0 ? 0 : 1) << 21) - (-((class174.field2883 == 0 ? 0 : 1) << 22) - (class294.method2104() << 23))))) : 113;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V", line = 26)
    public static final void method132(byte arg0) {
        field328++;
        for (int var1 = 0; var1 < 5; var1++) {
            class204.field3335[var1] = false;
        }
        class178.field2961 = -1;
        if (arg0 >= -26) {
            field327 = (class102) null;
        }
        class81.field1127 = 0;
        class31.field423 = 5;
        class150.field2326 = 0;
        class233.field3743 = -1;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V", line = 60)
    public static void method133(int arg0) {
        if (arg0 != 15902) {
            method134(29, 30);
        }
        field327 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)I", line = 94)
    public static final int method134(int arg0, int arg1) {
        int var2 = (arg0 >>> 1 & arg1) + (arg0 & 0x55555555);
        int var3 = ((var2 & 0xCCCCCCCE) >>> 2) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        field326++;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)V", line = 108)
    public static final void method135(int arg0) {
        if (arg0 == -1) {
            class179.method1343(0, 0, arg0 - 2);
            field332++;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I[BII)I", line = 137)
    public static final int method136(int arg0, byte[] arg1, int arg2, int arg3) {
        field331++;
        if (arg2 != 128) {
            field334 = -91;
        }
        int var4 = -1;
        for (int var5 = arg0; var5 < arg3; var5++) {
            var4 = var4 >>> 8 ^ class135.field2149[(var4 ^ arg1[var5]) & 0xFF];
        }
        return ~var4;
    }
}
