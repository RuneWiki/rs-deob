import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class310 {

    @OriginalMember(owner = "client!he", name = "c", descriptor = "F")
    public float field3944 = 0.25F;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "F")
    public float field3955 = 1.0F;

    @OriginalMember(owner = "client!he", name = "t", descriptor = "F")
    public float field3961 = 1.0F;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "F")
    public float field3946;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "I")
    public int field3953;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "I")
    public int field3952;

    @OriginalMember(owner = "client!he", name = "q", descriptor = "F")
    public float field3958;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    public int field3948;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "F")
    public float field3943;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public int field3947;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    public int field3945;

    @OriginalMember(owner = "client!he", name = "u", descriptor = "Lmv;")
    public class313 field3962;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "I")
    public int field3950;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "J")
    public static long field3949 = -1L;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!he", name = "r", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!he", name = "s", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!he", name = "v", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!he", name = "w", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!he", name = "x", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)Z", line = 7)
    public static final boolean method1716(int arg0) {
        field3956++;
        if (arg0 != 0) {
            field3942 = -37;
        }
        if (class545.field8022) {
            try {
                class47.method249("showVideoAd", class74.field873.field2014, (byte) 96);
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Los;B)V", line = 33)
    public final void method1717(class374 arg0, byte arg1) {
        this.field3955 = (float) (arg0.method2129(-90) * 8) / 255.0F;
        if (arg1 != -15) {
            method1723(34);
        }
        field3957++;
        this.field3944 = (float) (arg0.method2129(-70) * 8) / 255.0F;
        this.field3961 = (float) (arg0.method2129(-124) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Ldn;I)V", line = 52)
    public static final void method1718(class438 arg0, int arg1) {
        class325.field4147 = arg0.method2579(-1, "titlebg");
        field3964++;
        class249.field3177 = arg0.method2579(arg1, "logo");
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V", line = 63)
    public static final void method1719(int arg0) {
        field3960++;
        class611.field8871.method1770(21308);
        for (int var1 = 0; var1 < 32; var1++) {
            class466.field6527[var1] = 0L;
        }
        int var2 = 0;
        if (arg0 != 2) {
            method1722((byte) -98, -77L);
        }
        while (var2 < 32) {
            class205.field2449[var2] = 0L;
            var2++;
        }
        class433.field5862 = 0;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V", line = 230)
    public class310() {
        this.field3946 = 1.1523438F;
        this.field3953 = class175.field2134;
        this.field3952 = -60;
        this.field3958 = 1.2F;
        this.field3948 = class171.field2082;
        this.field3943 = 0.69921875F;
        this.field3947 = -50;
        this.field3945 = -50;
        this.field3962 = class450.field6234;
        this.field3950 = 0;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Los;)V", line = 247)
    public class310(class374 arg0) {
        int var2 = arg0.method2129(-95);
        if (class565.field8299.method993(class529.field7429, -104) && class512.field7236.method1122() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field3953 = class175.field2134;
            } else {
                this.field3953 = arg0.method2123(false);
            }
            if ((var2 & 0x2) == 0) {
                this.field3946 = 1.1523438F;
            } else {
                this.field3946 = (float) arg0.method2136(false) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field3943 = 0.69921875F;
            } else {
                this.field3943 = (float) arg0.method2136(false) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field3958 = 1.2F;
            } else {
                this.field3958 = (float) arg0.method2136(false) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method2123(false);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method2136(false);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method2136(false);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method2136(false);
            }
            this.field3946 = 1.1523438F;
            this.field3958 = 1.2F;
            this.field3953 = class175.field2134;
            this.field3943 = 0.69921875F;
        }
        if ((var2 & 0x10) == 0) {
            this.field3952 = -60;
            this.field3947 = -50;
            this.field3945 = -50;
        } else {
            this.field3947 = arg0.method2089(true);
            this.field3952 = arg0.method2089(true);
            this.field3945 = arg0.method2089(true);
        }
        if ((var2 & 0x20) == 0) {
            this.field3948 = class171.field2082;
        } else {
            this.field3948 = arg0.method2123(false);
        }
        if ((var2 & 0x40) == 0) {
            this.field3950 = 0;
        } else {
            this.field3950 = arg0.method2136(false);
        }
        if ((var2 & 0x80) == 0) {
            this.field3962 = class450.field6234;
        } else {
            int var3 = arg0.method2136(false);
            int var4 = arg0.method2136(false);
            int var5 = arg0.method2136(false);
            int var6 = arg0.method2136(false);
            int var7 = arg0.method2136(false);
            int var8 = arg0.method2136(false);
            this.field3962 = class184.method1007(var8, (byte) 17, var5, var6, var3, var4, var7);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lhe;B)Z", line = 93)
    public final boolean method1720(class310 arg0, byte arg1) {
        if (arg1 > -96) {
            return true;
        } else {
            field3951++;
            return this.field3953 == arg0.field3953 && this.field3946 == arg0.field3946 && this.field3943 == arg0.field3943 && this.field3958 == arg0.field3958 && this.field3944 == arg0.field3944 && this.field3955 == arg0.field3955 && this.field3961 == arg0.field3961 && this.field3948 == arg0.field3948 && this.field3950 == arg0.field3950 && this.field3962 == arg0.field3962;
        }
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(I)V", line = 111)
    public static final void method1721(int arg0) {
        field3965++;
        int var1 = class370.field4878;
        int[] var2 = class519.field7302;
        for (int var3 = 0; var3 < var1; var3++) {
            class545 var9 = class459.field6329[var2[var3]];
            if (var9 != null && var9.field6448 > 0) {
                var9.field6448--;
                if (var9.field6448 == 0) {
                    var9.field6441 = null;
                }
            }
        }
        for (int var4 = arg0; var4 < class474.field6637; var4++) {
            long var5 = (long) class194.field2345[var4];
            class415 var7 = (class415) class309.field3938.method2645(var5, (byte) -121);
            if (var7 != null) {
                class459 var8 = var7.field5390;
                if (var8.field6448 > 0) {
                    var8.field6448--;
                    if (var8.field6448 == 0) {
                        var8.field6441 = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BJ)Ljava/lang/String;", line = 172)
    public static final String method1722(byte arg0, long arg1) {
        field3954++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            int var3 = 114 / ((arg0 - 56) / 42);
            int var4 = 0;
            long var5 = arg1;
            while (var5 != 0L) {
                var5 /= 37L;
                var4++;
            }
            StringBuffer var7 = new StringBuffer(var4);
            while (arg1 != 0L) {
                long var8 = arg1;
                arg1 /= 37L;
                char var10 = class258.field3322[(int) (var8 - (arg1 * 37L))];
                if (var10 == '_') {
                    int var11 = var7.length() - 1;
                    var7.setCharAt(var11, Character.toUpperCase(var7.charAt(var11)));
                    var10 = ' ';
                }
                var7.append(var10);
            }
            var7.reverse();
            var7.setCharAt(0, Character.toUpperCase(var7.charAt(0)));
            return var7.toString();
        }
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(I)I", line = 220)
    public static final int method1723(int arg0) {
        if (arg0 <= 114) {
            field3963 = 40;
        }
        field3959++;
        return 16;
    }
}
