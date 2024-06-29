import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class382 {

    @OriginalMember(owner = "client!el", name = "f", descriptor = "Lng;")
    private class226 field5785 = new class226(16);

    @OriginalMember(owner = "client!el", name = "b", descriptor = "Lic;")
    private class491 field5781;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "Llt;")
    public static class475 field5782;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "Llt;")
    public static class475 field5788;

    @OriginalMember(owner = "client!el", name = "m", descriptor = "F")
    public static float field5792;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public static int field5780;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "I")
    public static int field5783;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "I")
    public static int field5784;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "I")
    public static int field5786;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "I")
    public static int field5787;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "I")
    public static int field5789;

    @OriginalMember(owner = "client!el", name = "k", descriptor = "I")
    public static int field5790;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "I")
    public static int field5791;

    static {
        new class475("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
        field5782 = new class475("flash2:", "blinken2:", "clignotant2:", "flash2:");
        field5788 = new class475("Discard", "Ablegen", "Jeter", "Descartar");
        new class475("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
        field5792 = 0.0F;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V", line = 11)
    public final void method2328(int arg0) {
        class226 var2 = this.field5785;
        synchronized (this.field5785) {
            if (arg0 != 13356) {
                field5782 = null;
            }
            this.field5785.method1540(0);
        }
        field5784++;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(BLji;Ljava/lang/Object;)V", line = 27)
    public static final void method2329(byte arg0, class432 arg1, Object arg2) {
        field5790++;
        if (arg1.field6456 == null) {
            return;
        }
        if (arg0 < 35) {
            method2333(-26, 72, -32);
        }
        for (int var3 = 0; var3 < 50 && arg1.field6456.peekEvent() != null; var3++) {
            class246.method1659((byte) 117, 1L);
        }
        if (arg2 != null) {
            arg1.field6456.postEvent(new ActionEvent(arg2, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(II)Lmg;", line = 51)
    private final class100 method2330(int arg0, int arg1) {
        field5783++;
        class226 var3 = this.field5785;
        class100 var4;
        synchronized (this.field5785) {
            var4 = (class100) this.field5785.method1536((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field5781.method2945(29, arg1, true);
        class100 var6 = new class100();
        if (var5 != null) {
            var6.method615(new class209(var5), -82);
        }
        if (arg0 < 19) {
            return null;
        }
        class226 var7 = this.field5785;
        synchronized (this.field5785) {
            this.field5785.method1542(var6, (byte) 112, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(I)V", line = 81)
    public static void method2331(int arg0) {
        int var1 = -77 % ((arg0 + 30) / 54);
        field5788 = null;
        field5782 = null;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(B)V", line = 99)
    public static final void method2332(byte arg0) {
        field5786++;
        if (arg0 >= -8) {
            return;
        }
        try {
            if (class150.field2232 == 1) {
                int var1 = class411.field6178.method1259(-16684);
                if (var1 > 0 && class411.field6178.method1238((byte) -67)) {
                    int var2 = var1 - class88.field1343;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class411.field6178.method1240((byte) 106, var2);
                } else {
                    class411.field6178.method1242(2);
                    class411.field6178.method1266(false);
                    class470.field6931 = null;
                    class165.field2424 = null;
                    if (class197.field2869 == null) {
                        class150.field2232 = 0;
                    } else {
                        class150.field2232 = 2;
                    }
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class411.field6178.method1242(2);
            class165.field2424 = null;
            class150.field2232 = 0;
            class197.field2869 = null;
            class470.field6931 = null;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(III)Z", line = 147)
    public static final boolean method2333(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class310.field4460; var3++) {
            class430 var4 = class184.field2746[var3];
            if (var4.field6424 == 1) {
                int var5 = var4.field6428 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field6422 * var5 >> 8) + var4.field6430;
                    int var7 = (var4.field6419 * var5 >> 8) + var4.field6427;
                    int var8 = (var4.field6437 * var5 >> 8) + var4.field6436;
                    int var9 = (var4.field6435 * var5 >> 8) + var4.field6433;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field6424 == 2) {
                int var10 = arg0 - var4.field6428;
                if (var10 > 0) {
                    int var11 = (var4.field6422 * var10 >> 8) + var4.field6430;
                    int var12 = (var4.field6419 * var10 >> 8) + var4.field6427;
                    int var13 = (var4.field6437 * var10 >> 8) + var4.field6436;
                    int var14 = (var4.field6435 * var10 >> 8) + var4.field6433;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field6424 == 3) {
                int var15 = var4.field6430 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field6431 * var15 >> 8) + var4.field6428;
                    int var17 = (var4.field6426 * var15 >> 8) + var4.field6420;
                    int var18 = (var4.field6437 * var15 >> 8) + var4.field6436;
                    int var19 = (var4.field6435 * var15 >> 8) + var4.field6433;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field6424 == 4) {
                int var20 = arg2 - var4.field6430;
                if (var20 > 0) {
                    int var21 = (var4.field6431 * var20 >> 8) + var4.field6428;
                    int var22 = (var4.field6426 * var20 >> 8) + var4.field6420;
                    int var23 = (var4.field6437 * var20 >> 8) + var4.field6436;
                    int var24 = (var4.field6435 * var20 >> 8) + var4.field6433;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field6424 == 5) {
                int var25 = arg1 - var4.field6436;
                if (var25 > 0) {
                    int var26 = (var4.field6431 * var25 >> 8) + var4.field6428;
                    int var27 = (var4.field6426 * var25 >> 8) + var4.field6420;
                    int var28 = (var4.field6422 * var25 >> 8) + var4.field6430;
                    int var29 = (var4.field6419 * var25 >> 8) + var4.field6427;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(II)V", line = 269)
    public final void method2334(int arg0, int arg1) {
        if (arg0 != 8) {
            this.method2328(45);
        }
        class226 var3 = this.field5785;
        synchronized (this.field5785) {
            this.field5785.method1534(0, arg1);
        }
        field5780++;
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Lai;ILic;)V", line = 288)
    public class382(class423 arg0, int arg1, class491 arg2) {
        this.field5781 = arg2;
        this.field5781.method2942(false, 29);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ILtv;IIII)Lvv;", line = 303)
    public final class212 method2335(int arg0, class391 arg1, int arg2, int arg3, int arg4, int arg5) {
        field5787++;
        class440[] var7 = null;
        class100 var8 = this.method2330(81, arg4);
        if (var8.field1457 != null) {
            var7 = new class440[var8.field1457.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class253 var10 = arg1.method2380(-58, var8.field1457[var9]);
                var7[var9] = new class440(var10.field3759, var10.field3760, var10.field3770, var10.field3767, var10.field3765, var10.field3764, var10.field3758, var10.field3768);
            }
        }
        if (arg5 > -41) {
            field5782 = null;
        }
        return new class212(var8.field1460, var7, var8.field1456, arg3, arg2, arg0);
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(I)V", line = 336)
    public final void method2336(int arg0) {
        field5791++;
        class226 var2 = this.field5785;
        synchronized (this.field5785) {
            this.field5785.method1539(arg0 ^ 0xFFFFFFBB);
            if (arg0 != 8) {
                field5788 = null;
            }
        }
    }
}
