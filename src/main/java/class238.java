import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public abstract class class238 extends class154 {

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "Ljagtheora/ogg/OggStreamState;")
    public OggStreamState field3398;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "I")
    public int field3399;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field3400;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lkh;Z)Lkh;", line = 8)
    public static final class17 method1587(class17 arg0, boolean arg1) {
        if (!arg1) {
            field3400 = null;
        }
        field3396++;
        class17 var2 = client.method2027(arg0);
        if (var2 == null) {
            var2 = arg0.field331;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V", line = 24)
    public class238(OggStreamState arg0) {
        this.field3398 = arg0;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V", line = 32)
    public static void method1588(byte arg0) {
        field3400 = null;
        if (arg0 <= 116) {
            field3400 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILkka;)V", line = 44)
    public static final void method1589(int arg0, class329 arg1) {
        arg1.method759(class185.field2875.method3739((byte) 65), 125);
        field3397++;
        arg1.method759(class373.field5068.method3739((byte) 122), -77);
        arg1.method759(class527.field7156.method3739((byte) 99), -3);
        arg1.method759(class341.field4600.method3739((byte) 111), -113);
        arg1.method759(class312.field4256.method3739((byte) 97), -108);
        arg1.method759(class193.field2947.method3739((byte) 99), -2);
        arg1.method759(class357.field4898.method3739((byte) 83), 124);
        arg1.method759(class109.field1705.method3739((byte) 96), -127);
        arg1.method759(class346.field4664.method3739((byte) 64), 126);
        arg1.method759(class661.field9153.method3739((byte) 112), -70);
        arg1.method759(class530.field7185.method3739((byte) 89), -117);
        arg1.method759(class660.field9142.method3739((byte) 78), 126);
        arg1.method759(class687.field9554.method3739((byte) 121), -33);
        arg1.method759(class564.field7989.method3739((byte) 65), 124);
        arg1.method759(class295.field4032.method3739((byte) 47), 29);
        arg1.method759(class483.field6528.method3739((byte) 111), 121);
        if (arg0 < 111) {
            return;
        }
        arg1.method759(class649.field8977.method3739((byte) 58), 124);
        arg1.method759(class249.field3517.method3739((byte) 115), 21);
        arg1.method759(class735.field10152.method3739((byte) 124), 121);
        arg1.method759(class153.field2523.method3739((byte) 71), -47);
        arg1.method759(class783.field10760.method3739((byte) 111), 126);
        arg1.method759(class713.field9816.method3739((byte) 91), 124);
        arg1.method759(class602.field8423.method3739((byte) 114), 125);
        arg1.method759(class744.field10270.method3739((byte) 43), 124);
        arg1.method759(class683.field9512.method3739((byte) 124), -8);
        arg1.method759(class619.field8622.method3739((byte) 47), 9);
        arg1.method759(class341.field4603.method3739((byte) 62), -33);
        arg1.method759(class369.field4998.method3739((byte) 88), 126);
        arg1.method759(class215.field3192.method3739((byte) 46), 38);
        arg1.method759(class496.field6788.method3739((byte) 46), 124);
        arg1.method759(class205.field3093.method3739((byte) 59), -123);
        arg1.method759(class365.field4958.method3739((byte) 51), 125);
        arg1.method759(class447.method2600(16563), 123);
        arg1.method759(class177.method1342(2), 122);
        arg1.method759(class421.field5755.method3739((byte) 92), -90);
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(BLjagtheora/ogg/OggPacket;)V", line = 89)
    public final void method1590(byte arg0, OggPacket arg1) {
        this.method618((byte) 112, arg1);
        field3401++;
        this.field3399++;
        if (arg0 != 91) {
            this.field3399 = 62;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BLjagtheora/ogg/OggPacket;)V")
    public abstract void method618(byte arg0, OggPacket arg1);

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
    public abstract void method622(int arg0);
}
