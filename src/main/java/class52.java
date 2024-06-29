import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class52 {

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "Lfa;")
    private class312 field737 = new class312();

    @OriginalMember(owner = "client!kn", name = "o", descriptor = "Lwg;")
    private class277 field746 = new class277();

    @OriginalMember(owner = "client!kn", name = "n", descriptor = "I")
    private int field745;

    @OriginalMember(owner = "client!kn", name = "q", descriptor = "I")
    private int field748;

    @OriginalMember(owner = "client!kn", name = "p", descriptor = "Ljf;")
    private class227 field747;

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "Z")
    public static boolean field734 = true;

    @OriginalMember(owner = "client!kn", name = "h", descriptor = "I")
    public static int field739 = 0;

    @OriginalMember(owner = "client!kn", name = "g", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field738 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!kn", name = "m", descriptor = "I")
    public static int field744 = 0;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!kn", name = "i", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!kn", name = "j", descriptor = "I")
    public static int field741;

    @OriginalMember(owner = "client!kn", name = "k", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!kn", name = "l", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(JLfa;Z)V", line = 6)
    public final void method350(long arg0, class312 arg1, boolean arg2) {
        if (this.field748 == 0) {
            class312 var5 = this.field746.method1825((byte) -97);
            var5.method1284(0);
            var5.method2143((byte) 125);
            if (this.field737 == var5) {
                class312 var6 = this.field746.method1825((byte) 116);
                var6.method1284(0);
                var6.method2143((byte) 125);
            }
        } else {
            this.field748--;
        }
        if (!arg2) {
            method354(-7);
        }
        field743++;
        this.field747.method1550(arg1, arg0, (byte) 13);
        this.field746.method1824(arg1, (byte) -104);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V", line = 38)
    public final void method351(int arg0) {
        if (arg0 != 0) {
            return;
        }
        this.field746.method1828(arg0 ^ 0xFFFFFFFB);
        field736++;
        this.field747.method1553(-27930);
        this.field737 = new class312();
        this.field748 = this.field745;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lwf;BLwf;)V", line = 53)
    public static final void method352(class306 arg0, byte arg1, class306 arg2) {
        class342.field5329 = class112.method751(arg2, arg1 ^ 0xFFFFFFC3, arg0, class215.field3402, 0);
        if (class333.field5166) {
            class159.field2478 = class299.method1969(arg0, class215.field3402, 0, -115, arg2);
        } else {
            class159.field2478 = (class232) class342.field5329;
        }
        field742++;
        class179.field2736 = class112.method751(arg2, 121, arg0, class95.field1452, 0);
        if (arg1 != -66) {
            field738 = (BigInteger) null;
        }
        class286.field4380 = class112.method751(arg2, 123, arg0, class323.field5032, 0);
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(I)Lsn;", line = 100)
    public final class187 method353(int arg0) {
        field733++;
        return arg0 == -1 ? this.field747.method1549((byte) 93) : (class187) null;
    }

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "(I)V", line = 126)
    public static void method354(int arg0) {
        field738 = null;
        if (arg0 <= 104) {
            field739 = 14;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(JI)Lfa;", line = 138)
    public final class312 method355(long arg0, int arg1) {
        class312 var4 = (class312) this.field747.method1558(arg0, false);
        field741++;
        if (arg1 != 6487) {
            this.method350(-30L, (class312) null, true);
        }
        if (var4 != null) {
            this.field746.method1824(var4, (byte) 126);
        }
        return var4;
    }

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "(I)Lsn;", line = 160)
    public final class187 method356(int arg0) {
        field740++;
        if (arg0 != 1) {
            field734 = true;
        }
        return this.field747.method1546(-1);
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(I)V", line = 182)
    public class52(int arg0) {
        this.field745 = arg0;
        this.field748 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field747 = new class227(var2);
    }
}
