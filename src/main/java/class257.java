import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class257 {

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "Luaa;")
    private class395 field3724 = new class395(64);

    @OriginalMember(owner = "client!dn", name = "s", descriptor = "Luaa;")
    public class395 field3738 = new class395(50);

    @OriginalMember(owner = "client!dn", name = "t", descriptor = "Lop;")
    public class364 field3739 = new class364(250);

    @OriginalMember(owner = "client!dn", name = "u", descriptor = "Lln;")
    private class94 field3740 = new class94();

    @OriginalMember(owner = "client!dn", name = "g", descriptor = "Lgp;")
    public class561 field3726;

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "Z")
    private boolean field3722;

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "Lgp;")
    private class561 field3721;

    @OriginalMember(owner = "client!dn", name = "w", descriptor = "Lvb;")
    private class289 field3742;

    @OriginalMember(owner = "client!dn", name = "i", descriptor = "I")
    public int field3728;

    @OriginalMember(owner = "client!dn", name = "q", descriptor = "I")
    public int field3736;

    @OriginalMember(owner = "client!dn", name = "y", descriptor = "[Ljava/lang/String;")
    private String[] field3744;

    @OriginalMember(owner = "client!dn", name = "x", descriptor = "[Ljava/lang/String;")
    private String[] field3743;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!dn", name = "h", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!dn", name = "j", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!dn", name = "k", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!dn", name = "l", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!dn", name = "m", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!dn", name = "n", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!dn", name = "o", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!dn", name = "p", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!dn", name = "r", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!dn", name = "v", descriptor = "I")
    public int field3741;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)V", line = 9)
    public final void method1619(byte arg0) {
        if (arg0 != 127) {
            this.method1622(-68, null, 103, (byte) -103, 6, null, 53, false, null, 21, true, null);
        }
        class395 var2 = this.field3738;
        synchronized (this.field3738) {
            this.field3738.method2406(63);
        }
        field3734++;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)V", line = 23)
    public final void method1620(int arg0, int arg1) {
        field3729++;
        if (arg1 != 10) {
            this.field3728 = 105;
        }
        class395 var3 = this.field3724;
        synchronized (this.field3724) {
            this.field3724.method2397(arg0, (byte) -54);
        }
        class395 var4 = this.field3738;
        synchronized (this.field3738) {
            this.field3738.method2397(arg0, (byte) -69);
        }
        class364 var5 = this.field3739;
        synchronized (this.field3739) {
            this.field3739.method2196(arg0, 8);
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(BI)Lbb;", line = 44)
    public final class381 method1621(byte arg0, int arg1) {
        int var3 = 119 % ((arg0 - 16) / 35);
        field3725++;
        class395 var4 = this.field3724;
        class381 var5;
        synchronized (this.field3724) {
            var5 = (class381) this.field3724.method2407(false, (long) arg1);
        }
        if (var5 != null) {
            return var5;
        }
        class561 var6 = this.field3721;
        byte[] var7;
        synchronized (this.field3721) {
            var7 = this.field3721.method3175(class550.method3095(1706, arg1), (byte) -53, class75.method719(arg1, 2259880));
        }
        class381 var8 = new class381();
        var8.field5635 = arg1;
        var8.field5629 = this;
        var8.field5599 = new String[] { null, null, class204.field2875.method3220(false, this.field3728), null, null };
        var8.field5606 = new String[] { null, null, null, null, class46.field639.method3220(false, this.field3728) };
        if (var7 != null) {
            var8.method2323(-3, new class268(var7));
        }
        var8.method2315(-32);
        if (var8.field5596 != -1) {
            var8.method2326(this.method1621((byte) 80, var8.field5632), 0, this.method1621((byte) -38, var8.field5596));
        }
        if (var8.field5631 != -1) {
            var8.method2320(4, this.method1621((byte) 101, var8.field5631), this.method1621((byte) 66, var8.field5602));
        }
        if (!this.field3722 && var8.field5646) {
            var8.field5658 = class592.field8416.method3220(false, this.field3728);
            var8.field5606 = this.field3743;
            var8.field5609 = false;
            var8.field5599 = this.field3744;
            var8.field5655 = 0;
            var8.field5666 = null;
            if (var8.field5626 != null) {
                boolean var9 = false;
                for (class108 var10 = var8.field5626.method734(0); var10 != null; var10 = var8.field5626.method736(-1)) {
                    class188 var11 = this.field3742.method1831(-26, (int) var10.field1798);
                    if (var11.field2706) {
                        var10.method911(-52);
                    } else {
                        var9 = true;
                    }
                }
                if (!var9) {
                    var8.field5626 = null;
                }
            }
        }
        class395 var12 = this.field3724;
        synchronized (this.field3724) {
            this.field3724.method2408(var8, (long) arg1, -109);
            return var8;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILqn;IBILqa;IZLra;IZLqa;)Lha;", line = 120)
    public final class116 method1622(int arg0, class525 arg1, int arg2, byte arg3, int arg4, class167 arg5, int arg6, boolean arg7, class259 arg8, int arg9, boolean arg10, class167 arg11) {
        field3727++;
        class116 var13 = this.method1626((byte) -122, arg0, arg4, arg5, arg2, arg6, arg1, arg9);
        if (var13 != null) {
            return var13;
        }
        class381 var14 = this.method1621((byte) -41, arg9);
        if (arg0 > 1 && var14.field5651 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (var14.field5619[var16] <= arg0 && var14.field5619[var16] != 0) {
                    var15 = var14.field5651[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method1621((byte) -85, var15);
            }
        }
        int[] var17 = var14.method2312(arg1, arg2, arg6, arg8, arg11, 1, arg4, arg0, arg5, arg7);
        if (var17 == null) {
            return null;
        }
        class116 var18;
        if (arg10) {
            var18 = arg11.method528(var17, 0, 36, 36, 32);
        } else {
            var18 = arg5.method528(var17, 0, 36, 36, 32);
        }
        if (!arg10) {
            class94 var19 = new class94();
            var19.field1653 = arg4;
            var19.field1647 = arg2;
            var19.field1656 = arg0;
            var19.field1655 = arg1 != null;
            var19.field1651 = arg6;
            var19.field1648 = arg5.field2441;
            var19.field1657 = arg9;
            this.field3739.method2194(var19, 1, var18);
        }
        return arg3 == -77 ? var18 : null;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V", line = 187)
    public final void method1623(int arg0) {
        class364 var2 = this.field3739;
        synchronized (this.field3739) {
            this.field3739.method2200(93);
        }
        field3723++;
        if (arg0 >= -14) {
            this.method1621((byte) -122, -120);
        }
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(I)V", line = 200)
    public final void method1624(int arg0) {
        class395 var2 = this.field3724;
        synchronized (this.field3724) {
            this.field3724.method2404((byte) -78);
            if (arg0 != -97) {
                this.field3744 = null;
            }
        }
        field3720++;
        class395 var3 = this.field3738;
        synchronized (this.field3738) {
            this.field3738.method2404((byte) -83);
        }
        class364 var4 = this.field3739;
        synchronized (this.field3739) {
            this.field3739.method2198((byte) 113);
        }
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(B)V", line = 219)
    public final void method1625(byte arg0) {
        class395 var2 = this.field3724;
        synchronized (this.field3724) {
            this.field3724.method2406(69);
        }
        field3730++;
        class395 var3 = this.field3738;
        synchronized (this.field3738) {
            if (arg0 != -87) {
                this.method1622(120, null, -63, (byte) 92, 93, null, -103, false, null, 41, false, null);
            }
            this.field3738.method2406(arg0 + 150);
        }
        class364 var4 = this.field3739;
        synchronized (this.field3739) {
            this.field3739.method2200(125);
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(BIILqa;IILqn;I)Lha;", line = 245)
    public final class116 method1626(byte arg0, int arg1, int arg2, class167 arg3, int arg4, int arg5, class525 arg6, int arg7) {
        field3737++;
        this.field3740.field1655 = arg6 != null;
        this.field3740.field1657 = arg7;
        this.field3740.field1653 = arg2;
        if (arg0 >= -121) {
            return null;
        }
        this.field3740.field1648 = arg3.field2441;
        this.field3740.field1656 = arg1;
        this.field3740.field1651 = arg5;
        this.field3740.field1647 = arg4;
        return (class116) this.field3739.method2203((byte) -106, this.field3740);
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(II)V", line = 263)
    public final void method1627(int arg0, int arg1) {
        field3735++;
        this.field3741 = arg0;
        class395 var3 = this.field3738;
        synchronized (this.field3738) {
            this.field3738.method2406(-5);
        }
        if (arg1 != -31009) {
            this.method1622(117, null, -16, (byte) 67, -61, null, -66, true, null, -16, false, null);
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(BZ)V", line = 278)
    public final void method1628(byte arg0, boolean arg1) {
        field3731++;
        if (this.field3722 != arg1) {
            this.field3722 = arg1;
            int var3 = -27 % ((arg0 - 67) / 47);
            this.method1625((byte) -87);
        }
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Ljc;IZLvb;Lgp;Lgp;)V", line = 482)
    public class257(class584 arg0, int arg1, boolean arg2, class289 arg3, class561 arg4, class561 arg5) {
        this.field3726 = arg5;
        this.field3722 = arg2;
        this.field3721 = arg4;
        this.field3742 = arg3;
        this.field3728 = arg1;
        if (this.field3721 == null) {
            this.field3736 = 0;
        } else {
            int var7 = this.field3721.method3185(-48) - 1;
            this.field3736 = var7 * 256 + this.field3721.method3164(var7, true);
        }
        this.field3744 = new String[] { null, null, class204.field2875.method3220(false, this.field3728), null, null };
        this.field3743 = new String[] { null, null, null, null, class46.field639.method3220(false, this.field3728) };
    }

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "(B)V", line = 307)
    public static final void method1629(byte arg0) {
        if (class217.field3276 < 102) {
            class217.field3276 += 6;
        }
        if (class85.field1564 != 0) {
            class637.field9254 -= class85.field1564 * 5;
            if (class308.field4466 <= class637.field9254) {
                class637.field9254 = class308.field4466 - 1;
            }
            class85.field1564 = 0;
            if (class637.field9254 < 0) {
                class637.field9254 = 0;
            }
        }
        field3732++;
        if (arg0 != 38) {
            method1629((byte) -19);
        }
        for (int var1 = 0; var1 < class151.field2283; var1++) {
            class200 var2 = class465.field6706[var1];
            int var3 = var2.method835((byte) -21);
            char var4 = var2.method837(false);
            int var5 = var2.method839(-3641);
            if (var3 == 84) {
                class516.method2895(false, (byte) 108);
            }
            if (var3 == 80) {
                class516.method2895(true, (byte) 51);
            } else if (var3 == 66 && (var5 & 0x4) != 0) {
                if (class644.field9363 != null) {
                    String var10 = "";
                    for (int var11 = class555.field7859.length - 1; var11 >= 0; var11--) {
                        if (class555.field7859[var11] != null && class555.field7859[var11].length() > 0) {
                            var10 = var10 + class555.field7859[var11] + '\n';
                        }
                    }
                    class644.field9363.setContents(new StringSelection(var10), null);
                }
            } else if (var3 == 67 && (var5 & 0x4) != 0) {
                if (class644.field9363 != null) {
                    Transferable var6 = class644.field9363.getContents(null);
                    if (var6 != null) {
                        try {
                            String var7 = (String) var6.getTransferData(DataFlavor.stringFlavor);
                            if (var7 != null) {
                                String[] var8 = class580.method3325((byte) 118, '\n', var7);
                                if (var8.length <= 1) {
                                    class57.field822 = class57.field822 + var7;
                                } else {
                                    for (int var9 = 0; var9 < var8.length; var9++) {
                                        class57.field822 = var8[var9];
                                        class516.method2895(false, (byte) 99);
                                    }
                                }
                            }
                        } catch (Exception var12) {
                        }
                    }
                }
            } else if (var3 == 85 && class424.field6206 > 0) {
                class57.field822 = class57.field822.substring(0, class424.field6206 - 1) + class57.field822.substring(class424.field6206);
                class424.field6206--;
            } else if (var3 == 101 && class424.field6206 < class57.field822.length()) {
                class57.field822 = class57.field822.substring(0, class424.field6206) + class57.field822.substring(class424.field6206 + 1);
            } else if (var3 == 96 && class424.field6206 > 0) {
                class424.field6206--;
            } else if (var3 == 97 && class424.field6206 < class57.field822.length()) {
                class424.field6206++;
            } else if (var3 == 102) {
                class424.field6206 = 0;
            } else if (var3 == 103) {
                class424.field6206 = class57.field822.length();
            } else if (var3 == 104 && class381.field5612 < class555.field7859.length) {
                class381.field5612++;
                class640.method3692((byte) -116);
                class424.field6206 = class57.field822.length();
            } else if (var3 == 105 && class381.field5612 > 0) {
                class381.field5612--;
                class640.method3692((byte) -114);
                class424.field6206 = class57.field822.length();
            } else if (class173.method1190(var4, arg0 + 28164) || var4 == ':' || var4 == ',' || var4 == ' ' || var4 == '_' || var4 == '-' || var4 == '+' || var4 == '[' || var4 == ']') {
                class57.field822 = class57.field822.substring(0, class424.field6206) + class465.field6706[var1].method837(false) + class57.field822.substring(class424.field6206);
                class424.field6206++;
            }
        }
        class151.field2283 = 0;
        class530.method2980(-6891);
    }
}
