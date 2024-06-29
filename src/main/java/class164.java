import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wea")
public class class164 {

    @OriginalMember(owner = "client!wea", name = "m", descriptor = "Lat;")
    private class398 field2655 = new class398();

    @OriginalMember(owner = "client!wea", name = "z", descriptor = "I")
    private int field2657 = 0;

    @OriginalMember(owner = "client!wea", name = "s", descriptor = "Lwq;")
    private class176 field2658 = new class176(1350);

    @OriginalMember(owner = "client!wea", name = "t", descriptor = "Lrv;")
    public class117 field2660 = new class117(15000);

    @OriginalMember(owner = "client!wea", name = "v", descriptor = "Z")
    public boolean field2669 = false;

    @OriginalMember(owner = "client!wea", name = "C", descriptor = "I")
    public int field2665 = 0;

    @OriginalMember(owner = "client!wea", name = "n", descriptor = "I")
    public int field2671 = 0;

    @OriginalMember(owner = "client!wea", name = "b", descriptor = "I")
    public int field2663 = 0;

    @OriginalMember(owner = "client!wea", name = "w", descriptor = "Lhl;")
    public class556 field2670 = null;

    @OriginalMember(owner = "client!wea", name = "h", descriptor = "Z")
    public boolean field2672 = true;

    @OriginalMember(owner = "client!wea", name = "D", descriptor = "[Ljava/lang/String;")
    private static final String[] field2674 = new String[] { method1551(method1550("zK\u0007!\u000f%")), method1551(method1550("zK\u0007!\f%")), method1551(method1550("zK\u0007!\u0002%")), method1551(method1550("v\u0000H!7")), method1551(method1550("c[\nc")), method1551(method1550("zK\u0007!\t%")), method1551(method1550("zK\u0007!\b%")), method1551(method1550("zK\u0007!\u0003%")), method1551(method1550("H@\u0012j8hJF{!=")), method1551(method1550("@K\u000b`8t\u000e\u0004j,b\\\u0003/)aK\u0007a?}\u0013")), method1551(method1550("k^\u0015/.hL\u0013hjh@\u0007m&hJ")), method1551(method1550("NA\u000b\u007f&hZ\u0003!jYA\tc!dZFa%z\u0014F")), method1551(method1550("bM\u0005c?iK")), method1551(method1550("KO\u000fc/i\u000e\u0012`jh@\u0012j8-Z\r:")), method1551(method1550("K~5/%kH")), method1551(method1550("}\\\u000fa>k^\u0015")), method1551(method1550("n]\u0016}%kG\nj)aK\u0007}")), method1551(method1550("KA\u0014l/i\u000e\u0012x/h@\u000fa--J\u000f|+oB\u0003kd")), method1551(method1550("_K\u0004z#aJ\u000fa--C\u0007\u007f")), method1551(method1550("\u007fK\u0004z#aJ")), method1551(method1550("b@")), method1551(method1550("eK\u0007\u007f")), method1551(method1550("nA\u000bb+cJ\u0015/g-z\u000ef9-M\tb'l@\u0002")), method1551(method1550("\u007fA\u0012n>hM\ta$hM\u0012b/yF\tk9")), method1551(method1550("KO\u000fc/i\u000e\u0012`jnF\u0007a-h\u000e\t}>eAFb%iK")), method1551(method1550("nB\u000f\u007f)bC\u0016`$h@\u0012|w")), method1551(method1550("[K\bk%\u007f\u0014F")), method1551(method1550("I\\\u000fy/\u007f\u000e0j8~G\tap-")), method1551(method1550("zCW/9xM\u0005j/iK\u0002")), method1551(method1550("`O\u001em?dB\u0002n8hO[")), method1551(method1550("H@\u0012j8hJF{!<")), method1551(method1550("|O9`:RZ\u0003|>0")), method1551(method1550("I\\\t\u007f:hJFl&dK\b{jg]S/$hZF~?h[\u0003")), method1551(method1550("]K\u0014i%\u007fC\u0007a)h\u0014F")), method1551(method1550("z\u0014F")), method1551(method1550("nA\u000bb+cJ\u0015")), method1551(method1550("_K\bk/\u007f\u000e\u0005`8h]Fa%z\u0014F")), method1551(method1550("I\\\t\u007f:hJF|/\u007fX\u0003}jg]S/$hZF~?h[\u0003")), method1551(method1550("D@\u0010n&dJFm?dB\u0002n8hOFy+a[\u0003")), method1551(method1550("~@\n`-d@F")), method1551(method1550("n]\u0016}%kG\nj%xZ\u0016z>n")), method1551(method1550("zCU/9xM\u0005j/iK\u0002")), method1551(method1550("zCT/9xM\u0005j/iK\u0002")), method1551(method1550("H@\u0012j8hJF{!?")), method1551(method1550("~K\u0014y/\u007fD\u0015:.\u007fA\u0016")), method1551(method1550("^}#/>bA\nd#y\u0014F/")), method1551(method1550("N\u0014:[/`^:g/l^Hk?`^")), method1551(method1550("zG\b")), method1551(method1550("nB\u000f\u007f)bC\u0016`$h@\u0012|")), method1551(method1550("k^\u0015`,k")), method1551(method1550("cO\u0012f<hC\u0003b/\u007f\\\t}")), method1551(method1550("KO\u000fc/i\u000e\u0012`jh@\u0012j8-Z\r<")), method1551(method1550("~K\u0012m+")), method1551(method1550("wA\tbj")), method1551(method1550("N[\u0014}/cZF{%bB\rf>-J\tj9c\t\u0012/9x^\u0016`8y\u000e\u000bz&yG\u0016c/-M\t}/~")), method1551(method1550("eG\u0002j)bB\u000bn:")), method1551(method1550("nB\u000fj$yD\u0015:.\u007fA\u0016")), method1551(method1550("\u007fK\bk/\u007f^\u0014`,dB\u0003")), method1551(method1550("#B\th")), method1551(method1550("NA\u0013c.-@\t{jn\\\u0003n>h\u000e")), method1551(method1550("zCT/,lG\nj.")), method1551(method1550("yEW")), method1551(method1550("n]Tk/o[\u00015")), method1551(method1550("LM\u0012f<h\u000e\u0015{8hO\u000b|p-")), method1551(method1550("~A\u0013a.~Z\u0014j+`M\tz$y")), method1551(method1550("jK\u0012l+`K\u0014n:b]")), method1551(method1550("{O\u0014\u007fw")), method1551(method1550("H@\u0012j8hJF{!>")), method1551(method1550("eK\u0007\u007fj \u000e6}#cZFe+{OFb/`A\u0014vjd@\u0000`8`O\u0012f%c")), method1551(method1550("\u007fK\u0004z#aJ\u0016}%kG\nj")), method1551(method1550("nB\u0015/g-m\nj+\u007f\u000e\u0005`$~A\nj")), method1551(method1550("}K\u0014bj{O\u0014l9-]\u0007y/i")), method1551(method1550("L\\\u0005gp-")), method1551(method1550("CO\u000bjp-")), method1551(method1550("^W\u0015{/`\u000e\u000bj'b\\\u001f5j")), method1551(method1550("~O\u0010j<l\\\u0005|")), method1551(method1550("jK\u0012g/dI\u000e{")), method1551(method1550("eK\n\u007f")), method1551(method1550("\u007f[\b|)\u007fG\u0016{j")), method1551(method1550("\u007fK\bk/\u007fK\u0014")), method1551(method1550("EK\u000fh\"y\u0014F")), method1551(method1550("}K\u0014bj{O\u0014l9-]\u0005}+`L\nj.")), method1551(method1550("KO\u000fc/i\u000e\u0012`jh@\u0012j8-Z\r=")), method1551(method1550("yES")), method1551(method1550("NO\ba%y\u000e\u0011}#yKF{%-")), method1551(method1550("bH\u0000")), method1551(method1550("`M")), method1551(method1550("K~5/%c")), method1551(method1550("nB\u0015")), method1551(method1550("b\\\u0012g%nO\u000bc%nE")), method1551(method1550("]A\u00155j")), method1551(method1550("zK\u0007!\u0000%")), method1551(method1550("OB\t`'-J\u000f|+oB\u0003k")), method1551(method1550("^W\b{+u\u0014F`8yF\t/vc\u0010")), method1551(method1550("-T\\")), method1551(method1550("k^\u0015/")), method1551(method1550("Jb>/>bA\nd#y\u0014F/")), method1551(method1550("yET")), method1551(method1550("jK\u0012l-nA\t}.")), method1551(method1550("-f\u0003f-eZ\\/")), method1551(method1550("b\\\u0012g%yG\nj9dT\u0003/")), method1551(method1550("nO\u0005g/~^\u0007l/")), method1551(method1550("I\u001d\"/>bA\nd#y\u0014F/")), method1551(method1550("D\u0006\u000b&p-")), method1551(method1550("@G\bf'l^F}/~K\u0012")), method1551(method1550("b\\\u0012g%-M\u0007b/\u007fOFc%nEFf9-")), method1551(method1550("zCW")), method1551(method1550("NO\u0005g/~\u000e\u0014j9hZ")), method1551(method1550("K~55j")), method1551(method1550("`]")), method1551(method1550("^F\u000fi> M\nf)f\u000e\u0002f9lL\nj.#")), method1551(method1550("zCU")), method1551(method1550("h@\u0007m&h\u000e\t}>eAFb%iKFi#\u007f]\u0012/bx]\u0003/mb\\\u0012g%-\u0012\b1m$")), method1551(method1550("~M\u0014n'oB\u0003y+\u007fM\u0015")), method1551(method1550("n]Tk/o[\u0001")), method1551(method1550("^[\u0005l/~]\u0000z&aWFl\"l@\u0001j.-A\u0014{\"b\u000e\u000b`.h")), method1551(method1550("l[\u0012`9hZ\u0013\u007f")), method1551(method1550("eK\u0007\u007f.xC\u0016")), method1551(method1550("~W\u0015{/`C\u0003b")), method1551(method1550("zCT")), method1551(method1550("h\\\u0014`8`K\u0015|+jK")), method1551(method1550("OB\t`'-K\bn(aK\u0002")), method1551(method1550("[K\u00145j")), method1551(method1550("oB\t`'")), method1551(method1550("^F\u000fi> M\nf)f\u000e#A\u000bOb#Kk")), method1551(method1550("k^\u0015`$")), method1551(method1550("GO\u0010njyA\tc!dZ\\/")), method1551(method1550("D\u0006\u0015&p-")), method1551(method1550("kG\njjlB\u0014j+iWFj2d]\u0012|k")), method1551(method1550("nA\nb+}\u000e\u000f|jeG\u0002k/c")), method1551(method1550("IA\bj")), method1551(method1550("yY\u0003j$")), method1551(method1550("b\\\u0012g%-")), method1551(method1550("o\\\u0003n!nA\b")), method1551(method1550("O\\\u0003n!d@\u0001/$hYFl%c@\u0003l>dA\b|jkA\u0014/\u007f-]\u0003l%cJ\u0015")), method1551(method1550("nB\t|/b[\u0012\u007f?y")), method1551(method1550("KO\u000fc/i\u000e\u0012`jh@\u0007m&h\u000e\u0004c%bC")), method1551(method1550("CAF|?nFFi#aK")), method1551(method1550("n]\u0016}%kG\nj%xZ\u0016z>y")), method1551(method1550("nB\u0003n8yK\u001e{")), method1551(method1550("\"Z\u000b\u007feeK\u0007\u007fdi[\u000b\u007f")), method1551(method1550("x@\n`+i@\u0007{#{K\u0015")), method1551(method1550("cO\u0012f<h\u0006+_\u0018")), method1551(method1550("@K\u000b`8t\u000e\u0007i>h\\Fl&hO\bz:0")), method1551(method1550("l[\u0012`=b\\\nk")), method1551(method1550("iG\u0015\u007f&lW\u0000\u007f9-\u0003F[%jI\njjK~5/+cJF`>eK\u0014/#cH\t}'lZ\u000f`$")), method1551(method1550("\u007fK\u0015j>`G\bf'l^")), method1551(method1550("I\\\t\u007f:hJFl&dK\b{jnA\ba/nZ\u000f`$")), method1551(method1550("iG\u0014j)yB\th#c")), method1551(method1550("yEU")), method1551(method1550("H@\u0012j8hJF{!8")), method1551(method1550("KO\u000fc/i\u000e\u0012`jh@\u0012j8-Z\r?")), method1551(method1550("b\\\u0012g%-Z\u000fc/-]\u000fu/0")), method1551(method1550("~Y\u000f{)eY\t}&i")), method1551(method1550("nA\nb+}\u000e\u000f|j~F\tx$")), method1551(method1550("b\\\u0012g%wA\tbw")), method1551(method1550("u\u0014")), method1551(method1550("jK\u0012x%\u007fB\u0002")), method1551(method1550("jK\u0012l&dK\b{<l\\\u0016")), method1551(method1550("AG\u0004}+\u007fWFz$aA\u0007k#cIFi+dB\u0003kk")), method1551(method1550("jK\u0012l&dK\b{<l\\\u0016m#y")), method1551(method1550("yK\u001e|#wK")), method1551(method1550("jM")), method1551(method1550("yEV")), method1551(method1550("\u007fK\u0015j>nO\u0005g/")), method1551(method1550("|O9`:RZ\u0003|>")), method1551(method1550("~Y\u000f{)eK\u0002")), method1551(method1550("EK\u0007\u007fp-")), method1551(method1550("IK\u0010f)h\u0014F")), method1551(method1550("@L")), method1551(method1550("h\\\u0014`8yK\u0015{")), method1551(method1550("\u007fK\u0005{\u0015iK\u0004z-0")), method1551(method1550("nA\u000b\u007f+nZ")), method1551(method1550("JbF{%bB\rf>7\u000eF/")), method1551(method1550("zCU/,lG\nj.")), method1551(method1550("iG\u0015\u007f&lW\u0000\u007f9")), method1551(method1550("nB\u000fj$yJ\u0014`:")), method1551(method1550("l[\u0012`jzA\u0014c.-]\u0003c/nZ\u0003k")), method1551(method1550("}\\\ti#aK\u0005\u007f?")), method1551(method1550("[K\u0014|#b@\\/")), method1551(method1550("n]Tk/o[\u00015j%")), method1551(method1550("cA\b\u007f)~")), method1551(method1550("_A\u0012n>hJFl%c@\u0003l>dA\b/'hZ\u000e`.~")), method1551(method1550("zCW/,lG\nj.")), method1551(method1550("\u007fK\u0005{\u0015iK\u0004z-")), method1551(method1550("B\u0006\u0015&p-")), method1551(method1550("}M")), method1551(method1550("\u007fK\bk/\u007fK\u0014/g-~\u0014f$y\u000e\u0001}+}F\u000fl9-\\\u0003a.h\\\u0003}jd@\u0000`8`O\u0012f%c")), method1551(method1550("\u007f^")), method1551(method1550("AG\u0004}+\u007fG\u0003|jx@\n`+iK\u0002")), method1551(method1550("D@\u0010n&dJF}/nZ9k/o[\u0001/<lB\u0013j")), method1551(method1550("KO\u000fc/i\u000e\u0012`jh@\u0012j8-Z\r>")), method1551(method1550("~K\u0012`?y^\u0013{j")), method1551(method1550("{O\u0014\u007f(dZ[")), method1551(method1550("b\\\u0012g%wA\tbj")), method1551(method1550("b]")), method1551(method1550("_K\u0004z#aJ\u000fa--C\u0007\u007fj%Y\u000f{\"-^\u0014`,dB\u000fa-$")), method1551(method1550("BM\u0005c9dA\b/$bYF`,k\u000f")), method1551(method1550("}K\u0014i%\u007fC\u0007a)hZ\u0003|>")), method1551(method1550("KA\u0014l/i\u000e\u0012x/h@\u000fa--k(N\bAk\".")), method1551(method1550("k^\u0015/.hL\u0013hjiG\u0015n(aK\u0002")), method1551(method1550("~F\tx:\u007fA\u0000f&d@\u00012")), method1551(method1550("YK\u001e{jnA\t}.~\u000e\u0005c/l\\\u0003k")), method1551(method1550("~F\tx)bB\u000bn:")), method1551(method1550("KO\u000fc/i\u000e\u0012`j\u007fK\u0007kjkG\nj")), method1551(method1550("YA\u0001h&hJG")), method1551(method1550("~F\u000fi>nB\u000fl!")), method1551(method1550("BM\u0005c9dA\b/$bYF`$,")), method1551(method1550("z\u001c\u0002j(xI")), method1551(method1550("cA\b\u007f)~\u0013")), method1551(method1550("AA\tdp-")), method1551(method1550("@l")), method1551(method1550("`K\u000b2")), method1551(method1550("zK\u0007!\u000b%")), method1551(method1550("zK\u0007!\r%")) };

    @OriginalMember(owner = "client!wea", name = "g", descriptor = "Lvn;")
    public static class330 field2650 = new class330(0, 3);

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "I")
    public static int field2654 = 0;

    @OriginalMember(owner = "client!wea", name = "f", descriptor = "[I")
    public static int[] field2656 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!wea", name = "q", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!wea", name = "u", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!wea", name = "y", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!wea", name = "B", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!wea", name = "e", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!wea", name = "F", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!wea", name = "l", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!wea", name = "r", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!wea", name = "p", descriptor = "I")
    public int field2662;

    @OriginalMember(owner = "client!wea", name = "d", descriptor = "I")
    public int field2664;

    @OriginalMember(owner = "client!wea", name = "i", descriptor = "I")
    private int field2668;

    @OriginalMember(owner = "client!wea", name = "x", descriptor = "I")
    public int field2673;

    @OriginalMember(owner = "client!wea", name = "j", descriptor = "Luga;")
    public class218 field2647;

    @OriginalMember(owner = "client!wea", name = "o", descriptor = "Lcca;")
    public class258 field2644;

    @OriginalMember(owner = "client!wea", name = "c", descriptor = "Lwha;")
    public class296 field2659;

    @OriginalMember(owner = "client!wea", name = "A", descriptor = "Lhl;")
    public class556 field2661;

    @OriginalMember(owner = "client!wea", name = "k", descriptor = "Lhl;")
    public class556 field2666;

    @OriginalMember(owner = "client!wea", name = "E", descriptor = "Lhl;")
    public class556 field2667;

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(I)V", line = 9)
    public final void method1540(int arg0) {
        try {
            field2653++;
            if (arg0 <= -59 && this.field2644 != null) {
                this.field2644.method2170(-123);
                this.field2644 = null;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2674[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wea", name = "b", descriptor = "(I)V", line = 28)
    public final void method1541(int arg0) {
        try {
            if (arg0 != 0) {
                method1542(false, 118, 10, -94);
            }
            field2643++;
            if ((class431.field6776 % 50) == 0) {
                this.field2662 = this.field2668;
                this.field2668 = 0;
                this.field2673 = this.field2664;
                this.field2664 = 0;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2674[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(ZIII)I", line = 47)
    public static final int method1542(boolean arg0, int arg1, int arg2, int arg3) {
        try {
            int var6 = arg3 & 0x3;
            field2652++;
            if (!arg0) {
                method1543(-45, true, false, null);
            }
            if (var6 == 0) {
                return arg1;
            } else if (var6 == 1) {
                return 4095 - arg2;
            } else if (var6 == 2) {
                return 4095 - arg1;
            } else {
                return arg2;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field2674[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(IZZLjava/lang/String;)V", line = 72)
    public static final void method1543(int arg0, boolean arg1, boolean arg2, String arg3) {
        try {
            if (arg0 == 5) {
                field2649++;
                try {
                    if (arg3.equalsIgnoreCase(field2674[35]) || arg3.equalsIgnoreCase(field2674[77])) {
                        class6.method42(true, field2674[22]);
                        class6.method42(true, field2674[70]);
                        class6.method42(true, field2674[145]);
                        class6.method42(true, field2674[187]);
                        class6.method42(true, field2674[68]);
                        return;
                    }
                    if (arg3.equalsIgnoreCase(field2674[88])) {
                        class582.field8381 = 0;
                        class455.field7020 = 0;
                        return;
                    }
                    if (arg3.equalsIgnoreCase(field2674[175])) {
                        class712.field10300 = !class712.field10300;
                        if (!class712.field10300) {
                            class6.method42(true, field2674[14]);
                            return;
                        }
                        class6.method42(true, field2674[87]);
                        return;
                    }
                    if (arg3.equals(field2674[79])) {
                        class734 var4 = class662.field9437.method240();
                        class6.method42(true, field2674[26] + var4.field10763);
                        class6.method42(true, field2674[73] + var4.field10761);
                        class6.method42(true, field2674[179] + var4.field10767);
                        class6.method42(true, field2674[168] + var4.field10765);
                        class6.method42(true, field2674[27] + var4.field10766);
                        return;
                    }
                    if (arg3.equals(field2674[21])) {
                        class6.method42(true, field2674[167] + class168.field2721 + field2674[211]);
                        return;
                    }
                } catch (Exception var54) {
                    class6.method42(true, class709.field10204.method5154(class795.field11624, (byte) 65));
                    return;
                }
                if (class710.field10281 != class417.field6596 || class264.field4283 >= 2) {
                    if (arg3.equalsIgnoreCase(field2674[170])) {
                        throw new RuntimeException();
                    }
                    if (arg3.equals(field2674[50])) {
                        throw new OutOfMemoryError(field2674[142]);
                    }
                    try {
                        if (arg3.equalsIgnoreCase(field2674[15])) {
                            class6.method42(true, field2674[108] + class43.field481);
                            return;
                        }
                        if (arg3.equalsIgnoreCase(field2674[12])) {
                            class382.field6142 = !class382.field6142;
                            if (!class382.field6142) {
                                class6.method42(true, field2674[197]);
                                return;
                            }
                            class6.method42(true, field2674[207]);
                            return;
                        }
                        if (arg3.equalsIgnoreCase(field2674[125])) {
                            class712.field10300 = true;
                            class6.method42(true, field2674[10]);
                            return;
                        }
                        if (arg3.equalsIgnoreCase(field2674[49])) {
                            class712.field10300 = false;
                            class6.method42(true, field2674[200]);
                            return;
                        }
                        if (arg3.equals(field2674[118])) {
                            try {
                                class6.method42(true, field2674[74] + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + class372.field6038.field11008 + field2674[169]);
                                return;
                            } catch (Throwable var48) {
                                return;
                            }
                        }
                        if (arg3.equalsIgnoreCase(field2674[139])) {
                            class195.field3093.method745(114);
                            class6.method42(true, field2674[202]);
                            return;
                        }
                        if (arg3.equalsIgnoreCase(field2674[162])) {
                            class645.method4671(-12312);
                            for (int var5 = 0; var5 < 10; var5++) {
                                System.gc();
                            }
                            Runtime var6 = Runtime.getRuntime();
                            int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                            class6.method42(true, field2674[212] + var7 + "k");
                            return;
                        }
                        if (arg3.equalsIgnoreCase(field2674[172])) {
                            class645.method4671(-12312);
                            for (int var8 = 0; var8 < 10; var8++) {
                                System.gc();
                            }
                            Runtime var9 = Runtime.getRuntime();
                            int var10 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                            class6.method42(true, field2674[9] + var10 + "k");
                            class230.method2010((byte) 37);
                            class645.method4671(arg0 ^ 0xFFFFCFED);
                            for (int var11 = 0; var11 < 10; var11++) {
                                System.gc();
                            }
                            int var12 = (int) ((var9.totalMemory() - var9.freeMemory()) / 1024L);
                            class6.method42(true, field2674[143] + var12 + "k");
                            return;
                        }
                        if (arg3.equalsIgnoreCase(field2674[141])) {
                            class6.method42(true, client.method2712(arg0 ^ 0xFFFFCD04) ? field2674[189] : field2674[159]);
                            return;
                        }
                        if (arg3.equalsIgnoreCase(field2674[176])) {
                            class6.method42(true, field2674[147]);
                            if (class315.field5127 == 11) {
                                class169.method1574(-23049);
                            } else if (class315.field5127 == 12) {
                                class185.field2948.field2669 = true;
                                return;
                            }
                            return;
                        }
                        if (arg3.equalsIgnoreCase(field2674[23])) {
                            class640.field9183.method3884(true);
                            class6.method42(true, field2674[182]);
                            return;
                        }
                        if (arg3.equalsIgnoreCase(field2674[56])) {
                            class173.field2772.method5629(0);
                            class6.method42(true, field2674[32]);
                            return;
                        }
                        if (arg3.equalsIgnoreCase(field2674[44])) {
                            class173.field2772.method5633(arg0 - 7149);
                            class6.method42(true, field2674[37]);
                            return;
                        }
                        if (arg3.equalsIgnoreCase(field2674[133])) {
                            class393.field6256.method642((byte) 1);
                            class164[] var13 = class185.field2949;
                            for (int var14 = 0; var14 < var13.length; var14++) {
                                class164 var15 = var13[var14];
                                if (var15.field2644 != null) {
                                    var15.field2644.method2173((byte) -43);
                                }
                            }
                            class173.field2772.method5624(96);
                            class6.method42(true, field2674[134]);
                            return;
                        }
                        if (arg3.equalsIgnoreCase(field2674[19])) {
                            class191.method1776(-10464);
                            class95.method918((byte) 55);
                            class6.method42(true, field2674[18]);
                            return;
                        }
                        if (arg3.equalsIgnoreCase(field2674[69])) {
                            class475.field7236 = class712.method5167(-2334);
                            class705.field10122 = true;
                            class191.method1776(arg0 ^ 0xFFFFD725);
                            class95.method918((byte) -56);
                            class6.method42(true, field2674[196]);
                            return;
                        }
                        if (arg3.equalsIgnoreCase(field2674[106])) {
                            class453.method3520(1, (byte) 52, -1, -1, false);
                            if (class466.method3598(arg0 - 4) != 1) {
                                class6.method42(true, field2674[183]);
                                return;
                            }
                            class6.method42(true, field2674[28]);
                            return;
                        }
                        if (arg3.equalsIgnoreCase(field2674[119])) {
                            class453.method3520(2, (byte) 52, -1, -1, false);
                            if (class466.method3598(1) != 2) {
                                class6.method42(true, field2674[60]);
                                return;
                            }
                            class6.method42(true, field2674[42]);
                            return;
                        }
                        if (arg3.equalsIgnoreCase(field2674[111])) {
                            class453.method3520(3, (byte) 52, 768, 1024, false);
                            if (class466.method3598(1) != 3) {
                                class6.method42(true, field2674[174]);
                                return;
                            }
                            class6.method42(true, field2674[41]);
                            return;
                        }
                        if (arg3.equalsIgnoreCase(field2674[163])) {
                            class679.method4942(false, (byte) 24, 0);
                            if (class623.field8996.field6379.method4132(true) == 0) {
                                class6.method42(true, field2674[8]);
                                class623.field8996.method3244(22733, class623.field8996.field6378, 0);
                                class574.method4222((byte) 123);
                                class746.field10999 = false;
                                return;
                            }
                            class6.method42(true, field2674[151]);
                            return;
                        }
                        if (arg3.equalsIgnoreCase(field2674[61])) {
                            class679.method4942(false, (byte) 81, 1);
                            if (class623.field8996.field6379.method4132(true) == 1) {
                                class6.method42(true, field2674[30]);
                                class623.field8996.method3244(22733, class623.field8996.field6378, 1);
                                class574.method4222((byte) 106);
                                class746.field10999 = false;
                                return;
                            }
                            class6.method42(true, field2674[191]);
                            return;
                        }
                        if (arg3.equalsIgnoreCase(field2674[97])) {
                            class679.method4942(false, (byte) 33, 2);
                            if (class623.field8996.field6379.method4132(true) == 2) {
                                class6.method42(true, field2674[43]);
                                class623.field8996.method3244(22733, class623.field8996.field6378, 2);
                                class574.method4222((byte) 62);
                                class746.field10999 = false;
                                return;
                            }
                            class6.method42(true, field2674[82]);
                            return;
                        }
                        if (arg3.equalsIgnoreCase(field2674[149])) {
                            class679.method4942(false, (byte) 38, 3);
                            if (class623.field8996.field6379.method4132(true) == 3) {
                                class6.method42(true, field2674[67]);
                                class623.field8996.method3244(arg0 ^ 0x58C8, class623.field8996.field6378, 3);
                                class574.method4222((byte) 58);
                                class746.field10999 = false;
                                return;
                            }
                            class6.method42(true, field2674[51]);
                            return;
                        }
                        if (arg3.equalsIgnoreCase(field2674[83])) {
                            class679.method4942(false, (byte) -108, 5);
                            if (class623.field8996.field6379.method4132(true) == 5) {
                                class6.method42(true, field2674[150]);
                                class623.field8996.method3244(arg0 ^ 0x58C8, class623.field8996.field6378, 5);
                                class574.method4222((byte) 81);
                                class746.field10999 = false;
                                return;
                            }
                            class6.method42(true, field2674[13]);
                            return;
                        }
                        if (arg3.startsWith(field2674[52])) {
                            if (arg3.length() < 6) {
                                class6.method42(true, field2674[38]);
                                return;
                            }
                            int var16 = class441.method3457(true, arg3.substring(6));
                            if (var16 >= 0 && var16 <= class499.method3768(class168.field2721, (byte) 118)) {
                                class623.field8996.method3244(22733, class623.field8996.field6404, var16);
                                class574.method4222((byte) -113);
                                class746.field10999 = false;
                                class6.method42(true, field2674[29] + class623.field8996.field6404.method3711(true));
                                return;
                            }
                            class6.method42(true, field2674[38]);
                            return;
                        }
                        if (arg3.startsWith(field2674[184])) {
                            if (arg3.length() < 10) {
                                class6.method42(true, field2674[190]);
                                return;
                            }
                            class195.field3091 = class441.method3457(true, arg3.substring(10).trim());
                            class6.method42(true, field2674[171] + class195.field3091);
                            return;
                        }
                        if (arg3.equalsIgnoreCase(field2674[165])) {
                            class531.field7804 = true;
                            class6.method42(true, field2674[31] + class531.field7804);
                            return;
                        }
                        if (arg3.equalsIgnoreCase(field2674[48])) {
                            class383.field6149 = !class383.field6149;
                            class6.method42(true, field2674[25] + class383.field6149);
                            return;
                        }
                        if (arg3.startsWith(field2674[123])) {
                            boolean var17 = class662.field9437.method167();
                            if (class410.method3288(!var17, (byte) -19)) {
                                if (var17) {
                                    class6.method42(true, field2674[92]);
                                    return;
                                }
                                class6.method42(true, field2674[121]);
                                return;
                            }
                            class6.method42(true, field2674[136]);
                            return;
                        }
                        if (arg3.equalsIgnoreCase(field2674[131])) {
                            if (class321.field5219) {
                                class321.field5219 = false;
                                class6.method42(true, field2674[17]);
                                return;
                            }
                            class321.field5219 = true;
                            class6.method42(true, field2674[199]);
                            return;
                        }
                        if (arg3.equalsIgnoreCase(field2674[206])) {
                            if (class558.field8130) {
                                class6.method42(true, field2674[110]);
                                class558.field8130 = false;
                                return;
                            }
                            class6.method42(true, field2674[124]);
                            class558.field8130 = true;
                            return;
                        }
                        if (arg3.equalsIgnoreCase(field2674[98])) {
                            class6.method42(true, field2674[156] + (class438.field6846.field9985 >> 9) + field2674[94] + (class438.field6846.field9983 >> 9));
                            return;
                        }
                        if (arg3.equalsIgnoreCase(field2674[76])) {
                            class6.method42(true, field2674[80] + class740.field10902[class438.field6846.field9975].method2495(class438.field6846.field9983 >> 9, 1, class438.field6846.field9985 >> 9));
                            return;
                        }
                        if (arg3.equalsIgnoreCase(field2674[146])) {
                            class550.field8065.method611(-53);
                            class550.field8065.method608(false);
                            class179.field2874.method3728(-4587);
                            class362.field5915.method2324((byte) 15);
                            class95.method918((byte) -120);
                            class6.method42(true, field2674[104]);
                            return;
                        }
                        if (arg3.startsWith(field2674[86])) {
                            if (class662.field9437.method269()) {
                                int var18 = Integer.parseInt(arg3.substring(3));
                                if (var18 < 1) {
                                    var18 = 1;
                                } else if (var18 > 4) {
                                    var18 = 4;
                                }
                                class709.field10269 = var18;
                                class191.method1776(-10464);
                                class6.method42(true, field2674[36] + class709.field10269);
                                return;
                            }
                            class6.method42(true, field2674[54]);
                            return;
                        }
                        if (arg3.startsWith(field2674[101])) {
                            class6.method42(true, field2674[127] + class551.field8082.method297(75) + "/" + class551.field8082.method296(arg0 ^ 0x4));
                            class6.method42(true, field2674[103] + class104.field1524.method297(89) + "/" + class104.field1524.method296(1));
                            class6.method42(true, field2674[185] + class229.field3563.field632.method3947(arg0 - 4) + "/" + class229.field3563.field632.method3951(-52));
                            return;
                        }
                        if (arg3.equalsIgnoreCase(field2674[65])) {
                            class6.method42(true, field2674[90] + class438.field6846.field9975 + "," + ((class791.field11550 >> 9) + class397.field6289 >> 6) + "," + ((class133.field1896 >> 9) + class141.field2011 >> 6) + "," + ((class791.field11550 >> 9) + class397.field6289 & 0x3F) + "," + ((class133.field1896 >> 9) + class141.field2011 & 0x3F) + field2674[99] + (class207.method1873(class791.field11550, -10, class438.field6846.field9975, class133.field1896) - class396.field6285));
                            class6.method42(true, field2674[210] + class438.field6846.field9975 + "," + (class397.field6289 + class133.field1899 >> 6) + "," + (class307.field4978 + class141.field2011 >> 6) + "," + (class397.field6289 + class133.field1899 & 0x3F) + "," + (class307.field4978 + class141.field2011 & 0x3F) + field2674[99] + (class207.method1873(class133.field1899, arg0 - 15, class438.field6846.field9975, class307.field4978) - class75.field1095));
                            return;
                        }
                        if (arg3.equals(field2674[57]) || arg3.equals(field2674[188])) {
                            class265.field4293 = !class265.field4293;
                            class662.field9437.method178(class265.field4293);
                            class320.method2739(0);
                            class6.method42(true, field2674[201] + class265.field4293);
                            return;
                        }
                        if (arg3.startsWith(field2674[198])) {
                            int var19 = -1;
                            int var20 = 1000;
                            if (arg3.length() > 15) {
                                String[] var21 = class444.method3476(' ', 11206, arg3);
                                try {
                                    if (var21.length > 1) {
                                        var20 = Integer.parseInt(var21[1]);
                                    }
                                } catch (Throwable var50) {
                                }
                                try {
                                    if (var21.length > 2) {
                                        var19 = Integer.parseInt(var21[2]);
                                    }
                                } catch (Throwable var49) {
                                }
                            }
                            if (var19 != -1) {
                                class6.method42(true, field2674[33] + class496.method3746(var20, (byte) 58, var19));
                                return;
                            }
                            class6.method42(true, field2674[126] + class496.method3746(var20, (byte) 80, 0));
                            class6.method42(true, field2674[45] + class496.method3746(var20, (byte) 93, 2));
                            class6.method42(true, field2674[102] + class496.method3746(var20, (byte) 117, 3));
                            class6.method42(true, field2674[173] + class496.method3746(var20, (byte) 80, 1));
                            class6.method42(true, field2674[96] + class496.method3746(var20, (byte) 57, 5));
                            return;
                        }
                        if (arg3.equals(field2674[181])) {
                            class220.field3442 = !class220.field3442;
                            class6.method42(true, field2674[209] + class220.field3442);
                            return;
                        }
                        if (arg3.equals(field2674[144])) {
                            class355.method2940(-30516);
                            class6.method42(true, field2674[177]);
                            return;
                        }
                        if (arg3.startsWith(field2674[153])) {
                            int var22 = Integer.parseInt(arg3.substring(12));
                            class430.method3406(class262.method2285(var22, 2).field1948, arg0 ^ 0x8, var22);
                            class6.method42(true, field2674[166]);
                            return;
                        }
                        if (arg3.equals(field2674[157])) {
                            class6.method42(true, field2674[34] + class640.field9183.field7676);
                            return;
                        }
                        if (arg3.startsWith(field2674[186])) {
                            class164 var23 = class193.method1785(false);
                            class487 var24 = class618.method4519(89, class608.field8759, var23.field2659);
                            var24.field7362.method1678(0, 65280);
                            int var25 = var24.field7362.field2799;
                            int var26 = arg3.indexOf(" ", 4);
                            var24.field7362.method1681(arg3.substring(3, var26), arg0 + 23132);
                            class530.method3962((byte) 125, arg3.substring(var26), var24.field7362);
                            var24.field7362.method1668(-17010, var24.field7362.field2799 - var25);
                            var23.method1546(var24, arg0 - 4);
                            return;
                        }
                        if (arg3.equals(field2674[75])) {
                            class227.method1989(0);
                            class6.method42(true, field2674[71]);
                            return;
                        }
                        if (arg3.equals(field2674[113])) {
                            for (int var27 = 0; var27 < class380.field6121.length; var27++) {
                                if (class335.field5467[var27]) {
                                    class380.field6121[var27] = (int) (Math.random() * 99999.0D);
                                    if (Math.random() > 0.5D) {
                                        class380.field6121[var27] *= -1;
                                    }
                                }
                            }
                            class227.method1989(0);
                            class6.method42(true, field2674[81]);
                            return;
                        }
                        if (arg3.equals(field2674[203])) {
                            class636.field9123 = true;
                            class95.method918((byte) 38);
                            class6.method42(true, field2674[154]);
                            return;
                        }
                        if (arg3.equals(field2674[55])) {
                            class636.field9123 = false;
                            class95.method918((byte) -101);
                            class6.method42(true, field2674[129]);
                            return;
                        }
                        if (arg3.equals(field2674[164])) {
                            class688.method5007(-118);
                            class6.method42(true, field2674[107]);
                            return;
                        }
                        if (arg3.equals(field2674[178])) {
                            class6.method42(true, class428.method3393(arg0 + 37) + field2674[109]);
                            return;
                        }
                        if (arg3.startsWith(field2674[160])) {
                            int var28 = Integer.parseInt(arg3.substring(17));
                            class6.method42(true, field2674[193] + class398.field6315.method1583(var28, (byte) -51));
                            return;
                        }
                        if (arg3.startsWith(field2674[158])) {
                            int var29 = Integer.parseInt(arg3.substring(14));
                            class6.method42(true, field2674[66] + class398.field6315.method1584(var29, (byte) 121));
                            return;
                        }
                        if (arg3.startsWith(field2674[148])) {
                            String[] var30 = class444.method3476(' ', 11206, arg3.substring(12));
                            if (var30.length >= 2) {
                                int var31 = var30.length > 2 ? Integer.parseInt(var30[2]) : 0;
                                class615.method4472(-15354, var31, var30[1], var30[0]);
                                return;
                            }
                        }
                        if (arg3.startsWith(field2674[39])) {
                            String[] var32 = class444.method3476(' ', arg0 ^ 0x2BC3, arg3.substring(8));
                            int var33 = Integer.parseInt(var32[0]);
                            int var34 = var32.length == 2 ? Integer.parseInt(var32[1]) : 0;
                            class685.method4992(var34, var33, (byte) 36);
                            return;
                        }
                        if (arg3.startsWith(field2674[16])) {
                            class598.method4376();
                            return;
                        }
                        if (arg3.startsWith(field2674[40])) {
                            class598.method4380(100, false);
                            return;
                        }
                        if (arg3.startsWith(field2674[138])) {
                            class598.method4380(10, true);
                            return;
                        }
                        if (arg3.startsWith(field2674[161])) {
                            int var35 = Integer.parseInt(arg3.substring(8));
                            class662.field9437.method150(var35);
                            return;
                        }
                        if (arg3.equals(field2674[64])) {
                            class6.method42(true, field2674[63] + class476.field7253.method2597());
                            return;
                        }
                        if (arg3.equals(field2674[116])) {
                            class690.method5022(-513);
                            class6.method42(true, field2674[11] + class623.field8996.field6379.method4132(true));
                            return;
                        }
                        if (arg3.equals(field2674[120])) {
                            class6.method42(true, class392.field6245.method2714(16383));
                            return;
                        }
                        if (arg3.equals(field2674[117])) {
                            if (class61.field790.startsWith(field2674[47])) {
                                class166.method1558(new File(field2674[46]), false, (byte) -48);
                            } else {
                                class166.method1558(new File(field2674[140]), false, (byte) -97);
                            }
                            class6.method42(true, field2674[130]);
                            return;
                        }
                        if (arg3.equals(field2674[195])) {
                            class6.method42(true, field2674[73] + class61.field790);
                            class6.method42(true, field2674[72] + class61.field805);
                            class6.method42(true, field2674[122] + class61.field792);
                            return;
                        }
                        if (arg3.startsWith(field2674[208])) {
                            int var36 = Integer.parseInt(arg3.substring(8, 9));
                            class572.field8278 = var36;
                            class191.method1776(-10464);
                            class6.method42(true, field2674[205]);
                            return;
                        }
                        if (arg3.startsWith(field2674[132])) {
                            int var37 = arg3.indexOf(32);
                            if (var37 < 0) {
                                class6.method42(true, field2674[93]);
                                return;
                            }
                            int var38 = class441.method3457(true, arg3.substring(var37 + 1));
                            class623.field8996.method3244(22733, class623.field8996.field6366, var38);
                            class574.method4222((byte) 99);
                            class746.field10999 = false;
                            class44.method452(1);
                            if (var38 == class623.field8996.field6366.method4750(true)) {
                                class6.method42(true, field2674[115]);
                                return;
                            }
                            class6.method42(true, field2674[24]);
                            return;
                        }
                        if (arg3.startsWith(field2674[194])) {
                            if (class623.field8996.field6366.method4750(true) == 0) {
                                class6.method42(true, field2674[112]);
                                return;
                            }
                            int var39 = class441.method3457(true, arg3.substring(arg3.indexOf(32) + 1));
                            class547.field8037 = var39;
                            class6.method42(true, field2674[155] + class547.field8037);
                            return;
                        }
                        if (arg3.startsWith(field2674[100])) {
                            int var40 = class441.method3457(true, arg3.substring(arg3.indexOf(32) + 1));
                            class606.field8737 = var40;
                            class697.field10037 = var40;
                            class6.method42(true, field2674[152] + var40);
                            class44.method452(1);
                            return;
                        }
                        if (arg3.equals(field2674[89])) {
                            class708.field10188 = !class708.field10188;
                            class6.method42(true, field2674[105] + (class708.field10188 ? field2674[20] : field2674[85]));
                            return;
                        }
                        if (arg3.startsWith(field2674[192])) {
                            File var41 = new File(arg3.substring(10));
                            if (var41.exists()) {
                                var41 = new File(arg3.substring(10) + "." + class712.method5167(-2334) + field2674[58]);
                                if (var41.exists()) {
                                    class6.method42(true, field2674[128]);
                                    return;
                                }
                            }
                            if (class536.field7868 != null) {
                                class536.field7868.close();
                                class536.field7868 = null;
                            }
                            try {
                                class536.field7868 = new FileOutputStream(var41);
                                return;
                            } catch (FileNotFoundException var51) {
                                class6.method42(true, field2674[59] + var41.getName());
                                return;
                            } catch (SecurityException var52) {
                                class6.method42(true, field2674[84] + var41.getName());
                                return;
                            }
                        }
                        if (arg3.equals(field2674[135])) {
                            if (class536.field7868 != null) {
                                class536.field7868.close();
                            }
                            class536.field7868 = null;
                            return;
                        }
                        if (arg3.startsWith(field2674[78])) {
                            File var42 = new File(arg3.substring(10));
                            if (!var42.exists()) {
                                class6.method42(true, field2674[137]);
                                return;
                            }
                            byte[] var43 = class582.method4271(var42, 0);
                            if (var43 == null) {
                                class6.method42(true, field2674[204]);
                                return;
                            }
                            String[] var44 = class444.method3476('\n', 11206, class486.method3692(arg0 ^ 0xFFFF9C95, '\r', "", class290.method2448(226, var43)));
                            class648.method4726(true, var44);
                        }
                        if (arg3.startsWith(field2674[53])) {
                            short var45 = (short) class441.method3457(true, arg3.substring(5));
                            if (var45 > 0) {
                                class112.field1572 = var45;
                            }
                            return;
                        }
                        if (arg3.startsWith(field2674[114])) {
                            if (arg3.length() > 9 && arg3.charAt(8) == ' ') {
                                class598.field8678 = arg3.substring(9);
                                class598.field8679 = true;
                                class6.method42(true, field2674[180] + class598.field8678 + ")");
                                return;
                            }
                            class598.field8678 = null;
                            class598.field8679 = !class598.field8679;
                            class6.method42(true, field2674[62] + class598.field8679);
                            return;
                        }
                        if (class315.field5127 == 11) {
                            class561.field8159++;
                            class487 var46 = class618.method4519(110, class709.field10267, class185.field2948.field2659);
                            var46.field7362.method1678(arg3.length() + 3, arg0 + 65275);
                            var46.field7362.method1678(arg1 ? 1 : 0, arg0 ^ 0xFF05);
                            var46.field7362.method1678(arg2 ? 1 : 0, 65280);
                            var46.field7362.method1681(arg3, 23137);
                            class185.field2948.method1546(var46, 1);
                        }
                        if (arg3.startsWith(field2674[95]) && class710.field10281 != class417.field6596) {
                            class430.method3402(class441.method3457(true, arg3.substring(4)), (byte) 12);
                            return;
                        }
                    } catch (Exception var53) {
                        class6.method42(true, class709.field10204.method5154(class795.field11624, (byte) 65));
                        return;
                    }
                }
                if (class315.field5127 != 11) {
                    class6.method42(true, class709.field10205.method5154(class795.field11624, (byte) 65) + arg3);
                }
            }
        } catch (RuntimeException var55) {
            throw class590.method4333(var55, field2674[91] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field2674[4] : field2674[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(B)V", line = 1118)
    public final void method1544(byte arg0) {
        try {
            this.field2655.method3224(false);
            field2648++;
            if (arg0 != 43) {
                method1548((byte) -53);
            }
            this.field2657 = 0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2674[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wea", name = "c", descriptor = "(I)V", line = 1130)
    public final void method1545(int arg0) throws IOException {
        try {
            field2651++;
            if (this.field2644 != null && this.field2657 > 0) {
                this.field2658.field2799 = 0;
                while (true) {
                    class487 var2 = (class487) this.field2655.method3228(11);
                    if (var2 == null || var2.field7364 > this.field2658.field2805.length - this.field2658.field2799) {
                        this.field2644.method2169(this.field2658.field2805, true, this.field2658.field2799, 0);
                        this.field2668 += this.field2658.field2799;
                        this.field2671 = 0;
                        break;
                    }
                    this.field2658.method1667(0, var2.field7364, 106, var2.field7362.field2805);
                    this.field2657 -= var2.field7364;
                    var2.method4173(-1);
                    var2.field7362.method1677(2);
                    var2.method3700(-116);
                }
            }
            if (arg0 < 85) {
                this.field2666 = null;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2674[213] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(Lnq;I)V", line = 1165)
    public final void method1546(class487 arg0, int arg1) {
        try {
            field2646++;
            this.field2655.method3220(arg0, 0);
            arg0.field7364 = arg0.field7362.field2799;
            if (arg1 != 1) {
                this.field2671 = -106;
            }
            this.field2657 += arg0.field7364;
            arg0.field7362.field2799 = 0;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2674[5] + (arg0 == null ? field2674[4] : field2674[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(Z)V", line = 1185)
    public static final void method1547(boolean arg0) {
        try {
            field2645++;
            class679.method4946(-12284);
            class316.field5141 = arg0;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2674[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wea", name = "b", descriptor = "(B)V", line = 1203)
    public static void method1548(byte arg0) {
        try {
            field2650 = null;
            if (arg0 < 9) {
                field2654 = -19;
            }
            field2656 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2674[214] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "()V", line = 1219)
    public static final void method1549() {
        class279.method2396(1, class612.field8806);
    }

    @OriginalMember(owner = "client!wea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1550(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1551(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 13;
                    break;
                case 1:
                    var10005 = 46;
                    break;
                case 2:
                    var10005 = 102;
                    break;
                case 3:
                    var10005 = 15;
                    break;
                default:
                    var10005 = 74;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
