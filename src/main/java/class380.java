import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class380 {

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "[F")
    public static float[] field5258 = new float[4];

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field5259 = new BigInteger("872e690c95e9bcd312aaff6dc60e7c7be762c1cc09b2701fc04df154a7d2400afb49aff0463dd91d8e47886bf4571430aaf7d16193e9f6ad6d7c5d0ba37b5beb56f1f879e639ee470b24ea83b460b0ecabfa5600e3da39051c41fd188240a99e20f22acd0918aa931a052bc502edb422e1132941755ab2ce11717264867b3d1fa25d2b0e45a0445eb2701006d2bd7eff059f73a18dadd0e9809aa8cb1f9df067b6513c05c778a318999410808f2aa1a28085c3f6349560708ed814738746e8ec5aea9720c2d46a07d6a1506302ea8b0384cc86dba4fdb81aa4dd715e83ade5f3b386a75d5501dd12c291e33f63eecfc3ac5928ef3ecd027e3b069fad7ed72c40276b421f94ab6c183c12830baf30a856e257370799a5fda6ebc4f062e4fa3341e23f6e7c36376034e7dcb0358a3c748a690a9441bb92411cdf6a2efb9483be8d415cc0511f1cceb8f74dfaef79040ac2493fdb2fa3faeae5c95305a2d46805c52c6f859d732d5ff60dede0f73f1ad67fda15fbe2de3462ec3126c3c7ed8d8a6ad6e40afc76f811a9248b790972160fd67e731c86601e8df63b06921909634c99b11896dd99d3660a217712ec567792672668a357451aecfc578530f7b3edd4a57e9dd798a605d0cbda6c2331566bbc1dadc9f30d82fecb0b4b9c1d34be9069740b25f7fbe213128def7e8f6d5889319cc9b8124c5f9f4f4dc6a545789cc9bee1", 16);

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
    public static int field5260 = 0;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    public static int field5256;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field5257;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)Z")
    public static final boolean method2362(int arg0) {
        field5256++;
        if (class685.field9515) {
            try {
                class323.method2083(arg0 ^ 0x27E8, "showVideoAd", class319.field4527);
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0 != -1) {
            method2362(-36);
        }
        return false;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IZ)V")
    public static final void method2363(int arg0, boolean arg1) {
        class752.field10398 = arg0;
        class67.field823 = -1;
        field5257++;
        class67.field823 = -1;
        if (!arg1) {
            method2363(-57, false);
        }
        class665.method3789(-113);
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)V")
    public static void method2364(int arg0) {
        field5259 = null;
        field5258 = null;
        if (arg0 != 4) {
            method2363(36, false);
        }
    }
}
