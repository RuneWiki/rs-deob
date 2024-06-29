import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!n")
public class class26 extends class43 {

    @OriginalMember(owner = "mapview!n", name = "B", descriptor = "Lua;")
    public static class41 field363 = class16.method86("Quest Start", true);

    @OriginalMember(owner = "mapview!n", name = "G", descriptor = "Z")
    public static boolean field368 = false;

    @OriginalMember(owner = "mapview!n", name = "y", descriptor = "I")
    public static int field360 = 0;

    @OriginalMember(owner = "mapview!n", name = "C", descriptor = "Lua;")
    public static class41 field364 = class16.method86("Estate Agent", true);

    @OriginalMember(owner = "mapview!n", name = "H", descriptor = "Lua;")
    public static class41 field369 = class16.method86("Helmet Shop", true);

    @OriginalMember(owner = "mapview!n", name = "E", descriptor = "Lua;")
    public static class41 field366 = class16.method86("download", true);

    @OriginalMember(owner = "mapview!n", name = "z", descriptor = "Lua;")
    public static class41 field361 = class16.method86("General Store", true);

    @OriginalMember(owner = "mapview!n", name = "A", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "mapview!n", name = "I", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "mapview!n", name = "J", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "mapview!n", name = "F", descriptor = "I")
    public static int originZ;

    @OriginalMember(owner = "mapview!n", name = "D", descriptor = "Lia;")
    public static class17 field365;

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(IZLjava/io/DataInputStream;)V", line = 4)
    private final void method171(int arg0, boolean arg1, DataInputStream arg2) throws IOException {
        if (!arg1) {
        }
        int var4 = arg2.read();
        int var5 = arg2.readInt();
        int var6 = var5;
        if (var4 != 0) {
            var5 += 4;
        }
        class19 var7 = new class19(var5 + 5);
        var7.method107(var4, (byte) 113);
        var7.method98((byte) -117, var6);
        arg2.readFully(var7.field157, var7.field158, var5);
        this.method260(var7.field157, 6);
        int var8 = 40 % ((-62 - arg0) / 61);
        for (int var9 = 0; super.field523 > var9; ++var9) {
            int var10 = arg2.read();
            int var11 = arg2.readInt();
            int var12 = var11;
            if (~var10 != -1) {
                var11 += 4;
            }
            class19 var13 = new class19(var11 + 5);
            var13.method107(var10, (byte) 113);
            var13.method98((byte) -79, var12);
            while (var11 > 33554432) {
                arg2.readFully(var13.field157, var13.field158, 33554432);
                var13.field158 += 33554432;
                var11 -= 33554432;
            }
            arg2.readFully(var13.field157, var13.field158, var11);
            if (!super.field540) {
                super.field528[super.field524[var9]] = class41.method236(false, var13.field157, (byte) 57);
            } else {
                super.field528[super.field524[var9]] = var13.field157;
            }
        }
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;I)V", line = 72)
    public static final void method172(Throwable arg0, String arg1, int arg2) {
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class10.method54(1, arg0);
            }
            if (arg1 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            if (arg2 != -9068) {
                return;
            }
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class21.field221.field389 == null) {
                return;
            }
            class6 var8 = class21.field221.method187(false, new URL(class21.field221.field389.getCodeBase(), "clienterror.ws?c=" + class43.field531 + "&u=" + class31.field413 + "&v1=" + class30.field391 + "&v2=" + class30.field395 + "&e=" + var7));
            while (~var8.field74 == -1) {
                class42.method249(-128, 1L);
            }
            if (~var8.field74 == -2) {
                DataInputStream var9 = (DataInputStream) var8.field76;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "mapview!n", name = "<init>", descriptor = "([BZZ)V", line = 134)
    public class26(byte[] arg0, boolean arg1, boolean arg2) throws IOException {
        this(arg0, arg1, arg2, false);
    }

    @OriginalMember(owner = "mapview!n", name = "b", descriptor = "(I)V", line = 163)
    public static void method173(int arg0) {
        field365 = null;
        field366 = null;
        if (arg0 != 11884) {
            field365 = (class17) null;
        }
        field369 = null;
        field361 = null;
        field364 = null;
        field363 = null;
    }

    @OriginalMember(owner = "mapview!n", name = "<init>", descriptor = "([BZZZ)V", line = 192)
    private class26(byte[] arg0, boolean arg1, boolean arg2, boolean arg3) throws IOException {
        super(arg1, arg2);
        this.method171(-123, arg3, new DataInputStream(new ByteArrayInputStream(arg0)));
    }
}
