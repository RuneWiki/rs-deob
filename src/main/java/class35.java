import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!v")
public class class35 extends class2 {

    @OriginalMember(owner = "mapview!v", name = "A", descriptor = "Lh;")
    public static class15 field441 = class26.method190(true, "Scimitar Shop");

    @OriginalMember(owner = "mapview!v", name = "D", descriptor = "Lh;")
    public static class15 field444 = class26.method190(true, "Transportation");

    @OriginalMember(owner = "mapview!v", name = "C", descriptor = "[I")
    public static int[] field443 = new int[128];

    @OriginalMember(owner = "mapview!v", name = "K", descriptor = "J")
    public static volatile long field449 = 0L;

    @OriginalMember(owner = "mapview!v", name = "L", descriptor = "Lh;")
    public static class15 field450 = class26.method190(true, "overlay2)3dat");

    @OriginalMember(owner = "mapview!v", name = "J", descriptor = "Lh;")
    public static class15 field448 = class26.method190(true, "details)3dat");

    @OriginalMember(owner = "mapview!v", name = "B", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "mapview!v", name = "E", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "mapview!v", name = "G", descriptor = "Lna;")
    public static class27 field446;

    @OriginalMember(owner = "mapview!v", name = "z", descriptor = "[B")
    public static byte[] field440;

    @OriginalMember(owner = "mapview!v", name = "I", descriptor = "[Lv;")
    public static class35[] field447;

    @OriginalMember(owner = "mapview!v", name = "<init>", descriptor = "([BZZ)V", line = 12)
    public class35(byte[] arg0, boolean arg1, boolean arg2) throws IOException {
        this(arg0, arg1, arg2, false);
    }

    @OriginalMember(owner = "mapview!v", name = "b", descriptor = "(I)V", line = 23)
    public static final void method235(int arg0) {
        if (class26.field354 != null) {
            class21 var1 = class26.field354;
            synchronized (class26.field354) {
                class26.field354 = null;
            }
        }
        if (arg0 < 32) {
            method237(125);
        }
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(IZLjava/io/DataInputStream;)V", line = 54)
    private final void method236(int arg0, boolean arg1, DataInputStream arg2) throws IOException {
        int var4 = arg2.read();
        if (arg1) {
        }
        if (arg0 >= -31) {
            method237(-31);
        }
        int var5 = arg2.readInt();
        int var6 = var5;
        if (var4 != 0) {
            var5 += 4;
        }
        class18 var7 = new class18(var5 + 5);
        var7.method158(var4, 24594);
        var7.method154((byte) 103, var6);
        arg2.readFully(var7.field288, var7.field286, var5);
        this.method45(var7.field288, -96);
        for (int var8 = 0; ~var8 > ~super.field83; ++var8) {
            int var9 = arg2.read();
            int var10 = arg2.readInt();
            int var11 = var10;
            if (~var9 != -1) {
                var10 += 4;
            }
            class18 var12 = new class18(var10 + 5);
            var12.method158(var9, 24594);
            var12.method154((byte) 81, var11);
            while (~var10 < -33554433) {
                arg2.readFully(var12.field288, var12.field286, 33554432);
                var12.field286 += 33554432;
                var10 -= 33554432;
            }
            arg2.readFully(var12.field288, var12.field286, var10);
            super.field94[super.field95[var8]] = var12.field288;
        }
    }

    @OriginalMember(owner = "mapview!v", name = "<init>", descriptor = "([BZZZ)V", line = 123)
    private class35(byte[] arg0, boolean arg1, boolean arg2, boolean arg3) throws IOException {
        super(arg1, arg2);
        this.method236(-125, arg3, new DataInputStream(new ByteArrayInputStream(arg0)));
    }

    @OriginalMember(owner = "mapview!v", name = "c", descriptor = "(I)V", line = 136)
    public static void method237(int arg0) {
        field443 = null;
        field448 = null;
        field446 = null;
        if (arg0 != 33554432) {
            method237(-120);
        }
        field447 = null;
        field440 = null;
        field444 = null;
        field450 = null;
        field441 = null;
    }
}
