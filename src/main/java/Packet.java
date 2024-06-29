import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!p")
public class Packet extends Linkable {

    @OriginalMember(owner = "mapview!p", name = "l", descriptor = "[B")
    public byte[] data;

    @OriginalMember(owner = "mapview!p", name = "p", descriptor = "I")
    public int pos;

    @OriginalMember(owner = "mapview!p", name = "n", descriptor = "[I")
    public static int[] field343 = new int[128];

    @OriginalMember(owner = "mapview!p", name = "m", descriptor = "I")
    public static int field342 = 0;

    @OriginalMember(owner = "mapview!p", name = "o", descriptor = "I")
    public static int field344 = 0;

    @OriginalMember(owner = "mapview!p", name = "q", descriptor = "Lv;")
    public static JagString field346 = class1.method2(255, "Next page");

    @OriginalMember(owner = "mapview!p", name = "k", descriptor = "[I")
    public static int[] field340;

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(II)V", line = 29)
    public final void p1(int arg0, int arg1) {
        this.data[this.pos++] = (byte) arg0;
        if (arg1 != -1) {
            field344 = -109;
        }
    }

    @OriginalMember(owner = "mapview!p", name = "b", descriptor = "(B)I", line = 45)
    public final int g2(byte arg0) {
        this.pos += 2;
        return arg0 == 0 ? ((this.data[this.pos - 2] & 0xFF) << 8) + (this.data[this.pos - 1] & 0xFF) : 116;
    }

    @OriginalMember(owner = "mapview!p", name = "b", descriptor = "(I)B", line = 62)
    public final byte g1b(int arg0) {
        if (arg0 != 63) {
            this.gdata(null, 115, false, -8);
        }
        return this.data[this.pos++];
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(Z)I", line = 75)
    public final int g1(boolean arg0) {
        if (arg0) {
            field343 = null;
        }
        return this.data[this.pos++] & 0xFF;
    }

    @OriginalMember(owner = "mapview!p", name = "c", descriptor = "(I)I", line = 85)
    public final int g3(int arg0) {
        if (arg0 != -5567) {
            method156(86, 18, null, 96);
        }
        this.pos += 3;
        return ((this.data[this.pos - 3] & 0xFF) << 16) + ((this.data[this.pos - 2] & 0xFF) << 8) + (this.data[this.pos + -1] & 0xFF);
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(II[IZ)V", line = 98)
    public final void tinydec(int arg0, int arg1, int[] arg2, boolean arg3) {
        int var5 = (arg1 - arg0) / 8;
        int var6 = this.pos;
        this.pos = arg0;
        int var7 = 0;
        if (arg3) {
            this.method155(40);
        }
        while (var7 < var5) {
            int var8 = this.method155(65280);
            int var9 = this.method155(65280);
            int var10 = -957401312;
            int var11 = 32;
            int var12 = -1640531527;
            while (var11-- > 0) {
                var9 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg2[var10 >>> 11 & 0xAA800003] + var10;
                var10 -= var12;
                var8 -= (var9 << 4 ^ var9 >>> 5) + var9 ^ arg2[var10 & 0x3] + var10;
            }
            this.pos -= 8;
            this.p4(var8, (byte) 97);
            this.p4(var9, (byte) 97);
            var7++;
        }
        this.pos = var6;
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "([BIZI)V", line = 145)
    public final void gdata(byte[] arg0, int arg1, boolean arg2, int arg3) {
        for (int var5 = arg1; var5 < arg1 + arg3; var5++) {
            arg0[var5] = this.data[this.pos++];
        }
        if (arg2) {
            this.pos = 16;
        }
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(IB)V", line = 163)
    public final void p4(int arg0, byte arg1) {
        this.data[this.pos++] = (byte) (arg0 >> 24);
        this.data[this.pos++] = (byte) (arg0 >> 16);
        this.data[this.pos++] = (byte) (arg0 >> 8);
        if (arg1 != 97) {
            this.method155(65);
        }
        this.data[this.pos++] = (byte) arg0;
    }

    @OriginalMember(owner = "mapview!p", name = "c", descriptor = "(B)Lv;", line = 191)
    public final JagString gjstr(byte arg0) {
        if (arg0 != -43) {
            this.g3(-100);
        }
        int var2 = this.pos;
        while (this.data[this.pos++] != 0) {
        }
        return JavaMouse.method180(this.pos - var2 - 1, var2, arg0 ^ 0xFFFFFFEA, this.data);
    }

    @OriginalMember(owner = "mapview!p", name = "d", descriptor = "(B)V", line = 204)
    public static void method154(byte arg0) {
        field346 = null;
        if (arg0 != 87) {
            method154((byte) -16);
        }
        field343 = null;
        field340 = null;
    }

    @OriginalMember(owner = "mapview!p", name = "d", descriptor = "(I)I", line = 217)
    public final int method155(int arg0) {
        this.pos += 4;
        if (arg0 != 65280) {
            this.pos = -49;
        }
        return (this.data[this.pos - 1] & 0xFF) + ((this.data[this.pos - 3] & 0xFF) << 16) + ((this.data[this.pos + -4] & 0xFF) << 24) + ((this.data[this.pos + -2] & 0xFF) << 8);
    }

    @OriginalMember(owner = "mapview!p", name = "<init>", descriptor = "(I)V", line = 286)
    public Packet(int arg0) {
        this.data = ByteArrayPool.alloc((byte) 102, arg0);
        this.pos = 0;
    }

    @OriginalMember(owner = "mapview!p", name = "<init>", descriptor = "([B)V", line = 305)
    public Packet(byte[] arg0) {
        this.pos = 0;
        this.data = arg0;
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(IILo;I)[Lf;", line = 322)
    public static final Pix8[] method156(int arg0, int arg1, Js5Index arg2, int arg3) {
        if (HashTable.method31(arg1, arg2, -1, arg3)) {
            if (arg0 != -29516) {
                method156(60, -54, null, -25);
            }
            return IntHashTable.method25(1);
        } else {
            return null;
        }
    }
}
