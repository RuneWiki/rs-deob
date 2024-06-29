import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class232 {

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "I")
    public int field3264 = 0;

    @OriginalMember(owner = "client!ki", name = "s", descriptor = "I")
    public int field3270 = 0;

    @OriginalMember(owner = "client!ki", name = "q", descriptor = "Z")
    private boolean field3268 = false;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public int field3253;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    public int field3254;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
    public int field3257;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
    public int field3259;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
    public int field3260;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "I")
    public int field3262;

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "I")
    private int field3263;

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "I")
    public int field3265;

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!ki", name = "p", descriptor = "I")
    public int field3267;

    @OriginalMember(owner = "client!ki", name = "t", descriptor = "I")
    public int field3271;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "J")
    public long field3258;

    @OriginalMember(owner = "client!ki", name = "r", descriptor = "Lum;")
    public static class83 field3269;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V", line = 5)
    public static final void method1437(byte arg0) {
        if (arg0 != -2) {
            return;
        }
        field3261++;
        class382 var1 = class426.field6355;
        synchronized (class426.field6355) {
            class426.field6355.method2293(false);
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(B)V", line = 20)
    public static void method1438(byte arg0) {
        field3269 = null;
        int var1 = 75 / ((-arg0 - 37) / 62);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILgk;I)V", line = 35)
    private final void method1439(int arg0, class468 arg1, int arg2) {
        field3255++;
        int var4 = 66 / ((arg2 - 64) / 40);
        if (arg0 == 1) {
            this.field3263 = arg1.method2727((byte) 43);
        } else if (arg0 == 2) {
            arg1.method2765(122);
        } else if (arg0 == 3) {
            this.field3265 = arg1.method2722(false);
            this.field3254 = arg1.method2722(false);
            this.field3260 = arg1.method2722(false);
        } else if (arg0 == 4) {
            this.field3267 = arg1.method2765(97);
            this.field3253 = arg1.method2722(false);
        } else if (arg0 == 6) {
            this.field3262 = arg1.method2765(57);
        } else if (arg0 == 8) {
            this.field3270 = 1;
        } else if (arg0 == 9) {
            this.field3264 = 1;
            return;
        } else if (arg0 == 10) {
            this.field3268 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(III)Z", line = 94)
    public static final boolean method1440(int arg0, int arg1, int arg2) {
        field3252++;
        if (!class495.field7350) {
            return false;
        }
        int var3 = arg0 >> 16;
        int var4 = arg0 & 0xFFFF;
        if (class174.field2549[var3] == null || class174.field2549[var3][var4] == null) {
            return false;
        } else if (arg2 == -13007) {
            class310 var5 = class174.field2549[var3][var4];
            if (arg1 == -1 && var5.field4703 == 0) {
                for (class477 var6 = (class477) class154.field2334.method2957(103); var6 != null; var6 = (class477) class154.field2334.method2947(70)) {
                    if (var6.field7034 == 16 || var6.field7034 == 1008 || var6.field7034 == 17 || var6.field7034 == 11 || var6.field7034 == 22) {
                        for (class310 var7 = class52.method386(arg2 ^ 0xFFFFCD31, var6.field7029); var7 != null; var7 = class367.method2185(var7, (byte) -2)) {
                            if (var5.field4643 == var7.field4643) {
                                return true;
                            }
                        }
                    }
                }
            } else {
                for (class477 var8 = (class477) class154.field2334.method2957(95); var8 != null; var8 = (class477) class154.field2334.method2947(109)) {
                    if (var8.field7039 == arg1 && var5.field4643 == var8.field7029 && (var8.field7034 == 16 || var8.field7034 == 1008 || var8.field7034 == 17 || var8.field7034 == 11 || var8.field7034 == 22)) {
                        return true;
                    }
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)V", line = 161)
    public final void method1441(boolean arg0) {
        this.field3257 = class445.field6544[this.field3263 << 3];
        field3266++;
        this.field3271 = (int) Math.sqrt((double) (this.field3254 * this.field3254 + this.field3265 * this.field3265 + this.field3260 * this.field3260));
        if (this.field3253 == 0) {
            this.field3253 = 1;
        }
        if (arg0) {
            return;
        }
        if (this.field3267 == 0) {
            this.field3258 = 2147483647L;
        } else if (this.field3267 == 1) {
            this.field3258 = (this.field3271 * 8 / this.field3253);
            this.field3258 *= this.field3258;
        } else if (this.field3267 == 2) {
            this.field3258 = (this.field3271 * 8 / this.field3253);
        }
        if (this.field3268) {
            this.field3271 *= -1;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(BLgk;)V", line = 199)
    public final void method1442(byte arg0, class468 arg1) {
        if (arg0 != -81) {
            return;
        }
        field3256++;
        while (true) {
            int var3 = arg1.method2765(60);
            if (var3 == 0) {
                return;
            }
            this.method1439(var3, arg1, 109);
        }
    }
}
