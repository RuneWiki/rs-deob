import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public abstract class class638 {

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "Le;")
    public class489 field9050;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public int field9051;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "Loj;")
    public static class346 field9060 = new class346(8);

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "[I")
    public static int[] field9063 = new int[14];

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "[[S")
    public static short[][] field9065 = new short[][] { { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10347, 10582, 10429, 10407, 10359, 8414, 9540, 10456, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 }, { 4300, 3294, 3303, 3264, 4506, 4382, 4387, 5293, 7622, 7384, 8412, 7496, 86, 123, 111, 99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 13766, 13745, 13726, 13890, 13743, 13852, 17602, 18605, 21660, 24000, 24997, 24088, 27972, 25903, 26904, 27193, 27175, 27156, 30020, 28975, 29976, 12482, 13485, 10392, 10692, 10669, 10776, 6717, 6695, 7830, 6971, 6951, 5910, 3389, 3369, 3356, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 } };

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "Lwn;")
    public static class663 field9064 = new class663();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field9049;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static int field9052;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field9053;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public static int field9054;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field9055;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field9056;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public static int field9057;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public static int field9058;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public static int field9059;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public static int field9061;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "I")
    public static int field9062;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "[I")
    public static int[] field9066;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Lld;)V")
    public abstract void method398(int arg0, class154[] arg1);

    @OriginalMember(owner = "client!oa", name = "ha", descriptor = "(F)V")
    public abstract void method465(float arg0);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Li;)V")
    public abstract void method421(class37 arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "()Lfea;")
    public abstract class127 method340();

    @OriginalMember(owner = "client!oa", name = "ma", descriptor = "(IIIIII[BII)V")
    public abstract void method458(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)Li;")
    public abstract class37 method438(int arg0);

    @OriginalMember(owner = "client!oa", name = "ya", descriptor = "(IIIII)V")
    public abstract void method414(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "()Z")
    public abstract boolean method411();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZ)Lxa;")
    public abstract class461 method420(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!oa", name = "sa", descriptor = "(II)V")
    public abstract void method428(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lka;)V")
    public abstract void method432(class434 arg0);

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "()Lq;")
    public abstract class391 method401();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIII)Lka;")
    public abstract class434 method454(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(FFF)V")
    public abstract void method322(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "(IIIIII)V")
    public abstract void method472(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "()I")
    public abstract int method473();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
    public static void method3553(byte arg0) {
        if (arg0 > -14) {
            method3563(98, 67, 34, 19, 115, 73, 34);
        }
        field9066 = null;
        field9060 = null;
        field9063 = null;
        field9065 = null;
        field9064 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method319(Rectangle[] arg0, int arg1) throws class211;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)I")
    public abstract int method444(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
    public final void method3554(boolean arg0) {
        class664.field9364[this.field9051] = false;
        field9061++;
        if (!arg0) {
            this.method395(null);
        }
        this.method306();
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZII)V")
    public final void method3555(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        this.method445(arg3, arg0, arg1, arg4, 1);
        if (!arg2) {
            this.method360(82, 8, -42, -86);
        }
        field9057++;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lhn;IIII)Lba;")
    public abstract class352 method379(class661 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
    public abstract void method342(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "()Z")
    public abstract boolean method423();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIF)Lld;")
    public abstract class154 method457(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!oa", name = "KA", descriptor = "(IIII)[I")
    public abstract int[] method360(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
    public abstract void method394(int arg0);

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "(I)V")
    public abstract void method310(int arg0);

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "()V")
    public abstract void method358();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lba;Lhfa;Lq;Lrc;I)V")
    public abstract void method434(class352 arg0, class281 arg1, class391 arg2, class494 arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIII)Lxa;")
    public abstract class461 method452(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method381(Canvas arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IBLjava/awt/Canvas;ILpj;Le;)Loa;")
    public static final synchronized class638 method3556(int arg0, byte arg1, Canvas arg2, int arg3, class132 arg4, class489 arg5) {
        field9058++;
        if (arg0 == 0) {
            return class237.method1500(1673, arg5, false, arg2);
        } else if (arg0 == 2) {
            return class644.method3587(arg5, arg2, 44);
        } else if (arg0 == 4) {
            return class237.method1500(1673, arg5, true, arg2);
        } else if (arg0 == 1) {
            return class137.method974(arg5, arg2, arg3, arg1 + 16777263);
        } else if (arg0 == 5) {
            return class305.method1876(arg5, arg3, arg2, arg4, 57);
        } else {
            if (arg1 != -48) {
                field9065 = null;
            }
            if (arg0 != 3) {
                throw new IllegalArgumentException("UM");
            }
            return class360.method2119(arg3, arg5, 30345, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "()Z")
    public abstract boolean method424();

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "()V")
    public abstract void method325();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([Lba;Lq;[Lrc;I)V")
    public abstract void method393(class352[] arg0, class391 arg1, class494[] arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "([I)V")
    public abstract void method416(int[] arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[[I[[IIII)Ld;")
    public abstract class136 method383(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
    public abstract void method386(int arg0);

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "()Z")
    public abstract boolean method297();

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "()V")
    public abstract void method449();

    @OriginalMember(owner = "client!oa", name = "ka", descriptor = "(FF)V")
    public abstract void method462(float arg0, float arg1);

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "()Z")
    public abstract boolean method385();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZIIIII)V")
    public final void method3557(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field9062++;
        if (!arg0) {
            this.method415(arg3, arg4, arg1, arg5, arg2, 1);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BIIIII)V")
    public final void method3558(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method472(arg5, arg1, arg3, arg4, arg2, 1);
        field9056++;
        if (arg0 < 24) {
            this.field9050 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V")
    public abstract void method422(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIII)V")
    public abstract void method415(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "()Z")
    public abstract boolean method436();

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V")
    public abstract void method299(int arg0);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method437(Canvas arg0);

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "()V")
    public abstract void method460();

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(Z)V")
    public abstract void method352(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "FA", descriptor = "(IIIIII)Z")
    public abstract boolean method456(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIII)V")
    public final void method3559(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < -49) {
            field9055++;
            this.method477(arg1, arg2, arg3, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)V")
    public abstract void method382(int arg0);

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "(IIII)V")
    public abstract void method433(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lq;)V")
    public abstract void method446(class391 arg0);

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "()Z")
    public abstract boolean method476();

    @OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V")
    protected void finalize() {
        field9053++;
        this.method3554(true);
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(IIIIII)V")
    public abstract void method399(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "ca", descriptor = "(IIII)V")
    public abstract void method442(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIII)V")
    public final void method3560(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 > 6) {
            field9049++;
            this.method414(arg4, arg0, arg3, arg1, 1);
        }
    }

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "()Z")
    public abstract boolean method308();

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "()Z")
    public abstract boolean method440();

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "()Z")
    public abstract boolean method408();

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "()Z")
    public abstract boolean method407();

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(Z)V")
    public abstract void method387(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "()V")
    public abstract void method296();

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "()Z")
    public abstract boolean method461();

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "(IIIII)V")
    public abstract void method477(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "AA", descriptor = "(IIII)V")
    public abstract void method468(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lka;Lka;FLka;)Lka;")
    public abstract class434 method317(class434 arg0, class434 arg1, float arg2, class434 arg3);

    @OriginalMember(owner = "client!oa", name = "SA", descriptor = "()I")
    public abstract int method356();

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "()Z")
    public abstract boolean method426();

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)I")
    public abstract int method431(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "()Z")
    public abstract boolean method447();

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method413(Canvas arg0);

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(IIIII)V")
    public abstract void method445(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "()V")
    public abstract void method365() throws class211;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IBI)Z")
    public static final boolean method3561(int arg0, byte arg1, int arg2) {
        if (arg1 != 86) {
            method3553((byte) 35);
        }
        field9052++;
        return class186.method1243(1, arg2, arg0) & class85.method655(arg0, 28238, arg2);
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)V")
    public abstract void method448(int arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lhfa;)V")
    public abstract void method419(class281 arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method384(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "()Z")
    public abstract boolean method417();

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "()V")
    public abstract void method327();

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "()I")
    public abstract int method451();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method388(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(IIIIII)V")
    public final void method3562(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method399(arg3, arg4, arg5, arg2, arg0, arg1);
        field9059++;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I)Lfa;")
    public abstract class212 method469(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "(III)V")
    public abstract void method453(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "()Lq;")
    public abstract class391 method459();

    @OriginalMember(owner = "client!oa", name = "YA", descriptor = "(IFFFFF)V")
    public abstract void method450(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIIII)V")
    public static final void method3563(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 - arg1 >= class482.field6703 && (arg0 + arg1) <= class144.field2148 && arg4 - arg1 >= class92.field1219 && arg4 + arg1 <= class631.field8829) {
            class438.method2515(arg3, arg4, -1, arg0, arg1, arg6, arg2);
        } else {
            class604.method3347(arg3, arg4, arg2, arg6, arg0, 71, arg1);
        }
        field9054++;
        if (arg5 != 15006) {
            method3553((byte) -112);
        }
    }

    @OriginalMember(owner = "client!oa", name = "IA", descriptor = "()I")
    public abstract int method474();

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "()V")
    public abstract void method406();

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "()I")
    public abstract int method400();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILfa;II)V")
    public abstract void method441(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class212 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "na", descriptor = "(III[I)V")
    public abstract void method443(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Le;)V")
    public class638(class489 arg0) {
        this.field9050 = arg0;
        int var2 = -1;
        for (int var3 = 0; var3 < 8; var3++) {
            if (!class664.field9364[var3]) {
                var2 = var3;
                class664.field9364[var3] = true;
                break;
            }
        }
        if (var2 == -1) {
            throw new IllegalStateException("NFTI");
        }
        this.field9051 = var2;
    }

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "()V")
    public abstract void method344();

    @OriginalMember(owner = "client!oa", name = "JA", descriptor = "(I)V")
    public abstract void method402(int arg0);

    @OriginalMember(owner = "client!oa", name = "LA", descriptor = "(IIII)V")
    public abstract void method410(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lkq;Z)Lxa;")
    public abstract class461 method412(class543 arg0, boolean arg1);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lmj;[Lkq;Z)Lta;")
    public abstract class194 method405(class599 arg0, class543[] arg1, boolean arg2);

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "(IIII)V")
    public abstract void method404(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "(ILfa;II)V")
    public abstract void method425(int arg0, class212 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([Lba;Lhfa;Lq;[Lrc;I)V")
    public abstract void method390(class352[] arg0, class281 arg1, class391 arg2, class494[] arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "aa", descriptor = "()I")
    public abstract int method471();

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "()V")
    public abstract void method306();

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method395(Canvas arg0);
}
