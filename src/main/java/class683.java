import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class683 {

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "Luw;")
    public static class208 field8811 = new class208(69, 1);

    @OriginalMember(owner = "client!dh", name = "n", descriptor = "I")
    public static int field8815 = -1;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public int field8802;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public int field8803;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    public int field8804;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
    public int field8805;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
    public int field8806;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "I")
    public static int field8807;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
    public int field8808;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
    public static int field8809;

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
    public int field8810;

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "I")
    public static int field8812;

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "I")
    public int field8813;

    @OriginalMember(owner = "client!dh", name = "m", descriptor = "I")
    public static int field8814;

    @OriginalMember(owner = "client!dh", name = "o", descriptor = "I")
    public int field8816;

    @OriginalMember(owner = "client!dh", name = "p", descriptor = "I")
    public int field8817;

    @OriginalMember(owner = "client!dh", name = "q", descriptor = "I")
    public int field8818;

    @OriginalMember(owner = "client!dh", name = "r", descriptor = "I")
    public int field8819;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I[Luaa;B)V")
    public static final void method3664(int arg0, class391[] arg1, byte arg2) {
        if (arg2 != 87) {
            return;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class391 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field5007 == 0) {
                    if (var4.field5145 != null) {
                        method3664(arg0, var4.field5145, (byte) 87);
                    }
                    class278 var5 = (class278) class149.field1895.method2616((long) var4.field5151, (byte) -83);
                    if (var5 != null) {
                        class664.method3614(false, var5.field3617, arg0);
                    }
                }
                if (arg0 == 0 && var4.field5155 != null) {
                    class244 var6 = new class244();
                    var6.field3349 = var4.field5155;
                    var6.field3350 = var4;
                    class760.method4148(var6);
                }
                if (arg0 == 1 && var4.field5147 != null) {
                    if (var4.field5039 >= 0) {
                        class391 var7 = class738.method4006(120, var4.field5151);
                        if (var7 == null || var7.field5145 == null || var4.field5039 >= var7.field5145.length || var7.field5145[var4.field5039] != var4) {
                            continue;
                        }
                    }
                    class244 var8 = new class244();
                    var8.field3350 = var4;
                    var8.field3349 = var4.field5147;
                    class760.method4148(var8);
                }
            }
        }
        field8812++;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILdh;)Z")
    public final boolean method3665(int arg0, class683 arg1) {
        field8814++;
        if (this.field8819 == arg1.field8819 && this.field8818 == arg1.field8818 && this.field8802 == arg1.field8802) {
            return true;
        } else {
            if (arg0 != 1111) {
                this.field8802 = -53;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIILck;[BZII)Lrc;")
    public static final class59 method3666(int arg0, int arg1, int arg2, class733 arg3, byte[] arg4, boolean arg5, int arg6, int arg7) {
        field8809++;
        if (arg7 != 3553) {
            return null;
        } else if (!arg3.field9891 && (!class735.method3997(arg6, (byte) -84) || !class735.method3997(arg0, (byte) -108))) {
            return arg3.field9876 ? new class59(arg3, 34037, arg2, arg6, arg0, arg5, arg4, arg1) : new class59(arg3, arg2, arg6, arg0, class483.method2714(arg6, (byte) -118), class483.method2714(arg0, (byte) -123), arg4, arg1);
        } else {
            return new class59(arg3, 3553, arg2, arg6, arg0, arg5, arg4, arg1);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)Z")
    public static final boolean method3667(int arg0, int arg1) {
        field8807++;
        if (class202.field2800[arg0]) {
            return true;
        } else if (class192.field2689.method156(9657, arg0)) {
            if (arg1 >= -34) {
                field8811 = null;
            }
            int var2 = class192.field2689.method138(0, arg0);
            if (var2 == 0) {
                class202.field2800[arg0] = true;
                return true;
            }
            if (class647.field8259[arg0] == null) {
                class647.field8259[arg0] = new class391[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class647.field8259[arg0][var3] == null) {
                    byte[] var4 = class192.field2689.method139(arg0, (byte) -94, var3);
                    if (var4 != null) {
                        class391 var5 = class647.field8259[arg0][var3] = new class391();
                        var5.field5151 = (arg0 << 16) + var3;
                        if (var4[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var5.method2252(new class234(var4), 0);
                    }
                }
            }
            class202.field2800[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V")
    public static void method3668(byte arg0) {
        field8811 = null;
        if (arg0 <= 97) {
            field8815 = 113;
        }
    }
}
