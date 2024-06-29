import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lfa")
public class class100 {

    @OriginalMember(owner = "client!lfa", name = "b", descriptor = "I")
    public int field1358 = 16777215;

    @OriginalMember(owner = "client!lfa", name = "f", descriptor = "I")
    public int field1362 = 8;

    @OriginalMember(owner = "client!lfa", name = "k", descriptor = "Lvh;")
    public static class328 field1367 = new class328(20);

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "I")
    public int field1357;

    @OriginalMember(owner = "client!lfa", name = "c", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!lfa", name = "d", descriptor = "I")
    public int field1360;

    @OriginalMember(owner = "client!lfa", name = "e", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!lfa", name = "g", descriptor = "I")
    public int field1363;

    @OriginalMember(owner = "client!lfa", name = "h", descriptor = "I")
    public int field1364;

    @OriginalMember(owner = "client!lfa", name = "j", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!lfa", name = "l", descriptor = "I")
    public int field1368;

    @OriginalMember(owner = "client!lfa", name = "i", descriptor = "Z")
    public boolean field1365;

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(I)V", line = 8)
    public static void method770(int arg0) {
        field1367 = null;
        if (arg0 != 30941) {
            field1367 = null;
        }
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(III)Z", line = 20)
    public static final boolean method771(int arg0, int arg1, int arg2) {
        field1366++;
        if (arg0 == 1) {
            return (arg1 & 0x20) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(ILjr;I)V", line = 31)
    private final void method772(int arg0, class96 arg1, int arg2) {
        field1359++;
        if (arg0 == 1) {
            this.field1362 = arg1.method743((byte) -111);
        } else if (arg0 == 2) {
            this.field1365 = true;
        } else if (arg0 == 3) {
            this.field1363 = arg1.method722(4);
            this.field1368 = arg1.method722(4);
            this.field1357 = arg1.method722(4);
        } else if (arg0 == 4) {
            this.field1364 = arg1.method718(-85);
        } else if (arg0 == 5) {
            this.field1360 = arg1.method743((byte) -70);
        } else if (arg0 == 6) {
            this.field1358 = arg1.method736(-123);
        }
        int var4 = -119 / ((-arg2 - 66) / 43);
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(Ljr;I)V", line = 85)
    public final void method773(class96 arg0, int arg1) {
        field1361++;
        while (true) {
            int var3 = arg0.method718(-108);
            if (var3 == 0) {
                if (arg1 <= 18) {
                    this.method773(null, -99);
                    return;
                } else {
                    return;
                }
            }
            this.method772(var3, arg0, 114);
        }
    }
}
