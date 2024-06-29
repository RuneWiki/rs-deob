import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class295 {

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
    public int field5145 = -1;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "Laj;")
    public static class1 field5138 = new class1();

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "[I")
    public static int[] field5154 = new int[200];

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "Lsf;")
    public static class108 field5150 = class140.method973(255, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "Ljava/util/Calendar;")
    public static Calendar field5152 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "I")
    public static volatile int field5157 = 0;

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "F")
    public static float field5155;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public int field5139;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    public static int field5140;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    public int field5141;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    public int field5142;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    public int field5143;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
    public static int field5144;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
    public int field5146;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
    public int field5147;

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
    public int field5148;

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "I")
    public int field5153;

    @OriginalMember(owner = "client!ob", name = "v", descriptor = "I")
    public static int field5159;

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "Lqa;")
    public static class130 field5156;

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "Lik;")
    public static class262 field5158;

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "Lca;")
    public static class98 field5151;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "[[Lcl;")
    public static class133[][] field5149;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V", line = 8)
    public static void method2099(int arg0) {
        field5138 = null;
        field5150 = null;
        field5149 = (class133[][]) null;
        field5154 = null;
        field5152 = null;
        field5151 = null;
        field5158 = null;
        field5156 = null;
        if (arg0 < 62) {
            method2099(-6);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)V", line = 32)
    public static final void method2100(boolean arg0) {
        field5140++;
        if (!arg0) {
            method2099(-12);
        }
        class322.field5516.method644((byte) 80);
    }
}
