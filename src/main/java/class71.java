import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class71 extends class97 {

    @OriginalMember(owner = "client!rm", name = "I", descriptor = "I")
    public int field926 = 0;

    @OriginalMember(owner = "client!rm", name = "t", descriptor = "I")
    public static int field911 = -1;

    @OriginalMember(owner = "client!rm", name = "v", descriptor = "[I")
    public static int[] field913 = new int[4];

    @OriginalMember(owner = "client!rm", name = "w", descriptor = "[Z")
    public static boolean[] field914 = new boolean[100];

    @OriginalMember(owner = "client!rm", name = "K", descriptor = "Ltm;")
    public static class354 field928 = new class354();

    @OriginalMember(owner = "client!rm", name = "N", descriptor = "[Z")
    public static boolean[] field931;

    @OriginalMember(owner = "client!rm", name = "O", descriptor = "Z")
    public static boolean field932;

    @OriginalMember(owner = "client!rm", name = "M", descriptor = "Lwl;")
    public static class452 field930;

    @OriginalMember(owner = "client!rm", name = "Q", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!rm", name = "R", descriptor = "Z")
    public static boolean field935;

    @OriginalMember(owner = "client!rm", name = "n", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!rm", name = "o", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!rm", name = "p", descriptor = "I")
    public int field907;

    @OriginalMember(owner = "client!rm", name = "q", descriptor = "I")
    public int field908;

    @OriginalMember(owner = "client!rm", name = "r", descriptor = "I")
    public int field909;

    @OriginalMember(owner = "client!rm", name = "s", descriptor = "I")
    public int field910;

    @OriginalMember(owner = "client!rm", name = "u", descriptor = "I")
    public int field912;

    @OriginalMember(owner = "client!rm", name = "D", descriptor = "I")
    public int field921;

    @OriginalMember(owner = "client!rm", name = "E", descriptor = "I")
    public int field922;

    @OriginalMember(owner = "client!rm", name = "F", descriptor = "I")
    public int field923;

    @OriginalMember(owner = "client!rm", name = "G", descriptor = "I")
    public int field924;

    @OriginalMember(owner = "client!rm", name = "J", descriptor = "I")
    public int field927;

    @OriginalMember(owner = "client!rm", name = "L", descriptor = "I")
    public int field929;

    @OriginalMember(owner = "client!rm", name = "P", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!rm", name = "x", descriptor = "Lwn;")
    public class155 field915;

    @OriginalMember(owner = "client!rm", name = "A", descriptor = "Lje;")
    public class169 field918;

    @OriginalMember(owner = "client!rm", name = "y", descriptor = "Lsj;")
    public class444 field916;

    @OriginalMember(owner = "client!rm", name = "B", descriptor = "Lsj;")
    public class444 field919;

    @OriginalMember(owner = "client!rm", name = "C", descriptor = "Lfq;")
    public class85 field920;

    @OriginalMember(owner = "client!rm", name = "z", descriptor = "Z")
    public boolean field917;

    @OriginalMember(owner = "client!rm", name = "H", descriptor = "[I")
    public int[] field925;

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(B)V")
    public final void method473(byte arg0) {
        field906++;
        int var2 = this.field921;
        if (this.field920 != null) {
            class85 var3 = this.field920.method542(6796);
            if (var3 == null) {
                this.field925 = null;
                this.field921 = -1;
                this.field912 = 0;
                this.field909 = 0;
                this.field907 = 0;
                this.field910 = 0;
            } else {
                this.field909 = var3.field1185;
                this.field921 = var3.field1163;
                this.field907 = var3.field1188;
                this.field910 = var3.field1174 * 128;
                this.field925 = var3.field1178;
                this.field912 = var3.field1196;
            }
        } else if (this.field915 != null) {
            int var4 = class8.method62(this.field915, arg0 ^ 0xFFFFFFD6);
            if (var2 != var4) {
                this.field921 = var4;
                class271 var5 = this.field915.field2137;
                if (var5.field4100 != null) {
                    var5 = var5.method1684(6);
                }
                if (var5 == null) {
                    this.field909 = this.field910 = 0;
                } else {
                    this.field909 = var5.field4123;
                    this.field910 = var5.field4114 * 128;
                }
            }
        } else if (this.field918 != null) {
            this.field921 = class233.method1407((byte) 126, this.field918);
            this.field909 = this.field918.field2427;
            this.field910 = this.field918.field2462 * 128;
        }
        if (this.field921 != var2 && this.field919 != null) {
            class267.field4077.method2135(this.field919);
            this.field919 = null;
        }
        if (arg0 != 41) {
            this.method473((byte) -95);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIIIIIII)Z")
    public static final boolean method474(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field905++;
        if ((arg7 + arg1) <= arg6 || arg5 + arg6 <= arg7) {
            return false;
        } else if (arg2 < (arg4 + arg8) && (arg2 + arg3) > arg4) {
            if (arg0 != 128) {
                method475(-88);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "(I)V")
    public static void method475(int arg0) {
        field931 = null;
        field913 = null;
        field928 = null;
        field914 = null;
        field930 = null;
        if (arg0 != 0) {
            method474(-21, -27, -72, 95, -49, 53, -60, 81, -53);
        }
    }

    static {
        new class151("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
        field931 = new boolean[100];
        field932 = false;
        field930 = new class452(55, 3);
        field934 = 10;
        field935 = true;
    }
}
