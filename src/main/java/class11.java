import java.awt.Font;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class11 extends class166 {

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "I")
    public int field187 = 0;

    @OriginalMember(owner = "client!hd", name = "C", descriptor = "[I")
    public static int[] field194 = new int[25];

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "Ljava/lang/String;")
    public static String field191 = "Ok";

    @OriginalMember(owner = "client!hd", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field207 = "Loaded wordpack";

    @OriginalMember(owner = "client!hd", name = "R", descriptor = "Z")
    public static boolean field208 = false;

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field189 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!hd", name = "S", descriptor = "I")
    public static int field209 = 0;

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
    public int field182;

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "I")
    public int field184;

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "I")
    public int field185;

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "I")
    public int field186;

    @OriginalMember(owner = "client!hd", name = "w", descriptor = "I")
    public int field188;

    @OriginalMember(owner = "client!hd", name = "y", descriptor = "I")
    public int field190;

    @OriginalMember(owner = "client!hd", name = "F", descriptor = "I")
    public int field196;

    @OriginalMember(owner = "client!hd", name = "H", descriptor = "I")
    public int field198;

    @OriginalMember(owner = "client!hd", name = "I", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!hd", name = "L", descriptor = "I")
    public int field202;

    @OriginalMember(owner = "client!hd", name = "M", descriptor = "I")
    public int field203;

    @OriginalMember(owner = "client!hd", name = "N", descriptor = "I")
    public int field204;

    @OriginalMember(owner = "client!hd", name = "D", descriptor = "Lfk;")
    public class14 field195;

    @OriginalMember(owner = "client!hd", name = "P", descriptor = "Lfk;")
    public class14 field206;

    @OriginalMember(owner = "client!hd", name = "G", descriptor = "Lma;")
    public class193 field197;

    @OriginalMember(owner = "client!hd", name = "B", descriptor = "Lwc;")
    public class236 field193;

    @OriginalMember(owner = "client!hd", name = "K", descriptor = "Lsd;")
    public class45 field201;

    @OriginalMember(owner = "client!hd", name = "A", descriptor = "Ljava/awt/Font;")
    public static Font field192;

    @OriginalMember(owner = "client!hd", name = "J", descriptor = "Z")
    public boolean field200;

    @OriginalMember(owner = "client!hd", name = "O", descriptor = "[I")
    public int[] field205;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V")
    public static void method107(int arg0) {
        field207 = null;
        field191 = null;
        field192 = null;
        field189 = null;
        if (arg0 <= 56) {
            field191 = null;
        }
        field194 = null;
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(I)V")
    public final void method108(int arg0) {
        field183++;
        int var2 = this.field188;
        if (arg0 > -36) {
            return;
        }
        if (this.field197 != null) {
            class193 var5 = this.field197.method1297(false);
            if (var5 == null) {
                this.field196 = 0;
                this.field205 = null;
                this.field184 = 0;
                this.field198 = 0;
                this.field204 = 0;
                this.field188 = -1;
            } else {
                this.field196 = var5.field2999 * 128;
                this.field188 = var5.field3001;
                this.field205 = var5.field3064;
                this.field198 = var5.field3056;
                this.field184 = var5.field3007;
                this.field204 = var5.field3003;
            }
        } else if (this.field201 != null) {
            int var3 = class185.method1248(-1, this.field201);
            if (var2 != var3) {
                this.field188 = var3;
                class60 var4 = this.field201.field645;
                if (var4.field1020 != null) {
                    var4 = var4.method459(true);
                }
                if (var4 == null) {
                    this.field184 = this.field196 = 0;
                } else {
                    this.field184 = var4.field1031;
                    this.field196 = var4.field991 * 128;
                }
            }
        } else if (this.field193 != null) {
            this.field188 = class90.method693(16, this.field193);
            this.field184 = this.field193.field3822;
            this.field196 = this.field193.field3812 * 128;
        }
        if (this.field188 != var2 && this.field206 != null) {
            class257.field4118.method1205(this.field206);
            this.field206 = null;
        }
    }
}
