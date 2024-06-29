import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class86 extends class5 {

    @OriginalMember(owner = "client!mc", name = "N", descriptor = "Lsf;")
    public static class131 field2134 = new class131(64);

    @OriginalMember(owner = "client!mc", name = "S", descriptor = "I")
    public static int field2139 = -1;

    @OriginalMember(owner = "client!mc", name = "T", descriptor = "Lhe;")
    public static class54 field2140 = class6.method58("scrollen:", false);

    @OriginalMember(owner = "client!mc", name = "I", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!mc", name = "J", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!mc", name = "L", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!mc", name = "O", descriptor = "I")
    public int field2135;

    @OriginalMember(owner = "client!mc", name = "P", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!mc", name = "Q", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!mc", name = "R", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!mc", name = "H", descriptor = "Lcb;")
    public class17 field2128;

    @OriginalMember(owner = "client!mc", name = "K", descriptor = "Leb;")
    public class31 field2131;

    @OriginalMember(owner = "client!mc", name = "M", descriptor = "[B")
    public byte[] field2133;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)Ldf;")
    public static final class28 method690(int arg0) {
        field2130++;
        try {
            int var1 = -126 / ((arg0 + 32) / 39);
            return (class28) Class.forName("uf").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class16();
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BI)Z")
    public static final boolean method691(byte arg0, int arg1) {
        field2137++;
        if (class140.field3197[arg1]) {
            return true;
        } else if (class15.field455.method263(arg1, 20619)) {
            int var2 = class15.field455.method262(arg1, true);
            if (var2 == 0) {
                class140.field3197[arg1] = true;
                return true;
            }
            if (class59.field1481[arg1] == null) {
                class59.field1481[arg1] = new class93[var2];
            }
            if (arg0 <= 107) {
                return false;
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class59.field1481[arg1][var3] == null) {
                    byte[] var4 = class15.field455.method266(arg1, (byte) 127, var3);
                    if (var4 != null) {
                        class59.field1481[arg1][var3] = new class93();
                        class59.field1481[arg1][var3].field2273 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            class59.field1481[arg1][var3].method741(new class83(var4), (byte) 80);
                        } else {
                            class59.field1481[arg1][var3].method737(1, new class83(var4));
                        }
                    }
                }
            }
            class140.field3197[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)Z")
    public static final boolean method692(int arg0, int arg1, int arg2) {
        field2132++;
        if (arg0 != 75) {
            method692(-103, -4, -124);
        }
        return (arg2 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)V")
    public static final void method693(int arg0) {
        System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
        field2129++;
        System.exit(arg0);
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(B)V")
    public static void method694(byte arg0) {
        field2134 = null;
        field2140 = null;
        if (arg0 >= -28) {
            field2136 = -93;
        }
    }
}
