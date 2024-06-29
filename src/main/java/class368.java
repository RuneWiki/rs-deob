import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class368 extends class496 {

    @OriginalMember(owner = "client!qt", name = "j", descriptor = "Lrk;")
    public class419 field5322 = new class419();

    @OriginalMember(owner = "client!qt", name = "i", descriptor = "F")
    public static float field5321;

    @OriginalMember(owner = "client!qt", name = "k", descriptor = "I")
    public static int field5323;

    @OriginalMember(owner = "client!qt", name = "l", descriptor = "I")
    public static int field5324;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method2245(long arg0, int arg1) {
        field5324++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg0;
            if (arg1 != 20296) {
                return null;
            }
            while (var4 != 0L) {
                var3++;
                var4 /= 37L;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                var6.append(class626.field9175[(int) (var7 - (arg0 * 37L))]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(II[BLjava/io/File;)V")
    public static final void method2246(int arg0, int arg1, byte[] arg2, File arg3) throws IOException {
        field5323++;
        DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg3)));
        try {
            var4.readFully(arg2, 0, arg0);
        } catch (EOFException var5) {
        }
        if (arg1 > 67) {
            var4.close();
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(II)V")
    public static final void method2247(int arg0, int arg1) {
        class415 var2 = class526.field7777[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class415 var4 = class526.field7777[var3][arg0][arg1] = class526.field7777[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field5990--;
                for (class639 var5 = var4.field5981; var5 != null; var5 = var5.field9291) {
                    class237 var6 = var5.field9288;
                    if (var6.field3469 == arg0 && var6.field3472 == arg1) {
                        var6.field3457--;
                    }
                }
            }
        }
        if (class526.field7777[0][arg0][arg1] == null) {
            class526.field7777[0][arg0][arg1] = new class415(0, arg0, arg1);
            class526.field7777[0][arg0][arg1].field5984 = 1;
        }
        class526.field7777[0][arg0][arg1].field5979 = var2;
        class526.field7777[3][arg0][arg1] = null;
    }
}
