import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ITKUXCXG")
public class class25 extends class31 {

    @OriginalMember(owner = "client!ITKUXCXG", name = "l", descriptor = "Z")
    public boolean field966 = false;

    @OriginalMember(owner = "client!ITKUXCXG", name = "q", descriptor = "B")
    private byte field971 = 7;

    @OriginalMember(owner = "client!ITKUXCXG", name = "w", descriptor = "I")
    private int field977 = 959;

    @OriginalMember(owner = "client!ITKUXCXG", name = "t", descriptor = "LCRSWMDQF;")
    private class9 field974;

    @OriginalMember(owner = "client!ITKUXCXG", name = "m", descriptor = "I")
    public int field967;

    @OriginalMember(owner = "client!ITKUXCXG", name = "n", descriptor = "I")
    public int field968;

    @OriginalMember(owner = "client!ITKUXCXG", name = "o", descriptor = "I")
    public int field969;

    @OriginalMember(owner = "client!ITKUXCXG", name = "p", descriptor = "I")
    public int field970;

    @OriginalMember(owner = "client!ITKUXCXG", name = "r", descriptor = "I")
    public int field972;

    @OriginalMember(owner = "client!ITKUXCXG", name = "s", descriptor = "I")
    private int field973;

    @OriginalMember(owner = "client!ITKUXCXG", name = "u", descriptor = "I")
    private int field975;

    @OriginalMember(owner = "client!ITKUXCXG", name = "v", descriptor = "I")
    private int field976;

    @OriginalMember(owner = "client!ITKUXCXG", name = "a", descriptor = "(B)LXBVYIDUH;")
    public final class65 method39(byte arg0) {
        class65 var2 = this.field974.method299();
        if (var2 == null) {
            return null;
        }
        int var3 = this.field974.field666.field1394[this.field975];
        if (arg0 != 3) {
            throw new NullPointerException();
        }
        boolean var4 = false;
        class65 var5 = new class65(class6.method115(this.field971, var3), (byte) 9, true, false, var2);
        if (!this.field966) {
            var5.method548((byte) 77);
            var5.method549(true, var3);
            var5.field1627 = null;
            var5.field1626 = null;
        }
        if (this.field974.field669 != 128 || this.field974.field670 != 128) {
            var5.method557(0, this.field974.field670, this.field974.field669, this.field974.field669);
        }
        if (this.field974.field671 != 0) {
            if (this.field974.field671 == 90) {
                var5.method552(216);
            }
            if (this.field974.field671 == 180) {
                var5.method552(216);
                var5.method552(216);
            }
            if (this.field974.field671 == 270) {
                var5.method552(216);
                var5.method552(216);
                var5.method552(216);
            }
        }
        var5.method558(this.field974.field672 + 64, this.field974.field673 + 850, -30, -50, -30, true);
        return var5;
    }

    @OriginalMember(owner = "client!ITKUXCXG", name = "<init>", descriptor = "(IIIIIIII)V")
    public class25(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field974 = class9.field662[arg7];
        if (arg4 != 0) {
            this.field977 = -211;
        }
        this.field967 = arg1;
        this.field968 = arg6;
        this.field969 = arg2;
        this.field970 = arg5;
        this.field972 = arg0 + arg3;
        this.field966 = false;
    }

    @OriginalMember(owner = "client!ITKUXCXG", name = "a", descriptor = "(II)V")
    public final void method322(int arg0, int arg1) {
        while (arg0 >= 0) {
            this.field973 = -196;
        }
        this.field976 += arg1;
        while (true) {
            do {
                do {
                    if (this.field976 <= this.field974.field666.method507(this.field975, 196)) {
                        return;
                    }
                    this.field976 -= this.field974.field666.method507(this.field975, 196) + 1;
                    this.field975++;
                } while (this.field975 < this.field974.field666.field1393);
            } while (this.field975 >= 0 && this.field975 < this.field974.field666.field1393);
            this.field975 = 0;
            this.field966 = true;
        }
    }
}
