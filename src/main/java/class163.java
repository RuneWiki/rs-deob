import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class163 extends class264 {

    @OriginalMember(owner = "client!rm", name = "N", descriptor = "I")
    private int field2365 = 0;

    @OriginalMember(owner = "client!rm", name = "S", descriptor = "I")
    private int field2370 = 4096;

    @OriginalMember(owner = "client!rm", name = "P", descriptor = "I")
    private int field2367 = 2000;

    @OriginalMember(owner = "client!rm", name = "O", descriptor = "I")
    private int field2366 = 16;

    @OriginalMember(owner = "client!rm", name = "X", descriptor = "I")
    private int field2375 = 0;

    @OriginalMember(owner = "client!rm", name = "U", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!rm", name = "Y", descriptor = "Leo;")
    public static class443 field2376;

    @OriginalMember(owner = "client!rm", name = "Z", descriptor = "[Lwg;")
    public static class361[] field2377;

    @OriginalMember(owner = "client!rm", name = "Q", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!rm", name = "R", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!rm", name = "T", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!rm", name = "V", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!rm", name = "W", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!rm", name = "bb", descriptor = "Ldg;")
    public static class131 field2379;

    @OriginalMember(owner = "client!rm", name = "ab", descriptor = "[Lsi;")
    public static class474[] field2378;

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "()V")
    public class163() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(II)[I")
    public final int[] method90(int arg0, int arg1) {
        ++field2373;
        int[] var3 = super.field3808.method958((byte) 91, arg0);
        if (super.field3808.field1732) {
            int var4 = this.field2370 >> 1;
            int[][] var5 = super.field3808.method957(0);
            Random var6 = new Random((long) this.field2365);
            for (int var7 = 0; this.field2367 > var7; ++var7) {
                int var8 = ~this.field2370 < -1 ? this.field2375 - (var4 + -class424.method2524(var6, this.field2370, (byte) -85)) : this.field2375;
                int var9 = var8 >> 4 & 255;
                int var10 = class424.method2524(var6, class478.field6792, (byte) -111);
                int var11 = class424.method2524(var6, class129.field1772, (byte) -104);
                int var12 = var10 - -(class41.field550[var9] * this.field2366 >> 12);
                int var13 = (class421.field5827[var9] * this.field2366 >> 12) + var11;
                int var14 = -var11 + var13;
                int var15 = var12 - var10;
                if (var15 != 0 || ~var14 != -1) {
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = var14 > var15;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        int var18 = var12;
                        var12 = var13;
                        var11 = var17;
                        var13 = var18;
                    }
                    if (~var12 > ~var10) {
                        int var19 = var10;
                        int var20 = var11;
                        var10 = var12;
                        var12 = var19;
                        var11 = var13;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = -var11 + var13;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = -(class424.method2524(var6, 4096, (byte) -74) >> 2) + 1024;
                    if (~var23 > -1) {
                        var23 = -var23;
                    }
                    int var27 = ~var13 >= ~var11 ? -1 : 1;
                    for (int var28 = var10; var12 > var28; ++var28) {
                        int var29 = (-var10 + var28) * var25 + 1024 + var26;
                        int var30 = class205.field3007 & var28;
                        int var31 = var21 & class301.field4265;
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                        var24 += var23;
                        if (~var24 < -1) {
                            var24 += -var22;
                            var21 -= -var27;
                        }
                    }
                }
            }
        }
        return arg1 != 21034 ? null : var3;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(BLkk;I)V")
    public final void method7(byte arg0, class161 arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (~arg2 == -5) {
                            this.field2370 = arg1.method1134(-16848);
                        }
                    } else {
                        this.field2375 = arg1.method1134(-16848);
                    }
                } else {
                    this.field2366 = arg1.method1172((byte) -112);
                }
            } else {
                this.field2367 = arg1.method1134(-16848);
            }
        } else {
            this.field2365 = arg1.method1172((byte) -119);
        }
        ++field2371;
        if (arg0 <= 31) {
            method1206((byte) 0);
        }
    }

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "(I)V")
    public static void method1204(int arg0) {
        field2376 = null;
        if (arg0 == -1) {
            field2379 = null;
            field2378 = null;
            field2377 = null;
        }
    }

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "(I)V")
    public final void method95(int arg0) {
        ++field2369;
        if (arg0 != -8) {
            field2372 = -66;
        }
        method1206((byte) -114);
    }

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "(BI)Lep;")
    public static final class309 method1205(byte arg0, int arg1) {
        ++field2368;
        class262[] var2 = class320.field4513;
        synchronized (class320.field4513) {
            if (arg0 != 40) {
                return null;
            } else {
                class309 var4;
                if (class320.field4513.length > arg1 && !class320.field4513[arg1].method1761(1)) {
                    var4 = (class309) class320.field4513[arg1].method1766((byte) 112);
                    var4.method2003(1);
                    int var10002 = class165.field2404[arg1]--;
                } else {
                    var4 = new class309();
                    var4.field4383 = new class63[arg1];
                    for (int var5 = 0; ~var5 > ~arg1; ++var5) {
                        var4.field4383[var5] = new class63();
                    }
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(B)V")
    public static final void method1206(byte arg0) {
        ++field2374;
        if (arg0 == -114) {
            if (class421.field5827 == null || class41.field550 == null) {
                class421.field5827 = new int[256];
                class41.field550 = new int[256];
                for (int var1 = 0; var1 < 256; ++var1) {
                    double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                    class421.field5827[var1] = (int) (4096.0D * Math.sin(var2));
                    class41.field550[var1] = (int) (4096.0D * Math.cos(var2));
                }
            }
        }
    }

    static {
        new class151((String) null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", (String) null, (String) null);
        field2372 = 0;
        field2376 = new class443(10, 3);
        field2377 = new class361[32768];
    }
}
