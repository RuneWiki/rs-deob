import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class138 {

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "Z")
    public boolean field2198 = false;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
    public static int field2204 = 128;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "Lrm;")
    public static class184 field2203 = new class184(4);

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public int field2201;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public int field2202;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "I")
    public int field2207;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "J")
    public long field2200;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "Lgh;")
    public class248 field2205;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "Lug;")
    public static class253 field2208;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)Luj;", line = 5)
    public static final class169 method1028(int arg0) {
        field2209++;
        int var1 = class81.field1103[0] * class213.field3355[0];
        byte[] var2 = class207.field3298[0];
        int[] var3 = new int[var1];
        int var4 = 113 / ((arg0 + 75) / 46);
        for (int var5 = 0; var5 < var1; var5++) {
            var3[var5] = class81.field1101[class333.method2319(var2[var5], 255)];
        }
        class169 var6;
        if (class109.field1458) {
            var6 = new class239(class243.field3796, class126.field1825, class119.field1659[0], class206.field3261[0], class213.field3355[0], class81.field1103[0], var3);
        } else {
            var6 = new class190(class243.field3796, class126.field1825, class119.field1659[0], class206.field3261[0], class213.field3355[0], class81.field1103[0], var3);
        }
        class207.method1526(0);
        return var6;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)V", line = 37)
    public static final void method1029(int arg0, int arg1) {
        class322.field5081 = arg1;
        field2206++;
        class275.field4241 = -1;
        if (arg0 < 105) {
            method1029(-122, 85);
        }
        class198.field3167 = -1;
        class310.method2146(5);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V", line = 51)
    public static void method1030(byte arg0) {
        if (arg0 >= -4) {
            method1029(1, 100);
        }
        field2203 = null;
        field2208 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIII)I", line = 70)
    public static final int method1031(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2199++;
        int var7 = arg0 & 0x3;
        if ((arg6 & arg4) == 1) {
            int var8 = arg1;
            arg1 = arg3;
            arg3 = var8;
        }
        if (var7 == 0) {
            return arg5;
        } else if (var7 == 1) {
            return arg2;
        } else if (var7 == 2) {
            return 8 - arg5 - arg1;
        } else {
            return 7 + 1 - arg3 - arg2;
        }
    }
}
