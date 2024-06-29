import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public abstract class class390 extends class316 {

    @OriginalMember(owner = "client!em", name = "h", descriptor = "Z")
    public boolean field5389 = false;

    @OriginalMember(owner = "client!em", name = "k", descriptor = "Z")
    public boolean field5392 = false;

    @OriginalMember(owner = "client!em", name = "i", descriptor = "I")
    public int field5390;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "I")
    public int field5386;

    @OriginalMember(owner = "client!em", name = "j", descriptor = "I")
    public int field5391;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "[[I")
    public static int[][] field5385 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!em", name = "f", descriptor = "Lap;")
    public static class310 field5387 = new class310(64, -1);

    @OriginalMember(owner = "client!em", name = "m", descriptor = "Lch;")
    public static class151 field5394 = new class151("level: ", "Stufe: ", "niveau ", "nível: ");

    @OriginalMember(owner = "client!em", name = "o", descriptor = "Lrc;")
    public static class108 field5396 = new class108(2, 6);

    @OriginalMember(owner = "client!em", name = "l", descriptor = "I")
    public static int field5393;

    @OriginalMember(owner = "client!em", name = "n", descriptor = "Lnl;")
    public static class435 field5395;

    @OriginalMember(owner = "client!em", name = "g", descriptor = "Ljf;")
    public static class483 field5388;

    @OriginalMember(owner = "client!em", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field5397;

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(IIIZZ)V")
    public class390(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        this.field5390 = arg1;
        this.field5389 = arg4;
        this.field5392 = arg3;
        this.field5386 = arg2;
        this.field5391 = arg0;
    }

    @OriginalMember(owner = "client!em", name = "e", descriptor = "(B)V")
    public static void method2368(byte arg0) {
        field5387 = null;
        field5396 = null;
        field5397 = null;
        if (arg0 != 94) {
            field5397 = null;
        }
        field5395 = null;
        field5388 = null;
        field5394 = null;
        field5385 = null;
    }
}
