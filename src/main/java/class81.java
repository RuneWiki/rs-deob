import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class81 {

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "I")
    private int field1119;

    @OriginalMember(owner = "client!hu", name = "f", descriptor = "I")
    public static int field1122 = 0;

    @OriginalMember(owner = "client!hu", name = "h", descriptor = "I")
    public static int field1124 = 0;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!hu", name = "d", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!hu", name = "e", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!hu", name = "g", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIIIIZI)V")
    public static final void method519(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (class473.field6839 <= arg6 && arg0 <= class63.field933 && arg3 >= class7.field131 && arg4 <= class92.field1252) {
            if (arg2 == 1) {
                class254.method1590(arg6, arg4, arg0, arg1, 58, arg3);
            } else {
                class236.method1434((byte) 96, arg0, arg2, arg4, arg1, arg3, arg6);
            }
        } else if (arg2 == 1) {
            class406.method2434((byte) -50, arg4, arg1, arg0, arg6, arg3);
        } else {
            class172.method1088(arg3, true, arg6, arg2, arg0, arg4, arg1);
        }
        field1118++;
        if (arg5) {
            method519(-101, 11, 60, 68, -41, false, 3);
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(II)V")
    public final void method520(int arg0, int arg1) {
        if (arg0 <= 107) {
            field1122 = 121;
        }
        OpenGL.glNewList(this.field1119 + arg1, 4864);
        field1117++;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "([I[[BIB[[B[BI[I)I")
    public static final int method521(int[] arg0, byte[][] arg1, int arg2, byte arg3, byte[][] arg4, byte[] arg5, int arg6, int[] arg7) {
        field1123++;
        int var8 = arg7[arg6];
        int var9 = var8 + arg0[arg6];
        int var10 = arg7[arg2];
        int var11 = arg0[arg2] + var10;
        int var12 = var8;
        if (var8 < var10) {
            var12 = var10;
        }
        int var13 = var9;
        if (var9 > var11) {
            var13 = var11;
        }
        int var14 = arg5[arg6] & 0xFF;
        if ((arg5[arg2] & 0xFF) < var14) {
            var14 = arg5[arg2] & 0xFF;
        }
        byte[] var15 = arg4[arg6];
        byte[] var16 = arg1[arg2];
        int var17 = var12 - var8;
        int var18 = var12 - var10;
        for (int var19 = var12; var19 < var13; var19++) {
            int var20 = var15[var17++] + var16[var18++];
            if (var20 < var14) {
                var14 = var20;
            }
        }
        if (arg3 > -122) {
            return 66;
        } else {
            return -var14;
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Z)V")
    public final void method522(boolean arg0) {
        field1121++;
        OpenGL.glEndList();
        if (arg0) {
            this.method523((byte) 68, (char) 65497);
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(BC)V")
    public final void method523(byte arg0, char arg1) {
        OpenGL.glCallList(this.field1119 + arg1);
        int var3 = 4 % ((37 - arg0) / 49);
        field1120++;
    }

    @OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Lrl;I)V")
    public class81(class487 arg0, int arg1) {
        this.field1119 = OpenGL.glGenLists(arg1);
    }
}
