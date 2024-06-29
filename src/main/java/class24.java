import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!HTOEUNMD")
public class class24 {

    @OriginalMember(owner = "client!HTOEUNMD", name = "e", descriptor = "I")
    public int field867 = -1;

    @OriginalMember(owner = "client!HTOEUNMD", name = "g", descriptor = "[I")
    public int[] field869 = new int[6];

    @OriginalMember(owner = "client!HTOEUNMD", name = "h", descriptor = "[I")
    public int[] field870 = new int[6];

    @OriginalMember(owner = "client!HTOEUNMD", name = "i", descriptor = "I")
    public int field871 = 128;

    @OriginalMember(owner = "client!HTOEUNMD", name = "j", descriptor = "I")
    public int field872 = 128;

    @OriginalMember(owner = "client!HTOEUNMD", name = "n", descriptor = "LLXKBDSHJ;")
    public static class41 field876 = new class41((byte) 0, 30);

    @OriginalMember(owner = "client!HTOEUNMD", name = "a", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!HTOEUNMD", name = "c", descriptor = "I")
    public int field865;

    @OriginalMember(owner = "client!HTOEUNMD", name = "d", descriptor = "I")
    public int field866;

    @OriginalMember(owner = "client!HTOEUNMD", name = "k", descriptor = "I")
    public int field873;

    @OriginalMember(owner = "client!HTOEUNMD", name = "l", descriptor = "I")
    public int field874;

    @OriginalMember(owner = "client!HTOEUNMD", name = "m", descriptor = "I")
    public int field875;

    @OriginalMember(owner = "client!HTOEUNMD", name = "f", descriptor = "LKSVXFIAD;")
    public class34 field868;

    @OriginalMember(owner = "client!HTOEUNMD", name = "b", descriptor = "[LHTOEUNMD;")
    public static class24[] field864;

    @OriginalMember(owner = "client!HTOEUNMD", name = "a", descriptor = "(BLJUPFHAZZ;)V")
    public static void method243(byte arg0, class32 arg1) {
        if (arg0 != -3) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        class59 var3 = new class59(859, arg1.method372("spotanim.dat", null));
        field863 = var3.method531();
        if (field864 == null) {
            field864 = new class24[field863];
        }
        for (int var4 = 0; var4 < field863; var4++) {
            if (field864[var4] == null) {
                field864[var4] = new class24();
            }
            field864[var4].field865 = var4;
            field864[var4].method244(var3, (byte) 4);
        }
    }

    @OriginalMember(owner = "client!HTOEUNMD", name = "a", descriptor = "(LTKPFKOXP;B)V")
    public void method244(class59 arg0, byte arg1) {
        if (arg1 != 4) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg0.method529();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field866 = arg0.method531();
                } else if (var3 == 2) {
                    this.field867 = arg0.method531();
                    if (class34.field1140 != null) {
                        this.field868 = class34.field1140[this.field867];
                    }
                } else if (var3 == 4) {
                    this.field871 = arg0.method531();
                } else if (var3 == 5) {
                    this.field872 = arg0.method531();
                } else if (var3 == 6) {
                    this.field873 = arg0.method531();
                } else if (var3 == 7) {
                    this.field874 = arg0.method529();
                } else if (var3 == 8) {
                    this.field875 = arg0.method529();
                } else if (var3 >= 40 && var3 < 50) {
                    this.field869[var3 - 40] = arg0.method531();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field870[var3 - 50] = arg0.method531();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!HTOEUNMD", name = "a", descriptor = "()LOGORHYVW;")
    public class45 method245() {
        class45 var1 = (class45) field876.method413((long) this.field865);
        if (var1 != null) {
            return var1;
        }
        class45 var2 = class45.method433(this.field866);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field869[0] != 0) {
                var2.method447(this.field869[var3], this.field870[var3]);
            }
        }
        field876.method414(-681, var2, (long) this.field865);
        return var2;
    }
}
