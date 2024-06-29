import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class28 extends class665 {

    @OriginalMember(owner = "client!o", name = "D", descriptor = "I")
    public int field421 = 0;

    @OriginalMember(owner = "client!o", name = "p", descriptor = "I")
    public static int field407 = 0;

    @OriginalMember(owner = "client!o", name = "n", descriptor = "I")
    public static int field405 = 328;

    @OriginalMember(owner = "client!o", name = "l", descriptor = "I")
    public int field403;

    @OriginalMember(owner = "client!o", name = "o", descriptor = "I")
    public int field406;

    @OriginalMember(owner = "client!o", name = "r", descriptor = "I")
    public int field409;

    @OriginalMember(owner = "client!o", name = "s", descriptor = "I")
    public int field410;

    @OriginalMember(owner = "client!o", name = "v", descriptor = "I")
    public int field413;

    @OriginalMember(owner = "client!o", name = "w", descriptor = "I")
    public int field414;

    @OriginalMember(owner = "client!o", name = "x", descriptor = "I")
    public int field415;

    @OriginalMember(owner = "client!o", name = "y", descriptor = "I")
    public int field416;

    @OriginalMember(owner = "client!o", name = "A", descriptor = "I")
    public int field418;

    @OriginalMember(owner = "client!o", name = "G", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!o", name = "I", descriptor = "I")
    public int field426;

    @OriginalMember(owner = "client!o", name = "J", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!o", name = "N", descriptor = "I")
    public int field431;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "Lmm;")
    public class250 field402;

    @OriginalMember(owner = "client!o", name = "E", descriptor = "Lmm;")
    public class250 field422;

    @OriginalMember(owner = "client!o", name = "u", descriptor = "Lwj;")
    public class359 field412;

    @OriginalMember(owner = "client!o", name = "K", descriptor = "Lwj;")
    public class359 field428;

    @OriginalMember(owner = "client!o", name = "L", descriptor = "Lde;")
    public class491 field429;

    @OriginalMember(owner = "client!o", name = "F", descriptor = "Let;")
    public class550 field423;

    @OriginalMember(owner = "client!o", name = "t", descriptor = "Lre;")
    public class557 field411;

    @OriginalMember(owner = "client!o", name = "M", descriptor = "Lre;")
    public class557 field430;

    @OriginalMember(owner = "client!o", name = "H", descriptor = "Lpaa;")
    public class577 field425;

    @OriginalMember(owner = "client!o", name = "q", descriptor = "Ljava/lang/String;")
    public static String field408;

    @OriginalMember(owner = "client!o", name = "m", descriptor = "Z")
    public boolean field404;

    @OriginalMember(owner = "client!o", name = "z", descriptor = "Z")
    public boolean field417;

    @OriginalMember(owner = "client!o", name = "C", descriptor = "Z")
    public boolean field420;

    @OriginalMember(owner = "client!o", name = "B", descriptor = "[I")
    public int[] field419;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
    public final void method324(int arg0) {
        field424++;
        if (arg0 != 0) {
            this.method324(-11);
        }
        int var2 = this.field406;
        boolean var3 = this.field404;
        if (this.field423 != null) {
            class550 var6 = this.field423.method3124((byte) -117, class61.field1163);
            if (var6 == null) {
                this.field406 = -1;
                this.field420 = false;
                this.field403 = 0;
                this.field419 = null;
                this.field418 = 0;
                this.field415 = 0;
                this.field404 = false;
                this.field410 = 0;
            } else {
                this.field403 = var6.field7724;
                this.field406 = var6.field7802;
                this.field415 = var6.field7731;
                this.field418 = var6.field7750;
                this.field410 = var6.field7753 << 9;
                this.field420 = var6.field7800;
                this.field419 = var6.field7814;
                this.field404 = var6.field7757;
            }
        } else if (this.field425 != null) {
            int var4 = class696.method3882((byte) 86, this.field425);
            if (var2 != var4) {
                this.field406 = var4;
                class592 var5 = this.field425.field8121;
                if (var5.field8315 != null) {
                    var5 = var5.method3356(90, class61.field1163);
                }
                if (var5 == null) {
                    this.field404 = this.field425.field8121.field8355;
                    this.field415 = this.field410 = 0;
                } else {
                    this.field404 = var5.field8355;
                    this.field415 = var5.field8305;
                    this.field410 = var5.field8291 << 9;
                }
            }
        } else if (this.field429 != null) {
            this.field406 = class595.method3369(this.field429, false);
            this.field404 = this.field429.field6998;
            this.field410 = this.field429.field6986 << 9;
            this.field415 = this.field429.field6996;
        }
        if (this.field406 == var2 && this.field404 == var3) {
            return;
        }
        if (this.field430 == null) {
            return;
        }
        class627.field8780.method2114(this.field430);
        this.field430 = null;
        this.field402 = null;
        this.field428 = null;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(I)V")
    public static void method325(int arg0) {
        field408 = null;
        if (arg0 != -1) {
            method325(-52);
        }
    }
}
