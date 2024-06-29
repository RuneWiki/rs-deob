import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public abstract class class543 extends class55 {

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "Lac;")
    public class541 field7689;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
    public static int field7686 = 0;

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
    public static int field7690 = 0;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    public static int field7683;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
    public static int field7684;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    public static int field7685;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
    public static int field7687;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
    public static int field7688;

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "I")
    public static int field7692;

    @OriginalMember(owner = "client!lb", name = "u", descriptor = "I")
    public static int field7693;

    @OriginalMember(owner = "client!lb", name = "v", descriptor = "I")
    public static int field7694;

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "Z")
    public boolean field7691;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)Z")
    public abstract boolean method3073(byte arg0);

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIZ)V")
    public abstract void method3074(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(B)V")
    public static final void method3075(byte arg0) {
        field7687++;
        int var1 = -92 % ((arg0 + 52) / 32);
        class358.field4752.method1563(106);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IB)V")
    public abstract void method3076(int arg0, byte arg1);

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)Z")
    public abstract boolean method3077(int arg0);

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)I")
    public int method3078(boolean arg0) {
        if (arg0) {
            this.method3081(null, -118, (byte) 5, null);
        }
        field7685++;
        return 0;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)Z")
    public final boolean method3079(int arg0) {
        field7692++;
        if (arg0 != 0) {
            this.field7691 = false;
        }
        return this.field7691;
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)Z")
    public final boolean method3080(int arg0) {
        field7693++;
        return arg0 > -5 ? false : false;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Laaa;IBLaaa;)V")
    public abstract void method3081(class616 arg0, int arg1, byte arg2, class616 arg3);

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "(I)I")
    public final int method3082(int arg0) {
        if (arg0 != 0) {
            this.field7691 = true;
        }
        field7688++;
        return 1;
    }

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "(B)V")
    public abstract void method3083(byte arg0);

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method3084(int arg0, long arg1) {
        field7694++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            if (arg0 > -42) {
                method3086(16, -80, -112, 57);
            }
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                var6.append(class353.field4713[(int) (var7 - (arg1 * 37L))]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "(B)I")
    public static final int method3085(byte arg0) {
        field7684++;
        boolean var1 = false;
        boolean var2 = false;
        boolean var3 = false;
        if (class287.field3823.field10290 && !class287.field3823.field10283) {
            var1 = true;
            if (class353.field4715.field10203 < 512 && class353.field4715.field10203 != 0) {
                var1 = false;
            }
            if (class739.field10307.startsWith("win")) {
                var3 = true;
                var2 = true;
            } else {
                var2 = true;
            }
        }
        if (class759.field10580) {
            var1 = false;
        }
        if (class4.field35) {
            var2 = false;
        }
        if (class364.field4813) {
            var3 = false;
        }
        if (!var1 && !var2 && !var3) {
            return class536.method2953(arg0 ^ 0xFFFFFF96);
        }
        int var4 = -1;
        int var5 = -1;
        if (var1) {
            try {
                var4 = class711.method3986((byte) -79, 1000, 2);
            } catch (Exception var15) {
            }
        }
        int var6 = -1;
        if (var3) {
            try {
                var6 = class711.method3986((byte) -113, 1000, 3);
                if (class11.field68.field5503.method741((byte) 127) == 3) {
                    class758 var7 = class21.field142.method418();
                    long var8 = var7.field10566 & 0xFFFFFFFFFFFFL;
                    int var10 = var7.field10565;
                    if (var10 == 4318) {
                        var2 &= var8 >= 64425238954L;
                    } else if (var10 == 4098) {
                        var2 &= var8 >= 60129613779L;
                    }
                }
            } catch (Exception var14) {
            }
        }
        if (arg0 != -106) {
            field7686 = -48;
        }
        if (var2) {
            try {
                var5 = class711.method3986((byte) -115, 1000, 1);
            } catch (Exception var13) {
            }
        }
        if (var4 == -1 && var5 == -1 && var6 == -1) {
            return class536.method2953(0);
        }
        int var11 = (int) ((float) var6 * 1.1F);
        int var12 = (int) ((float) var5 * 1.1F);
        if (var11 < var4 && var4 > var12) {
            return class86.method623(var4, 5000);
        } else if (var11 <= var12) {
            return class579.method3240(var12, 1, (byte) 98);
        } else {
            return class579.method3240(var11, 3, (byte) 98);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIII)I")
    public static final int method3086(int arg0, int arg1, int arg2, int arg3) {
        field7683++;
        if (class491.field6703 < 100) {
            return -2;
        } else if (arg1 == 1) {
            int var4 = -2;
            int var5 = Integer.MAX_VALUE;
            int var6 = arg2 - class642.field8947;
            int var7 = arg3 - class642.field8950;
            for (class513 var8 = (class513) class642.field8937.method724(arg1 ^ 0x21); var8 != null; var8 = (class513) class642.field8937.method723(88)) {
                if (var8.field6940 == arg0) {
                    int var9 = var8.field6945;
                    int var10 = var8.field6939;
                    int var11 = class642.field8947 + var9 << 14 | class642.field8950 + var10;
                    int var12 = (var6 - var9) * (var6 - var9) + (var7 - var10) * (var7 - var10);
                    if (var4 < 0 || var12 < var5) {
                        var4 = var11;
                        var5 = var12;
                    }
                }
            }
            return var4;
        } else {
            return 57;
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lac;)V")
    public class543(class541 arg0) {
        this.field7689 = arg0;
    }
}
