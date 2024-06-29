import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class28 {

    @OriginalMember(owner = "client!o", name = "a", descriptor = "Lhu;")
    public static class115 field610 = new class115("", 13);

    @OriginalMember(owner = "client!o", name = "e", descriptor = "Liv;")
    public static class82 field614 = new class82(2, 7);

    @OriginalMember(owner = "client!o", name = "g", descriptor = "I")
    public static int field616 = 0;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
    public static void method382(int arg0) {
        field610 = null;
        field614 = null;
        if (arg0 != -3) {
            field615 = 119;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V")
    public static final void method383(byte arg0) {
        field612++;
        if (arg0 <= 115) {
            field610 = null;
        }
        for (class553 var1 = (class553) class627.field8993.method2074(-101); var1 != null; var1 = (class553) class627.field8993.method2074(-50)) {
            class62.method606(var1, -21);
        }
        int var2;
        int var3;
        if (class221.field2851.method1747(0, class375.field5039)) {
            var2 = 3;
            var3 = 0;
        } else {
            var2 = class656.field9319;
            var3 = class656.field9319;
        }
        client.method1641();
        for (int var4 = var3; var4 <= var2; var4++) {
            client.method1644();
            client.method1652(var4);
            client.method1649(var4);
        }
        client.method1647();
        client.method1651();
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(B)V")
    public static final void method384(byte arg0) {
        if (class53.field865 == 1 || class53.field865 == 3 || class53.field865 != class227.field2933 && (class53.field865 == 0 || class227.field2933 == 0)) {
            class99.field1332 = 0;
            class59.field928 = 0;
            class522.field7662.method3674((byte) -37);
        }
        if (arg0 < 70) {
            field614 = null;
        }
        field613++;
        class227.field2933 = class53.field865;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "([I[[BIZI[[B[I[B)I")
    public static final int method385(int[] arg0, byte[][] arg1, int arg2, boolean arg3, int arg4, byte[][] arg5, int[] arg6, byte[] arg7) {
        field611++;
        int var8 = arg0[arg4];
        int var9 = var8 + arg6[arg4];
        if (arg3) {
            method384((byte) -93);
        }
        int var10 = arg0[arg2];
        int var11 = arg6[arg2] + var10;
        int var12 = var8;
        if (var10 > var8) {
            var12 = var10;
        }
        int var13 = var9;
        if (var11 < var9) {
            var13 = var11;
        }
        int var14 = arg7[arg4] & 0xFF;
        if ((arg7[arg2] & 0xFF) < var14) {
            var14 = arg7[arg2] & 0xFF;
        }
        byte[] var15 = arg5[arg4];
        byte[] var16 = arg1[arg2];
        int var17 = var12 - var8;
        int var18 = var12 - var10;
        for (int var19 = var12; var19 < var13; var19++) {
            int var20 = var16[var18++] + var15[var17++];
            if (var14 > var20) {
                var14 = var20;
            }
        }
        return -var14;
    }
}
