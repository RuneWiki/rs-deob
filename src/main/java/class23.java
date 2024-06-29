import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class23 extends class190 {

    @OriginalMember(owner = "client!ob", name = "x", descriptor = "I")
    public int field261 = -1;

    @OriginalMember(owner = "client!ob", name = "C", descriptor = "I")
    public int field266 = 0;

    @OriginalMember(owner = "client!ob", name = "z", descriptor = "I")
    public static int field263 = 0;

    @OriginalMember(owner = "client!ob", name = "D", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field267 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!ob", name = "K", descriptor = "Lqe;")
    public static class168 field274 = class66.method448(" weitere Optionen", -122);

    @OriginalMember(owner = "client!ob", name = "N", descriptor = "I")
    public static int field277 = 0;

    @OriginalMember(owner = "client!ob", name = "M", descriptor = "Lqe;")
    public static class168 field276 = class66.method448("Update)2Liste geladen)3", 26);

    @OriginalMember(owner = "client!ob", name = "v", descriptor = "I")
    public int field259;

    @OriginalMember(owner = "client!ob", name = "w", descriptor = "I")
    public int field260;

    @OriginalMember(owner = "client!ob", name = "y", descriptor = "I")
    public int field262;

    @OriginalMember(owner = "client!ob", name = "A", descriptor = "I")
    public int field264;

    @OriginalMember(owner = "client!ob", name = "B", descriptor = "I")
    public int field265;

    @OriginalMember(owner = "client!ob", name = "E", descriptor = "I")
    public int field268;

    @OriginalMember(owner = "client!ob", name = "F", descriptor = "I")
    public int field269;

    @OriginalMember(owner = "client!ob", name = "G", descriptor = "I")
    public int field270;

    @OriginalMember(owner = "client!ob", name = "H", descriptor = "I")
    public int field271;

    @OriginalMember(owner = "client!ob", name = "I", descriptor = "I")
    public int field272;

    @OriginalMember(owner = "client!ob", name = "J", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!ob", name = "L", descriptor = "[[[I")
    public static int[][][] field275;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)J")
    public static final long method117(int arg0, int arg1, int arg2) {
        class177 var3 = class254.field4395[arg0][arg1][arg2];
        return var3 == null || var3.field3101 == null ? 0L : var3.field3101.field148;
    }

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "(I)V")
    public static final void method118(int arg0) {
        field273++;
        class147.field2567.method1530(arg0);
        class212.field3659.method393((byte) -123);
        class80.field1194.method393((byte) -120);
    }

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "(I)V")
    public static void method119(int arg0) {
        field274 = null;
        if (arg0 != -28387) {
            method118(51);
        }
        field275 = null;
        field276 = null;
        field267 = null;
    }
}
