import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class37 extends class243 {

    @OriginalMember(owner = "client!eh", name = "Y", descriptor = "I")
    private int field608 = 2000;

    @OriginalMember(owner = "client!eh", name = "hb", descriptor = "I")
    private int field617 = 4096;

    @OriginalMember(owner = "client!eh", name = "cb", descriptor = "I")
    private int field612 = 0;

    @OriginalMember(owner = "client!eh", name = "kb", descriptor = "I")
    private int field620 = 16;

    @OriginalMember(owner = "client!eh", name = "lb", descriptor = "I")
    private int field621 = 0;

    @OriginalMember(owner = "client!eh", name = "gb", descriptor = "Lub;")
    public static class227 field616 = class257.method1749("null", 17263);

    @OriginalMember(owner = "client!eh", name = "bb", descriptor = "[Lub;")
    public static class227[] field611 = new class227[500];

    @OriginalMember(owner = "client!eh", name = "fb", descriptor = "Lub;")
    public static class227 field615 = class257.method1749("Benutzeroberfl-=che geladen)3", 17263);

    @OriginalMember(owner = "client!eh", name = "ib", descriptor = "I")
    public static volatile int field618 = 0;

    @OriginalMember(owner = "client!eh", name = "mb", descriptor = "Lub;")
    private static class227 field622 = class257.method1749("Cancel", 17263);

    @OriginalMember(owner = "client!eh", name = "nb", descriptor = "I")
    public static int field623 = -2;

    @OriginalMember(owner = "client!eh", name = "eb", descriptor = "Lub;")
    public static class227 field614 = field622;

    @OriginalMember(owner = "client!eh", name = "Z", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!eh", name = "ab", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!eh", name = "db", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!eh", name = "jb", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!eh", name = "ob", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lnj;ZI)V")
    public final void method81(class226 arg0, boolean arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (arg2 == 4) {
                            this.field617 = arg0.method1447(0);
                        }
                    } else {
                        this.field612 = arg0.method1447(0);
                    }
                } else {
                    this.field620 = arg0.method1471(255);
                }
            } else {
                this.field608 = arg0.method1447(0);
            }
        } else {
            this.field621 = arg0.method1471(255);
        }
        if (arg1) {
            field614 = null;
        }
        ++field610;
    }

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "(B)V")
    public static void method195(byte arg0) {
        field614 = null;
        field615 = null;
        field616 = null;
        field622 = null;
        if (arg0 != -51) {
            method196(false, 10, (Object) null);
        }
        field611 = null;
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V")
    public class37() {
        super(0, true);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZILjava/lang/Object;)[B")
    public static final byte[] method196(boolean arg0, int arg1, Object arg2) {
        ++field624;
        if (arg1 != -16549) {
            method196(true, -42, (Object) null);
        }
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg0 ? class176.method1121(true, var3) : var3;
        } else if (arg2 instanceof class23) {
            class23 var4 = (class23) arg2;
            return var4.method112(-101);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(Z)V")
    public final void method170(boolean arg0) {
        class87.method522(37);
        if (arg0) {
            this.method77(-28, 68);
        }
        ++field613;
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(II)[I")
    public final int[] method77(int arg0, int arg1) {
        int[] var3 = super.field4215.method984(arg1, 0);
        ++field609;
        int var4 = -52 / ((arg0 - -15) / 51);
        if (super.field4215.field2707) {
            int var5 = this.field617 >> 1;
            int[][] var6 = super.field4215.method986((byte) -125);
            Random var7 = new Random((long) this.field621);
            for (int var8 = 0; ~var8 > ~this.field608; ++var8) {
                int var9 = ~this.field617 < -1 ? this.field612 + class210.method1342(-121, var7, this.field617) + -var5 : this.field612;
                int var10 = class210.method1342(-120, var7, class212.field3586);
                int var11 = class210.method1342(-106, var7, class193.field3280);
                int var12 = (var9 & 4082) >> 4;
                int var13 = (class43.field716[var12] * this.field620 >> 12) + var10;
                int var14 = -var10 + var13;
                int var15 = (class128.field2260[var12] * this.field620 >> 12) + var11;
                int var16 = var15 - var11;
                if (var14 != 0 || ~var16 != -1) {
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    if (var16 < 0) {
                        var16 = -var16;
                    }
                    boolean var17 = var14 < var16;
                    if (var17) {
                        int var18 = var10;
                        var10 = var11;
                        var11 = var18;
                        int var19 = var13;
                        var13 = var15;
                        var15 = var19;
                    }
                    if (~var10 < ~var13) {
                        int var20 = var10;
                        int var21 = var11;
                        var10 = var13;
                        var13 = var20;
                        var11 = var15;
                        var15 = var21;
                    }
                    int var22 = var11;
                    int var23 = -var10 + var13;
                    int var24 = -var23 / 2;
                    int var25 = -var11 + var15;
                    int var26 = 2048 / var23;
                    int var27 = 1024 - (class210.method1342(82, var7, 4096) >> 2);
                    if (var25 < 0) {
                        var25 = -var25;
                    }
                    int var28 = var11 >= var15 ? -1 : 1;
                    for (int var29 = var10; var13 > var29; ++var29) {
                        var24 += var25;
                        int var30 = (-var10 + var29) * var26 + var27 + 1024;
                        int var31 = var29 & class179.field3062;
                        int var32 = var22 & class254.field4469;
                        if (~var24 < -1) {
                            var22 += var28;
                            var24 += -var23;
                        }
                        if (var17) {
                            var6[var32][var31] = var30;
                        } else {
                            var6[var31][var32] = var30;
                        }
                    }
                }
            }
        }
        return var3;
    }
}
