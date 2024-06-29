import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class344 extends OutputStream {

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
    public static int field4950;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)Lvl;")
    public static final class11 method2042(int arg0, int arg1) {
        field4949++;
        if (arg0 != 0) {
            return null;
        } else if (arg1 == 0) {
            return new class494();
        } else if (arg1 == 1) {
            return new class408();
        } else if (arg1 == 2) {
            return new class522();
        } else if (arg1 == 3) {
            return new class497();
        } else if (arg1 == 4) {
            return new class473();
        } else if (arg1 == 5) {
            return new class485();
        } else if (arg1 == 6) {
            return new class427();
        } else if (arg1 == 7) {
            return new class481();
        } else if (arg1 == 8) {
            return new class272();
        } else if (arg1 == 9) {
            return new class98();
        } else if (arg1 == 10) {
            return new class210();
        } else if (arg1 == 11) {
            return new class321();
        } else if (arg1 == 12) {
            return new class376();
        } else if (arg1 == 13) {
            return new class140();
        } else if (arg1 == 14) {
            return new class476();
        } else if (arg1 == 15) {
            return new class203();
        } else if (arg1 == 16) {
            return new class506();
        } else if (arg1 == 17) {
            return new class421();
        } else if (arg1 == 18) {
            return new class37();
        } else if (arg1 == 19) {
            return new class465();
        } else if (arg1 == 20) {
            return new class185();
        } else if (arg1 == 21) {
            return new class76();
        } else if (arg1 == 22) {
            return new class407();
        } else if (arg1 == 23) {
            return new class111();
        } else if (arg1 == 24) {
            return new class80();
        } else if (arg1 == 25) {
            return new class292();
        } else if (arg1 == 26) {
            return new class374();
        } else if (arg1 == 27) {
            return new class290();
        } else if (arg1 == 28) {
            return new class50();
        } else if (arg1 == 29) {
            return new class378();
        } else if (arg1 == 30) {
            return new class9();
        } else if (arg1 == 31) {
            return new class309();
        } else if (arg1 == 32) {
            return new class62();
        } else if (arg1 == 33) {
            return new class509();
        } else if (arg1 == 34) {
            return new class318();
        } else if (arg1 == 35) {
            return new class369();
        } else if (arg1 == 36) {
            return new class472();
        } else if (arg1 == 37) {
            return new class113();
        } else if (arg1 == 38) {
            return new class110();
        } else if (arg1 == 39) {
            return new class52();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BJ)Ljava/lang/String;")
    public static final String method2043(byte arg0, long arg1) {
        field4948++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                var6.append(class60.field754[(int) (var7 - arg1 * 37L)]);
            }
            if (arg0 != 72) {
                method2043((byte) -100, -40L);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!pi", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field4950++;
        throw new IOException();
    }
}
