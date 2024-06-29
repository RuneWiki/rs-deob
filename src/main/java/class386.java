import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class386 extends OutputStream {

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "Lss;")
    public static class457 field5627 = new class457();

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
    public static int field5626;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
    public static int field5628;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "I")
    public static int field5629;

    @OriginalMember(owner = "client!ll", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field5626++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V")
    public static void method2447(int arg0) {
        if (arg0 == 3) {
            field5627 = null;
        }
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(I)V")
    public static final void method2448(int arg0) {
        if (arg0 == 0) {
            if (class695.field9751 == 2) {
                class665.field9187[0].method1398(class398.field5838[0]);
                class665.field9187[1].method1398(class398.field5838[1]);
            } else if (class695.field9751 == 3) {
                class665.field9187[0].method1398(class398.field5838[0]);
                class665.field9187[1].method1398(class398.field5838[1]);
                class665.field9187[2].method1398(class398.field5838[2]);
            } else {
                class665.field9187[0].method1398(class398.field5838[0]);
                class665.field9187[1].method1398(class398.field5838[1]);
                class665.field9187[2].method1398(class398.field5838[2]);
                class665.field9187[3].method1398(class398.field5838[3]);
            }
        } else if (arg0 == 1) {
            if (class695.field9751 == 2) {
                class665.field9187[0].method1398(class398.field5838[2]);
            } else if (class695.field9751 == 3) {
                class665.field9187[0].method1398(class398.field5838[3]);
                class665.field9187[1].method1398(class398.field5838[4]);
            } else {
                class665.field9187[0].method1398(class398.field5838[4]);
                class665.field9187[1].method1398(class398.field5838[5]);
                class665.field9187[2].method1398(class398.field5838[6]);
            }
        } else if (arg0 == 2) {
            if (class695.field9751 == 2) {
                class665.field9187[0].method1398(class398.field5838[3]);
                return;
            }
            if (class695.field9751 == 3) {
                class665.field9187[0].method1398(class398.field5838[5]);
                return;
            }
            class665.field9187[0].method1398(class398.field5838[7]);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method2449(long arg0, int arg1) {
        field5628++;
        class260.field3869.setTime(new Date(arg0));
        int var3 = class260.field3869.get(7);
        int var4 = class260.field3869.get(5);
        int var5 = class260.field3869.get(2);
        if (arg1 <= 70) {
            method2447(-84);
        }
        int var6 = class260.field3869.get(1);
        int var7 = class260.field3869.get(11);
        int var8 = class260.field3869.get(12);
        int var9 = class260.field3869.get(13);
        return class485.field6709[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class94.field1339[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }
}
