import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class210 {

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "B")
    private byte field3586;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public int field3592;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public int field3589;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
    public int field3593;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
    public int field3597;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public int field3594;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "Lia;")
    public static class257 field3590 = class28.method234(74, "(Y<)4col>");

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "[I")
    public static int[] field3591 = new int[2048];

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B[B)V")
    public static final void method1409(byte arg0, byte[] arg1) {
        int var2 = -87 % ((arg0 + 35) / 41);
        int var3 = 0;
        field3595++;
        while (true) {
            while (var3 < arg1.length) {
                int var4 = (arg1[var3++] & 0xFF) * 64 - class182.field3159;
                int var5 = (arg1[var3++] & 0xFF) * 64 - class8.field174;
                if (var4 > 0 && var5 > 0 && class252.field4337 > (var4 + 64) && class181.field3149 > (var5 + 64)) {
                    int var6 = var4 >> 6;
                    int var7 = class181.field3149 - var5 - 1 >> 6;
                    for (int var8 = 0; var8 < 64; var8++) {
                        for (int var9 = -64; var9 < 0; var9++) {
                            byte var10 = arg1[var3++];
                            if (var10 != 0) {
                                if (class221.field3737[var6][var7] == null) {
                                    class221.field3737[var6][var7] = new byte[4096];
                                }
                                class221.field3737[var6][var7][(-(var9 + 1) << 6) + var8] = var10;
                                byte var11 = arg1[var3++];
                                if (class207.field3553[var6][var7] == null) {
                                    class207.field3553[var6][var7] = new byte[4096];
                                }
                                class207.field3553[var6][var7][(-(var9 + 1) << 6) + var8] = var11;
                            }
                        }
                    }
                } else {
                    for (int var12 = -4096; var12 < 0; var12++) {
                        byte var13 = arg1[var3++];
                        if (var13 != 0) {
                            var3++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljava/lang/Object;Lmi;B)V")
    public static final void method1410(Object arg0, class100 arg1, byte arg2) {
        field3588++;
        if (arg1.field1847 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg1.field1847.peekEvent() != null; var3++) {
            class33.method283(arg2 - 125, 1L);
        }
        if (arg2 != 15) {
            field3591 = null;
        }
        if (arg0 != null) {
            arg1.field1847.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
    public static void method1411(int arg0) {
        field3590 = null;
        field3591 = null;
        if (arg0 >= -3) {
            field3591 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)I")
    public final int method1412(boolean arg0) {
        if (arg0) {
            return 111;
        } else {
            field3587++;
            return this.field3586 & 0x7;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method1413(int arg0, int arg1, int arg2, long arg3) {
        class177 var5 = class75.field1463[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field3024 != null && var5.field3024.field170 == arg3) {
            return true;
        } else if (var5.field3022 != null && var5.field3022.field154 == arg3) {
            return true;
        } else if (var5.field3016 != null && var5.field3016.field2079 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field3012; var6++) {
                if (var5.field3017[var6].field2702 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
    public class210() {
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lk;)V")
    public class210(class152 arg0) {
        this.field3586 = arg0.method1060((byte) -58);
        this.field3592 = arg0.method1063(-17162);
        this.field3589 = arg0.method1042(112);
        this.field3593 = arg0.method1042(121);
        this.field3597 = arg0.method1042(119);
        this.field3594 = arg0.method1042(115);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)I")
    public final int method1414(byte arg0) {
        field3596++;
        if (arg0 > -94) {
            this.method1414((byte) -121);
        }
        return (this.field3586 & 0x8) == 8 ? 1 : 0;
    }
}
