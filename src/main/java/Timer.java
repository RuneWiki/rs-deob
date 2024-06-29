import java.awt.Component;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ra")
public abstract class Timer {

    @OriginalMember(owner = "mapview!ra", name = "c", descriptor = "I")
    public static int field397 = 0;

    @OriginalMember(owner = "mapview!ra", name = "e", descriptor = "J")
    public static volatile long field399 = 0L;

    @OriginalMember(owner = "mapview!ra", name = "f", descriptor = "Lv;")
    public static JagString field400 = class1.method2(255, "Tannery");

    @OriginalMember(owner = "mapview!ra", name = "i", descriptor = "Lv;")
    public static JagString field403 = class1.method2(255, "POH Portal");

    @OriginalMember(owner = "mapview!ra", name = "h", descriptor = "I")
    public static int field402 = 0;

    @OriginalMember(owner = "mapview!ra", name = "b", descriptor = "Lv;")
    public static JagString field396 = class1.method2(255, "Magic Shop");

    @OriginalMember(owner = "mapview!ra", name = "k", descriptor = "Lv;")
    public static JagString field405 = class1.method2(255, "Staff Shop");

    @OriginalMember(owner = "mapview!ra", name = "g", descriptor = "Lv;")
    public static JagString field401 = class1.method2(255, "Switch to ");

    @OriginalMember(owner = "mapview!ra", name = "d", descriptor = "J")
    public static long field398 = 0L;

    @OriginalMember(owner = "mapview!ra", name = "m", descriptor = "Lv;")
    public static JagString field407 = class1.method2(255, "loc)3dat");

    @OriginalMember(owner = "mapview!ra", name = "l", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "Ljava/awt/Image;")
    public static Image field395;

    @OriginalMember(owner = "mapview!ra", name = "j", descriptor = "[B")
    public static byte[] field404;

    @OriginalMember(owner = "mapview!fa", name = "b", descriptor = "(B)Lra;", line = 7)
    public static final Timer create(byte arg0) {
        if (arg0 != 98) {
            StringNode.create((byte) 83);
        }
        try {
            return (Timer) Class.forName("ha").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new MillisTimer();
        }
    }

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(Z)V", line = 9)
    public static void method188(boolean arg0) {
        field407 = null;
        field405 = null;
        field401 = null;
        field404 = null;
        field395 = null;
        field396 = null;
        field400 = null;
        field403 = null;
        if (arg0) {
            method193(-101, 17, null, -46);
        }
    }

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(II)I", line = 28)
    public static int method189(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(I)B", line = 38)
    public static final byte method190(int arg0) {
        if (arg0 == 0) {
            return GameShell.field205 == null ? 0 : GameShell.field205[JavaKeyboard.field12];
        } else {
            return -65;
        }
    }

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(IB)I", line = 53)
    public static final int method191(int arg0, byte arg1) {
        if (arg1 <= 30) {
            method188(true);
        }
        if (arg0 >= 65 && arg0 <= 90) {
            arg0 += 32;
        }
        return arg0;
    }

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(BZIII)V", line = 75)
    public static final void method192(byte arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (arg1) {
            field406 = 91;
        }
        int var5 = arg3 >> 6;
        int var6 = arg4 >> 6;
        if (class18.field165[arg2][var6][var5] == null) {
            class18.field165[arg2][var6][var5] = new byte[4096];
        }
        class18.field165[arg2][var6][var5][method189(63, arg3) + method189(arg4 << 6, 4032)] = arg0;
    }

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(IILjava/awt/Component;I)Lna;", line = 97)
    public static final PixMap method193(int arg0, int arg1, Component arg2, int arg3) {
        try {
            Class var4 = Class.forName("d");
            if (arg0 != 0) {
                field396 = null;
            }
            PixMap var5 = (PixMap) var4.getDeclaredConstructor().newInstance();
            var5.init(false, arg1, arg3, arg2);
            return var5;
        } catch (Throwable var8) {
            JavaPixMap var7 = new JavaPixMap();
            var7.init(false, arg1, arg3, arg2);
            return var7;
        }
    }

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "([Lv;III)Lv;", line = 122)
    public static final JagString method194(JagString[] arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 22760) {
            field407 = null;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < arg2; var5++) {
            if (arg0[arg1 + var5] == null) {
                arg0[arg1 + var5] = class18.field161;
            }
            var4 += arg0[arg1 + var5].field468;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg2; var8++) {
            JagString var9 = arg0[arg1 + var8];
            ByteArrayCopier.copy(var9.field474, 0, var6, var7, var9.field468);
            var7 += var9.field468;
        }
        JagString var10 = new JagString();
        var10.field474 = var6;
        var10.field468 = var4;
        return var10;
    }

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(I[B)[B", line = 191)
    public static final byte[] method195(int arg0, byte[] arg1) {
        if (arg0 != 7219) {
            method188(false);
        }
        Packet var2 = new Packet(arg1);
        int var3 = var2.g1(false);
        int var4 = var2.method155(65280);
        if (var4 < 0 || ByteArray.field125 != 0 && var4 > ByteArray.field125) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.gdata(var7, 0, false, var4);
            return var7;
        } else {
            int var5 = var2.method155(65280);
            if (var5 < 0 || ByteArray.field125 != 0 && ByteArray.field125 < var5) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                BZip2.decompress(var6, var5, arg1, var4, 9);
            } else {
                IntHashTable.field55.decompress(var2, 3, var6);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(Lv;Lo;BLv;)[Lf;", line = 254)
    public static final Pix8[] method196(JagString arg0, Js5Index arg1, byte arg2, JagString arg3) {
        if (arg2 != 82) {
            method190(23);
        }
        int var4 = arg1.method128((byte) -99, arg3);
        int var5 = arg1.method132(-9751, var4, arg0);
        return Packet.method156(arg2 ^ 0xFFFF8CE6, var5, arg1, var4);
    }

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(III)I")
    public abstract int sleep(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(B)V")
    public abstract void init(byte arg0);
}
