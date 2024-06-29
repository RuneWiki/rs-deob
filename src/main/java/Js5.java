import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!j")
public class Js5 extends Js5Index {

    @OriginalMember(owner = "mapview!j", name = "v", descriptor = "Lv;")
    public static JagString field129 = class1.method2(255, "details)3dat");

    @OriginalMember(owner = "mapview!j", name = "w", descriptor = "Lv;")
    public static JagString field130 = class1.method2(255, "Woodcutting stump");

    @OriginalMember(owner = "mapview!j", name = "z", descriptor = "Lv;")
    public static JagString field133 = class1.method2(255, "Please wait)3)3)3 Rendering Map");

    @OriginalMember(owner = "mapview!j", name = "B", descriptor = "Lv;")
    public static JagString field135 = class1.method2(255, "Helmet Shop");

    @OriginalMember(owner = "mapview!j", name = "x", descriptor = "Lv;")
    public static JagString field131 = class1.method2(255, "Dairy Churn");

    @OriginalMember(owner = "mapview!j", name = "D", descriptor = "Lv;")
    public static JagString field137 = class1.method2(255, "50(U");

    @OriginalMember(owner = "mapview!j", name = "A", descriptor = "I")
    public static volatile int field134 = 0;

    @OriginalMember(owner = "mapview!j", name = "C", descriptor = "Z")
    public static boolean field136 = true;

    @OriginalMember(owner = "mapview!j", name = "E", descriptor = "Lv;")
    public static JagString field138 = class1.method2(255, "Farming shop");

    @OriginalMember(owner = "mapview!j", name = "F", descriptor = "Lv;")
    public static JagString field139 = class1.method2(255, "Herbalist");

    @OriginalMember(owner = "mapview!j", name = "y", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "mapview!j", name = "b", descriptor = "(I)V", line = 25)
    public static void method57(int arg0) {
        field135 = null;
        field129 = null;
        field131 = null;
        field130 = null;
        field138 = null;
        if (arg0 != 0) {
            method57(53);
        }
        field133 = null;
        field139 = null;
        field137 = null;
    }

    @OriginalMember(owner = "mapview!j", name = "<init>", descriptor = "([BZZ)V", line = 66)
    public Js5(byte[] arg0, boolean arg1, boolean arg2) throws IOException {
        this(arg0, arg1, arg2, false);
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(ZLjava/io/DataInputStream;B)V", line = 72)
    private final void method58(boolean arg0, DataInputStream arg1, byte arg2) throws IOException {
        if (arg0) {
        }
        if (arg2 < 26) {
            field132 = -61;
        }
        int var4 = arg1.read();
        int var5 = arg1.readInt();
        int var6 = var5;
        if (var4 != 0) {
            var5 += 4;
        }
        Packet var7 = new Packet(var5 + 5);
        var7.p1(var4, -1);
        var7.p4(var6, (byte) 97);
        arg1.readFully(var7.data, var7.pos, var5);
        this.method125((byte) 5, var7.data);
        for (int var8 = 0; ~var8 > ~super.field328; ++var8) {
            int var9 = arg1.read();
            int var10 = arg1.readInt();
            int var11 = var10;
            if (var9 != 0) {
                var10 += 4;
            }
            Packet var12 = new Packet(var10 + 5);
            var12.p1(var9, -1);
            var12.p4(var11, (byte) 97);
            while (33554432 < var10) {
                var10 -= 33554432;
                arg1.readFully(var12.data, var12.pos, 33554432);
                var12.pos += 33554432;
            }
            arg1.readFully(var12.data, var12.pos, var10);
            if (super.field321) {
                super.field322[super.field326[var8]] = var12.data;
            } else {
                super.field322[super.field326[var8]] = StringNode.wrap(false, var12.data, false);
            }
        }
    }

    @OriginalMember(owner = "mapview!j", name = "<init>", descriptor = "([BZZZ)V", line = 158)
    private Js5(byte[] arg0, boolean arg1, boolean arg2, boolean arg3) throws IOException {
        super(arg1, arg2);
        this.method58(arg3, new DataInputStream(new ByteArrayInputStream(arg0)), (byte) 42);
    }
}
