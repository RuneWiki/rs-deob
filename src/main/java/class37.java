import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class37 extends class15 {

    @OriginalMember(owner = "client!pc", name = "y", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!pc", name = "z", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!pc", name = "C", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!pc", name = "G", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!pc", name = "H", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!pc", name = "I", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!pc", name = "J", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!pc", name = "K", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!pc", name = "L", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!pc", name = "N", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!pc", name = "E", descriptor = "Ljava/lang/String;")
    public String field456;

    @OriginalMember(owner = "client!pc", name = "M", descriptor = "Ljava/lang/String;")
    public static String field464;

    @OriginalMember(owner = "client!pc", name = "B", descriptor = "[C")
    public char[] field453;

    @OriginalMember(owner = "client!pc", name = "D", descriptor = "[C")
    public char[] field455;

    @OriginalMember(owner = "client!pc", name = "A", descriptor = "[I")
    public int[] field452;

    @OriginalMember(owner = "client!pc", name = "F", descriptor = "[I")
    public int[] field457;

    static {
        new class40("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)Z", line = 3)
    public static final boolean method188(int arg0) {
        if (arg0 != 0) {
            method193(-57, 70, 40, -15, 32);
        }
        field459++;
        if (class220.field3076) {
            try {
                if ((Boolean) class336.method2038(class42.field512.field5106, -125, "showingVideoAd")) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lvt;I)V", line = 27)
    public final void method189(class179 arg0, int arg1) {
        field461++;
        while (true) {
            int var3 = arg0.method895((byte) -98);
            if (var3 == 0) {
                if (arg1 <= 93) {
                    field464 = null;
                    return;
                } else {
                    return;
                }
            }
            this.method194(var3, arg0, (byte) -104);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLws;)V", line = 55)
    public static final void method190(byte arg0, class158 arg1) {
        field460++;
        if (!class385.field5517) {
            int var2 = 87 % ((24 - arg0) / 50);
            arg1.method702((byte) -114);
            class223.field3099--;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BC)I", line = 72)
    public final int method191(byte arg0, char arg1) {
        field450++;
        if (this.field457 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field457.length; var3++) {
            if (this.field455[var3] == arg1) {
                return this.field457[var3];
            }
        }
        if (arg0 != -128) {
            method190((byte) -9, (class158) null);
        }
        return -1;
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)V", line = 96)
    public static void method192(int arg0) {
        if (arg0 == 0) {
            field464 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIII)V", line = 107)
    public static final void method193(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 0) {
            method190((byte) 8, (class158) null);
        }
        if (class322.field4659 == 1) {
            class283.field4119[class347.field4955 / 100].method2363(class485.field6884 - 8, class244.field3333 - 8);
        }
        field465++;
        if (class322.field4659 == 2) {
            class283.field4119[(class347.field4955 / 100) + 4].method2363(class485.field6884 - 8, class244.field3333 + -8);
        }
        class305.method1906((byte) -104);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILvt;B)V", line = 132)
    private final void method194(int arg0, class179 arg1, byte arg2) {
        field458++;
        if (arg0 == 1) {
            this.field456 = arg1.method907(-27652);
        } else if (arg0 == 2) {
            int var4 = arg1.method895((byte) -99);
            this.field453 = new char[var4];
            this.field452 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field452[var5] = arg1.method916(21933);
                byte var6 = arg1.method922(32429);
                this.field453[var5] = var6 == 0 ? 0 : class437.method2598(var6, (byte) -49);
            }
        } else if (arg0 == 3) {
            int var7 = arg1.method895((byte) -101);
            this.field455 = new char[var7];
            this.field457 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field457[var8] = arg1.method916(21933);
                byte var9 = arg1.method922(32429);
                this.field455[var8] = var9 == 0 ? 0 : class437.method2598(var9, (byte) -49);
            }
        }
        int var10 = -92 / ((-arg2 - 50) / 34);
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(BC)I", line = 194)
    public final int method195(byte arg0, char arg1) {
        field454++;
        if (this.field452 == null) {
            return -1;
        }
        if (arg0 != -90) {
            this.method196((byte) -49);
        }
        for (int var3 = 0; var3 < this.field452.length; var3++) {
            if (this.field453[var3] == arg1) {
                return this.field452[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "(B)V", line = 218)
    public final void method196(byte arg0) {
        if (this.field457 != null) {
            for (int var2 = 0; var2 < this.field457.length; var2++) {
                this.field457[var2] = class292.method1841(this.field457[var2], 32768);
            }
        }
        field463++;
        if (this.field452 != null) {
            for (int var3 = 0; var3 < this.field452.length; var3++) {
                this.field452[var3] = class292.method1841(this.field452[var3], 32768);
            }
        }
        int var4 = 81 / ((arg0 - 47) / 63);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IILmt;)Loe;", line = 250)
    public static final class248 method197(int arg0, int arg1, class83 arg2) {
        if (arg1 != 0) {
            field464 = null;
        }
        field462++;
        class248 var3;
        if (class145.field1745 == null) {
            var3 = new class248();
        } else {
            var3 = class145.field1745;
            class145.field1745 = class145.field1745.field3490;
            class159.field1898--;
            var3.field3490 = null;
        }
        var3.field3487 = arg2;
        var3.field3488 = arg0;
        return var3;
    }
}
