import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class7 {

    @OriginalMember(owner = "client!db", name = "l", descriptor = "Z")
    public boolean field69 = false;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field60 = 0;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "Z")
    public static boolean field61 = false;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    public int field66;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "I")
    public int field67;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "Lnc;")
    public class496 field62;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IZIIZ)V")
    public static final void method30(int arg0, boolean arg1, int arg2, int arg3, boolean arg4) {
        class88.method612((byte) 79, arg1, 0, arg2, arg3, class462.field6425.length - 1, arg4);
        field63++;
        if (arg0 != 18857) {
            method30(29, true, -119, 114, true);
        }
        class81.field1175 = null;
        class76.field1114 = 0;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ZILha;B)Lfd;")
    public final class298 method31(boolean arg0, int arg1, class548 arg2, byte arg3) {
        if (arg3 <= 52) {
            return null;
        }
        field65++;
        long var5 = (long) (arg2.field7611 << 19 | (arg0 ? 262144 : 0) | arg1 << 16 | this.field66);
        class298 var7 = (class298) this.field62.field6950.method3898((byte) -42, var5);
        if (var7 != null) {
            return var7;
        } else if (this.field62.field6944.method1578(this.field66, (byte) -81)) {
            class52 var8 = class52.method374(this.field62.field6944, this.field66, 0);
            if (var8 != null) {
                var8.field764 = var8.field765 = var8.field762 = var8.field761 = 0;
                if (arg0) {
                    var8.method378();
                }
                for (int var9 = 0; var9 < arg1; var9++) {
                    var8.method386();
                }
            }
            class298 var10 = arg2.method1496(var8, true);
            if (var10 != null) {
                this.field62.field6950.method3899(101, var10, var5);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILdc;)V")
    public final void method32(int arg0, class63 arg1) {
        while (true) {
            int var3 = arg1.method505((byte) -119);
            if (var3 == 0) {
                if (arg0 != -29579) {
                    this.field62 = null;
                }
                field58++;
                return;
            }
            this.method33(-13419, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILdc;I)V")
    private final void method33(int arg0, class63 arg1, int arg2) {
        if (arg0 != -13419) {
            return;
        }
        if (arg2 == 1) {
            this.field66 = arg1.method482(-772591672);
        } else if (arg2 == 2) {
            this.field67 = arg1.method476((byte) -106);
        } else if (arg2 == 3) {
            this.field69 = true;
        } else if (arg2 == 4) {
            this.field66 = -1;
        }
        field64++;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method34(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg3 == 22114) {
            class363.field5183[class414.field5864++] = new class616(arg8, arg0, arg6, arg2, arg2, arg6, arg7, arg5, arg5, arg7, arg4, arg4, arg1, arg1);
            field68++;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)Z")
    public final boolean method35(byte arg0) {
        int var2 = -8 / ((arg0 - 70) / 44);
        field59++;
        return this.field62.field6944.method1578(this.field66, (byte) -81);
    }
}
