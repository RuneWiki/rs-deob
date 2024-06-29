import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pga")
public class class537 {

    @OriginalMember(owner = "client!pga", name = "k", descriptor = "Lkg;")
    public static class275 field7447 = new class275(24, 0);

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "B")
    public byte field7437;

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "B")
    public byte field7438;

    @OriginalMember(owner = "client!pga", name = "e", descriptor = "B")
    public byte field7441;

    @OriginalMember(owner = "client!pga", name = "g", descriptor = "B")
    public byte field7443;

    @OriginalMember(owner = "client!pga", name = "h", descriptor = "B")
    public byte field7444;

    @OriginalMember(owner = "client!pga", name = "j", descriptor = "B")
    public byte field7446;

    @OriginalMember(owner = "client!pga", name = "m", descriptor = "B")
    public byte field7449;

    @OriginalMember(owner = "client!pga", name = "c", descriptor = "I")
    public int field7439;

    @OriginalMember(owner = "client!pga", name = "i", descriptor = "I")
    public static int field7445;

    @OriginalMember(owner = "client!pga", name = "l", descriptor = "I")
    public static int field7448;

    @OriginalMember(owner = "client!pga", name = "n", descriptor = "I")
    public int field7450;

    @OriginalMember(owner = "client!pga", name = "v", descriptor = "I")
    public int field7458;

    @OriginalMember(owner = "client!pga", name = "w", descriptor = "Lfh;")
    public static class653 field7459;

    @OriginalMember(owner = "client!pga", name = "o", descriptor = "S")
    public short field7451;

    @OriginalMember(owner = "client!pga", name = "d", descriptor = "Z")
    public boolean field7440;

    @OriginalMember(owner = "client!pga", name = "f", descriptor = "Z")
    public boolean field7442;

    @OriginalMember(owner = "client!pga", name = "p", descriptor = "Z")
    public boolean field7452;

    @OriginalMember(owner = "client!pga", name = "q", descriptor = "Z")
    public boolean field7453;

    @OriginalMember(owner = "client!pga", name = "s", descriptor = "Z")
    public boolean field7455;

    @OriginalMember(owner = "client!pga", name = "t", descriptor = "Z")
    public boolean field7456;

    @OriginalMember(owner = "client!pga", name = "u", descriptor = "Z")
    public boolean field7457;

    @OriginalMember(owner = "client!pga", name = "x", descriptor = "Z")
    public boolean field7460;

    @OriginalMember(owner = "client!pga", name = "r", descriptor = "[Liea;")
    public static class481[] field7454;

    @OriginalMember(owner = "client!pga", name = "y", descriptor = "[Liea;")
    public static class481[] field7461;

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(B)Lef;")
    public static final class490 method3087(byte arg0) {
        if (arg0 != -28) {
            field7459 = null;
        }
        field7445++;
        return class73.field1020;
    }

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "(B)V")
    public static void method3088(byte arg0) {
        if (arg0 < 57) {
            field7454 = null;
        }
        field7454 = null;
        field7459 = null;
        field7461 = null;
        field7447 = null;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(I)I")
    public static final int method3089(int arg0) {
        field7448++;
        boolean var1 = false;
        boolean var2 = false;
        boolean var3 = false;
        if (class162.field2227.field6256 && !class162.field2227.field6235) {
            var1 = true;
            if (class323.field4162.field367 < 512 && class323.field4162.field367 != 0) {
                var1 = false;
            }
            if (class465.field6233.startsWith("win")) {
                var2 = true;
                var3 = true;
            } else {
                var2 = true;
            }
        }
        if (class712.field9879) {
            var3 = false;
        }
        if (class290.field3802) {
            var1 = false;
        }
        if (class514.field7214) {
            var2 = false;
        }
        if (!var1 && !var2 && !var3) {
            return class272.method1609(-11806);
        }
        int var4 = -1;
        int var5 = -1;
        int var6 = -1;
        if (var1) {
            try {
                var4 = class103.method819(2, 1000, (byte) -74);
            } catch (Exception var15) {
            }
        }
        if (var3) {
            try {
                var6 = class103.method819(3, 1000, (byte) -104);
                if (class748.field10451.field10399.method1924((byte) 78) == 3) {
                    class647 var7 = class386.field4930.method499();
                    long var8 = var7.field8961 & 0xFFFFFFFFFFFFL;
                    int var10 = var7.field8954;
                    if (var10 == 4318) {
                        var2 &= var8 >= 64425238954L;
                    } else if (var10 == 4098) {
                        var2 &= var8 >= 60129613779L;
                    }
                }
            } catch (Exception var14) {
            }
        }
        if (arg0 != 3) {
            return -107;
        }
        if (var2) {
            try {
                var5 = class103.method819(1, 1000, (byte) -82);
            } catch (Exception var13) {
            }
        }
        if (var4 == -1 && var5 == -1 && var6 == -1) {
            return class272.method1609(-11806);
        }
        int var11 = (int) ((float) var6 * 1.1F);
        int var12 = (int) ((float) var5 * 1.1F);
        if (var4 > var11 && var12 < var4) {
            return class597.method3386(var4, -126);
        } else if (var12 >= var11) {
            return class129.method962(arg0 + 19997, 1, var12);
        } else {
            return class129.method962(20000, 3, var11);
        }
    }
}
