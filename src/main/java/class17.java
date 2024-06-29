import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class17 extends RuntimeException {

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "Ljava/lang/Throwable;")
    public Throwable field359;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "Ljava/lang/String;")
    public String field369;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "Lrd;")
    public static class173 field364 = class133.method843("60 Sekunden noch einmal)3)3)3", -111);

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "Lrd;")
    public static class173 field361 = class133.method843("Welt", 89);

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "Lrd;")
    public static class173 field362 = class133.method843(" ", -94);

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "Lrd;")
    public static class173 field368 = class133.method843("<col=ffff00>", -77);

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "Lrd;")
    public static class173 field367 = class133.method843(":trade:", 65);

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "Lrd;")
    private static class173 field371 = class133.method843("button near the top of that page)3", 16);

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "Lrd;")
    public static class173 field360 = field371;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
    public static void method152(int arg0) {
        field371 = null;
        if (arg0 != -17624) {
            field367 = null;
        }
        field361 = null;
        field368 = null;
        field367 = null;
        field360 = null;
        field364 = null;
        field362 = null;
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class17(Throwable arg0, String arg1) {
        this.field359 = arg0;
        this.field369 = arg1;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V")
    public static final void method153(boolean arg0) {
        class45.field920 = 0;
        class36.field783 = 0;
        class145.method914(-10685);
        class196.method1304(-114);
        field366++;
        class140.method874(-117);
        for (int var1 = 0; var1 < class45.field920; var1++) {
            int var3 = class40.field819[var1];
            if (class217.field4203 != client.field632[var3].field2800) {
                client.field632[var3].field2215 = null;
                client.field632[var3] = null;
            }
        }
        if (class45.field919 != class70.field1358.field2222) {
            throw new RuntimeException("gnp1 pos:" + class70.field1358.field2222 + " psize:" + class45.field919);
        } else if (!arg0) {
            for (int var2 = 0; var2 < class66.field1291; var2++) {
                if (client.field632[class139.field2597[var2]] == null) {
                    throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class66.field1291);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)V")
    public static final void method154(int arg0) {
        field363++;
        if (class107.field2003 && class203.field3951 != class172.field3347) {
            class103.method638(class175.field3447.field2764[0], class166.field3206, false, class172.field3347, class175.field3447.field2814[0], class150.field2850);
        } else if (arg0 == -22278 && class34.field746 != class172.field3347) {
            class34.field746 = class172.field3347;
            class76.method471(-32, class172.field3347);
        }
    }
}
