import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class46 extends class70 {

    @OriginalMember(owner = "client!hd", name = "C", descriptor = "I")
    public int field957;

    @OriginalMember(owner = "client!hd", name = "H", descriptor = "I")
    private int field962;

    @OriginalMember(owner = "client!hd", name = "P", descriptor = "[[I")
    public int[][] field970;

    @OriginalMember(owner = "client!hd", name = "L", descriptor = "[I")
    public int[] field966;

    @OriginalMember(owner = "client!hd", name = "M", descriptor = "Llc;")
    public static class69 field967 = class69.method470((byte) -127, "yellow:");

    @OriginalMember(owner = "client!hd", name = "O", descriptor = "[I")
    public static int[] field969 = new int[] { 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800 };

    @OriginalMember(owner = "client!hd", name = "N", descriptor = "I")
    public static int field968 = -1;

    @OriginalMember(owner = "client!hd", name = "Q", descriptor = "Llc;")
    public static class69 field971 = class69.method470((byte) -126, "Off");

    @OriginalMember(owner = "client!hd", name = "V", descriptor = "I")
    public static int field976 = 0;

    @OriginalMember(owner = "client!hd", name = "I", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!hd", name = "J", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!hd", name = "K", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!hd", name = "S", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!hd", name = "U", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!hd", name = "D", descriptor = "Lcc;")
    public static class16 field958;

    @OriginalMember(owner = "client!hd", name = "G", descriptor = "Lda;")
    public static class20 field961;

    @OriginalMember(owner = "client!hd", name = "T", descriptor = "Lk;")
    public static class60 field974;

    @OriginalMember(owner = "client!hd", name = "E", descriptor = "[I")
    public static int[] field959;

    @OriginalMember(owner = "client!hd", name = "F", descriptor = "[I")
    public static int[] field960;

    @OriginalMember(owner = "client!hd", name = "R", descriptor = "[Ljc;")
    public static class57[] field972;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I[Llc;)Llc;")
    public static final class69 method305(int arg0, class69[] arg1) {
        if (arg0 != 20025) {
            method309(29);
        }
        field965++;
        if (arg1.length < 2) {
            throw new IllegalArgumentException();
        }
        return class18.method108(0, arg0 ^ 0x4E39, arg1, arg1.length);
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(I)V")
    public static final void method306(int arg0) {
        if (arg0 == 25685) {
            class115.field2498.method220((byte) -115);
            class68.field1450.method220((byte) -113);
            field975++;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lcc;I)V")
    public static final void method307(class16 arg0, int arg1) {
        field973++;
        if (arg1 != 261) {
            return;
        }
        class23 var2 = new class23();
        var2.field490 = 2;
        var2.field485 = arg0;
        class80 var3 = class91.field1986;
        synchronized (class91.field1986) {
            class91.field1986.method577(var2, -124);
        }
        class63.method404((byte) -108);
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(I[B)V")
    public class46(int arg0, byte[] arg1) {
        this.field957 = arg0;
        class94 var3 = new class94(arg1);
        this.field962 = var3.method703((byte) 97);
        this.field970 = new int[this.field962][];
        this.field966 = new int[this.field962];
        for (int var4 = 0; var4 < this.field962; var4++) {
            this.field966[var4] = var3.method703((byte) 104);
        }
        for (int var5 = 0; var5 < this.field962; var5++) {
            this.field970[var5] = new int[var3.method703((byte) 91)];
        }
        for (int var6 = 0; var6 < this.field962; var6++) {
            for (int var7 = 0; var7 < this.field970[var6].length; var7++) {
                this.field970[var6][var7] = var3.method703((byte) 110);
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "(I)V")
    public static final void method308(int arg0) {
        field963++;
        if (arg0 != 0) {
            return;
        }
        for (class13 var1 = (class13) class75.field1689.method580((byte) -68); var1 != null; var1 = (class13) class75.field1689.method576((byte) 87)) {
            if (var1.field247 == -1) {
                var1.field260 = 0;
                class77.method551(var1, arg0 + 89);
            } else {
                var1.method502(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "(I)V")
    public static final void method309(int arg0) {
        field964++;
        class89.field1940 = true;
        class114.method837(false);
        int var1 = 68 % ((arg0 + 19) / 62);
        if (class67.field1396 != -1) {
            boolean var3 = class4.method17(1, 0, -1, 190, false, 0, class67.field1396, 261, 0);
            if (!var3) {
                class110.field2418 = true;
            }
        } else if (class51.field1110[class40.field792] != -1) {
            boolean var2 = class4.method17(1, 0, -1, 190, false, 0, class51.field1110[class40.field792], 261, 0);
            if (!var2) {
                class110.field2418 = true;
            }
        }
        if (class127.field2738 && class77.field1718 == 1) {
            class23.method156(-13309);
        }
        class3.method14(205, class24.field509);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
    public static void method310(byte arg0) {
        field974 = null;
        field960 = null;
        field972 = null;
        field961 = null;
        field959 = null;
        if (arg0 != 107) {
            field961 = null;
        }
        field969 = null;
        field971 = null;
        field967 = null;
        field958 = null;
    }
}
