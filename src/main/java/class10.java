import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!f")
public class class10 extends class11 {

    @OriginalMember(owner = "mapview!f", name = "u", descriptor = "Lta;")
    public static class37 field105 = class20.method87(-107, "uitext has incorrect number of strings");

    @OriginalMember(owner = "mapview!f", name = "x", descriptor = "I")
    public static int field108 = 0;

    @OriginalMember(owner = "mapview!f", name = "y", descriptor = "[I")
    public static int[] field109 = new int[128];

    @OriginalMember(owner = "mapview!f", name = "z", descriptor = "I")
    public static int field110 = 50;

    @OriginalMember(owner = "mapview!f", name = "A", descriptor = "Lta;")
    public static class37 field111 = class20.method87(-86, "b12_full");

    @OriginalMember(owner = "mapview!f", name = "w", descriptor = "Lta;")
    public static class37 field107 = class20.method87(-103, "Holiday Event");

    @OriginalMember(owner = "mapview!f", name = "B", descriptor = "Z")
    public static boolean field112 = false;

    @OriginalMember(owner = "mapview!f", name = "v", descriptor = "Lta;")
    public static class37 field106 = class20.method87(-114, "Slayer Master");

    @OriginalMember(owner = "mapview!f", name = "D", descriptor = "Lta;")
    public static class37 field114 = class20.method87(-84, "Find");

    @OriginalMember(owner = "mapview!f", name = "C", descriptor = "[[Lna;")
    public static class27[][] field113;

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(ZILjava/io/DataInputStream;)V", line = 6)
    private final void method39(boolean arg0, int arg1, DataInputStream arg2) throws IOException {
        if (arg0) {
        }
        int var4 = arg2.read();
        int var5 = arg2.readInt();
        int var6 = var5;
        if (var4 != 0) {
            var5 += 4;
        }
        class21 var7 = new class21(var5 - -5);
        var7.method102(var4, (byte) -125);
        var7.method93((byte) 122, var6);
        arg2.readFully(var7.field234, var7.field235, var5);
        this.method48(var7.field234, -126);
        if (arg1 >= -73) {
            field105 = (class37) null;
        }
        for (int var8 = 0; var8 < super.field129; ++var8) {
            int var9 = arg2.read();
            int var10 = arg2.readInt();
            int var11 = var10;
            if (~var9 != -1) {
                var10 += 4;
            }
            class21 var12 = new class21(var10 - -5);
            var12.method102(var9, (byte) -113);
            var12.method93((byte) 103, var11);
            while (var10 > 33554432) {
                var10 -= 33554432;
                arg2.readFully(var12.field234, var12.field235, 33554432);
                var12.field235 += 33554432;
            }
            arg2.readFully(var12.field234, var12.field235, var10);
            if (super.field130) {
                super.field126[super.field122[var8]] = var12.field234;
            } else {
                super.field126[super.field122[var8]] = class31.method189(false, var12.field234, -115);
            }
        }
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(II)I", line = 72)
    public static int method40(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "mapview!f", name = "<init>", descriptor = "([BZZZ)V", line = 82)
    private class10(byte[] arg0, boolean arg1, boolean arg2, boolean arg3) throws IOException {
        super(arg1, arg2);
        this.method39(arg3, -126, new DataInputStream(new ByteArrayInputStream(arg0)));
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "([Lta;I)V", line = 95)
    public static final void method41(class37[] arg0, int arg1) {
        class38.method250((byte) -126, arg0, arg0.length, arg1);
    }

    @OriginalMember(owner = "mapview!f", name = "<init>", descriptor = "([BZZ)V", line = 126)
    public class10(byte[] arg0, boolean arg1, boolean arg2) throws IOException {
        this(arg0, arg1, arg2, false);
    }

    @OriginalMember(owner = "mapview!f", name = "b", descriptor = "(I)V", line = 135)
    public static void method42(int arg0) {
        field106 = null;
        field105 = null;
        if (arg0 != -31958) {
            method41((class37[]) null, 100);
        }
        field114 = null;
        field111 = null;
        field107 = null;
        field109 = null;
        field113 = (class27[][]) null;
    }
}
