import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class443 {

    @OriginalMember(owner = "client!jq", name = "f", descriptor = "Ltf;")
    private class248 field6613 = new class248();

    @OriginalMember(owner = "client!jq", name = "n", descriptor = "Ltf;")
    private class248 field6621 = new class248();

    @OriginalMember(owner = "client!jq", name = "s", descriptor = "Ltf;")
    private class248 field6626 = new class248();

    @OriginalMember(owner = "client!jq", name = "t", descriptor = "Ltf;")
    private class248 field6627 = new class248();

    @OriginalMember(owner = "client!jq", name = "A", descriptor = "Lrt;")
    private class194 field6634 = new class194(4);

    @OriginalMember(owner = "client!jq", name = "D", descriptor = "B")
    private byte field6637 = 0;

    @OriginalMember(owner = "client!jq", name = "F", descriptor = "I")
    public volatile int field6639 = 0;

    @OriginalMember(owner = "client!jq", name = "C", descriptor = "I")
    public volatile int field6636 = 0;

    @OriginalMember(owner = "client!jq", name = "E", descriptor = "Lrt;")
    private class194 field6638 = new class194(8);

    @OriginalMember(owner = "client!jq", name = "v", descriptor = "Lqg;")
    public static class398 field6629;

    @OriginalMember(owner = "client!jq", name = "y", descriptor = "J")
    public static long field6632;

    @OriginalMember(owner = "client!jq", name = "z", descriptor = "I")
    public static int field6633;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "I")
    public static int field6608;

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "I")
    public static int field6609;

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "I")
    public static int field6610;

    @OriginalMember(owner = "client!jq", name = "d", descriptor = "I")
    public static int field6611;

    @OriginalMember(owner = "client!jq", name = "e", descriptor = "I")
    public static int field6612;

    @OriginalMember(owner = "client!jq", name = "g", descriptor = "I")
    public static int field6614;

    @OriginalMember(owner = "client!jq", name = "h", descriptor = "I")
    public static int field6615;

    @OriginalMember(owner = "client!jq", name = "i", descriptor = "I")
    public static int field6616;

    @OriginalMember(owner = "client!jq", name = "k", descriptor = "I")
    public static int field6618;

    @OriginalMember(owner = "client!jq", name = "l", descriptor = "I")
    public static int field6619;

    @OriginalMember(owner = "client!jq", name = "m", descriptor = "I")
    public static int field6620;

    @OriginalMember(owner = "client!jq", name = "o", descriptor = "I")
    public static int field6622;

    @OriginalMember(owner = "client!jq", name = "p", descriptor = "I")
    public static int field6623;

    @OriginalMember(owner = "client!jq", name = "q", descriptor = "I")
    public static int field6624;

    @OriginalMember(owner = "client!jq", name = "r", descriptor = "I")
    public static int field6625;

    @OriginalMember(owner = "client!jq", name = "u", descriptor = "I")
    public static int field6628;

    @OriginalMember(owner = "client!jq", name = "B", descriptor = "I")
    private int field6635;

    @OriginalMember(owner = "client!jq", name = "w", descriptor = "J")
    private long field6630;

    @OriginalMember(owner = "client!jq", name = "x", descriptor = "Lwda;")
    private class555 field6631;

    @OriginalMember(owner = "client!jq", name = "G", descriptor = "Lbm;")
    private class96 field6640;

    @OriginalMember(owner = "client!jq", name = "j", descriptor = "[[[B")
    public static byte[][][] field6617;

    static {
        new class474("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
        field6629 = new class398();
        field6632 = 0L;
        field6633 = 0;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILwda;Z)V", line = 3)
    public final void method2757(int arg0, class555 arg1, boolean arg2) {
        if (this.field6631 != null) {
            try {
                this.field6631.method3210(-85);
            } catch (Exception var9) {
            }
            this.field6631 = null;
        }
        field6620++;
        this.field6631 = arg1;
        this.method2771(47);
        this.method2758(arg2, (byte) -123);
        this.field6640 = null;
        this.field6638.field2610 = 0;
        while (true) {
            class96 var4 = (class96) this.field6621.method1645(117);
            if (var4 == null) {
                while (true) {
                    class96 var5 = (class96) this.field6627.method1645(-119);
                    if (var5 == null) {
                        int var6 = 106 % ((arg0 - 61) / 55);
                        if (this.field6637 != 0) {
                            try {
                                this.field6634.field2610 = 0;
                                this.field6634.method1205((byte) -69, 4);
                                this.field6634.method1205((byte) -69, this.field6637);
                                this.field6634.method1229(0, 30364);
                                this.field6631.method3207(0, 4, this.field6634.field2622, 0);
                            } catch (IOException var8) {
                                try {
                                    this.field6631.method3210(-84);
                                } catch (Exception var7) {
                                }
                                this.field6639++;
                                this.field6636 = -2;
                                this.field6631 = null;
                            }
                        }
                        this.field6635 = 0;
                        this.field6630 = class84.method550((byte) -97);
                        return;
                    }
                    this.field6626.method1646(-121, var5);
                }
            }
            this.field6613.method1646(-106, var4);
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(ZB)V", line = 71)
    public final void method2758(boolean arg0, byte arg1) {
        field6624++;
        if (this.field6631 == null) {
            return;
        }
        try {
            this.field6634.field2610 = 0;
            this.field6634.method1205((byte) -69, arg0 ? 2 : 3);
            this.field6634.method1240(0, (byte) 121);
            this.field6631.method3207(0, 4, this.field6634.field2622, 0);
            if (arg1 >= -118) {
                this.field6626 = null;
            }
        } catch (IOException var4) {
            try {
                this.field6631.method3210(118);
            } catch (Exception var3) {
            }
            this.field6631 = null;
            this.field6636 = -2;
            this.field6639++;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Z)V", line = 98)
    public static void method2759(boolean arg0) {
        field6617 = null;
        field6629 = null;
        if (arg0) {
            field6617 = null;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IBIIZ)Lbm;", line = 109)
    public final class96 method2760(int arg0, byte arg1, int arg2, int arg3, boolean arg4) {
        field6608++;
        long var6 = (long) ((arg0 << 16) + arg3);
        class96 var8 = new class96();
        var8.field1129 = arg1;
        if (arg2 != 0) {
            method2769((byte) 84, null);
        }
        var8.field401 = var6;
        var8.field9008 = arg4;
        if (arg4) {
            if (this.method2765(69) >= 20) {
                throw new RuntimeException();
            }
            this.field6613.method1646(-96, var8);
        } else if (this.method2770(true) < 20) {
            this.field6626.method1646(123, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)Z", line = 153)
    public final boolean method2761(int arg0) {
        field6619++;
        if (this.field6631 != null) {
            long var2 = class84.method550((byte) -124);
            int var4 = (int) (var2 - this.field6630);
            this.field6630 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field6635 += var4;
            if (this.field6635 > 30000) {
                try {
                    this.field6631.method3210(124);
                } catch (Exception var28) {
                }
                this.field6631 = null;
            }
        }
        if (this.field6631 == null) {
            return this.method2765(74) == 0 && this.method2770(true) == 0;
        }
        try {
            this.field6631.method3208((byte) -87);
            for (class96 var5 = (class96) this.field6613.method1644((byte) -123); var5 != null; var5 = (class96) this.field6613.method1642(0)) {
                this.field6634.field2610 = 0;
                this.field6634.method1205((byte) -69, 1);
                this.field6634.method1240((int) var5.field401, (byte) 109);
                this.field6631.method3207(0, 4, this.field6634.field2622, 0);
                this.field6621.method1646(-115, var5);
            }
            for (class96 var6 = (class96) this.field6626.method1644((byte) -125); var6 != null; var6 = (class96) this.field6626.method1642(0)) {
                this.field6634.field2610 = 0;
                this.field6634.method1205((byte) -69, 0);
                this.field6634.method1240((int) var6.field401, (byte) 116);
                this.field6631.method3207(0, 4, this.field6634.field2622, 0);
                this.field6627.method1646(78, var6);
            }
            int var7 = -40 / ((-arg0 - 14) / 38);
            for (int var8 = 0; var8 < 100; var8++) {
                int var9 = this.field6631.method3205(113);
                if (var9 < 0) {
                    throw new IOException();
                }
                if (var9 == 0) {
                    break;
                }
                this.field6635 = 0;
                byte var10 = 0;
                if (this.field6640 == null) {
                    var10 = 8;
                } else if (this.field6640.field1127 == 0) {
                    var10 = 1;
                }
                if (var10 <= 0) {
                    int var11 = this.field6640.field1130.field2622.length - this.field6640.field1129;
                    int var12 = 512 - this.field6640.field1127;
                    if (var12 > var11 - this.field6640.field1130.field2610) {
                        var12 = var11 - this.field6640.field1130.field2610;
                    }
                    if (var12 > var9) {
                        var12 = var9;
                    }
                    this.field6631.method3204(this.field6640.field1130.field2622, this.field6640.field1130.field2610, var12, (byte) -47);
                    if (this.field6637 != 0) {
                        for (int var13 = 0; var13 < var12; var13++) {
                            this.field6640.field1130.field2622[this.field6640.field1130.field2610 + var13] = (byte) class92.method583(this.field6640.field1130.field2622[this.field6640.field1130.field2610 + var13], this.field6637);
                        }
                    }
                    this.field6640.field1127 += var12;
                    this.field6640.field1130.field2610 += var12;
                    if (this.field6640.field1130.field2610 == var11) {
                        this.field6640.method199(-105);
                        this.field6640.field9009 = false;
                        this.field6640 = null;
                    } else if (this.field6640.field1127 == 512) {
                        this.field6640.field1127 = 0;
                    }
                } else {
                    int var14 = var10 - this.field6638.field2610;
                    if (var14 > var9) {
                        var14 = var9;
                    }
                    this.field6631.method3204(this.field6638.field2622, this.field6638.field2610, var14, (byte) 123);
                    if (this.field6637 != 0) {
                        for (int var15 = 0; var15 < var14; var15++) {
                            this.field6638.field2622[this.field6638.field2610 + var15] = (byte) class92.method583(this.field6638.field2622[this.field6638.field2610 + var15], this.field6637);
                        }
                    }
                    this.field6638.field2610 += var14;
                    if (this.field6638.field2610 >= var10) {
                        if (this.field6640 == null) {
                            this.field6638.field2610 = 0;
                            int var16 = this.field6638.method1177(255);
                            int var17 = this.field6638.method1220(126);
                            int var18 = this.field6638.method1177(255);
                            int var19 = this.field6638.method1178(-230315992);
                            int var20 = var18 & 0x7F;
                            boolean var21 = (var18 & 0x80) != 0;
                            long var22 = (long) ((var16 << 16) + var17);
                            Object var24 = null;
                            class96 var25;
                            if (var21) {
                                for (var25 = (class96) this.field6627.method1644((byte) -123); var25 != null && var25.field401 != var22; var25 = (class96) this.field6627.method1642(0)) {
                                }
                            } else {
                                for (var25 = (class96) this.field6621.method1644((byte) -124); var25 != null && var25.field401 != var22; var25 = (class96) this.field6621.method1642(0)) {
                                }
                            }
                            if (var25 == null) {
                                throw new IOException();
                            }
                            this.field6640 = var25;
                            int var26 = var20 == 0 ? 5 : 9;
                            this.field6640.field1130 = new class194(var19 - (-var26 - this.field6640.field1129));
                            this.field6640.field1130.method1205((byte) -69, var20);
                            this.field6640.field1130.method1223(true, var19);
                            this.field6638.field2610 = 0;
                            this.field6640.field1127 = 8;
                        } else if (this.field6640.field1127 != 0) {
                            throw new IOException();
                        } else if (this.field6638.field2622[0] == -1) {
                            this.field6638.field2610 = 0;
                            this.field6640.field1127 = 1;
                        } else {
                            this.field6640 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var29) {
            try {
                this.field6631.method3210(56);
            } catch (Exception var27) {
            }
            this.field6639++;
            this.field6636 = -2;
            this.field6631 = null;
            return this.method2765(-88) == 0 && this.method2770(true) == 0;
        }
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(I)V", line = 431)
    public final void method2762(int arg0) {
        if (this.field6631 != null) {
            this.field6631.method3211(true);
        }
        if (arg0 == 0) {
            field6615++;
        }
    }

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "(I)V", line = 445)
    public final void method2763(int arg0) {
        if (arg0 != 9) {
            this.field6635 = 43;
        }
        if (this.field6631 != null) {
            this.field6631.method3210(109);
        }
        field6622++;
    }

    @OriginalMember(owner = "client!jq", name = "d", descriptor = "(I)Ljava/lang/String;", line = 460)
    public static final String method2764(int arg0) {
        field6614++;
        if (class600.field8764 || class454.field6790 == null) {
            return "";
        } else {
            if (arg0 > -38) {
                method2759(false);
            }
            return class454.field6790.field9107;
        }
    }

    @OriginalMember(owner = "client!jq", name = "e", descriptor = "(I)I", line = 475)
    public final int method2765(int arg0) {
        field6625++;
        int var2 = -23 % (-arg0 / 46);
        return this.field6613.method1643(14030) + this.field6621.method1643(14030);
    }

    @OriginalMember(owner = "client!jq", name = "f", descriptor = "(I)V", line = 485)
    public final void method2766(int arg0) {
        field6610++;
        try {
            this.field6631.method3210(arg0 ^ 0x743E);
        } catch (Exception var2) {
        }
        this.field6637 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field6636 = -1;
        this.field6639++;
        this.field6631 = null;
        if (arg0 != 29775) {
            field6633 = -98;
        }
    }

    @OriginalMember(owner = "client!jq", name = "g", descriptor = "(I)Z", line = 508)
    public final boolean method2767(int arg0) {
        field6612++;
        int var2 = -1 % ((arg0 + 14) / 63);
        return this.method2770(true) >= 20;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIB)V", line = 521)
    public static final void method2768(int arg0, int arg1, byte arg2) {
        field6616++;
        if (arg2 < 110) {
            method2764(-105);
        }
        class467 var3 = class541.method3144(arg1, (byte) -117, 14);
        var3.method2851(true);
        var3.field6926 = arg0;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(BLqf;)Lqf;", line = 535)
    public static final class593 method2769(byte arg0, class593 arg1) {
        field6609++;
        if (arg1.field8533 != -1) {
            return class259.method1728(40, arg1.field8533);
        }
        if (arg0 != 63) {
            method2764(34);
        }
        int var2 = arg1.field8579 >>> 16;
        class438 var3 = new class438(class234.field3309);
        for (class563 var4 = (class563) var3.method2727((byte) -47); var4 != null; var4 = (class563) var3.method2728((byte) 95)) {
            if (var4.field8022 == var2) {
                return class259.method1728(40, (int) var4.field4676);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(Z)I", line = 576)
    private final int method2770(boolean arg0) {
        if (!arg0) {
            field6632 = -53L;
        }
        field6628++;
        return this.field6626.method1643(14030) + this.field6627.method1643(14030);
    }

    @OriginalMember(owner = "client!jq", name = "h", descriptor = "(I)V", line = 587)
    private final void method2771(int arg0) {
        field6618++;
        if (this.field6631 == null) {
            return;
        }
        try {
            this.field6634.field2610 = 0;
            this.field6634.method1205((byte) -69, 6);
            this.field6634.method1240(3, (byte) 112);
            if (arg0 <= 38) {
                field6629 = null;
            }
            this.field6631.method3207(0, 4, this.field6634.field2622, 0);
        } catch (IOException var3) {
            try {
                this.field6631.method3210(53);
            } catch (Exception var2) {
            }
            this.field6631 = null;
            this.field6639++;
            this.field6636 = -2;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(B)V", line = 616)
    public final void method2772(byte arg0) {
        field6611++;
        if (arg0 < 68) {
            this.method2766(-102);
        }
        if (this.field6631 == null) {
            return;
        }
        try {
            this.field6634.field2610 = 0;
            this.field6634.method1205((byte) -69, 7);
            this.field6634.method1240(0, (byte) 119);
            this.field6631.method3207(0, 4, this.field6634.field2622, 0);
        } catch (IOException var3) {
            try {
                this.field6631.method3210(-69);
            } catch (Exception var2) {
            }
            this.field6639++;
            this.field6631 = null;
            this.field6636 = -2;
        }
    }

    @OriginalMember(owner = "client!jq", name = "i", descriptor = "(I)Z", line = 669)
    public final boolean method2773(int arg0) {
        field6623++;
        if (arg0 < 45) {
            return false;
        } else {
            return this.method2765(79) >= 20;
        }
    }
}
