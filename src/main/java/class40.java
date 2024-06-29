import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class40 {

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "[Lud;")
    public class26[] field610 = null;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "Lbc;")
    public class235 field613 = null;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "Lbc;")
    public class235 field618 = null;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "[Lud;")
    public class26[] field614 = null;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "Lbc;")
    public class235 field621 = null;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "Z")
    public boolean field615;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "Lgn;")
    public static class475 field616 = new class475(71, 18);

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public static int field617 = 0;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
    public static int field620 = 1;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public static void method306(int arg0) {
        field616 = null;
        if (arg0 != 99) {
            method309(109, null, null);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BLrl;[Lmt;)Ljh;")
    public static final class105 method307(byte arg0, class487 arg1, class260[] arg2) {
        field619++;
        for (int var3 = 0; var3 < arg2.length; var3++) {
            if (arg2[var3] == null || arg2[var3].field3723 <= 0L) {
                return null;
            }
        }
        if (arg0 != 55) {
            field620 = 31;
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg2.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg2[var6].field3723);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class250.field3609, 0);
        if (class250.field3609[0] == 0) {
            if (class250.field3609[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class250.field3609, 1);
            if (class250.field3609[1] > 1) {
                byte[] var7 = new byte[class250.field3609[1]];
                OpenGL.glGetInfoLogARB(var4, class250.field3609[1], class250.field3609, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class250.field3609[0] == 0) {
                for (int var8 = 0; var8 < arg2.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg2[var8].field3723);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class105(arg1, var4, arg2);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;I)V")
    public static final void method308(String arg0, int arg1, String arg2, int arg3, String arg4, int arg5, String arg6, int arg7) {
        for (int var8 = 99; var8 > 0; var8--) {
            class201.field2794[var8] = class201.field2794[var8 - 1];
            class53.field819[var8] = class53.field819[var8 - 1];
            class90.field1225[var8] = class90.field1225[var8 - 1];
            class49.field754[var8] = class49.field754[var8 - 1];
            class121.field1590[var8] = class121.field1590[var8 - 1];
            class270.field3779[var8] = class270.field3779[var8 - 1];
            class282.field4032[var8] = class282.field4032[var8 - 1];
        }
        if (arg1 != -1) {
            method309(-74, null, null);
        }
        field611++;
        class201.field2794[0] = arg3;
        class90.field1225[0] = arg6;
        class53.field819[0] = arg7;
        class49.field754[0] = arg4;
        class121.field1590[0] = arg0;
        class282.field4032[0] = arg5;
        class362.field5443++;
        field617 = class490.field7491;
        class270.field3779[0] = arg2;
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lrl;)V")
    public class40(class487 arg0) {
        this.field615 = arg0.field7456;
        class283.method1721(arg0, 128);
        if (this.field615) {
            byte[] var2 = class475.method2780(false, -16777216, class441.field6440);
            this.field621 = new class235(arg0, 6410, 128, 128, 16, var2, 6410);
            byte[] var3 = class475.method2780(false, -16777216, class505.field7707);
            this.field613 = new class235(arg0, 6410, 128, 128, 16, var3, 6410);
            class417 var4 = arg0.field7320;
            if (var4.method2482(35632)) {
                byte[] var5 = class475.method2780(false, -16777216, class4.field67);
                this.field618 = new class235(arg0, 6408, 128, 128, 16);
                class235 var6 = new class235(arg0, 6409, 128, 128, 16, var5, 6409);
                if (var4.method2480((byte) -93, 2.0F, this.field618, var6)) {
                    this.field618.method1369(-1);
                } else {
                    this.field618.method1371((byte) -107);
                    this.field618 = null;
                }
                var6.method1371((byte) -107);
                return;
            }
        } else {
            this.field610 = new class26[16];
            for (int var7 = 0; var7 < 16; var7++) {
                byte[] var10 = class165.method1042(-16777216, var7 * 2 * 16384, class441.field6440, 32768);
                this.field610[var7] = new class26(arg0, 3553, 6410, 128, 128, true, var10, 6410, false);
            }
            this.field614 = new class26[16];
            for (int var8 = 0; var8 < 16; var8++) {
                byte[] var9 = class165.method1042(-16777216, var8 * 128 * 256, class505.field7707, 32768);
                this.field614[var8] = new class26(arg0, 3553, 6410, 128, 128, true, var9, 6410, false);
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[[BLuo;)V")
    public static final void method309(int arg0, byte[][] arg1, class388 arg2) {
        field612++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg1.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var10 = arg1[var5];
            if (var10 != null) {
                class156 var11 = new class156(var10);
                int var12 = class76.field1081[var5] >> 8;
                int var13 = class76.field1081[var5] & 0xFF;
                int var14 = var12 * 64 - class455.field6637;
                int var15 = var13 * 64 - class223.field3158;
                class498.method2992(arg0 ^ 0x40);
                arg2.method52((byte) -101, var11, var14, var15, class455.field6637, class223.field3158, class169.field2234);
                arg2.method2329(var11, 98, class481.field6937, var15, var3, var14);
                if (!arg2.field94 && (class134.field1714 / 8) == var12 && class454.field6612 / 8 == var13 && var3[0] != -1) {
                    class252.field3649 = class75.field1067.method2818(var3[0], class66.field988, var3[3], var3[2], 21929, var3[1]);
                    class230.field3221 = var3[4];
                }
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class76.field1081[var6] >> 8) * 64 - class455.field6637;
            int var8 = (class76.field1081[var6] & 0xFF) * 64 - class223.field3158;
            byte[] var9 = arg1[var6];
            if (var9 == null && class454.field6612 < 800) {
                class498.method2992(0);
                arg2.method56(64, 57, var7, 64, var8);
            }
        }
        if (arg0 != 64) {
            field620 = -109;
        }
    }
}
