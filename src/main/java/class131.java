import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class131 {

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "Laf;")
    public static class7 field3100 = class48.method406(40, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "Laf;")
    public static class7 field3101 = class48.method406(40, "<br>(X100(U(Y");

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "[Lfd;")
    public static class40[] field3102 = new class40[1000];

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "Laf;")
    public static class7 field3104 = class48.method406(40, "Hierhin gehen");

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "Laf;")
    public static class7 field3105 = class48.method406(40, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "[[I")
    public static int[][] field3098;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIII)V")
    public static final void method1070(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3099++;
        if (class126.field3010 == arg4 && class45.field1080 == arg2 && (class45.field1078 == arg1 || !class91.field2106)) {
            return;
        }
        class126.field3010 = arg4;
        class45.field1080 = arg2;
        class45.field1078 = arg1;
        if (!class91.field2106) {
            class45.field1078 = 0;
        }
        class111.method880(20, 25);
        class43.method382(-61, class13.field342, true);
        int var6 = class32.field843;
        int var7 = class153.field3585;
        class32.field843 = (arg2 - 6) * 8;
        class153.field3585 = (arg4 - 6) * 8;
        int var8 = class153.field3585 - var7;
        int var9 = class32.field843 - var6;
        int var10 = class153.field3585;
        int var11 = class32.field843;
        for (int var12 = 0; var12 < 32768; var12++) {
            class141 var28 = class121.field2843[var12];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field493[var29] -= var8;
                    var28.field509[var29] -= var9;
                }
                var28.field491 -= var9 * 128;
                var28.field505 -= var8 * 128;
            }
        }
        for (int var13 = 0; var13 < 2048; var13++) {
            class92 var26 = class18.field425[var13];
            if (var26 != null) {
                for (int var27 = 0; var27 < 10; var27++) {
                    var26.field493[var27] -= var8;
                    var26.field509[var27] -= var9;
                }
                var26.field505 -= var8 * 128;
                var26.field491 -= var9 * 128;
            }
        }
        class8.field186 = arg1;
        class21.field531.method178(arg5, (byte) -126, arg3, false);
        byte var14 = 0;
        byte var15 = 0;
        byte var16 = 1;
        byte var17 = 104;
        byte var18 = 104;
        if (var8 < 0) {
            var14 = 103;
            var16 = -1;
            var18 = -1;
        }
        byte var19 = 1;
        if (var9 < 0) {
            var15 = 103;
            var17 = -1;
            var19 = -1;
        }
        for (int var20 = var14; var20 != var18; var20 += var16) {
            for (int var22 = var15; var22 != var17; var22 += var19) {
                int var23 = var8 + var20;
                int var24 = var22 + var9;
                for (int var25 = 0; var25 < 4; var25++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                        class9.field252[var25][var20][var22] = class9.field252[var25][var23][var24];
                    } else {
                        class9.field252[var25][var20][var22] = null;
                    }
                }
            }
        }
        for (class130 var21 = (class130) class75.field1738.method758(arg0 + 256); var21 != null; var21 = (class130) class75.field1738.method766(-37)) {
            var21.field3092 -= var8;
            var21.field3068 -= var9;
            if (var21.field3092 < 0 || var21.field3068 < 0 || var21.field3092 >= 104 || var21.field3068 >= 104) {
                var21.method1124((byte) 62);
            }
        }
        class121.field2848 = false;
        if (~class42.field1012 != arg0) {
            class84.field1984 -= var9;
            class42.field1012 -= var8;
        }
        class127.field3062 = -1;
        class42.field1009 = 0;
        class48.field1157.method762(arg0 ^ 0xFFFFFF9B);
        class26.field679.method762(100);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
    public static void method1071(byte arg0) {
        field3102 = null;
        field3101 = null;
        field3104 = null;
        field3105 = null;
        if (arg0 == -63) {
            field3098 = null;
            field3100 = null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lkb;ILkb;)V")
    public static final void method1072(class71 arg0, int arg1, class71 arg2) {
        client.field578 = arg0;
        field3097++;
        class78.field1825 = arg2;
        class127.field3050 = class78.field1825.method562((byte) 9, 3);
        if (arg1 != -14171) {
            field3098 = null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)V")
    public static final void method1073(byte arg0) {
        field3106++;
        class120.field2837 = 0;
        class98.field2325 = 0;
        class113.method890((byte) -97);
        class55.method443((byte) -98);
        class115.method899(30269);
        class20.method191(arg0 ^ 0xFFFFFFA4);
        if (arg0 != 16) {
            field3102 = null;
        }
        for (int var1 = 0; var1 < class120.field2837; var1++) {
            int var3 = class84.field1982[var1];
            if (class155.field3611 != class18.field425[var3].field476) {
                class18.field425[var3] = null;
            }
        }
        if (class87.field2026 != class91.field2100.field2903) {
            throw new RuntimeException("gpp1 pos:" + class91.field2100.field2903 + " psize:" + class87.field2026);
        }
        for (int var2 = 0; var2 < class130.field3088; var2++) {
            if (class18.field425[class87.field2046[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class130.field3088);
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)V")
    public static final void method1074(int arg0, int arg1, int arg2) {
        field3103++;
        class102 var3 = class14.method137(true, arg0);
        int var4 = var3.field2417;
        int var5 = var3.field2408;
        int var6 = var3.field2407;
        int var7 = class95.field2211[var6 - var5];
        if (arg1 < 0 || arg1 > var7) {
            arg1 = 0;
        }
        int var8 = var7 << var5;
        int var9 = 29 % ((arg2 + 6) / 57);
        class43.field1026[var4] = class141.method1150(class84.method705(class43.field1026[var4], ~var8), class84.method705(arg1 << var5, var8));
    }
}
