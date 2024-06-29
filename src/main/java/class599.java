import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tka")
public class class599 extends class761 {
   @OriginalMember(
      owner = "client!tka",
      name = "r",
      descriptor = "[I"
   )
   private int[] field8523;
   @OriginalMember(
      owner = "client!tka",
      name = "k",
      descriptor = "I"
   )
   private int field8519;
   @OriginalMember(
      owner = "client!tka",
      name = "nc",
      descriptor = "I"
   )
   private int field8550 = 0;
   @OriginalMember(
      owner = "client!tka",
      name = "Bc",
      descriptor = "I"
   )
   private int field8530 = 0;
   @OriginalMember(
      owner = "client!tka",
      name = "gc",
      descriptor = "I"
   )
   private int field8478;
   @OriginalMember(
      owner = "client!tka",
      name = "ib",
      descriptor = "Z"
   )
   private boolean field8507 = false;
   @OriginalMember(
      owner = "client!tka",
      name = "x",
      descriptor = "Z"
   )
   private boolean field8465 = false;
   @OriginalMember(
      owner = "client!tka",
      name = "lb",
      descriptor = "[I"
   )
   private int[] field8505;
   @OriginalMember(
      owner = "client!tka",
      name = "E",
      descriptor = "[I"
   )
   private int[] field8487;
   @OriginalMember(
      owner = "client!tka",
      name = "Ic",
      descriptor = "I"
   )
   private int field8528 = 0;
   @OriginalMember(
      owner = "client!tka",
      name = "Ec",
      descriptor = "[I"
   )
   private int[] field8453;
   @OriginalMember(
      owner = "client!tka",
      name = "ac",
      descriptor = "[S"
   )
   private short[] field8514;
   @OriginalMember(
      owner = "client!tka",
      name = "I",
      descriptor = "I"
   )
   private int field8527 = 0;
   @OriginalMember(
      owner = "client!tka",
      name = "F",
      descriptor = "[Ldga;"
   )
   private class712[] field8468;
   @OriginalMember(
      owner = "client!tka",
      name = "Cc",
      descriptor = "[Lhaa;"
   )
   private class3[] field8443;
   @OriginalMember(
      owner = "client!tka",
      name = "rb",
      descriptor = "I"
   )
   private int field8461;
   @OriginalMember(
      owner = "client!tka",
      name = "zc",
      descriptor = "[Lsfa;"
   )
   private class138[] field8440;
   @OriginalMember(
      owner = "client!tka",
      name = "yc",
      descriptor = "[Lon;"
   )
   private class496[] field8555;
   @OriginalMember(
      owner = "client!tka",
      name = "Y",
      descriptor = "[B"
   )
   private byte[] field8460;
   @OriginalMember(
      owner = "client!tka",
      name = "Rb",
      descriptor = "[S"
   )
   private short[] field8447;
   @OriginalMember(
      owner = "client!tka",
      name = "pb",
      descriptor = "[F"
   )
   private float[] field8477;
   @OriginalMember(
      owner = "client!tka",
      name = "Ab",
      descriptor = "[S"
   )
   private short[] field8532;
   @OriginalMember(
      owner = "client!tka",
      name = "V",
      descriptor = "S"
   )
   private short field8562;
   @OriginalMember(
      owner = "client!tka",
      name = "mb",
      descriptor = "S"
   )
   private short field8444;
   @OriginalMember(
      owner = "client!tka",
      name = "xb",
      descriptor = "[S"
   )
   private short[] field8521;
   @OriginalMember(
      owner = "client!tka",
      name = "U",
      descriptor = "[S"
   )
   private short[] field8500;
   @OriginalMember(
      owner = "client!tka",
      name = "Tb",
      descriptor = "[S"
   )
   private short[] field8497;
   @OriginalMember(
      owner = "client!tka",
      name = "cc",
      descriptor = "[S"
   )
   private short[] field8458;
   @OriginalMember(
      owner = "client!tka",
      name = "pc",
      descriptor = "[S"
   )
   private short[] field8503;
   @OriginalMember(
      owner = "client!tka",
      name = "mc",
      descriptor = "[S"
   )
   private short[] field8560;
   @OriginalMember(
      owner = "client!tka",
      name = "Ub",
      descriptor = "[S"
   )
   private short[] field8525;
   @OriginalMember(
      owner = "client!tka",
      name = "o",
      descriptor = "[F"
   )
   private float[] field8556;
   @OriginalMember(
      owner = "client!tka",
      name = "Fc",
      descriptor = "[B"
   )
   private byte[] field8540;
   @OriginalMember(
      owner = "client!tka",
      name = "vc",
      descriptor = "[S"
   )
   private short[] field8437;
   @OriginalMember(
      owner = "client!tka",
      name = "fc",
      descriptor = "[S"
   )
   private short[] field8499;
   @OriginalMember(
      owner = "client!tka",
      name = "Gc",
      descriptor = "[S"
   )
   private short[] field8485;
   @OriginalMember(
      owner = "client!tka",
      name = "J",
      descriptor = "[I"
   )
   private int[] field8551;
   @OriginalMember(
      owner = "client!tka",
      name = "ub",
      descriptor = "[I"
   )
   private int[] field8542;
   @OriginalMember(
      owner = "client!tka",
      name = "wc",
      descriptor = "[I"
   )
   private int[] field8515;
   @OriginalMember(
      owner = "client!tka",
      name = "Eb",
      descriptor = "I"
   )
   private int field8563 = 0;
   @OriginalMember(
      owner = "client!tka",
      name = "m",
      descriptor = "[[I"
   )
   private int[][] field8454;
   @OriginalMember(
      owner = "client!tka",
      name = "tb",
      descriptor = "[[I"
   )
   private int[][] field8546;
   @OriginalMember(
      owner = "client!tka",
      name = "v",
      descriptor = "[[I"
   )
   private int[][] field8495;
   @OriginalMember(
      owner = "client!tka",
      name = "bb",
      descriptor = "Z"
   )
   private boolean field8541 = false;
   @OriginalMember(
      owner = "client!tka",
      name = "Z",
      descriptor = "Z"
   )
   private boolean field8513 = true;
   @OriginalMember(
      owner = "client!tka",
      name = "nb",
      descriptor = "Z"
   )
   private boolean field8561 = false;
   @OriginalMember(
      owner = "client!tka",
      name = "O",
      descriptor = "Ldaa;"
   )
   private class226 field8446;
   @OriginalMember(
      owner = "client!tka",
      name = "hc",
      descriptor = "Lika;"
   )
   private class223 field8522;
   @OriginalMember(
      owner = "client!tka",
      name = "dc",
      descriptor = "Lika;"
   )
   private class223 field8481;
   @OriginalMember(
      owner = "client!tka",
      name = "ec",
      descriptor = "Lika;"
   )
   private class223 field8552;
   @OriginalMember(
      owner = "client!tka",
      name = "A",
      descriptor = "Lika;"
   )
   private class223 field8473;
   @OriginalMember(
      owner = "client!tka",
      name = "y",
      descriptor = "Ldp;"
   )
   private class513 field8543;
   @OriginalMember(
      owner = "client!tka",
      name = "Kc",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8565 = new String[]{method4409(method4408("\fru\t?:1")), method4409(method4408("\fru\t?P")), method4409(method4408("\u0016lxK")), method4409(method4408("\u00037:\t\u000b")), method4409(method4408("\fru\t891")), method4409(method4408("\fru\t991")), method4409(method4408("\fru\t\u0001\u00191")), method4409(method4408("\fru\t&91")), method4409(method4408("\fru\t:91")), method4409(method4408("\fru\t4:1")), method4409(method4408("\fru\t1:1")), method4409(method4408("\fru\t\u0018\u00191")), method4409(method4408("\fru\t9P")), method4409(method4408("\fru\t3P")), method4409(method4408("\fru\t7:1")), method4409(method4408("\fru\t>:1")), method4409(method4408("\fru\t091")), method4409(method4408("\fru\t\"91")), method4409(method4408("\fru\t>91")), method4409(method4408("\fru\t3:1")), method4409(method4408("\fru\t591")), method4409(method4408("\fru\t\u0006P")), method4409(method4408("\fru\t\u0003\u00191")), method4409(method4408("\fru\t\u0014\u00191")), method4409(method4408("\fru\t\u0017\u00191")), method4409(method4408("\fru\t%91")), method4409(method4408("\fru\t0:1")), method4409(method4408("\fru\t=P")), method4409(method4408("\fru\t4P")), method4409(method4408("\fru\t\u0005P")), method4409(method4408("\fru\t 91")), method4409(method4408("\fru\t;91")), method4409(method4408("\fru\tJ\u0011w}SHP")), method4409(method4408("\fru\t>P")), method4409(method4408("\fru\t$91")), method4409(method4408("\fru\t391")), method4409(method4408("\fru\t<P")), method4409(method4408("\fru\t\u0000P")), method4409(method4408("\fru\t8:1")), method4409(method4408("\fru\t291")), method4409(method4408("\fru\t\"P")), method4409(method4408("\fru\t=91")), method4409(method4408("\fru\t2:1")), method4409(method4408("\fru\t\u001b\u00191")), method4409(method4408("\fru\t5:1")), method4409(method4408("\fru\t491")), method4409(method4408("\fru\t0P")), method4409(method4408("\fru\t'91")), method4409(method4408("\bz")), method4409(method4408("\fru\t=:1")), method4409(method4408("\fru\t\f\u00191")), method4409(method4408("\fru\t::1")), method4409(method4408("\fru\t\u001dP")), method4409(method4408("\fru\t;:1")), method4409(method4408("\fru\t$P")), method4409(method4408("\fru\t2P")), method4409(method4408("\fru\t:P")), method4409(method4408("\fru\t<:1")), method4409(method4408("\fru\t1P")), method4409(method4408("\fru\t!P")), method4409(method4408("\fru\t#P")), method4409(method4408("\fru\t\u001f\u00191")), method4409(method4408("\fru\t\u0004P")), method4409(method4408("\fru\t P")), method4409(method4408("\fru\t\u0012\u00191")), method4409(method4408("\fru\t\u0010\u00191")), method4409(method4408("\fru\t5P")), method4409(method4408("\fru\t9:1")), method4409(method4408("\fru\t!91")), method4409(method4408("\fru\t\u0017P")), method4409(method4408("\fru\t#91")), method4409(method4408("\fru\t&P"))};
   @OriginalMember(
      owner = "client!tka",
      name = "cb",
      descriptor = "Lhha;"
   )
   public static class724 field8496 = new class724(142, 2);
   @OriginalMember(
      owner = "client!tka",
      name = "db",
      descriptor = "I"
   )
   public static int field8520 = 1;
   @OriginalMember(
      owner = "client!tka",
      name = "T",
      descriptor = "I"
   )
   public static int field8435;
   @OriginalMember(
      owner = "client!tka",
      name = "p",
      descriptor = "I"
   )
   public static int field8436;
   @OriginalMember(
      owner = "client!tka",
      name = "rc",
      descriptor = "I"
   )
   public static int field8438;
   @OriginalMember(
      owner = "client!tka",
      name = "Wb",
      descriptor = "I"
   )
   private int field8439;
   @OriginalMember(
      owner = "client!tka",
      name = "tc",
      descriptor = "I"
   )
   public static int field8441;
   @OriginalMember(
      owner = "client!tka",
      name = "Mb",
      descriptor = "I"
   )
   public static int field8442;
   @OriginalMember(
      owner = "client!tka",
      name = "Pb",
      descriptor = "I"
   )
   public static int field8445;
   @OriginalMember(
      owner = "client!tka",
      name = "Ac",
      descriptor = "I"
   )
   public static int field8448;
   @OriginalMember(
      owner = "client!tka",
      name = "wb",
      descriptor = "I"
   )
   public static int field8449;
   @OriginalMember(
      owner = "client!tka",
      name = "gb",
      descriptor = "I"
   )
   private int field8450;
   @OriginalMember(
      owner = "client!tka",
      name = "sc",
      descriptor = "I"
   )
   public static int field8451;
   @OriginalMember(
      owner = "client!tka",
      name = "vb",
      descriptor = "I"
   )
   public static int field8452;
   @OriginalMember(
      owner = "client!tka",
      name = "bc",
      descriptor = "I"
   )
   public static int field8455;
   @OriginalMember(
      owner = "client!tka",
      name = "kc",
      descriptor = "I"
   )
   private int field8456;
   @OriginalMember(
      owner = "client!tka",
      name = "G",
      descriptor = "I"
   )
   public static int field8457;
   @OriginalMember(
      owner = "client!tka",
      name = "C",
      descriptor = "I"
   )
   public static int field8459;
   @OriginalMember(
      owner = "client!tka",
      name = "qc",
      descriptor = "I"
   )
   public static int field8462;
   @OriginalMember(
      owner = "client!tka",
      name = "Ib",
      descriptor = "I"
   )
   private int field8463;
   @OriginalMember(
      owner = "client!tka",
      name = "kb",
      descriptor = "I"
   )
   public static int field8464;
   @OriginalMember(
      owner = "client!tka",
      name = "N",
      descriptor = "I"
   )
   public static int field8467;
   @OriginalMember(
      owner = "client!tka",
      name = "u",
      descriptor = "I"
   )
   public static int field8469;
   @OriginalMember(
      owner = "client!tka",
      name = "Jc",
      descriptor = "I"
   )
   public static int field8470;
   @OriginalMember(
      owner = "client!tka",
      name = "Q",
      descriptor = "I"
   )
   public static int field8471;
   @OriginalMember(
      owner = "client!tka",
      name = "Hc",
      descriptor = "I"
   )
   public static int field8472;
   @OriginalMember(
      owner = "client!tka",
      name = "s",
      descriptor = "I"
   )
   public static int field8474;
   @OriginalMember(
      owner = "client!tka",
      name = "B",
      descriptor = "I"
   )
   public static int field8475;
   @OriginalMember(
      owner = "client!tka",
      name = "jb",
      descriptor = "I"
   )
   public static int field8476;
   @OriginalMember(
      owner = "client!tka",
      name = "sb",
      descriptor = "I"
   )
   private int field8479;
   @OriginalMember(
      owner = "client!tka",
      name = "Gb",
      descriptor = "I"
   )
   public static int field8480;
   @OriginalMember(
      owner = "client!tka",
      name = "P",
      descriptor = "I"
   )
   public static int field8482;
   @OriginalMember(
      owner = "client!tka",
      name = "q",
      descriptor = "I"
   )
   public static int field8483;
   @OriginalMember(
      owner = "client!tka",
      name = "ic",
      descriptor = "I"
   )
   public static int field8484;
   @OriginalMember(
      owner = "client!tka",
      name = "R",
      descriptor = "I"
   )
   public static int field8486;
   @OriginalMember(
      owner = "client!tka",
      name = "ab",
      descriptor = "I"
   )
   public static int field8488;
   @OriginalMember(
      owner = "client!tka",
      name = "Sb",
      descriptor = "I"
   )
   public static int field8489;
   @OriginalMember(
      owner = "client!tka",
      name = "Cb",
      descriptor = "I"
   )
   public static int field8490;
   @OriginalMember(
      owner = "client!tka",
      name = "n",
      descriptor = "I"
   )
   private int field8491;
   @OriginalMember(
      owner = "client!tka",
      name = "D",
      descriptor = "I"
   )
   public static int field8492;
   @OriginalMember(
      owner = "client!tka",
      name = "xc",
      descriptor = "I"
   )
   public static int field8493;
   @OriginalMember(
      owner = "client!tka",
      name = "eb",
      descriptor = "I"
   )
   public static int field8494;
   @OriginalMember(
      owner = "client!tka",
      name = "Jb",
      descriptor = "I"
   )
   public static int field8498;
   @OriginalMember(
      owner = "client!tka",
      name = "Fb",
      descriptor = "I"
   )
   public static int field8501;
   @OriginalMember(
      owner = "client!tka",
      name = "z",
      descriptor = "I"
   )
   public static int field8502;
   @OriginalMember(
      owner = "client!tka",
      name = "Zb",
      descriptor = "I"
   )
   public static int field8504;
   @OriginalMember(
      owner = "client!tka",
      name = "Ob",
      descriptor = "I"
   )
   public static int field8506;
   @OriginalMember(
      owner = "client!tka",
      name = "Xb",
      descriptor = "I"
   )
   public static int field8508;
   @OriginalMember(
      owner = "client!tka",
      name = "Vb",
      descriptor = "I"
   )
   public static int field8509;
   @OriginalMember(
      owner = "client!tka",
      name = "qb",
      descriptor = "I"
   )
   public static int field8510;
   @OriginalMember(
      owner = "client!tka",
      name = "hb",
      descriptor = "I"
   )
   public static int field8511;
   @OriginalMember(
      owner = "client!tka",
      name = "zb",
      descriptor = "I"
   )
   public static int field8512;
   @OriginalMember(
      owner = "client!tka",
      name = "K",
      descriptor = "I"
   )
   public static int field8516;
   @OriginalMember(
      owner = "client!tka",
      name = "H",
      descriptor = "I"
   )
   private int field8517;
   @OriginalMember(
      owner = "client!tka",
      name = "oc",
      descriptor = "I"
   )
   public static int field8518;
   @OriginalMember(
      owner = "client!tka",
      name = "w",
      descriptor = "I"
   )
   public static int field8524;
   @OriginalMember(
      owner = "client!tka",
      name = "W",
      descriptor = "I"
   )
   public static int field8526;
   @OriginalMember(
      owner = "client!tka",
      name = "Kb",
      descriptor = "I"
   )
   private int field8529;
   @OriginalMember(
      owner = "client!tka",
      name = "Qb",
      descriptor = "I"
   )
   public static int field8531;
   @OriginalMember(
      owner = "client!tka",
      name = "Db",
      descriptor = "I"
   )
   public static int field8533;
   @OriginalMember(
      owner = "client!tka",
      name = "fb",
      descriptor = "I"
   )
   public static int field8534;
   @OriginalMember(
      owner = "client!tka",
      name = "M",
      descriptor = "I"
   )
   public static int field8535;
   @OriginalMember(
      owner = "client!tka",
      name = "ob",
      descriptor = "I"
   )
   public static int field8536;
   @OriginalMember(
      owner = "client!tka",
      name = "L",
      descriptor = "I"
   )
   public static int field8537;
   @OriginalMember(
      owner = "client!tka",
      name = "t",
      descriptor = "I"
   )
   public static int field8538;
   @OriginalMember(
      owner = "client!tka",
      name = "uc",
      descriptor = "I"
   )
   public static int field8539;
   @OriginalMember(
      owner = "client!tka",
      name = "jc",
      descriptor = "I"
   )
   public static int field8544;
   @OriginalMember(
      owner = "client!tka",
      name = "Hb",
      descriptor = "I"
   )
   public static int field8545;
   @OriginalMember(
      owner = "client!tka",
      name = "Bb",
      descriptor = "I"
   )
   public static int field8547;
   @OriginalMember(
      owner = "client!tka",
      name = "Nb",
      descriptor = "I"
   )
   public static int field8548;
   @OriginalMember(
      owner = "client!tka",
      name = "lc",
      descriptor = "I"
   )
   public static int field8549;
   @OriginalMember(
      owner = "client!tka",
      name = "yb",
      descriptor = "I"
   )
   public static int field8553;
   @OriginalMember(
      owner = "client!tka",
      name = "X",
      descriptor = "I"
   )
   public static int field8554;
   @OriginalMember(
      owner = "client!tka",
      name = "l",
      descriptor = "I"
   )
   public static int field8557;
   @OriginalMember(
      owner = "client!tka",
      name = "S",
      descriptor = "I"
   )
   public static int field8558;
   @OriginalMember(
      owner = "client!tka",
      name = "Dc",
      descriptor = "I"
   )
   public static int field8559;
   @OriginalMember(
      owner = "client!tka",
      name = "Lb",
      descriptor = "I"
   )
   public static int field8564;
   @OriginalMember(
      owner = "client!tka",
      name = "Yb",
      descriptor = "Luca;"
   )
   private class243 field8466;

   @OriginalMember(
      owner = "client!tka",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method4389(int arg0) {
      try {
         field8496 = null;
         if (arg0 != 255) {
            field8520 = 59;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8565[38] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "fa",
      descriptor = "()I"
   )
   public final int method801() {
      try {
         if (!this.field8561) {
            this.method4391((byte)97);
         }

         ++field8506;
         return this.field8450;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8565[65] + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "e",
      descriptor = "()[Ldga;"
   )
   public final class712[] method753() {
      try {
         ++field8501;
         return this.field8468;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8565[20] + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "P",
      descriptor = "(IIII)V"
   )
   public final void method766(int arg0, int arg1, int arg2, int arg3) {
      boolean var5 = client.field10022;

      try {
         ++field8436;
         if (~arg0 != -1) {
            if (arg0 != 1) {
               if (~arg0 != -3) {
                  if (~arg0 != -4) {
                     if (arg0 != 5) {
                        if (~arg0 != -8) {
                           if (arg0 != 8) {
                              if (arg0 != 10) {
                                 if (arg0 == 9) {
                                    int var40 = 0;
                                    if (var5 || ~this.field8461 < ~var40) {
                                       do {
                                          class496 var41 = this.field8555[var40];
                                          var41.field7076 = 16383 & var41.field7076 + arg1;
                                          ++var40;
                                       } while(~this.field8461 < ~var40);

                                    }
                                 }
                              } else {
                                 int var38 = 0;
                                 if (var5 || this.field8461 > var38) {
                                    do {
                                       class496 var39 = this.field8555[var38];
                                       var39.field7078 = var39.field7078 * arg2 >> 7;
                                       var39.field7073 = var39.field7073 * arg1 >> 7;
                                       ++var38;
                                    } while(this.field8461 > var38);

                                 }
                              }
                           } else {
                              int var36 = 0;
                              if (var5 || ~this.field8461 < ~var36) {
                                 do {
                                    class496 var37 = this.field8555[var36];
                                    var37.field7071 += arg1;
                                    var37.field7070 += arg2;
                                    ++var36;
                                 } while(~this.field8461 < ~var36);

                              }
                           }
                        } else {
                           int var25 = 0;
                           int var33;
                           class138 var34;
                           class496 var35;
                           if (!var5 && ~var25 <= ~this.field8550) {
                              if (this.field8440 != null) {
                                 var33 = 0;
                                 if (var5 || ~var33 > ~this.field8461) {
                                    do {
                                       var34 = this.field8440[var33];
                                       var35 = this.field8555[var33];
                                       var35.field7069 = class744.field10589[this.field8499[var34.field2219] & 65535] & 16777215 | var35.field7069 & -16777216;
                                       ++var33;
                                    } while(~var33 > ~this.field8461);
                                 }
                              }

                              this.method4407((byte)-92);
                           } else {
                              do {
                                 int var26 = 65535 & this.field8499[var25];
                                 int var27 = 63 & var26 >> 10;
                                 int var28 = 7 & var26 >> 7;
                                 int var29 = var26 & 127;
                                 int var30 = 63 & arg1 + var27;
                                 int var31 = arg2 / 4 + var28;
                                 if (~var31 <= -1) {
                                    if (~var31 < -8) {
                                       var31 = 7;
                                       if (var5) {
                                          var31 = 0;
                                       }
                                    }
                                 } else {
                                    var31 = 0;
                                 }

                                 int var32 = arg3 + var29;
                                 if (~var32 <= -1) {
                                    if (~var32 < -128) {
                                       var32 = 127;
                                       if (var5) {
                                          var32 = 0;
                                       }
                                    }
                                 } else {
                                    var32 = 0;
                                 }

                                 this.field8499[var25] = (short)class91.method932(var32, class91.method932(var31 << 7, var30 << 10));
                                 ++var25;
                              } while(~var25 > ~this.field8550);

                              if (this.field8440 != null) {
                                 var33 = 0;
                                 if (var5 || ~var33 > ~this.field8461) {
                                    do {
                                       var34 = this.field8440[var33];
                                       var35 = this.field8555[var33];
                                       var35.field7069 = class744.field10589[this.field8499[var34.field2219] & 65535] & 16777215 | var35.field7069 & -16777216;
                                       ++var33;
                                    } while(~var33 > ~this.field8461);
                                 }
                              }

                              this.method4407((byte)-92);
                           }
                        }
                     } else {
                        int var20 = 0;
                        int var21;
                        if (var5) {
                           var21 = (255 & this.field8540[var20]) + arg1 * 8;
                           if (~var21 <= -1) {
                              if (var21 > 255) {
                                 var21 = 255;
                                 if (var5) {
                                    var21 = 0;
                                 }
                              }
                           } else {
                              var21 = 0;
                           }

                           this.field8540[var20] = (byte)var21;
                           ++var20;
                        }

                        while(this.field8550 > var20) {
                           var21 = (255 & this.field8540[var20]) + arg1 * 8;
                           if (~var21 <= -1) {
                              if (var21 > 255) {
                                 var21 = 255;
                                 if (var5) {
                                    var21 = 0;
                                 }
                              }
                           } else {
                              var21 = 0;
                           }

                           this.field8540[var20] = (byte)var21;
                           ++var20;
                        }

                        if (this.field8440 != null) {
                           int var22 = 0;
                           if (var5 || var22 < this.field8461) {
                              do {
                                 class138 var23 = this.field8440[var22];
                                 class496 var24 = this.field8555[var22];
                                 var24.field7069 = var24.field7069 & 16777215 | -(this.field8540[var23.field2219] & 255) + 255 << 24;
                                 ++var22;
                              } while(var22 < this.field8461);
                           }
                        }

                        this.method4407((byte)-95);
                     }
                  } else {
                     int var19 = 0;
                     if (var5) {
                        this.field8505[var19] -= class339.field5000;
                        this.field8453[var19] -= class37.field540;
                        this.field8487[var19] -= class772.field11165;
                        this.field8505[var19] = this.field8505[var19] * arg1 / 128;
                        this.field8453[var19] = this.field8453[var19] * arg2 / 128;
                        this.field8487[var19] = this.field8487[var19] * arg3 / 128;
                        this.field8505[var19] += class339.field5000;
                        this.field8453[var19] += class37.field540;
                        this.field8487[var19] += class772.field11165;
                        ++var19;
                     }

                     while(true) {
                        while(this.field8527 > var19) {
                           this.field8505[var19] -= class339.field5000;
                           this.field8453[var19] -= class37.field540;
                           this.field8487[var19] -= class772.field11165;
                           this.field8505[var19] = this.field8505[var19] * arg1 / 128;
                           this.field8453[var19] = this.field8453[var19] * arg2 / 128;
                           this.field8487[var19] = this.field8487[var19] * arg3 / 128;
                           this.field8505[var19] += class339.field5000;
                           this.field8453[var19] += class37.field540;
                           this.field8487[var19] += class772.field11165;
                           ++var19;
                        }

                        if (!var5) {
                           return;
                        }

                        ++var19;
                     }
                  }
               } else {
                  int var9 = 0;
                  if (var5) {
                     this.field8505[var9] -= class339.field5000;
                     this.field8453[var9] -= class37.field540;
                     this.field8487[var9] -= class772.field11165;
                  } else if (~this.field8527 >= ~var9) {
                     if (!var5) {
                        return;
                     }
                  } else {
                     this.field8505[var9] -= class339.field5000;
                     this.field8453[var9] -= class37.field540;
                     this.field8487[var9] -= class772.field11165;
                  }

                  while(true) {
                     if (arg3 != 0) {
                        int var10 = class160.field2447[arg3];
                        int var11 = class160.field2446[arg3];
                        int var12 = this.field8505[var9] * var11 + this.field8453[var9] * var10 + 16383 >> 14;
                        this.field8453[var9] = this.field8453[var9] * var11 - -16383 + -(this.field8505[var9] * var10) >> 14;
                        this.field8505[var9] = var12;
                     }

                     if (~arg1 != -1) {
                        int var13 = class160.field2447[arg1];
                        int var14 = class160.field2446[arg1];
                        int var15 = this.field8453[var9] * var14 - this.field8487[var9] * var13 + 16383 >> 14;
                        this.field8487[var9] = this.field8487[var9] * var14 + this.field8453[var9] * var13 - -16383 >> 14;
                        this.field8453[var9] = var15;
                     }

                     if (arg2 != 0) {
                        int var16 = class160.field2447[arg2];
                        int var17 = class160.field2446[arg2];
                        int var18 = this.field8487[var9] * var16 - -(this.field8505[var9] * var17) - -16383 >> 14;
                        this.field8487[var9] = this.field8487[var9] * var17 + -(this.field8505[var9] * var16) + 16383 >> 14;
                        this.field8505[var9] = var18;
                     }

                     this.field8505[var9] += class339.field5000;
                     this.field8453[var9] += class37.field540;
                     this.field8487[var9] += class772.field11165;
                     ++var9;
                     if (~this.field8527 >= ~var9) {
                        if (!var5) {
                           return;
                        }
                     } else {
                        this.field8505[var9] -= class339.field5000;
                        this.field8453[var9] -= class37.field540;
                        this.field8487[var9] -= class772.field11165;
                     }
                  }
               }
            } else {
               int var8 = 0;
               if (var5) {
                  this.field8505[var8] += arg1;
                  this.field8453[var8] += arg2;
                  this.field8487[var8] += arg3;
                  ++var8;
               }

               while(true) {
                  while(var8 < this.field8527) {
                     this.field8505[var8] += arg1;
                     this.field8453[var8] += arg2;
                     this.field8487[var8] += arg3;
                     ++var8;
                  }

                  if (!var5) {
                     return;
                  }

                  ++var8;
               }
            }
         } else {
            int var6 = 0;
            class37.field540 = 0;
            class772.field11165 = 0;
            class339.field5000 = 0;
            int var7 = 0;
            if (var5) {
               class339.field5000 += this.field8505[var7];
               class37.field540 += this.field8453[var7];
               ++var6;
               class772.field11165 += this.field8487[var7];
               ++var7;
            }

            while(true) {
               while(~var7 > ~this.field8527) {
                  class339.field5000 += this.field8505[var7];
                  class37.field540 += this.field8453[var7];
                  ++var6;
                  class772.field11165 += this.field8487[var7];
                  ++var7;
               }

               int var10000 = ~var6;
               if (!var5) {
                  if (var10000 >= -1) {
                     class772.field11165 = arg3;
                     class339.field5000 = arg1;
                     class37.field540 = arg2;
                     return;
                  }

                  class339.field5000 = class339.field5000 / var6 + arg1;
                  class37.field540 = class37.field540 / var6 - -arg2;
                  class772.field11165 = class772.field11165 / var6 + arg3;
                  return;
               }

               class772.field11165 = var10000 + -1;
               ++var7;
            }
         }
      } catch (RuntimeException var43) {
         throw class612.method4503(var43, field8565[71] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "d",
      descriptor = "()V"
   )
   public final void method752() {
      try {
         ++field8539;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8565[13] + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "G",
      descriptor = "()I"
   )
   public final int method783() {
      try {
         if (!this.field8561) {
            this.method4391((byte)90);
         }

         ++field8474;
         return this.field8456;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8565[58] + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "d",
      descriptor = "(B)V"
   )
   private final void method4390(byte arg0) {
      boolean var2 = client.field10022;

      try {
         ++field8544;
         if (~this.field8530 != -1) {
            if (arg0 == -51) {
               if (this.method4400(700844110) && this.method4398((byte)-60)) {
                  boolean var3;
                  label41: {
                     this.field8446.method1254(0, this.field8522.field3163, 4);
                     this.field8446.method1254(1, this.field8552.field3163, 4);
                     this.field8446.method1254(2, this.field8481.field3163, 4);
                     if (~(55 & this.field8519) != -1) {
                        var3 = true;
                        this.field8446.method1971(-116, true);
                        this.field8446.method1254(3, this.field8473.field3163, 4);
                        this.field8446.method1263(this.field8446.field3507, 78);
                        if (!var2) {
                           break label41;
                        }
                     }

                     this.field8446.method1971(99, false);
                     var3 = false;
                     this.field8446.method1263(this.field8446.field3515, 115);
                  }

                  int var4 = 0;
                  if (var2 || ~var4 > ~this.field8515.length) {
                     do {
                        int var5 = this.field8551[var4];
                        int var6 = this.field8551[var4 - -1];
                        int var7 = this.field8521[var5] & 65535;
                        if (var7 == 65535) {
                           var7 = -1;
                        }

                        this.field8446.method2010(var3, arg0 ^ -50, var7, true);
                        this.field8446.method1230(this.field8542[var4], -var5 + var6, this.field8543.field7278, (byte)99, class482.field6912, this.field8515[var4], var5 * 3);
                        ++var4;
                     } while(~var4 > ~this.field8515.length);
                  }
               }

               this.method4406(arg0 ^ -85);
            }
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field8565[54] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "g",
      descriptor = "(B)V"
   )
   private final void method4391(byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!tka",
      name = "da",
      descriptor = "()I"
   )
   public final int method749() {
      try {
         ++field8489;
         return this.field8562;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8565[64] + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "a",
      descriptor = "(IIII)V"
   )
   public final void method768(int arg0, int arg1, int arg2, int arg3) {
      boolean var5 = client.field10022;

      try {
         int var6 = 0;
         int var11;
         class138 var12;
         class496 var13;
         int var10000;
         if (var5) {
            var10000 = 65535 & this.field8499[var6];
         } else if (~this.field8550 >= ~var6) {
            var10000 = field8449 + 1;
            if (!var5) {
               field8449 = var10000;
               if (this.field8440 != null) {
                  var11 = 0;
                  if (var5 || this.field8461 > var11) {
                     do {
                        var12 = this.field8440[var11];
                        var13 = this.field8555[var11];
                        var13.field7069 = var13.field7069 & -16777216 | 16777215 & class744.field10589[65535 & this.field8499[var12.field2219]];
                        ++var11;
                     } while(this.field8461 > var11);
                  }
               }

               this.method4407((byte)-122);
               return;
            }
         } else {
            var10000 = 65535 & this.field8499[var6];
         }

         while(true) {
            int var7 = var10000;
            int var8 = 63 & var7 >> 10;
            int var9 = (902 & var7) >> 7;
            if (~arg1 != 0) {
               var9 += (-var9 + arg1) * arg3 >> 7;
            }

            if (arg0 != -1) {
               var8 -= -((-var8 + arg0) * arg3 >> 7);
            }

            int var10 = var7 & 127;
            if (~arg2 != 0) {
               var10 += (-var10 + arg2) * arg3 >> 7;
            }

            this.field8499[var6] = (short)class91.method932(class91.method932(var8 << 10, var9 << 7), var10);
            ++var6;
            if (~this.field8550 >= ~var6) {
               var10000 = field8449 + 1;
               if (!var5) {
                  field8449 = var10000;
                  if (this.field8440 != null) {
                     var11 = 0;
                     if (var5 || this.field8461 > var11) {
                        do {
                           var12 = this.field8440[var11];
                           var13 = this.field8555[var11];
                           var13.field7069 = var13.field7069 & -16777216 | 16777215 & class744.field10589[65535 & this.field8499[var12.field2219]];
                           ++var11;
                        } while(this.field8461 > var11);
                     }
                  }

                  this.method4407((byte)-122);
                  return;
               }
            } else {
               var10000 = 65535 & this.field8499[var6];
            }
         }
      } catch (RuntimeException var15) {
         throw class612.method4503(var15, field8565[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "r",
      descriptor = "()Z"
   )
   public final boolean method767() {
      try {
         ++field8559;
         return this.field8465;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8565[62] + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "WA",
      descriptor = "()I"
   )
   public final int method778() {
      try {
         ++field8548;
         return this.field8444;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8565[68] + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "a",
      descriptor = "(ILtka;ZZLtka;B)Lka;"
   )
   private final class761 method4392(int arg0, class599 arg1, boolean arg2, boolean arg3, class599 arg4, byte arg5) {
      boolean var7 = client.field10022;

      try {
         label615: {
            if (~(arg0 & 256) == -1) {
               arg4.field8507 = this.field8507;
               if (!var7) {
                  break label615;
               }
            }

            arg4.field8507 = true;
         }

         arg4.field8550 = this.field8550;
         arg4.field8444 = this.field8444;
         if (arg5 != 45) {
            this.field8561 = false;
         }

         label609: {
            arg4.field8519 = this.field8519;
            arg4.field8563 = this.field8563;
            arg4.field8478 = arg0;
            arg4.field8527 = this.field8527;
            arg4.field8465 = this.field8465;
            arg4.field8461 = this.field8461;
            arg4.field8562 = this.field8562;
            arg4.field8528 = this.field8528;
            arg4.field8530 = this.field8530;
            ++field8534;
            boolean var8 = class426.method3325(this.field8519, arg0, 33);
            boolean var9 = class388.method3024(this.field8519, arg0, (byte)2);
            boolean var10 = class341.method2719(this.field8519, true, arg0);
            boolean var11 = var10 | var8 | var9;
            if (var11) {
               label606: {
                  if (var8) {
                     if (arg1.field8505 != null && arg1.field8505.length >= this.field8528) {
                        arg4.field8505 = arg1.field8505;
                        if (!var7) {
                           break label606;
                        }
                     }

                     arg4.field8505 = arg1.field8505 = new int[this.field8528];
                     if (!var7) {
                        break label606;
                     }
                  }

                  arg4.field8505 = this.field8505;
               }

               label661: {
                  if (!var9) {
                     arg4.field8453 = this.field8453;
                     if (!var7) {
                        break label661;
                     }
                  }

                  if (arg1.field8453 == null || this.field8528 > arg1.field8453.length) {
                     arg4.field8453 = arg1.field8453 = new int[this.field8528];
                     if (!var7) {
                        break label661;
                     }
                  }

                  arg4.field8453 = arg1.field8453;
               }

               label663: {
                  if (!var10) {
                     arg4.field8487 = this.field8487;
                     if (!var7) {
                        break label663;
                     }
                  }

                  if (arg1.field8487 == null || arg1.field8487.length < this.field8528) {
                     arg4.field8487 = arg1.field8487 = new int[this.field8528];
                     if (!var7) {
                        break label663;
                     }
                  }

                  arg4.field8487 = arg1.field8487;
               }

               label575: {
                  int var12 = 0;
                  if (var7) {
                     if (var8) {
                        arg4.field8505[var12] = this.field8505[var12];
                     }
                  } else if (~var12 <= ~this.field8528) {
                     if (!var7) {
                        break label575;
                     }
                  } else if (var8) {
                     arg4.field8505[var12] = this.field8505[var12];
                  }

                  while(true) {
                     if (var9) {
                        arg4.field8453[var12] = this.field8453[var12];
                     }

                     if (var10) {
                        arg4.field8487[var12] = this.field8487[var12];
                     }

                     ++var12;
                     if (~var12 <= ~this.field8528) {
                        if (!var7) {
                           break;
                        }
                     } else if (var8) {
                        arg4.field8505[var12] = this.field8505[var12];
                     }
                  }
               }

               if (!var7) {
                  break label609;
               }
            }

            arg4.field8487 = this.field8487;
            arg4.field8505 = this.field8505;
            arg4.field8453 = this.field8453;
         }

         label624: {
            if (class201.method1749(this.field8519, arg0, 200)) {
               arg4.field8522 = arg1.field8522;
               arg4.field8522.field3165 = this.field8522.field3165;
               arg4.field8522.field3163 = this.field8522.field3163;
               arg4.field8522.field3169 = true;
               if (!var7) {
                  break label624;
               }
            }

            if (!class294.method2459(arg0, (byte)-85, this.field8519)) {
               arg4.field8522 = null;
               if (!var7) {
                  break label624;
               }
            }

            arg4.field8522 = this.field8522;
         }

         label540: {
            if (class249.method2152(this.field8519, (byte)66, arg0)) {
               label537: {
                  if (arg1.field8499 != null && this.field8550 <= arg1.field8499.length) {
                     arg4.field8499 = arg1.field8499;
                     if (!var7) {
                        break label537;
                     }
                  }

                  arg4.field8499 = arg1.field8499 = new short[this.field8550];
               }

               int var13 = 0;
               if (var7) {
                  arg4.field8499[var13] = this.field8499[var13];
                  ++var13;
               }

               while(true) {
                  while(~var13 > ~this.field8550) {
                     arg4.field8499[var13] = this.field8499[var13];
                     ++var13;
                  }

                  if (!var7) {
                     if (!var7) {
                        break label540;
                     }
                     break;
                  }

                  ++var13;
               }
            }

            arg4.field8499 = this.field8499;
         }

         label509: {
            if (class642.method4672(this.field8519, arg0, -1416)) {
               label664: {
                  if (arg1.field8540 == null || arg1.field8540.length < this.field8550) {
                     arg4.field8540 = arg1.field8540 = new byte[this.field8550];
                     if (!var7) {
                        break label664;
                     }
                  }

                  arg4.field8540 = arg1.field8540;
               }

               int var14 = 0;
               if (var7) {
                  arg4.field8540[var14] = this.field8540[var14];
                  ++var14;
               }

               while(true) {
                  while(var14 < this.field8550) {
                     arg4.field8540[var14] = this.field8540[var14];
                     ++var14;
                  }

                  if (!var7) {
                     if (!var7) {
                        break label509;
                     }
                     break;
                  }

                  ++var14;
               }
            }

            arg4.field8540 = this.field8540;
         }

         label631: {
            if (class388.method3023(this.field8519, arg0, (byte)65)) {
               arg4.field8552 = arg1.field8552;
               arg4.field8552.field3169 = true;
               arg4.field8552.field3165 = this.field8552.field3165;
               arg4.field8552.field3163 = this.field8552.field3163;
               if (!var7) {
                  break label631;
               }
            }

            if (class34.method389(this.field8519, (byte)66, arg0)) {
               arg4.field8552 = this.field8552;
               if (!var7) {
                  break label631;
               }
            }

            arg4.field8552 = null;
         }

         label632: {
            if (!class294.method2458(arg0, false, this.field8519)) {
               arg4.field8466 = this.field8466;
               arg4.field8503 = this.field8503;
               arg4.field8460 = this.field8460;
               arg4.field8500 = this.field8500;
               arg4.field8560 = this.field8560;
               if (!var7) {
                  break label632;
               }
            }

            label662: {
               if (arg1.field8560 == null || this.field8563 > arg1.field8560.length) {
                  int var15 = this.field8563;
                  arg4.field8560 = arg1.field8560 = new short[var15];
                  arg4.field8503 = arg1.field8503 = new short[var15];
                  arg4.field8500 = arg1.field8500 = new short[var15];
                  if (!var7) {
                     break label662;
                  }
               }

               arg4.field8560 = arg1.field8560;
               arg4.field8503 = arg1.field8503;
               arg4.field8500 = arg1.field8500;
            }

            label665: {
               if (this.field8466 == null) {
                  arg4.field8466 = null;
                  int var16 = 0;
                  if (var7) {
                     arg4.field8560[var16] = this.field8560[var16];
                     arg4.field8503[var16] = this.field8503[var16];
                     arg4.field8500[var16] = this.field8500[var16];
                     ++var16;
                  }

                  while(true) {
                     while(~this.field8563 < ~var16) {
                        arg4.field8560[var16] = this.field8560[var16];
                        arg4.field8503[var16] = this.field8503[var16];
                        arg4.field8500[var16] = this.field8500[var16];
                        ++var16;
                     }

                     if (!var7) {
                        if (!var7) {
                           break label665;
                        }
                        break;
                     }

                     ++var16;
                  }
               }

               if (arg1.field8466 == null) {
                  arg1.field8466 = new class243();
               }

               class243 var17 = arg4.field8466 = arg1.field8466;
               if (var17.field3735 == null || ~var17.field3735.length > ~this.field8563) {
                  int var18 = this.field8563;
                  var17.field3738 = new short[var18];
                  var17.field3735 = new short[var18];
                  var17.field3740 = new byte[var18];
                  var17.field3737 = new short[var18];
               }

               int var19 = 0;
               if (var7 || this.field8563 > var19) {
                  do {
                     arg4.field8560[var19] = this.field8560[var19];
                     arg4.field8503[var19] = this.field8503[var19];
                     arg4.field8500[var19] = this.field8500[var19];
                     var17.field3735[var19] = this.field8466.field3735[var19];
                     var17.field3738[var19] = this.field8466.field3738[var19];
                     var17.field3737[var19] = this.field8466.field3737[var19];
                     var17.field3740[var19] = this.field8466.field3740[var19];
                     ++var19;
                  } while(this.field8563 > var19);
               }
            }

            arg4.field8460 = this.field8460;
         }

         label413: {
            if (!class633.method4630(arg0, (byte)83, this.field8519)) {
               if (!class46.method507(this.field8519, false, arg0)) {
                  arg4.field8473 = null;
                  if (!var7) {
                     break label413;
                  }
               }

               arg4.field8473 = this.field8473;
               if (!var7) {
                  break label413;
               }
            }

            arg4.field8473 = arg1.field8473;
            arg4.field8473.field3165 = this.field8473.field3165;
            arg4.field8473.field3163 = this.field8473.field3163;
            arg4.field8473.field3169 = true;
         }

         label405: {
            if (class361.method2838(arg0, this.field8519, -1983466679)) {
               label402: {
                  if (arg1.field8556 != null && arg1.field8556.length >= this.field8550) {
                     arg4.field8477 = arg1.field8477;
                     arg4.field8556 = arg1.field8556;
                     if (!var7) {
                        break label402;
                     }
                  }

                  int var20 = this.field8563;
                  arg4.field8477 = arg1.field8477 = new float[var20];
                  arg4.field8556 = arg1.field8556 = new float[var20];
               }

               int var21 = 0;
               if (var7) {
                  arg4.field8556[var21] = this.field8556[var21];
                  arg4.field8477[var21] = this.field8477[var21];
                  ++var21;
               }

               while(true) {
                  while(this.field8563 > var21) {
                     arg4.field8556[var21] = this.field8556[var21];
                     arg4.field8477[var21] = this.field8477[var21];
                     ++var21;
                  }

                  if (!var7) {
                     if (!var7) {
                        break label405;
                     }
                     break;
                  }

                  ++var21;
               }
            }

            arg4.field8477 = this.field8477;
            arg4.field8556 = this.field8556;
         }

         label640: {
            if (class681.method4972(arg0, (byte)70, this.field8519)) {
               arg4.field8481 = arg1.field8481;
               arg4.field8481.field3169 = true;
               arg4.field8481.field3165 = this.field8481.field3165;
               arg4.field8481.field3163 = this.field8481.field3163;
               if (!var7) {
                  break label640;
               }
            }

            if (class488.method3714(1, arg0, this.field8519)) {
               arg4.field8481 = this.field8481;
               if (!var7) {
                  break label640;
               }
            }

            arg4.field8481 = null;
         }

         label365: {
            if (class118.method1145(this.field8519, -123, arg0)) {
               label666: {
                  if (arg1.field8447 == null || ~arg1.field8447.length > ~this.field8550) {
                     int var22 = this.field8550;
                     arg4.field8447 = arg1.field8447 = new short[var22];
                     arg4.field8485 = arg1.field8485 = new short[var22];
                     arg4.field8437 = arg1.field8437 = new short[var22];
                     if (!var7) {
                        break label666;
                     }
                  }

                  arg4.field8437 = arg1.field8437;
                  arg4.field8447 = arg1.field8447;
                  arg4.field8485 = arg1.field8485;
               }

               int var23 = 0;
               if (var7) {
                  arg4.field8447[var23] = this.field8447[var23];
                  arg4.field8437[var23] = this.field8437[var23];
                  arg4.field8485[var23] = this.field8485[var23];
                  ++var23;
               }

               while(true) {
                  while(~var23 > ~this.field8550) {
                     arg4.field8447[var23] = this.field8447[var23];
                     arg4.field8437[var23] = this.field8437[var23];
                     arg4.field8485[var23] = this.field8485[var23];
                     ++var23;
                  }

                  if (!var7) {
                     if (!var7) {
                        break label365;
                     }
                     break;
                  }

                  ++var23;
               }
            }

            arg4.field8447 = this.field8447;
            arg4.field8485 = this.field8485;
            arg4.field8437 = this.field8437;
         }

         label644: {
            if (class23.method303((byte)123, this.field8519, arg0)) {
               arg4.field8543 = arg1.field8543;
               arg4.field8543.field7279 = this.field8543.field7279;
               arg4.field8543.field7276 = true;
               arg4.field8543.field7278 = this.field8543.field7278;
               if (!var7) {
                  break label644;
               }
            }

            if (!class722.method5230(arg0, this.field8519, 83)) {
               arg4.field8543 = null;
               if (!var7) {
                  break label644;
               }
            }

            arg4.field8543 = this.field8543;
         }

         label645: {
            if (!class382.method2979(this.field8519, arg0, 32768)) {
               arg4.field8521 = this.field8521;
               if (!var7) {
                  break label645;
               }
            }

            label318: {
               if (arg1.field8521 != null && ~this.field8550 >= ~arg1.field8521.length) {
                  arg4.field8521 = arg1.field8521;
                  if (!var7) {
                     break label318;
                  }
               }

               int var24 = this.field8550;
               arg4.field8521 = arg1.field8521 = new short[var24];
            }

            int var25 = 0;
            if (var7 || ~var25 > ~this.field8550) {
               do {
                  arg4.field8521[var25] = this.field8521[var25];
                  ++var25;
               } while(~var25 > ~this.field8550);
            }
         }

         label303: {
            if (class495.method3754(false, arg0, this.field8519)) {
               if (arg1.field8555 != null && ~arg1.field8555.length <= ~this.field8461) {
                  arg4.field8555 = arg1.field8555;
                  int var26 = 0;
                  if (var7) {
                     arg4.field8555[var26].method3761(128, this.field8555[var26]);
                     ++var26;
                  }

                  while(true) {
                     while(~this.field8461 < ~var26) {
                        arg4.field8555[var26].method3761(128, this.field8555[var26]);
                        ++var26;
                     }

                     if (!var7) {
                        if (!var7) {
                           break label303;
                        }
                        break;
                     }

                     ++var26;
                  }
               }

               int var27 = this.field8461;
               arg4.field8555 = arg1.field8555 = new class496[var27];
               int var28 = 0;
               if (var7) {
                  arg4.field8555[var28] = this.field8555[var28].method3764(arg5 + -148);
                  ++var28;
               }

               while(true) {
                  while(var28 < this.field8461) {
                     arg4.field8555[var28] = this.field8555[var28].method3764(arg5 + -148);
                     ++var28;
                  }

                  if (!var7) {
                     if (!var7) {
                        break label303;
                     }
                     break;
                  }

                  ++var28;
               }
            }

            arg4.field8555 = this.field8555;
         }

         label252: {
            arg4.field8525 = this.field8525;
            arg4.field8514 = this.field8514;
            arg4.field8542 = this.field8542;
            arg4.field8532 = this.field8532;
            arg4.field8546 = this.field8546;
            arg4.field8458 = this.field8458;
            arg4.field8495 = this.field8495;
            arg4.field8468 = this.field8468;
            arg4.field8443 = this.field8443;
            if (this.field8561) {
               arg4.field8456 = this.field8456;
               arg4.field8450 = this.field8450;
               arg4.field8491 = this.field8491;
               arg4.field8561 = true;
               arg4.field8529 = this.field8529;
               arg4.field8517 = this.field8517;
               arg4.field8479 = this.field8479;
               arg4.field8439 = this.field8439;
               arg4.field8463 = this.field8463;
               if (!var7) {
                  break label252;
               }
            }

            arg4.field8561 = false;
         }

         arg4.field8454 = this.field8454;
         arg4.field8440 = this.field8440;
         arg4.field8497 = this.field8497;
         arg4.field8551 = this.field8551;
         arg4.field8515 = this.field8515;
         arg4.field8523 = this.field8523;
         return arg4;
      } catch (RuntimeException var30) {
         throw class612.method4503(var30, field8565[25] + arg0 + ',' + (arg1 != null ? field8565[3] : field8565[2]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field8565[3] : field8565[2]) + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "<init>",
      descriptor = "(Ldaa;Leca;IIII)V"
   )
   public class599(class226 param1, class590 param2, int param3, int param4, int param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!tka",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method809(int arg0) {
      boolean var2 = client.field10022;

      try {
         ++field8538;
         int var3 = class160.field2447[arg0];
         int var4 = class160.field2446[arg0];
         int var5 = 0;
         class599 var10000;
         if (var2) {
            var10000 = this;
         } else if (this.field8527 <= var5) {
            this.method4401((byte)88);
            var10000 = this;
            if (!var2) {
               this.field8561 = false;
               return;
            }
         } else {
            var10000 = this;
         }

         while(true) {
            int var6 = var10000.field8505[var5] * var4 + this.field8487[var5] * var3 >> 14;
            this.field8487[var5] = this.field8487[var5] * var4 + -(this.field8505[var5] * var3) >> 14;
            this.field8505[var5] = var6;
            ++var5;
            if (this.field8527 <= var5) {
               this.method4401((byte)88);
               var10000 = this;
               if (!var2) {
                  this.field8561 = false;
                  return;
               }
            } else {
               var10000 = this;
            }
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field8565[69] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "na",
      descriptor = "()I"
   )
   public final int method782() {
      try {
         ++field8536;
         if (!this.field8561) {
            this.method4391((byte)96);
         }

         return this.field8439;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8565[11] + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "ua",
      descriptor = "()I"
   )
   public final int method775() {
      try {
         ++field8483;
         return this.field8478;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8565[22] + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "VA",
      descriptor = "(I)V"
   )
   public final void method773(int arg0) {
      boolean var2 = client.field10022;

      try {
         ++field8549;
         int var3 = class160.field2447[arg0];
         int var4 = class160.field2446[arg0];
         int var5 = 0;
         if (!var2 && ~this.field8527 >= ~var5) {
            this.method4401((byte)88);
            this.field8561 = false;
         } else {
            do {
               int var6 = this.field8505[var5] * var4 + this.field8453[var5] * var3 >> 14;
               this.field8453[var5] = this.field8453[var5] * var4 + -(this.field8505[var5] * var3) >> 14;
               this.field8505[var5] = var6;
               ++var5;
            } while(~this.field8527 < ~var5);

            this.method4401((byte)88);
            this.field8561 = false;
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field8565[30] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "a",
      descriptor = "()[Lhaa;"
   )
   public final class3[] method784() {
      try {
         ++field8490;
         return this.field8443;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8565[31] + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "e",
      descriptor = "(I)V"
   )
   private final void method4393(int arg0) {
      try {
         label27: {
            ++field8475;
            if ((55 & this.field8519) == 0) {
               if (this.field8552 == null) {
                  break label27;
               }

               this.field8552.field3165 = false;
               if (!client.field10022) {
                  break label27;
               }
            }

            if (this.field8473 != null) {
               this.field8473.field3165 = false;
            }
         }

         if (arg0 != 9136) {
            this.field8563 = -109;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8565[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "f",
      descriptor = "()V"
   )
   public final void method756() {
      try {
         ++field8512;
         if (~this.field8563 < -1 && ~this.field8530 < -1) {
            this.method4400(700844110);
            this.method4398((byte)-60);
            this.method4406(-107);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8565[41] + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "wa",
      descriptor = "()V"
   )
   public final void method764() {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!tka",
      name = "ia",
      descriptor = "(SS)V"
   )
   public final void method791(short arg0, short arg1) {
      boolean var3 = client.field10022;

      try {
         int var4 = 0;
         if (var3) {
            if (~this.field8499[var4] == ~arg0) {
               this.field8499[var4] = arg1;
            }

            ++var4;
         }

         while(true) {
            class599 var10000;
            if (~this.field8550 >= ~var4) {
               ++field8526;
               var10000 = this;
               if (!var3) {
                  if (this.field8440 != null) {
                     int var5 = 0;
                     if (var3 || this.field8461 > var5) {
                        do {
                           class138 var6 = this.field8440[var5];
                           class496 var7 = this.field8555[var5];
                           var7.field7069 = 16777215 & class744.field10589[this.field8499[var6.field2219] & 65535] | var7.field7069 & -16777216;
                           ++var5;
                        } while(this.field8461 > var5);
                     }
                  }

                  this.method4407((byte)-113);
                  return;
               }
            } else {
               var10000 = this;
            }

            if (~var10000.field8499[var4] == ~arg0) {
               this.field8499[var4] = arg1;
            }

            ++var4;
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field8565[61] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "aa",
      descriptor = "(SS)V"
   )
   public final void method811(short arg0, short arg1) {
      boolean var3 = client.field10022;

      try {
         ++field8482;
         class672 var4 = this.field8446.field240;
         int var5 = 0;
         if (var3) {
            if (this.field8521[var5] == arg0) {
               this.field8521[var5] = arg1;
            }

            ++var5;
         }

         while(true) {
            short var10000;
            short var10001;
            if (var5 >= this.field8550) {
               byte var6 = 0;
               byte var7 = 0;
               var10000 = arg0;
               var10001 = -1;
               if (!var3) {
                  if (arg0 != -1) {
                     class390 var8 = var4.method2043(-51, 65535 & arg0);
                     var6 = var8.field5679;
                     var7 = var8.field5677;
                  }

                  byte var9 = 0;
                  byte var10 = 0;
                  if (~arg1 != 0) {
                     class390 var11 = var4.method2043(-58, 65535 & arg1);
                     var9 = var11.field5679;
                     if (var11.field5681 != 0 || ~var11.field5667 != -1) {
                        this.field8465 = true;
                     }

                     var10 = var11.field5677;
                  }

                  if (!(var7 != var10 | var6 != var9)) {
                     return;
                  }

                  if (this.field8440 != null) {
                     int var12 = 0;
                     if (var3 || ~this.field8461 < ~var12) {
                        do {
                           class138 var13 = this.field8440[var12];
                           class496 var14 = this.field8555[var12];
                           var14.field7069 = class744.field10589[this.field8499[var13.field2219] & 65535] & 16777215 | -16777216 & var14.field7069;
                           ++var12;
                        } while(~this.field8461 < ~var12);
                     }
                  }

                  this.method4407((byte)-77);
                  return;
               }
            } else {
               var10000 = this.field8521[var5];
               var10001 = arg0;
            }

            if (var10000 == var10001) {
               this.field8521[var5] = arg1;
            }

            ++var5;
         }
      } catch (RuntimeException var16) {
         throw class612.method4503(var16, field8565[24] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "ma",
      descriptor = "()I"
   )
   public final int method794() {
      try {
         ++field8471;
         if (!this.field8561) {
            this.method4391((byte)-99);
         }

         return this.field8479;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8565[43] + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "a",
      descriptor = "(IIIIIIIII)Z"
   )
   private final boolean method4394(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      try {
         ++field8470;
         if (~arg5 > ~arg3 && arg1 > arg5 && ~arg6 < ~arg5) {
            return false;
         } else if (arg3 < arg5 && ~arg5 < ~arg1 && arg5 > arg6) {
            return false;
         } else if (arg4 < arg7 && arg4 < arg0 && arg8 > arg4) {
            return false;
         } else if (~arg4 < ~arg7 && arg4 > arg0 && arg4 > arg8) {
            return false;
         } else {
            return arg2 > -49 ? true : true;
         }
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field8565[19] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "d",
      descriptor = "(I)V"
   )
   private final void method4395(int arg0) {
      try {
         ++field8508;
         if (this.field8543 != null) {
            this.field8543.field7279 = false;
         }

         if (arg0 != 0) {
            this.field8523 = null;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8565[53] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "a",
      descriptor = "(Lgga;Lrh;II)V"
   )
   public final void method763(class502 arg0, class213 arg1, int arg2, int arg3) {
      boolean var5 = client.field10022;

      try {
         ++field8457;
         if (this.field8563 != 0) {
            class522 var6 = this.field8446.field3396;
            class522 var7 = (class522)arg0;
            if (!this.field8561) {
               this.method4391((byte)-81);
            }

            float var10;
            float var11;
            label93: {
               class432.field6347 = var6.field7388 * var7.field7339 + var6.field7376 * var7.field7391 + var6.field7339 * var7.field7338;
               class682.field9863 = var6.field7388 * var7.field7352 + var6.field7376 * var7.field7377 + var6.field7339 * var7.field7356 + var6.field7352;
               float var8 = (float)this.field8450 * class432.field6347 + class682.field9863;
               float var9 = (float)this.field8463 * class432.field6347 + class682.field9863;
               if (var9 < var8) {
                  var10 = var9 - (float)this.field8439;
                  var11 = (float)this.field8439 + var8;
                  if (!var5) {
                     break label93;
                  }
               }

               var11 = (float)this.field8439 + var9;
               var10 = var8 - (float)this.field8439;
            }

            if (!(var10 >= this.field8446.field3472)) {
               if (!((float)this.field8446.field3494 >= var11)) {
                  float var14;
                  float var15;
                  label85: {
                     class54.field796 = var6.field7384 * var7.field7339 + var6.field7391 * var7.field7338 + var6.field7350 * var7.field7391;
                     class197.field2852 = var6.field7384 * var7.field7352 + var6.field7391 * var7.field7356 + var6.field7350 * var7.field7377 + var6.field7377;
                     float var12 = (float)this.field8450 * class54.field796 + class197.field2852;
                     float var13 = (float)this.field8463 * class54.field796 + class197.field2852;
                     if (!(var12 > var13)) {
                        var14 = (var12 - (float)this.field8439) * (float)this.field8446.field3412;
                        var15 = ((float)this.field8439 + var13) * (float)this.field8446.field3412;
                        if (!var5) {
                           break label85;
                        }
                     }

                     var15 = ((float)this.field8439 + var12) * (float)this.field8446.field3412;
                     var14 = (var13 - (float)this.field8439) * (float)this.field8446.field3412;
                  }

                  if (!(var14 / (float)arg2 >= this.field8446.field3436)) {
                     if (!(this.field8446.field3485 >= var15 / (float)arg2)) {
                        float var18;
                        float var19;
                        label77: {
                           class51.field768 = var6.field7363 * var7.field7352 + var6.field7344 * var7.field7377 + var6.field7338 * var7.field7356 + var6.field7356;
                           class211.field3023 = var6.field7363 * var7.field7339 + var6.field7344 * var7.field7391 + var6.field7338 * var7.field7338;
                           float var16 = (float)this.field8450 * class211.field3023 + class51.field768;
                           float var17 = (float)this.field8463 * class211.field3023 + class51.field768;
                           if (!(var17 < var16)) {
                              var18 = ((float)this.field8439 + var17) * (float)this.field8446.field3449;
                              var19 = (var16 - (float)this.field8439) * (float)this.field8446.field3449;
                              if (!var5) {
                                 break label77;
                              }
                           }

                           var19 = (var17 - (float)this.field8439) * (float)this.field8446.field3449;
                           var18 = ((float)this.field8439 + var16) * (float)this.field8446.field3449;
                        }

                        if (!(var19 / (float)arg2 >= this.field8446.field3453)) {
                           if (!(var18 / (float)arg2 <= this.field8446.field3459)) {
                              if (arg1 != null || this.field8440 != null) {
                                 class376.field5492 = var6.field7388 * var7.field7376 + var6.field7376 * var7.field7350 + var6.field7339 * var7.field7344;
                                 class217.field3109 = var6.field7384 * var7.field7376 + var6.field7391 * var7.field7344 + var6.field7350 * var7.field7350;
                                 class627.field8950 = var6.field7388 * var7.field7388 + var6.field7376 * var7.field7384 + var6.field7339 * var7.field7363;
                                 class633.field8984 = var6.field7363 * var7.field7388 + var6.field7344 * var7.field7384 + var6.field7338 * var7.field7363;
                                 class249.field3819 = var6.field7384 * var7.field7388 + var6.field7391 * var7.field7363 + var6.field7350 * var7.field7384;
                                 class415.field6083 = var6.field7363 * var7.field7376 + var6.field7344 * var7.field7350 + var6.field7338 * var7.field7344;
                              }

                              if (arg1 != null) {
                                 int var20 = this.field8517 + this.field8491 >> 1;
                                 int var21 = this.field8529 + this.field8456 >> 1;
                                 int var22 = (int)((float)var21 * class249.field3819 + (float)this.field8450 * class54.field796 + (float)var20 * class217.field3109 + class197.field2852);
                                 int var23 = (int)((float)var21 * class633.field8984 + (float)this.field8450 * class211.field3023 + (float)var20 * class415.field6083 + class51.field768);
                                 int var24 = (int)((float)var21 * class627.field8950 + (float)this.field8450 * class432.field6347 + (float)var20 * class376.field5492 + class682.field9863);
                                 int var25 = (int)((float)var21 * class249.field3819 + (float)this.field8463 * class54.field796 + (float)var20 * class217.field3109 + class197.field2852);
                                 int var26 = (int)((float)var21 * class633.field8984 + (float)this.field8463 * class211.field3023 + (float)var20 * class415.field6083 + class51.field768);
                                 arg1.field3054 = this.field8446.field3412 * var22 / arg2 + this.field8446.field3408;
                                 arg1.field3056 = this.field8446.field3412 * var25 / arg2 + this.field8446.field3408;
                                 arg1.field3055 = this.field8446.field3478 - -(this.field8446.field3449 * var23 / arg2);
                                 arg1.field3051 = this.field8446.field3478 - -(this.field8446.field3449 * var26 / arg2);
                                 int var27 = (int)((float)var21 * class627.field8950 + (float)this.field8463 * class432.field6347 + (float)var20 * class376.field5492 + class682.field9863);
                                 if (~this.field8446.field3494 >= ~var24 || ~this.field8446.field3494 >= ~var27) {
                                    arg1.field3053 = true;
                                    arg1.field3052 = -arg1.field3054 + this.field8446.field3408 - -((this.field8439 + var22) * this.field8446.field3412 / arg2);
                                 }
                              }

                              this.field8446.method2003((byte)-128, (float)arg2);
                              this.field8446.method1979((byte)88);
                              this.field8446.method1938(var7, (byte)-70);
                              this.method4390((byte)-51);
                              this.method4403(1309106666);
                           }
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var29) {
         throw class612.method4503(var29, field8565[47] + (arg0 != null ? field8565[3] : field8565[2]) + ',' + (arg1 != null ? field8565[3] : field8565[2]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "H",
      descriptor = "(III)V"
   )
   public final void method799(int param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!tka",
      name = "f",
      descriptor = "(B)Lub;"
   )
   public static final class306 method4396(byte arg0) {
      try {
         if (arg0 > -70) {
            return null;
         } else {
            ++field8504;

            try {
               return (class306)Class.forName(field8565[48]).newInstance();
            } catch (Throwable var2) {
               return null;
            }
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8565[49] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "LA",
      descriptor = "(I)V"
   )
   public final void method771(int arg0) {
      try {
         ++field8486;
         this.field8562 = (short)arg0;
         this.method4401((byte)88);
         this.method4393(9136);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8565[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "F",
      descriptor = "()Z"
   )
   public final boolean method781() {
      try {
         ++field8480;
         return this.field8507;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8565[46] + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "a",
      descriptor = "(Lka;IIIZ)V"
   )
   public final void method754(class761 param1, int param2, int param3, int param4, boolean param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!tka",
      name = "a",
      descriptor = "(BIZ)Lka;"
   )
   public final class761 method755(byte arg0, int arg1, boolean arg2) {
      boolean var4 = client.field10022;

      try {
         ++field8472;
         class599 var5;
         class599 var6;
         if (arg0 != 1) {
            if (arg0 != 2) {
               if (~arg0 == -4) {
                  var5 = this.field8446.field3504;
                  var6 = this.field8446.field3506;
                  if (!var4) {
                     return this.method4392(arg1, var5, arg2, arg0 != 0, var6, (byte)45);
                  }
               }

               if (~arg0 == -5) {
                  var5 = this.field8446.field3512;
                  var6 = this.field8446.field3520;
                  if (!var4) {
                     return this.method4392(arg1, var5, arg2, arg0 != 0, var6, (byte)45);
                  }
               }

               if (arg0 == 5) {
                  var5 = this.field8446.field3513;
                  var6 = this.field8446.field3518;
                  if (!var4) {
                     return this.method4392(arg1, var5, arg2, arg0 != 0, var6, (byte)45);
                  }
               }

               var6 = var5 = new class599(this.field8446, 0, 0, true, false);
               if (!var4) {
                  return this.method4392(arg1, var5, arg2, arg0 != 0, var6, (byte)45);
               }
            }

            var5 = this.field8446.field3516;
            var6 = this.field8446.field3514;
            if (!var4) {
               return this.method4392(arg1, var5, arg2, arg0 != 0, var6, (byte)45);
            }
         }

         var6 = this.field8446.field3503;
         var5 = this.field8446.field3522;
         return this.method4392(arg1, var5, arg2, arg0 != 0, var6, (byte)45);
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field8565[28] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "NA",
      descriptor = "()Z"
   )
   public final boolean method769() {
      boolean var1 = client.field10022;

      try {
         ++field8441;
         if (this.field8454 == null) {
            return false;
         } else {
            int var2 = 0;
            if (var1) {
               this.field8505[var2] <<= 4;
               this.field8453[var2] <<= 4;
               this.field8487[var2] <<= 4;
               ++var2;
            }

            while(true) {
               while(this.field8528 > var2) {
                  this.field8505[var2] <<= 4;
                  this.field8453[var2] <<= 4;
                  this.field8487[var2] <<= 4;
                  ++var2;
               }

               class339.field5000 = 0;
               class37.field540 = 0;
               class772.field11165 = 0;
               if (!var1) {
                  return true;
               }

               ++var2;
            }
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field8565[4] + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "EA",
      descriptor = "()I"
   )
   public final int method758() {
      try {
         if (!this.field8561) {
            this.method4391((byte)85);
         }

         ++field8459;
         return this.field8463;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8565[35] + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "I",
      descriptor = "(I[IIIIZI[I)V"
   )
   public final void method762(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
      boolean var9 = client.field10022;

      try {
         ++field8558;
         int var10 = arg1.length;
         int var10000;
         if (~arg0 != -1) {
            if (~arg0 == -2) {
               if (arg7 != null) {
                  int var17 = arg7[2] * arg4 + (arg7[0] * arg2 - -(arg7[1] * arg3)) + 8192 >> 14;
                  int var18 = arg7[3] * arg2 + arg7[5] * arg4 + arg7[4] * arg3 + 8192 >> 14;
                  int var19 = arg7[8] * arg4 + 8192 + arg7[7] * arg3 + arg7[6] * arg2 >> 14;
                  arg4 = var19;
                  arg2 = var17;
                  arg3 = var18;
               }

               arg4 <<= 4;
               arg3 <<= 4;
               arg2 <<= 4;
               int var20 = 0;
               if (var9 || var10 > var20) {
                  do {
                     int var21 = arg1[var20];
                     if (~this.field8454.length >= ~var21) {
                        ++var20;
                     } else {
                        int[] var22 = this.field8454[var21];
                        int var23 = 0;
                        if (!var9 && ~var23 <= ~var22.length) {
                           ++var20;
                        } else {
                           do {
                              int var24 = var22[var23];
                              if (this.field8514 != null && ~(arg6 & this.field8514[var24]) == -1) {
                                 ++var23;
                              } else {
                                 this.field8505[var24] += arg2;
                                 this.field8453[var24] += arg3;
                                 this.field8487[var24] += arg4;
                                 ++var23;
                              }
                           } while(~var23 > ~var22.length);

                           ++var20;
                        }
                     }
                  } while(var10 > var20);

               }
            } else if (~arg0 == -3) {
               if (arg7 != null) {
                  int var57 = arg7[9] << 4;
                  int var58 = arg7[10] << 4;
                  int var59 = arg7[11] << 4;
                  int var60 = arg7[12] << 4;
                  int var61 = arg7[13] << 4;
                  int var62 = arg7[14] << 4;
                  if (class428.field6281) {
                     int var63 = arg7[6] * class772.field11165 + (arg7[3] * class37.field540 + arg7[0] * class339.field5000 - -8192) >> 14;
                     int var64 = arg7[1] * class339.field5000 + (arg7[4] * class37.field540 - -(arg7[7] * class772.field11165)) - -8192 >> 14;
                     int var65 = var61 + var64;
                     int var66 = var60 + var63;
                     int var67 = arg7[8] * class772.field11165 + 8192 + arg7[5] * class37.field540 + arg7[2] * class339.field5000 >> 14;
                     int var68 = var62 + var67;
                     class339.field5000 = var66;
                     class37.field540 = var65;
                     class428.field6281 = false;
                     class772.field11165 = var68;
                  }

                  int[] var84;
                  int var86;
                  int var91;
                  int var93;
                  int[] var94;
                  int var95;
                  label514: {
                     int[] var69 = new int[9];
                     int var70 = class160.field2446[arg2];
                     int var71 = class160.field2447[arg2];
                     int var72 = class160.field2446[arg3];
                     int var73 = class160.field2447[arg3];
                     int var74 = class160.field2446[arg4];
                     int var75 = class160.field2447[arg4];
                     int var76 = var71 * var74 + 8192 >> 14;
                     int var77 = var71 * var75 - -8192 >> 14;
                     var69[8] = var70 * var72 + 8192 >> 14;
                     var69[2] = var70 * var73 + 8192 >> 14;
                     var69[3] = var70 * var75 + 8192 >> 14;
                     var69[5] = -var71;
                     var69[0] = var72 * var74 + var73 * var77 + 8192 >> 14;
                     var69[4] = var70 * var74 + 8192 >> 14;
                     var69[6] = var72 * var77 + (-var73 * var74 - -8192) >> 14;
                     var69[7] = var73 * var75 + var72 * var76 + 8192 >> 14;
                     var69[1] = -var72 * var75 + var73 * var76 + 8192 >> 14;
                     int var78 = var69[1] * -class37.field540 + var69[0] * -class339.field5000 + var69[2] * -class772.field11165 + 8192 >> 14;
                     int var79 = var69[5] * -class772.field11165 + 8192 + var69[4] * -class37.field540 + var69[3] * -class339.field5000 >> 14;
                     int var80 = var69[8] * -class772.field11165 + var69[6] * -class339.field5000 + var69[7] * -class37.field540 - -8192 >> 14;
                     int var81 = class339.field5000 + var78;
                     int var82 = class37.field540 + var79;
                     int var83 = var80 - -class772.field11165;
                     var84 = new int[9];
                     int var85 = 0;
                     int var89;
                     int var90;
                     int var92;
                     if (var9) {
                        var86 = 0;
                     } else if (~var85 <= -4) {
                        var89 = var69[0] * var60 - -(var69[2] * var62) + var69[1] * var61 + 8192 >> 14;
                        var90 = var69[3] * var60 + var69[4] * var61 + 8192 - -(var69[5] * var62) >> 14;
                        var91 = var82 + var90;
                        var92 = var69[7] * var61 + 8192 + var69[6] * var60 + var69[8] * var62 >> 14;
                        var86 = var81 + var89;
                        var93 = var83 + var92;
                        var94 = new int[9];
                        var95 = 0;
                        if (!var9) {
                           break label514;
                        }
                     } else {
                        var86 = 0;
                     }

                     while(true) {
                        label511: {
                           int var87;
                           int var88;
                           if (var9) {
                              var87 = 0;
                              var88 = 0;
                              if (var9) {
                                 var87 += var69[var85 * 3 + var88] * arg7[var86 * 3 + var88];
                                 ++var88;
                              }
                           } else {
                              if (var86 >= 3) {
                                 break label511;
                              }

                              var87 = 0;
                              var88 = 0;
                              if (var9) {
                                 var87 += var69[var85 * 3 + var88] * arg7[var86 * 3 + var88];
                                 ++var88;
                              }
                           }

                           while(true) {
                              while(~var88 > -4) {
                                 var87 += var69[var85 * 3 + var88] * arg7[var86 * 3 + var88];
                                 ++var88;
                              }

                              var84[var85 * 3 + var86] = var87 - -8192 >> 14;
                              if (!var9) {
                                 ++var86;
                                 if (var86 >= 3) {
                                    break;
                                 }

                                 var87 = 0;
                                 var88 = 0;
                                 if (var9) {
                                    var87 += var69[var85 * 3 + var88] * arg7[var86 * 3 + var88];
                                    ++var88;
                                 }
                              } else {
                                 ++var88;
                              }
                           }
                        }

                        ++var85;
                        if (~var85 <= -4) {
                           var89 = var69[0] * var60 - -(var69[2] * var62) + var69[1] * var61 + 8192 >> 14;
                           var90 = var69[3] * var60 + var69[4] * var61 + 8192 - -(var69[5] * var62) >> 14;
                           var91 = var82 + var90;
                           var92 = var69[7] * var61 + 8192 + var69[6] * var60 + var69[8] * var62 >> 14;
                           var86 = var81 + var89;
                           var93 = var83 + var92;
                           var94 = new int[9];
                           var95 = 0;
                           if (!var9) {
                              break;
                           }
                        } else {
                           var86 = 0;
                        }
                     }
                  }

                  int var96;
                  int var102;
                  int var103;
                  int var104;
                  label453: {
                     int var99;
                     int var100;
                     int var101;
                     if (var9) {
                        var96 = 0;
                     } else if (~var95 <= -4) {
                        var99 = arg7[1] * var91 + arg7[2] * var93 + arg7[0] * var86 - -8192 >> 14;
                        var100 = arg7[5] * var93 + arg7[4] * var91 + arg7[3] * var86 + 8192 >> 14;
                        var101 = arg7[6] * var86 + 8192 + arg7[7] * var91 + arg7[8] * var93 >> 14;
                        var102 = var58 + var100;
                        var96 = var57 + var99;
                        var103 = var59 + var101;
                        var104 = 0;
                        if (!var9) {
                           break label453;
                        }
                     } else {
                        var96 = 0;
                     }

                     while(true) {
                        label450: {
                           int var97;
                           int var98;
                           if (var9) {
                              var97 = 0;
                              var98 = 0;
                              if (var9) {
                                 var97 += arg7[var95 * 3 + var98] * var84[var98 * 3 + var96];
                                 ++var98;
                              }
                           } else {
                              if (var96 >= 3) {
                                 break label450;
                              }

                              var97 = 0;
                              var98 = 0;
                              if (var9) {
                                 var97 += arg7[var95 * 3 + var98] * var84[var98 * 3 + var96];
                                 ++var98;
                              }
                           }

                           while(true) {
                              while(~var98 > -4) {
                                 var97 += arg7[var95 * 3 + var98] * var84[var98 * 3 + var96];
                                 ++var98;
                              }

                              var94[var95 * 3 + var96] = var97 - -8192 >> 14;
                              if (!var9) {
                                 ++var96;
                                 if (var96 >= 3) {
                                    break;
                                 }

                                 var97 = 0;
                                 var98 = 0;
                                 if (var9) {
                                    var97 += arg7[var95 * 3 + var98] * var84[var98 * 3 + var96];
                                    ++var98;
                                 }
                              } else {
                                 ++var98;
                              }
                           }
                        }

                        ++var95;
                        if (~var95 <= -4) {
                           var99 = arg7[1] * var91 + arg7[2] * var93 + arg7[0] * var86 - -8192 >> 14;
                           var100 = arg7[5] * var93 + arg7[4] * var91 + arg7[3] * var86 + 8192 >> 14;
                           var101 = arg7[6] * var86 + 8192 + arg7[7] * var91 + arg7[8] * var93 >> 14;
                           var102 = var58 + var100;
                           var96 = var57 + var99;
                           var103 = var59 + var101;
                           var104 = 0;
                           if (!var9) {
                              break;
                           }
                        } else {
                           var96 = 0;
                        }
                     }
                  }

                  if (var9 || var104 < var10) {
                     do {
                        int var105 = arg1[var104];
                        if (var105 >= this.field8454.length) {
                           ++var104;
                        } else {
                           int[] var106 = this.field8454[var105];
                           int var107 = 0;
                           if (!var9 && var106.length <= var107) {
                              ++var104;
                           } else {
                              do {
                                 int var108 = var106[var107];
                                 if (this.field8514 != null && (this.field8514[var108] & arg6) == 0) {
                                    ++var107;
                                 } else {
                                    int var109 = this.field8487[var108] * var94[2] + this.field8505[var108] * var94[0] + this.field8453[var108] * var94[1] + 8192 >> 14;
                                    int var110 = this.field8505[var108] * var94[3] + this.field8487[var108] * var94[5] + this.field8453[var108] * var94[4] - -8192 >> 14;
                                    int var111 = var102 + var110;
                                    int var112 = this.field8487[var108] * var94[8] + (this.field8505[var108] * var94[6] - (-(this.field8453[var108] * var94[7]) - 8192)) >> 14;
                                    int var113 = var96 + var109;
                                    this.field8505[var108] = var113;
                                    int var114 = var103 + var112;
                                    this.field8453[var108] = var111;
                                    this.field8487[var108] = var114;
                                    ++var107;
                                 }
                              } while(var106.length > var107);

                              ++var104;
                           }
                        }
                     } while(var104 < var10);
                  }
               } else {
                  int var25 = 0;
                  int var39;
                  int var40;
                  int[] var41;
                  int var42;
                  int var43;
                  int var44;
                  int var45;
                  int var46;
                  int var47;
                  int var48;
                  int var49;
                  int var50;
                  int var51;
                  int var52;
                  int var53;
                  int var54;
                  int var55;
                  int var56;
                  if (var9) {
                     var10000 = arg1[var25];
                  } else if (var25 >= var10) {
                     var10000 = arg5;
                     if (!var9) {
                        if (arg5 == 0) {
                           return;
                        }

                        var39 = 0;
                        if (!var9 && var10 <= var39) {
                           this.method4393(9136);
                           return;
                        }

                        do {
                           var40 = arg1[var39];
                           if (var40 >= this.field8454.length) {
                              ++var39;
                           } else {
                              var41 = this.field8454[var40];
                              var42 = 0;
                              if (!var9 && ~var42 <= ~var41.length) {
                                 ++var39;
                              } else {
                                 label692:
                                 do {
                                    var43 = var41[var42];
                                    if (this.field8514 != null && ~(this.field8514[var43] & arg6) == -1) {
                                       ++var42;
                                    } else {
                                       var44 = this.field8523[var43];
                                       var45 = this.field8523[var43 - -1];
                                       var46 = var44;
                                       if (!var9 && var44 >= var45) {
                                          ++var42;
                                       } else {
                                          do {
                                             var47 = this.field8497[var46] + -1;
                                             if (~var47 == 0) {
                                                ++var42;
                                                continue label692;
                                             }

                                             if (~arg4 != -1) {
                                                var48 = class160.field2447[arg4];
                                                var49 = class160.field2446[arg4];
                                                var50 = this.field8503[var47] * var48 - -(this.field8560[var47] * var49) + 16383 >> 14;
                                                this.field8503[var47] = (short)(this.field8503[var47] * var49 - -16383 + -(this.field8560[var47] * var48) >> 14);
                                                this.field8560[var47] = (short)var50;
                                             }

                                             if (arg2 != 0) {
                                                var51 = class160.field2447[arg2];
                                                var52 = class160.field2446[arg2];
                                                var53 = this.field8503[var47] * var52 - this.field8500[var47] * var51 - -16383 >> 14;
                                                this.field8500[var47] = (short)(this.field8500[var47] * var52 + (this.field8503[var47] * var51 - -16383) >> 14);
                                                this.field8503[var47] = (short)var53;
                                             }

                                             if (arg3 != 0) {
                                                var54 = class160.field2447[arg3];
                                                var55 = class160.field2446[arg3];
                                                var56 = this.field8560[var47] * var55 + this.field8500[var47] * var54 - -16383 >> 14;
                                                this.field8500[var47] = (short)(this.field8500[var47] * var55 + -(this.field8560[var47] * var54) + 16383 >> 14);
                                                this.field8560[var47] = (short)var56;
                                             }

                                             ++var46;
                                          } while(var46 < var45);

                                          ++var42;
                                       }
                                    }
                                 } while(~var42 > ~var41.length);

                                 ++var39;
                              }
                           }
                        } while(var10 > var39);

                        this.method4393(9136);
                        return;
                     }
                  } else {
                     var10000 = arg1[var25];
                  }

                  while(true) {
                     int var26 = var10000;
                     if (~this.field8454.length >= ~var26) {
                        ++var25;
                     } else {
                        int[] var27 = this.field8454[var26];
                        int var28 = 0;
                        int var29;
                        int var30;
                        int var31;
                        int var32;
                        int var33;
                        int var34;
                        int var35;
                        int var36;
                        int var37;
                        int var38;
                        if (var9) {
                           var29 = var27[var28];
                           if (this.field8514 != null) {
                              if (~(arg6 & this.field8514[var29]) != -1) {
                                 this.field8505[var29] -= class339.field5000;
                                 this.field8453[var29] -= class37.field540;
                                 this.field8487[var29] -= class772.field11165;
                                 if (~arg4 != -1) {
                                    var30 = class160.field2447[arg4];
                                    var31 = class160.field2446[arg4];
                                    var32 = this.field8505[var29] * var31 + this.field8453[var29] * var30 + 16383 >> 14;
                                    this.field8453[var29] = this.field8453[var29] * var31 - this.field8505[var29] * var30 + 16383 >> 14;
                                    this.field8505[var29] = var32;
                                 }

                                 if (~arg2 != -1) {
                                    var33 = class160.field2447[arg2];
                                    var34 = class160.field2446[arg2];
                                    var35 = this.field8453[var29] * var34 + -(this.field8487[var29] * var33) + 16383 >> 14;
                                    this.field8487[var29] = this.field8453[var29] * var33 + this.field8487[var29] * var34 + 16383 >> 14;
                                    this.field8453[var29] = var35;
                                 }

                                 if (arg3 != 0) {
                                    var36 = class160.field2447[arg3];
                                    var37 = class160.field2446[arg3];
                                    var38 = this.field8505[var29] * var37 + this.field8487[var29] * var36 + 16383 >> 14;
                                    this.field8487[var29] = this.field8487[var29] * var37 + 16383 + -(this.field8505[var29] * var36) >> 14;
                                    this.field8505[var29] = var38;
                                 }

                                 this.field8505[var29] += class339.field5000;
                                 this.field8453[var29] += class37.field540;
                                 this.field8487[var29] += class772.field11165;
                                 ++var28;
                              } else {
                                 ++var28;
                              }
                           } else {
                              this.field8505[var29] -= class339.field5000;
                              this.field8453[var29] -= class37.field540;
                              this.field8487[var29] -= class772.field11165;
                              if (~arg4 != -1) {
                                 var30 = class160.field2447[arg4];
                                 var31 = class160.field2446[arg4];
                                 var32 = this.field8505[var29] * var31 + this.field8453[var29] * var30 + 16383 >> 14;
                                 this.field8453[var29] = this.field8453[var29] * var31 - this.field8505[var29] * var30 + 16383 >> 14;
                                 this.field8505[var29] = var32;
                              }

                              if (~arg2 != -1) {
                                 var33 = class160.field2447[arg2];
                                 var34 = class160.field2446[arg2];
                                 var35 = this.field8453[var29] * var34 + -(this.field8487[var29] * var33) + 16383 >> 14;
                                 this.field8487[var29] = this.field8453[var29] * var33 + this.field8487[var29] * var34 + 16383 >> 14;
                                 this.field8453[var29] = var35;
                              }

                              if (arg3 != 0) {
                                 var36 = class160.field2447[arg3];
                                 var37 = class160.field2446[arg3];
                                 var38 = this.field8505[var29] * var37 + this.field8487[var29] * var36 + 16383 >> 14;
                                 this.field8487[var29] = this.field8487[var29] * var37 + 16383 + -(this.field8505[var29] * var36) >> 14;
                                 this.field8505[var29] = var38;
                              }

                              this.field8505[var29] += class339.field5000;
                              this.field8453[var29] += class37.field540;
                              this.field8487[var29] += class772.field11165;
                              ++var28;
                           }
                        }

                        while(var27.length > var28) {
                           var29 = var27[var28];
                           if (this.field8514 != null) {
                              if (~(arg6 & this.field8514[var29]) != -1) {
                                 this.field8505[var29] -= class339.field5000;
                                 this.field8453[var29] -= class37.field540;
                                 this.field8487[var29] -= class772.field11165;
                                 if (~arg4 != -1) {
                                    var30 = class160.field2447[arg4];
                                    var31 = class160.field2446[arg4];
                                    var32 = this.field8505[var29] * var31 + this.field8453[var29] * var30 + 16383 >> 14;
                                    this.field8453[var29] = this.field8453[var29] * var31 - this.field8505[var29] * var30 + 16383 >> 14;
                                    this.field8505[var29] = var32;
                                 }

                                 if (~arg2 != -1) {
                                    var33 = class160.field2447[arg2];
                                    var34 = class160.field2446[arg2];
                                    var35 = this.field8453[var29] * var34 + -(this.field8487[var29] * var33) + 16383 >> 14;
                                    this.field8487[var29] = this.field8453[var29] * var33 + this.field8487[var29] * var34 + 16383 >> 14;
                                    this.field8453[var29] = var35;
                                 }

                                 if (arg3 != 0) {
                                    var36 = class160.field2447[arg3];
                                    var37 = class160.field2446[arg3];
                                    var38 = this.field8505[var29] * var37 + this.field8487[var29] * var36 + 16383 >> 14;
                                    this.field8487[var29] = this.field8487[var29] * var37 + 16383 + -(this.field8505[var29] * var36) >> 14;
                                    this.field8505[var29] = var38;
                                 }

                                 this.field8505[var29] += class339.field5000;
                                 this.field8453[var29] += class37.field540;
                                 this.field8487[var29] += class772.field11165;
                                 ++var28;
                              } else {
                                 ++var28;
                              }
                           } else {
                              this.field8505[var29] -= class339.field5000;
                              this.field8453[var29] -= class37.field540;
                              this.field8487[var29] -= class772.field11165;
                              if (~arg4 != -1) {
                                 var30 = class160.field2447[arg4];
                                 var31 = class160.field2446[arg4];
                                 var32 = this.field8505[var29] * var31 + this.field8453[var29] * var30 + 16383 >> 14;
                                 this.field8453[var29] = this.field8453[var29] * var31 - this.field8505[var29] * var30 + 16383 >> 14;
                                 this.field8505[var29] = var32;
                              }

                              if (~arg2 != -1) {
                                 var33 = class160.field2447[arg2];
                                 var34 = class160.field2446[arg2];
                                 var35 = this.field8453[var29] * var34 + -(this.field8487[var29] * var33) + 16383 >> 14;
                                 this.field8487[var29] = this.field8453[var29] * var33 + this.field8487[var29] * var34 + 16383 >> 14;
                                 this.field8453[var29] = var35;
                              }

                              if (arg3 != 0) {
                                 var36 = class160.field2447[arg3];
                                 var37 = class160.field2446[arg3];
                                 var38 = this.field8505[var29] * var37 + this.field8487[var29] * var36 + 16383 >> 14;
                                 this.field8487[var29] = this.field8487[var29] * var37 + 16383 + -(this.field8505[var29] * var36) >> 14;
                                 this.field8505[var29] = var38;
                              }

                              this.field8505[var29] += class339.field5000;
                              this.field8453[var29] += class37.field540;
                              this.field8487[var29] += class772.field11165;
                              ++var28;
                           }
                        }

                        ++var25;
                     }

                     if (var25 >= var10) {
                        var10000 = arg5;
                        if (!var9) {
                           if (arg5 == 0) {
                              break;
                           }

                           var39 = 0;
                           if (!var9 && var10 <= var39) {
                              this.method4393(9136);
                              return;
                           }

                           do {
                              var40 = arg1[var39];
                              if (var40 >= this.field8454.length) {
                                 ++var39;
                              } else {
                                 var41 = this.field8454[var40];
                                 var42 = 0;
                                 if (!var9 && ~var42 <= ~var41.length) {
                                    ++var39;
                                 } else {
                                    label563:
                                    do {
                                       var43 = var41[var42];
                                       if (this.field8514 != null && ~(this.field8514[var43] & arg6) == -1) {
                                          ++var42;
                                       } else {
                                          var44 = this.field8523[var43];
                                          var45 = this.field8523[var43 - -1];
                                          var46 = var44;
                                          if (!var9 && var44 >= var45) {
                                             ++var42;
                                          } else {
                                             do {
                                                var47 = this.field8497[var46] + -1;
                                                if (~var47 == 0) {
                                                   ++var42;
                                                   continue label563;
                                                }

                                                if (~arg4 != -1) {
                                                   var48 = class160.field2447[arg4];
                                                   var49 = class160.field2446[arg4];
                                                   var50 = this.field8503[var47] * var48 - -(this.field8560[var47] * var49) + 16383 >> 14;
                                                   this.field8503[var47] = (short)(this.field8503[var47] * var49 - -16383 + -(this.field8560[var47] * var48) >> 14);
                                                   this.field8560[var47] = (short)var50;
                                                }

                                                if (arg2 != 0) {
                                                   var51 = class160.field2447[arg2];
                                                   var52 = class160.field2446[arg2];
                                                   var53 = this.field8503[var47] * var52 - this.field8500[var47] * var51 - -16383 >> 14;
                                                   this.field8500[var47] = (short)(this.field8500[var47] * var52 + (this.field8503[var47] * var51 - -16383) >> 14);
                                                   this.field8503[var47] = (short)var53;
                                                }

                                                if (arg3 != 0) {
                                                   var54 = class160.field2447[arg3];
                                                   var55 = class160.field2446[arg3];
                                                   var56 = this.field8560[var47] * var55 + this.field8500[var47] * var54 - -16383 >> 14;
                                                   this.field8500[var47] = (short)(this.field8500[var47] * var55 + -(this.field8560[var47] * var54) + 16383 >> 14);
                                                   this.field8560[var47] = (short)var56;
                                                }

                                                ++var46;
                                             } while(var46 < var45);

                                             ++var42;
                                          }
                                       }
                                    } while(~var42 > ~var41.length);

                                    ++var39;
                                 }
                              }
                           } while(var10 > var39);

                           this.method4393(9136);
                           return;
                        }
                     } else {
                        var10000 = arg1[var25];
                     }
                  }
               }

            } else if (~arg0 == -4) {
               if (arg7 != null) {
                  int var115 = arg7[9] << 4;
                  int var116 = arg7[10] << 4;
                  int var117 = arg7[11] << 4;
                  int var118 = arg7[12] << 4;
                  int var119 = arg7[13] << 4;
                  int var120 = arg7[14] << 4;
                  if (class428.field6281) {
                     int var121 = arg7[3] * class37.field540 + (arg7[0] * class339.field5000 + arg7[6] * class772.field11165 - -8192) >> 14;
                     int var122 = arg7[4] * class37.field540 - -8192 + arg7[7] * class772.field11165 + arg7[1] * class339.field5000 >> 14;
                     int var123 = var119 + var122;
                     int var124 = arg7[5] * class37.field540 + arg7[8] * class772.field11165 + arg7[2] * class339.field5000 + 8192 >> 14;
                     int var125 = var118 + var121;
                     class37.field540 = var123;
                     class339.field5000 = var125;
                     int var126 = var120 + var124;
                     class428.field6281 = false;
                     class772.field11165 = var126;
                  }

                  int[] var143;
                  int var145;
                  int var151;
                  int var152;
                  int var153;
                  label837: {
                     int var127 = arg2 << 15 >> 7;
                     int var128 = arg3 << 15 >> 7;
                     int var129 = arg4 << 15 >> 7;
                     int var130 = -class339.field5000 * var127 + 8192 >> 14;
                     int var131 = -class37.field540 * var128 - -8192 >> 14;
                     int var132 = -class772.field11165 * var129 + 8192 >> 14;
                     int var133 = class339.field5000 + var130;
                     int var134 = class37.field540 + var131;
                     int var135 = class772.field11165 + var132;
                     int[] var136 = new int[]{arg7[0] * var127 + 8192 >> 14, arg7[3] * var127 + 8192 >> 14, arg7[6] * var127 + 8192 >> 14, arg7[1] * var128 - -8192 >> 14, arg7[4] * var128 + 8192 >> 14, arg7[7] * var128 + 8192 >> 14, arg7[2] * var129 - -8192 >> 14, arg7[5] * var129 + 8192 >> 14, arg7[8] * var129 + 8192 >> 14};
                     int var137 = var118 * var127 + 8192 >> 14;
                     int var138 = var119 * var128 + 8192 >> 14;
                     int var139 = var134 + var138;
                     int var140 = var133 + var137;
                     int var141 = var120 * var129 + 8192 >> 14;
                     int var142 = var135 + var141;
                     var143 = new int[9];
                     int var144 = 0;
                     int var148;
                     int var149;
                     int var150;
                     if (var9) {
                        var145 = 0;
                     } else if (~var144 <= -4) {
                        var148 = arg7[2] * var142 + arg7[1] * var139 + (arg7[0] * var140 - -8192) >> 14;
                        var149 = arg7[4] * var139 + 8192 + arg7[3] * var140 + arg7[5] * var142 >> 14;
                        var150 = arg7[7] * var139 + (arg7[6] * var140 - -(arg7[8] * var142)) - -8192 >> 14;
                        var151 = var116 + var149;
                        var145 = var115 + var148;
                        var152 = var117 + var150;
                        var153 = 0;
                        if (!var9) {
                           break label837;
                        }
                     } else {
                        var145 = 0;
                     }

                     while(true) {
                        label834: {
                           int var146;
                           int var147;
                           if (var9) {
                              var146 = 0;
                              var147 = 0;
                              if (var9) {
                                 var146 += arg7[var144 * 3 - -var147] * var136[var147 * 3 + var145];
                                 ++var147;
                              }
                           } else {
                              if (var145 >= 3) {
                                 break label834;
                              }

                              var146 = 0;
                              var147 = 0;
                              if (var9) {
                                 var146 += arg7[var144 * 3 - -var147] * var136[var147 * 3 + var145];
                                 ++var147;
                              }
                           }

                           while(true) {
                              while(var147 < 3) {
                                 var146 += arg7[var144 * 3 - -var147] * var136[var147 * 3 + var145];
                                 ++var147;
                              }

                              var143[var144 * 3 + var145] = var146 + 8192 >> 14;
                              if (!var9) {
                                 ++var145;
                                 if (var145 >= 3) {
                                    break;
                                 }

                                 var146 = 0;
                                 var147 = 0;
                                 if (var9) {
                                    var146 += arg7[var144 * 3 - -var147] * var136[var147 * 3 + var145];
                                    ++var147;
                                 }
                              } else {
                                 ++var147;
                              }
                           }
                        }

                        ++var144;
                        if (~var144 <= -4) {
                           var148 = arg7[2] * var142 + arg7[1] * var139 + (arg7[0] * var140 - -8192) >> 14;
                           var149 = arg7[4] * var139 + 8192 + arg7[3] * var140 + arg7[5] * var142 >> 14;
                           var150 = arg7[7] * var139 + (arg7[6] * var140 - -(arg7[8] * var142)) - -8192 >> 14;
                           var151 = var116 + var149;
                           var145 = var115 + var148;
                           var152 = var117 + var150;
                           var153 = 0;
                           if (!var9) {
                              break;
                           }
                        } else {
                           var145 = 0;
                        }
                     }
                  }

                  if (var9 || ~var10 < ~var153) {
                     do {
                        int var154 = arg1[var153];
                        if (var154 >= this.field8454.length) {
                           ++var153;
                        } else {
                           int[] var155 = this.field8454[var154];
                           int var156 = 0;
                           if (!var9 && ~var155.length >= ~var156) {
                              ++var153;
                           } else {
                              do {
                                 int var157 = var155[var156];
                                 if (this.field8514 != null && ~(this.field8514[var157] & arg6) == -1) {
                                    ++var156;
                                 } else {
                                    int var158 = this.field8453[var157] * var143[1] - -(this.field8487[var157] * var143[2]) + this.field8505[var157] * var143[0] + 8192 >> 14;
                                    int var159 = this.field8487[var157] * var143[5] + this.field8505[var157] * var143[3] + (this.field8453[var157] * var143[4] - -8192) >> 14;
                                    int var160 = var145 + var158;
                                    int var161 = this.field8487[var157] * var143[8] - -8192 + this.field8505[var157] * var143[6] + this.field8453[var157] * var143[7] >> 14;
                                    int var162 = var151 + var159;
                                    this.field8505[var157] = var160;
                                    int var163 = var152 + var161;
                                    this.field8453[var157] = var162;
                                    this.field8487[var157] = var163;
                                    ++var156;
                                 }
                              } while(~var155.length < ~var156);

                              ++var153;
                           }
                        }
                     } while(~var10 < ~var153);

                  }
               } else {
                  int var164 = 0;
                  if (var9 || var10 > var164) {
                     do {
                        int var165 = arg1[var164];
                        if (~this.field8454.length >= ~var165) {
                           ++var164;
                        } else {
                           int[] var166 = this.field8454[var165];
                           int var167 = 0;
                           if (!var9 && var166.length <= var167) {
                              ++var164;
                           } else {
                              do {
                                 int var168 = var166[var167];
                                 if (this.field8514 != null && (arg6 & this.field8514[var168]) == 0) {
                                    ++var167;
                                 } else {
                                    this.field8505[var168] -= class339.field5000;
                                    this.field8453[var168] -= class37.field540;
                                    this.field8487[var168] -= class772.field11165;
                                    this.field8505[var168] = this.field8505[var168] * arg2 >> 7;
                                    this.field8453[var168] = this.field8453[var168] * arg3 >> 7;
                                    this.field8487[var168] = this.field8487[var168] * arg4 >> 7;
                                    this.field8505[var168] += class339.field5000;
                                    this.field8453[var168] += class37.field540;
                                    this.field8487[var168] += class772.field11165;
                                    ++var167;
                                 }
                              } while(var166.length > var167);

                              ++var164;
                           }
                        }
                     } while(var10 > var164);

                  }
               }
            } else if (arg0 == 5) {
               if (this.field8495 != null) {
                  label1008: {
                     int var169 = 0;
                     int var170 = 0;
                     if (var9) {
                        var10000 = arg1[var170];
                     } else if (~var170 <= ~var10) {
                        var10000 = var169;
                        if (!var9) {
                           break label1008;
                        }
                     } else {
                        var10000 = arg1[var170];
                     }

                     while(true) {
                        int var171 = var10000;
                        if (~this.field8495.length >= ~var171) {
                           ++var170;
                        } else {
                           label1322: {
                              int[] var172 = this.field8495[var171];
                              int var173 = 0;
                              if (var9) {
                                 var10000 = var172[var173];
                              } else if (~var172.length >= ~var173) {
                                 var10000 = var169;
                                 if (!var9) {
                                    var169 |= var172.length <= 0 ? 0 : 1;
                                    ++var170;
                                    break label1322;
                                 }
                              } else {
                                 var10000 = var172[var173];
                              }

                              while(true) {
                                 int var174 = var10000;
                                 int var175;
                                 if (this.field8525 != null) {
                                    if ((arg6 & this.field8525[var174]) != 0) {
                                       var175 = (this.field8540[var174] & 255) + arg2 * 8;
                                       if (var175 >= 0) {
                                          if (var175 > 255) {
                                             var175 = 255;
                                             if (var9) {
                                                var175 = 0;
                                             }
                                          }
                                       } else {
                                          var175 = 0;
                                       }

                                       this.field8540[var174] = (byte)var175;
                                       ++var173;
                                    } else {
                                       ++var173;
                                    }
                                 } else {
                                    var175 = (this.field8540[var174] & 255) + arg2 * 8;
                                    if (var175 >= 0) {
                                       if (var175 > 255) {
                                          var175 = 255;
                                          if (var9) {
                                             var175 = 0;
                                          }
                                       }
                                    } else {
                                       var175 = 0;
                                    }

                                    this.field8540[var174] = (byte)var175;
                                    ++var173;
                                 }

                                 if (~var172.length >= ~var173) {
                                    var10000 = var169;
                                    if (!var9) {
                                       var169 |= var172.length <= 0 ? 0 : 1;
                                       ++var170;
                                       break;
                                    }
                                 } else {
                                    var10000 = var172[var173];
                                 }
                              }
                           }
                        }

                        if (~var170 <= ~var10) {
                           var10000 = var169;
                           if (!var9) {
                              break;
                           }
                        } else {
                           var10000 = arg1[var170];
                        }
                     }
                  }

                  if (var10000 != 0) {
                     if (this.field8440 != null) {
                        int var176 = 0;
                        if (var9 || var176 < this.field8461) {
                           do {
                              class138 var177 = this.field8440[var176];
                              class496 var178 = this.field8555[var176];
                              var178.field7069 = 16777215 & var178.field7069 | -(this.field8540[var177.field2219] & 255) + 255 << 24;
                              ++var176;
                           } while(var176 < this.field8461);
                        }
                     }

                     this.method4407((byte)-78);
                  }
               }

            } else if (~arg0 == -8) {
               if (this.field8495 != null) {
                  label1099: {
                     int var179 = 0;
                     int var180 = 0;
                     if (var9) {
                        var10000 = arg1[var180];
                     } else if (var10 <= var180) {
                        var10000 = var179;
                        if (!var9) {
                           break label1099;
                        }
                     } else {
                        var10000 = arg1[var180];
                     }

                     while(true) {
                        int var181 = var10000;
                        if (var181 >= this.field8495.length) {
                           ++var180;
                        } else {
                           label1328: {
                              int[] var182 = this.field8495[var181];
                              int var183 = 0;
                              if (var9) {
                                 var10000 = var182[var183];
                              } else if (var183 >= var182.length) {
                                 var10000 = var179;
                                 if (!var9) {
                                    var179 |= ~var182.length >= -1 ? 0 : 1;
                                    ++var180;
                                    break label1328;
                                 }
                              } else {
                                 var10000 = var182[var183];
                              }

                              while(true) {
                                 int var184 = var10000;
                                 if (this.field8525 != null && (this.field8525[var184] & arg6) == 0) {
                                    ++var183;
                                 } else {
                                    int var185 = 65535 & this.field8499[var184];
                                    int var186 = 63 & var185 >> 10;
                                    int var187 = 7 & var185 >> 7;
                                    int var188 = arg3 / 4 + var187;
                                    int var189 = var186 - -arg2 & 63;
                                    int var190 = 127 & var185;
                                    if (var188 >= 0) {
                                       if (~var188 < -8) {
                                          var188 = 7;
                                          if (var9) {
                                             var188 = 0;
                                          }
                                       }
                                    } else {
                                       var188 = 0;
                                    }

                                    int var191 = arg4 + var190;
                                    if (var191 >= 0) {
                                       if (~var191 < -128) {
                                          var191 = 127;
                                          if (var9) {
                                             var191 = 0;
                                          }
                                       }
                                    } else {
                                       var191 = 0;
                                    }

                                    this.field8499[var184] = (short)class91.method932(var191, class91.method932(var189 << 10, var188 << 7));
                                    ++var183;
                                 }

                                 if (var183 >= var182.length) {
                                    var10000 = var179;
                                    if (!var9) {
                                       var179 |= ~var182.length >= -1 ? 0 : 1;
                                       ++var180;
                                       break;
                                    }
                                 } else {
                                    var10000 = var182[var183];
                                 }
                              }
                           }
                        }

                        if (var10 <= var180) {
                           var10000 = var179;
                           if (!var9) {
                              break;
                           }
                        } else {
                           var10000 = arg1[var180];
                        }
                     }
                  }

                  if (var10000 != 0) {
                     if (this.field8440 != null) {
                        int var192 = 0;
                        if (var9 || var192 < this.field8461) {
                           do {
                              class138 var193 = this.field8440[var192];
                              class496 var194 = this.field8555[var192];
                              var194.field7069 = class744.field10589[this.field8499[var193.field2219] & 65535] & 16777215 | -16777216 & var194.field7069;
                              ++var192;
                           } while(var192 < this.field8461);
                        }
                     }

                     this.method4407((byte)-73);
                  }
               }

            } else if (~arg0 == -9) {
               if (this.field8546 != null) {
                  int var195 = 0;
                  if (var9 || var195 < var10) {
                     do {
                        int var196 = arg1[var195];
                        if (~this.field8546.length >= ~var196) {
                           ++var195;
                        } else {
                           int[] var197 = this.field8546[var196];
                           int var198 = 0;
                           if (!var9 && ~var197.length >= ~var198) {
                              ++var195;
                           } else {
                              do {
                                 class496 var199 = this.field8555[var197[var198]];
                                 var199.field7070 += arg3;
                                 var199.field7071 += arg2;
                                 ++var198;
                              } while(~var197.length < ~var198);

                              ++var195;
                           }
                        }
                     } while(var195 < var10);
                  }
               }

            } else if (arg0 == 10) {
               if (this.field8546 != null) {
                  int var200 = 0;
                  if (var9 || var200 < var10) {
                     do {
                        int var201 = arg1[var200];
                        if (this.field8546.length <= var201) {
                           ++var200;
                        } else {
                           int[] var202 = this.field8546[var201];
                           int var203 = 0;
                           if (!var9 && var202.length <= var203) {
                              ++var200;
                           } else {
                              do {
                                 class496 var204 = this.field8555[var202[var203]];
                                 var204.field7078 = var204.field7078 * arg3 >> 7;
                                 var204.field7073 = var204.field7073 * arg2 >> 7;
                                 ++var203;
                              } while(var202.length > var203);

                              ++var200;
                           }
                        }
                     } while(var200 < var10);
                  }
               }

            } else if (arg0 == 9) {
               if (this.field8546 != null) {
                  int var205 = 0;
                  if (var9 || var205 < var10) {
                     do {
                        int var206 = arg1[var205];
                        if (this.field8546.length <= var206) {
                           ++var205;
                        } else {
                           int[] var207 = this.field8546[var206];
                           int var208 = 0;
                           if (!var9 && ~var207.length >= ~var208) {
                              ++var205;
                           } else {
                              do {
                                 class496 var209 = this.field8555[var207[var208]];
                                 var209.field7076 = 16383 & var209.field7076 - -arg2;
                                 ++var208;
                              } while(~var207.length < ~var208);

                              ++var205;
                           }
                        }
                     } while(var205 < var10);
                  }
               }

            }
         } else {
            arg2 <<= 4;
            arg4 <<= 4;
            arg3 <<= 4;
            class37.field540 = 0;
            int var11 = 0;
            class339.field5000 = 0;
            class772.field11165 = 0;
            int var12 = 0;
            if (var9) {
               var10000 = arg1[var12];
            } else if (var10 <= var12) {
               var10000 = ~var11;
               if (!var9) {
                  if (var10000 < -1) {
                     class772.field11165 = class772.field11165 / var11 + arg4;
                     class428.field6281 = true;
                     class37.field540 = class37.field540 / var11 + arg3;
                     class339.field5000 = class339.field5000 / var11 + arg2;
                     return;
                  }

                  class772.field11165 = arg4;
                  class37.field540 = arg3;
                  class339.field5000 = arg2;
                  return;
               }
            } else {
               var10000 = arg1[var12];
            }

            while(true) {
               int var13 = var10000;
               if (this.field8454.length <= var13) {
                  ++var12;
               } else {
                  int[] var14 = this.field8454[var13];
                  int var15 = 0;
                  int var16;
                  if (var9) {
                     var16 = var14[var15];
                     if (this.field8514 != null) {
                        if (~(this.field8514[var16] & arg6) != -1) {
                           class339.field5000 += this.field8505[var16];
                           class37.field540 += this.field8453[var16];
                           class772.field11165 += this.field8487[var16];
                           ++var11;
                           ++var15;
                        } else {
                           ++var15;
                        }
                     } else {
                        class339.field5000 += this.field8505[var16];
                        class37.field540 += this.field8453[var16];
                        class772.field11165 += this.field8487[var16];
                        ++var11;
                        ++var15;
                     }
                  }

                  while(var15 < var14.length) {
                     var16 = var14[var15];
                     if (this.field8514 != null) {
                        if (~(this.field8514[var16] & arg6) != -1) {
                           class339.field5000 += this.field8505[var16];
                           class37.field540 += this.field8453[var16];
                           class772.field11165 += this.field8487[var16];
                           ++var11;
                           ++var15;
                        } else {
                           ++var15;
                        }
                     } else {
                        class339.field5000 += this.field8505[var16];
                        class37.field540 += this.field8453[var16];
                        class772.field11165 += this.field8487[var16];
                        ++var11;
                        ++var15;
                     }
                  }

                  ++var12;
               }

               if (var10 <= var12) {
                  var10000 = ~var11;
                  if (!var9) {
                     if (var10000 < -1) {
                        class772.field11165 = class772.field11165 / var11 + arg4;
                        class428.field6281 = true;
                        class37.field540 = class37.field540 / var11 + arg3;
                        class339.field5000 = class339.field5000 / var11 + arg2;
                        return;
                     }

                     class772.field11165 = arg4;
                     class37.field540 = arg3;
                     class339.field5000 = arg2;
                     return;
                  }
               } else {
                  var10000 = arg1[var12];
               }
            }
         }
      } catch (RuntimeException var211) {
         throw class612.method4503(var211, field8565[1] + arg0 + ',' + (arg1 != null ? field8565[3] : field8565[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field8565[3] : field8565[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "a",
      descriptor = "(IIIFBLeca;IFIJI)S"
   )
   private final short method4397(int arg0, int arg1, int arg2, float arg3, byte arg4, class590 arg5, int arg6, float arg7, int arg8, long arg9, int arg10) {
      boolean var13 = client.field10022;

      try {
         ++field8564;
         if (arg4 < 44) {
            return 127;
         } else {
            int var14 = this.field8523[arg0];
            int var15 = this.field8523[arg0 + 1];
            int var16 = 0;
            int var17 = var14;
            short var10000;
            if (var13) {
               var10000 = this.field8497[var14];
            } else if (~var15 >= ~var14) {
               this.field8497[var16] = (short)(this.field8563 - -1);
               class716.field10272[var16] = arg9;
               this.field8532[this.field8563] = (short)arg6;
               this.field8458[this.field8563] = (short)arg0;
               this.field8560[this.field8563] = (short)arg10;
               this.field8503[this.field8563] = (short)arg2;
               this.field8500[this.field8563] = (short)arg8;
               this.field8460[this.field8563] = (byte)arg1;
               this.field8556[this.field8563] = arg7;
               this.field8477[this.field8563] = arg3;
               var10000 = (short)(this.field8563++);
               if (!var13) {
                  return var10000;
               }
            } else {
               var10000 = this.field8497[var14];
            }

            do {
               while(true) {
                  short var18 = var10000;
                  if (~var18 == -1) {
                     var16 = var17;
                     if (!var13) {
                        this.field8497[var17] = (short)(this.field8563 - -1);
                        class716.field10272[var17] = arg9;
                        this.field8532[this.field8563] = (short)arg6;
                        this.field8458[this.field8563] = (short)arg0;
                        this.field8560[this.field8563] = (short)arg10;
                        this.field8503[this.field8563] = (short)arg2;
                        this.field8500[this.field8563] = (short)arg8;
                        this.field8460[this.field8563] = (byte)arg1;
                        this.field8556[this.field8563] = arg7;
                        this.field8477[this.field8563] = arg3;
                        var10000 = (short)(this.field8563++);
                        break;
                     }

                     if (~class716.field10272[var17] == ~arg9) {
                        return (short)(var18 + -1);
                     }

                     ++var17;
                  } else {
                     if (~class716.field10272[var17] == ~arg9) {
                        return (short)(var18 + -1);
                     }

                     ++var17;
                  }

                  if (~var15 >= ~var17) {
                     this.field8497[var16] = (short)(this.field8563 - -1);
                     class716.field10272[var16] = arg9;
                     this.field8532[this.field8563] = (short)arg6;
                     this.field8458[this.field8563] = (short)arg0;
                     this.field8560[this.field8563] = (short)arg10;
                     this.field8503[this.field8563] = (short)arg2;
                     this.field8500[this.field8563] = (short)arg8;
                     this.field8460[this.field8563] = (byte)arg1;
                     this.field8556[this.field8563] = arg7;
                     this.field8477[this.field8563] = arg3;
                     var10000 = (short)(this.field8563++);
                     if (!var13) {
                        return var10000;
                     }
                  } else {
                     var10000 = this.field8497[var17];
                  }
               }
            } while(var13);

            return var10000;
         }
      } catch (RuntimeException var20) {
         throw class612.method4503(var20, field8565[14] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field8565[3] : field8565[2]) + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "p",
      descriptor = "(IILs;Ls;III)V"
   )
   public final void method770(int arg0, int arg1, class751 arg2, class751 arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field10022;

      try {
         ++field8448;
         if (!this.field8561) {
            this.method4391((byte)86);
         }

         int var9 = this.field8491 + arg4;
         int var10 = this.field8517 + arg4;
         int var11 = this.field8529 + arg6;
         int var12 = this.field8456 + arg6;
         if (arg0 != 1 && ~arg0 != -3 && ~arg0 != -4 && ~arg0 != -6 || var9 >= 0 && var10 - -arg2.field10672 >> arg2.field10671 < arg2.field10665 && ~var11 <= -1 && ~(var12 - -arg2.field10672 >> arg2.field10671) > ~arg2.field10666) {
            if (arg0 != 4 && arg0 != 5) {
               int var13 = var9 >> arg2.field10671;
               int var14 = arg2.field10672 + -1 + var10 >> arg2.field10671;
               int var15 = var11 >> arg2.field10671;
               int var16 = -1 - -arg2.field10672 + var12 >> arg2.field10671;
               if (arg5 == arg2.method5400(-1, var15, var13) && arg5 == arg2.method5400(-1, var15, var14) && arg5 == arg2.method5400(-1, var16, var13) && arg5 == arg2.method5400(-1, var16, var14)) {
                  return;
               }
            } else {
               if (arg3 == null) {
                  return;
               }

               if (~var9 > -1 || arg3.field10672 + var10 >> arg3.field10671 >= arg3.field10665 || ~var11 > -1 || arg3.field10672 + var12 >> arg3.field10671 >= arg3.field10666) {
                  return;
               }
            }

            int var33;
            if (arg0 == 1) {
               var33 = 0;
               if (var8 || ~this.field8527 < ~var33) {
                  do {
                     this.field8453[var33] = this.field8453[var33] + arg2.method5401(this.field8505[var33] + arg4, true, this.field8487[var33] + arg6) - arg5;
                     ++var33;
                  } while(~this.field8527 < ~var33);
               }
            } else {
               label289: {
                  if (~arg0 != -3) {
                     if (arg0 != 3) {
                        if (arg0 == 4) {
                           int var17 = -this.field8450 + this.field8463;
                           int var18 = 0;
                           if (var8) {
                              this.field8453[var18] = this.field8453[var18] - arg5 + var17 - -arg3.method5401(this.field8505[var18] + arg4, true, this.field8487[var18] + arg6);
                              ++var18;
                           }

                           while(true) {
                              while(~var18 > ~this.field8527) {
                                 this.field8453[var18] = this.field8453[var18] - arg5 + var17 - -arg3.method5401(this.field8505[var18] + arg4, true, this.field8487[var18] + arg6);
                                 ++var18;
                              }

                              if (!var8) {
                                 if (!var8) {
                                    break label289;
                                 }
                                 break;
                              }

                              ++var18;
                           }
                        }

                        if (arg0 != 5) {
                           break label289;
                        }

                        int var19 = -this.field8450 + this.field8463;
                        int var20 = 0;
                        if (!var8 && ~this.field8527 >= ~var20) {
                           if (!var8) {
                              break label289;
                           }
                        } else {
                           while(true) {
                              int var21 = this.field8505[var20] - -arg4;
                              int var22 = this.field8487[var20] - -arg6;
                              int var23 = arg2.method5401(var21, true, var22);
                              int var24 = arg3.method5401(var21, true, var22);
                              int var25 = -arg1 + var23 - var24;
                              this.field8453[var20] = ((this.field8453[var20] << 8) / var19 * var25 >> 8) + var23 + -arg5;
                              ++var20;
                              if (~this.field8527 >= ~var20) {
                                 if (!var8) {
                                    break label289;
                                 }
                                 break;
                              }
                           }
                        }
                     }

                     int var26 = (255 & arg1) * 4;
                     int var27 = ((65393 & arg1) >> 8) * 4;
                     int var28 = arg1 >> 16 << 6 & 16320;
                     int var29 = arg1 >> 24 << 6 & 16320;
                     if (-(var26 >> 1) + arg4 < 0 || ~(arg2.field10665 << arg2.field10671) >= ~((var26 >> 1) + arg4 + arg2.field10672) || -(var27 >> 1) + arg6 < 0 || arg2.field10672 + arg6 - -(var27 >> 1) >= arg2.field10666 << arg2.field10671) {
                        return;
                     }

                     this.method5491(var27, var28, arg5, var26, arg6, 39, arg4, var29, arg2);
                     if (!var8) {
                        break label289;
                     }
                  }

                  int var30 = this.field8450;
                  if (var30 == 0) {
                     return;
                  }

                  int var31 = 0;
                  int var32;
                  if (var8) {
                     var32 = (this.field8453[var31] << 16) / var30;
                     if (var32 < arg1) {
                        this.field8453[var31] -= -((arg2.method5401(this.field8505[var31] + arg4, true, this.field8487[var31] - -arg6) - arg5) * (-var32 + arg1) / arg1);
                     }

                     ++var31;
                  }

                  while(~var31 > ~this.field8527) {
                     var32 = (this.field8453[var31] << 16) / var30;
                     if (var32 < arg1) {
                        this.field8453[var31] -= -((arg2.method5401(this.field8505[var31] + arg4, true, this.field8487[var31] - -arg6) - arg5) * (-var32 + arg1) / arg1);
                     }

                     ++var31;
                  }

                  if (var8) {
                     var33 = 0;
                     if (var8 || ~this.field8527 < ~var33) {
                        do {
                           this.field8453[var33] = this.field8453[var33] + arg2.method5401(this.field8505[var33] + arg4, true, this.field8487[var33] + arg6) - arg5;
                           ++var33;
                        } while(~this.field8527 < ~var33);
                     }
                  }
               }
            }

            this.method4401((byte)88);
            this.field8561 = false;
         }
      } catch (RuntimeException var35) {
         throw class612.method4503(var35, field8565[21] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8565[3] : field8565[2]) + ',' + (arg3 != null ? field8565[3] : field8565[2]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "e",
      descriptor = "(B)Z"
   )
   private final boolean method4398(byte arg0) {
      boolean var2 = client.field10022;

      try {
         ++field8442;
         if (this.field8543.field7279) {
            return true;
         } else {
            if (this.field8543.field7283 == null) {
               this.field8543.field7283 = this.field8446.method1236(this.field8541, 0);
            }

            class99 var3 = this.field8543.field7283;
            var3.method981(this.field8530 * 6, (byte)118);
            if (arg0 != -60) {
               this.method4406(-38);
            }

            Buffer var4 = var3.method979(true, true);
            if (var4 != null) {
               label83: {
                  Stream var5;
                  int var6;
                  label82: {
                     var5 = this.field8446.method1952((byte)99, var4);
                     if (Stream.method3185()) {
                        var6 = 0;
                        if (var2) {
                           var5.method3181(this.field8447[var6]);
                           var5.method3181(this.field8437[var6]);
                           var5.method3181(this.field8485[var6]);
                           ++var6;
                        }

                        while(true) {
                           while(~this.field8530 < ~var6) {
                              var5.method3181(this.field8447[var6]);
                              var5.method3181(this.field8437[var6]);
                              var5.method3181(this.field8485[var6]);
                              ++var6;
                           }

                           if (!var2) {
                              if (!var2) {
                                 var5.method3187();
                                 if (!var2) {
                                    break label83;
                                 }

                                 ++var6;
                                 break label82;
                              }
                              break;
                           }

                           ++var6;
                        }
                     }

                     var6 = 0;
                     if (var2) {
                        var5.method3178(this.field8447[var6]);
                        var5.method3178(this.field8437[var6]);
                        var5.method3178(this.field8485[var6]);
                        ++var6;
                     }
                  }

                  while(true) {
                     while(~var6 > ~this.field8530) {
                        var5.method3178(this.field8447[var6]);
                        var5.method3178(this.field8437[var6]);
                        var5.method3178(this.field8485[var6]);
                        ++var6;
                     }

                     var5.method3187();
                     if (!var2) {
                        break;
                     }

                     ++var6;
                  }
               }

               if (var3.method982(-23434)) {
                  this.field8513 = true;
                  this.field8543.field7279 = true;
                  this.field8543.field7278 = var3;
                  return true;
               }
            }

            return false;
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field8565[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "FA",
      descriptor = "(I)V"
   )
   public final void method785(int arg0) {
      boolean var2 = client.field10022;

      try {
         ++field8535;
         int var3 = class160.field2447[arg0];
         int var4 = class160.field2446[arg0];
         int var5 = 0;
         if (!var2 && ~this.field8527 >= ~var5) {
            this.method4401((byte)88);
            this.field8561 = false;
         } else {
            do {
               int var6 = this.field8453[var5] * var4 + -(this.field8487[var5] * var3) >> 14;
               this.field8487[var5] = this.field8453[var5] * var3 - -(this.field8487[var5] * var4) >> 14;
               this.field8453[var5] = var6;
               ++var5;
            } while(~this.field8527 < ~var5);

            this.method4401((byte)88);
            this.field8561 = false;
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field8565[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "a",
      descriptor = "(BLo;)V"
   )
   private final void method4399(byte param1, class484 param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!tka",
      name = "c",
      descriptor = "(I)Z"
   )
   private final boolean method4400(int arg0) {
      boolean var2 = client.field10022;

      try {
         if (arg0 != 700844110) {
            this.method756();
         }

         ++field8553;
         boolean var3 = !this.field8552.field3165;
         boolean var4 = ~(this.field8519 & 55) != -1 && !this.field8473.field3165;
         boolean var5 = !this.field8522.field3165;
         boolean var6 = !this.field8481.field3165;
         if (!var5 && !var3 && !var4 && !var6) {
            return true;
         } else {
            boolean var7 = true;
            if (var5) {
               label172: {
                  if (this.field8458 == null) {
                     return true;
                  }

                  if (this.field8522.field3170 == null) {
                     this.field8522.field3170 = this.field8446.method1286(false, this.field8541);
                  }

                  class581 var8 = this.field8522.field3170;
                  var8.method351((byte)38, this.field8563 * 12, 12);
                  Buffer var9 = var8.method353(true, (byte)112);
                  if (var9 != null) {
                     this.field8446.field3337.copyPositions(this.field8505, this.field8453, this.field8487, this.field8458, 0, 12, this.field8563, var9.getAddress());
                     if (!var8.method352(-2070)) {
                        var7 = false;
                        if (!var2) {
                           break label172;
                        }
                     }

                     this.field8522.field3165 = true;
                     this.field8522.field3163 = var8;
                     if (!var2) {
                        break label172;
                     }
                  }

                  var7 = false;
               }
            }

            if (var3) {
               label173: {
                  if (this.field8552.field3170 == null) {
                     this.field8552.field3170 = this.field8446.method1286(false, this.field8541);
                  }

                  class581 var10 = this.field8552.field3170;
                  var10.method351((byte)38, this.field8563 * 4, 4);
                  Buffer var11 = var10.method353(true, (byte)121);
                  if (var11 == null) {
                     var7 = false;
                     if (!var2) {
                        break label173;
                     }
                  }

                  label139: {
                     if (~(55 & this.field8519) == -1) {
                        short[] var12;
                        short[] var13;
                        byte[] var14;
                        short[] var15;
                        label136: {
                           if (this.field8466 != null) {
                              var12 = this.field8466.field3735;
                              var13 = this.field8466.field3737;
                              var14 = this.field8466.field3740;
                              var15 = this.field8466.field3738;
                              if (!var2) {
                                 break label136;
                              }
                           }

                           var15 = this.field8503;
                           var13 = this.field8500;
                           var12 = this.field8560;
                           var14 = this.field8460;
                        }

                        this.field8446.field3337.copyLighting(this.field8499, this.field8540, this.field8521, var12, var15, var13, var14, this.field8444, this.field8562, this.field8532, 0, 4, this.field8563, var11.getAddress());
                        if (!var2) {
                           break label139;
                        }
                     }

                     this.field8446.field3337.copyColours(this.field8499, this.field8540, this.field8521, this.field8444, this.field8532, 0, 4, this.field8563, var11.getAddress());
                  }

                  if (var10.method352(-2070)) {
                     this.field8552.field3163 = var10;
                     this.field8552.field3165 = true;
                     if (!var2) {
                        break label173;
                     }
                  }

                  var7 = false;
               }
            }

            if (var4) {
               label174: {
                  if (this.field8473.field3170 == null) {
                     this.field8473.field3170 = this.field8446.method1286(false, this.field8541);
                  }

                  class581 var16 = this.field8473.field3170;
                  var16.method351((byte)38, this.field8563 * 12, 12);
                  Buffer var17 = var16.method353(true, (byte)105);
                  if (var17 == null) {
                     var7 = false;
                     if (!var2) {
                        break label174;
                     }
                  }

                  short[] var18;
                  short[] var19;
                  short[] var20;
                  byte[] var21;
                  label118: {
                     if (this.field8466 != null) {
                        var18 = this.field8466.field3735;
                        var19 = this.field8466.field3737;
                        var20 = this.field8466.field3738;
                        var21 = this.field8466.field3740;
                        if (!var2) {
                           break label118;
                        }
                     }

                     var19 = this.field8500;
                     var21 = this.field8460;
                     var18 = this.field8560;
                     var20 = this.field8503;
                  }

                  this.field8446.field3337.copyNormals(var18, var20, var19, var21, 3.0F / (float)this.field8562, 3.0F / (float)(this.field8562 / 2 + this.field8562), 0, 12, this.field8563, var17.getAddress());
                  if (!var16.method352(arg0 ^ -700842076)) {
                     var7 = false;
                     if (!var2) {
                        break label174;
                     }
                  }

                  this.field8473.field3165 = true;
                  this.field8473.field3163 = var16;
               }
            }

            if (var6) {
               if (this.field8481.field3170 == null) {
                  this.field8481.field3170 = this.field8446.method1286(false, this.field8541);
               }

               class581 var22 = this.field8481.field3170;
               var22.method351((byte)38, this.field8563 * 8, 8);
               Buffer var23 = var22.method353(true, (byte)120);
               if (var23 != null) {
                  this.field8446.field3337.copyTexCoords(this.field8556, this.field8477, 0, 8, this.field8563, var23.getAddress());
                  if (!var22.method352(-2070)) {
                     var7 = false;
                     if (!var2) {
                        return var7;
                     }
                  }

                  this.field8481.field3165 = true;
                  this.field8481.field3163 = var22;
                  if (!var2) {
                     return var7;
                  }
               }

               var7 = false;
            }

            return var7;
         }
      } catch (RuntimeException var25) {
         throw class612.method4503(var25, field8565[67] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "V",
      descriptor = "()I"
   )
   public final int method800() {
      try {
         if (!this.field8561) {
            this.method4391((byte)-75);
         }

         ++field8554;
         return this.field8491;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8565[63] + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "a",
      descriptor = "(IILgga;ZI)Z"
   )
   public final boolean method748(int arg0, int arg1, class502 arg2, boolean arg3, int arg4) {
      try {
         ++field8494;
         return this.method4402(arg0, arg3, arg4, -1, arg1, 583635438, arg2);
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field8565[45] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8565[3] : field8565[2]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "b",
      descriptor = "()[B"
   )
   public final byte[] method774() {
      try {
         ++field8467;
         return this.field8540;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8565[40] + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "c",
      descriptor = "()V"
   )
   public final void method795() {
      try {
         ++field8451;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8565[56] + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "RA",
      descriptor = "()I"
   )
   public final int method797() {
      try {
         ++field8492;
         if (!this.field8561) {
            this.method4391((byte)97);
         }

         return this.field8517;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8565[34] + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "v",
      descriptor = "()V"
   )
   public final void method780() {
      boolean var1 = client.field10022;

      try {
         int var2 = 0;
         if (var1) {
            this.field8487[var2] = -this.field8487[var2];
            ++var2;
         }

         while(true) {
            while(~this.field8527 < ~var2) {
               this.field8487[var2] = -this.field8487[var2];
               ++var2;
            }

            ++field8547;
            int var3 = 0;
            if (!var1) {
               if (var1) {
                  this.field8500[var3] = (short)(-this.field8500[var3]);
                  ++var3;
               }

               while(true) {
                  while(var3 < this.field8563) {
                     this.field8500[var3] = (short)(-this.field8500[var3]);
                     ++var3;
                  }

                  int var4 = 0;
                  if (!var1) {
                     short var5;
                     if (var1) {
                        var5 = this.field8447[var4];
                        this.field8447[var4] = this.field8485[var4];
                        this.field8485[var4] = var5;
                        ++var4;
                     }

                     while(true) {
                        class599 var10000;
                        if (var4 >= this.field8550) {
                           this.method4401((byte)88);
                           this.method4393(9136);
                           this.method4395(0);
                           var10000 = this;
                           if (!var1) {
                              this.field8561 = false;
                              return;
                           }
                        } else {
                           var10000 = this;
                        }

                        var5 = var10000.field8447[var4];
                        this.field8447[var4] = this.field8485[var4];
                        this.field8485[var4] = var5;
                        ++var4;
                     }
                  }

                  ++var3;
               }
            }

            ++var2;
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field8565[37] + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "a",
      descriptor = "(Lgga;IZ)V"
   )
   public final void method750(class502 param1, int param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!tka",
      name = "HA",
      descriptor = "()I"
   )
   public final int method779() {
      try {
         ++field8469;
         if (!this.field8561) {
            this.method4391((byte)-118);
         }

         return this.field8529;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8565[18] + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "ba",
      descriptor = "(Lr;)Lr;"
   )
   public final class412 method792(class412 arg0) {
      boolean var2 = client.field10022;

      try {
         ++field8524;
         if (this.field8563 == 0) {
            return null;
         } else {
            if (!this.field8561) {
               this.method4391((byte)73);
            }

            int var3;
            int var4;
            label46: {
               if (this.field8446.field3444 > 0) {
                  var3 = -(this.field8446.field3444 * this.field8463 >> 8) + this.field8491 >> this.field8446.field3441;
                  var4 = -(this.field8446.field3444 * this.field8450 >> 8) + this.field8517 >> this.field8446.field3441;
                  if (!var2) {
                     break label46;
                  }
               }

               var3 = this.field8491 - (this.field8446.field3444 * this.field8450 >> 8) >> this.field8446.field3441;
               var4 = -(this.field8446.field3444 * this.field8463 >> 8) + this.field8517 >> this.field8446.field3441;
            }

            int var5;
            int var6;
            label41: {
               if (this.field8446.field3500 > 0) {
                  var5 = -(this.field8446.field3500 * this.field8463 >> 8) + this.field8529 >> this.field8446.field3441;
                  var6 = -(this.field8446.field3500 * this.field8450 >> 8) + this.field8456 >> this.field8446.field3441;
                  if (!var2) {
                     break label41;
                  }
               }

               var5 = -(this.field8446.field3500 * this.field8450 >> 8) + this.field8529 >> this.field8446.field3441;
               var6 = -(this.field8446.field3500 * this.field8463 >> 8) + this.field8456 >> this.field8446.field3441;
            }

            class484 var10;
            label36: {
               int var7 = -var3 + var4 + 1;
               int var8 = -var5 + var6 + 1;
               class484 var9 = (class484)arg0;
               if (var9 != null && var9.method3695(112, var7, var8)) {
                  var10 = var9;
                  var9.method3696((byte)127);
                  if (!var2) {
                     break label36;
                  }
               }

               var10 = new class484(this.field8446, var7, var8);
            }

            var10.method3697(var6, 0, var4, var5, var3);
            this.method4399((byte)-116, var10);
            return var10;
         }
      } catch (RuntimeException var12) {
         throw class612.method4503(var12, field8565[23] + (arg0 != null ? field8565[3] : field8565[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "c",
      descriptor = "(B)V"
   )
   private final void method4401(byte arg0) {
      try {
         if (this.field8522 != null) {
            this.field8522.field3165 = false;
         }

         ++field8511;
         if (arg0 != 88) {
            this.method4406(-26);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8565[57] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "a",
      descriptor = "(Lgga;)V"
   )
   public final void method757(class502 arg0) {
      boolean var2 = client.field10022;

      try {
         ++field8455;
         class522 var3 = (class522)arg0;
         if (this.field8468 != null) {
            int var4 = 0;
            if (var2 || this.field8468.length > var4) {
               do {
                  class712 var5 = this.field8468[var4];
                  class712 var6 = var5;
                  if (var5.field10229 != null) {
                     var6 = var5.field10229;
                  }

                  var6.field10242 = (int)((float)this.field8487[var5.field10220] * var3.field7384 + (float)this.field8505[var5.field10220] * var3.field7350 + (float)this.field8453[var5.field10220] * var3.field7391 + var3.field7377);
                  var6.field10243 = (int)((float)this.field8487[var5.field10220] * var3.field7363 + (float)this.field8505[var5.field10220] * var3.field7344 + (float)this.field8453[var5.field10220] * var3.field7338 + var3.field7356);
                  var6.field10240 = (int)((float)this.field8487[var5.field10220] * var3.field7388 + (float)this.field8505[var5.field10220] * var3.field7376 + (float)this.field8453[var5.field10220] * var3.field7339 + var3.field7352);
                  var6.field10236 = (int)((float)this.field8487[var5.field10239] * var3.field7384 + (float)this.field8505[var5.field10239] * var3.field7350 + (float)this.field8453[var5.field10239] * var3.field7391 + var3.field7377);
                  var6.field10237 = (int)((float)this.field8487[var5.field10239] * var3.field7363 + (float)this.field8505[var5.field10239] * var3.field7344 + (float)this.field8453[var5.field10239] * var3.field7338 + var3.field7356);
                  var6.field10226 = (int)((float)this.field8487[var5.field10239] * var3.field7388 + (float)this.field8505[var5.field10239] * var3.field7376 + (float)this.field8453[var5.field10239] * var3.field7339 + var3.field7352);
                  var6.field10222 = (int)((float)this.field8487[var5.field10223] * var3.field7384 + (float)this.field8505[var5.field10223] * var3.field7350 + (float)this.field8453[var5.field10223] * var3.field7391 + var3.field7377);
                  var6.field10234 = (int)((float)this.field8487[var5.field10223] * var3.field7363 + (float)this.field8505[var5.field10223] * var3.field7344 + (float)this.field8453[var5.field10223] * var3.field7338 + var3.field7356);
                  var6.field10230 = (int)((float)this.field8487[var5.field10223] * var3.field7388 + (float)this.field8505[var5.field10223] * var3.field7376 + (float)this.field8453[var5.field10223] * var3.field7339 + var3.field7352);
                  ++var4;
               } while(this.field8468.length > var4);
            }
         }

         if (this.field8443 != null) {
            int var7 = 0;
            if (var2 || ~this.field8443.length < ~var7) {
               do {
                  class3 var8 = this.field8443[var7];
                  class3 var9 = var8;
                  if (var8.field29 != null) {
                     var9 = var8.field29;
                  }

                  if (var8.field28 != null) {
                     var8.field28.method323(var3);
                     if (var2) {
                        var8.field28 = var3.method338();
                     }
                  } else {
                     var8.field28 = var3.method338();
                  }

                  var9.field25 = (int)((float)this.field8487[var8.field31] * var3.field7384 + (float)this.field8505[var8.field31] * var3.field7350 + (float)this.field8453[var8.field31] * var3.field7391 + var3.field7377);
                  var9.field30 = (int)((float)this.field8487[var8.field31] * var3.field7363 + (float)this.field8505[var8.field31] * var3.field7344 + (float)this.field8453[var8.field31] * var3.field7338 + var3.field7356);
                  var9.field27 = (int)((float)this.field8487[var8.field31] * var3.field7388 + (float)this.field8505[var8.field31] * var3.field7376 + (float)this.field8453[var8.field31] * var3.field7339 + var3.field7352);
                  ++var7;
               } while(~this.field8443.length < ~var7);

            }
         }
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field8565[36] + (arg0 != null ? field8565[3] : field8565[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "a",
      descriptor = "(I[IIIIIZ)V"
   )
   public final void method765(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
      boolean var8 = client.field10022;

      try {
         ++field8445;
         int var9 = arg1.length;
         int var10000;
         int var112;
         int var113;
         int var114;
         if (arg0 != 0) {
            if (~arg0 != -2) {
               if (arg0 != 2) {
                  if (~arg0 != -4) {
                     if (~arg0 == -6) {
                        if (this.field8495 != null) {
                           label346: {
                              int var69 = 0;
                              int var70 = 0;
                              if (var8) {
                                 var10000 = arg1[var70];
                              } else if (~var9 >= ~var70) {
                                 var10000 = var69;
                                 if (!var8) {
                                    break label346;
                                 }
                              } else {
                                 var10000 = arg1[var70];
                              }

                              while(true) {
                                 int var71 = var10000;
                                 if (~var71 <= ~this.field8495.length) {
                                    ++var70;
                                 } else {
                                    label846: {
                                       int[] var72 = this.field8495[var71];
                                       int var73 = 0;
                                       if (var8) {
                                          var10000 = var72[var73];
                                       } else if (var73 >= var72.length) {
                                          var10000 = var69;
                                          if (!var8) {
                                             var69 |= ~var72.length >= -1 ? 0 : 1;
                                             ++var70;
                                             break label846;
                                          }
                                       } else {
                                          var10000 = var72[var73];
                                       }

                                       while(true) {
                                          int var74 = var10000;
                                          int var75 = (255 & this.field8540[var74]) + arg2 * 8;
                                          if (var75 >= 0) {
                                             if (~var75 < -256) {
                                                var75 = 255;
                                                if (var8) {
                                                   var75 = 0;
                                                }
                                             }
                                          } else {
                                             var75 = 0;
                                          }

                                          this.field8540[var74] = (byte)var75;
                                          ++var73;
                                          if (var73 >= var72.length) {
                                             var10000 = var69;
                                             if (!var8) {
                                                var69 |= ~var72.length >= -1 ? 0 : 1;
                                                ++var70;
                                                break;
                                             }
                                          } else {
                                             var10000 = var72[var73];
                                          }
                                       }
                                    }
                                 }

                                 if (~var9 >= ~var70) {
                                    var10000 = var69;
                                    if (!var8) {
                                       break;
                                    }
                                 } else {
                                    var10000 = arg1[var70];
                                 }
                              }
                           }

                           if (var10000 != 0) {
                              if (this.field8440 != null) {
                                 int var76 = 0;
                                 if (var8 || ~var76 > ~this.field8461) {
                                    do {
                                       class138 var77 = this.field8440[var76];
                                       class496 var78 = this.field8555[var76];
                                       var78.field7069 = 16777215 & var78.field7069 | 255 - (this.field8540[var77.field2219] & 255) << 24;
                                       ++var76;
                                    } while(~var76 > ~this.field8461);
                                 }
                              }

                              this.method4407((byte)-87);
                           }
                        }

                     } else if (~arg0 == -8) {
                        if (this.field8495 != null) {
                           label429: {
                              int var79 = 0;
                              int var80 = 0;
                              if (var8) {
                                 var10000 = arg1[var80];
                              } else if (var80 >= var9) {
                                 var10000 = var79;
                                 if (!var8) {
                                    break label429;
                                 }
                              } else {
                                 var10000 = arg1[var80];
                              }

                              while(true) {
                                 int var81 = var10000;
                                 if (~this.field8495.length >= ~var81) {
                                    ++var80;
                                 } else {
                                    label852: {
                                       int[] var82 = this.field8495[var81];
                                       int var83 = 0;
                                       if (var8) {
                                          var10000 = var82[var83];
                                       } else if (~var82.length >= ~var83) {
                                          var10000 = var79;
                                          if (!var8) {
                                             var79 |= var82.length <= 0 ? 0 : 1;
                                             ++var80;
                                             break label852;
                                          }
                                       } else {
                                          var10000 = var82[var83];
                                       }

                                       while(true) {
                                          int var84 = var10000;
                                          int var85 = 65535 & this.field8499[var84];
                                          int var86 = (var85 & 65163) >> 10;
                                          int var87 = 7 & var85 >> 7;
                                          int var88 = 63 & arg2 + var86;
                                          int var89 = arg3 / 4 + var87;
                                          int var90 = var85 & 127;
                                          int var91 = arg4 + var90;
                                          if (~var89 <= -1) {
                                             if (~var89 < -8) {
                                                var89 = 7;
                                                if (var8) {
                                                   var89 = 0;
                                                }
                                             }
                                          } else {
                                             var89 = 0;
                                          }

                                          if (~var91 <= -1) {
                                             if (~var91 < -128) {
                                                var91 = 127;
                                                if (var8) {
                                                   var91 = 0;
                                                }
                                             }
                                          } else {
                                             var91 = 0;
                                          }

                                          this.field8499[var84] = (short)class91.method932(class91.method932(var88 << 10, var89 << 7), var91);
                                          ++var83;
                                          if (~var82.length >= ~var83) {
                                             var10000 = var79;
                                             if (!var8) {
                                                var79 |= var82.length <= 0 ? 0 : 1;
                                                ++var80;
                                                break;
                                             }
                                          } else {
                                             var10000 = var82[var83];
                                          }
                                       }
                                    }
                                 }

                                 if (var80 >= var9) {
                                    var10000 = var79;
                                    if (!var8) {
                                       break;
                                    }
                                 } else {
                                    var10000 = arg1[var80];
                                 }
                              }
                           }

                           if (var10000 != 0) {
                              if (this.field8440 != null) {
                                 int var92 = 0;
                                 if (var8 || ~this.field8461 < ~var92) {
                                    do {
                                       class138 var93 = this.field8440[var92];
                                       class496 var94 = this.field8555[var92];
                                       var94.field7069 = class744.field10589[65535 & this.field8499[var93.field2219]] & 16777215 | -16777216 & var94.field7069;
                                       ++var92;
                                    } while(~this.field8461 < ~var92);
                                 }
                              }

                              this.method4407((byte)-65);
                           }
                        }

                     } else if (arg0 == 8) {
                        if (this.field8546 != null) {
                           int var95 = 0;
                           if (var8 || ~var95 > ~var9) {
                              do {
                                 int var96 = arg1[var95];
                                 if (this.field8546.length <= var96) {
                                    ++var95;
                                 } else {
                                    int[] var97 = this.field8546[var96];
                                    int var98 = 0;
                                    if (!var8 && var97.length <= var98) {
                                       ++var95;
                                    } else {
                                       do {
                                          class496 var99 = this.field8555[var97[var98]];
                                          var99.field7070 += arg3;
                                          var99.field7071 += arg2;
                                          ++var98;
                                       } while(var97.length > var98);

                                       ++var95;
                                    }
                                 }
                              } while(~var95 > ~var9);
                           }
                        }

                     } else if (arg0 == 10) {
                        if (this.field8546 != null) {
                           int var100 = 0;
                           if (var8 || ~var100 > ~var9) {
                              do {
                                 int var101 = arg1[var100];
                                 if (~var101 <= ~this.field8546.length) {
                                    ++var100;
                                 } else {
                                    int[] var102 = this.field8546[var101];
                                    int var103 = 0;
                                    if (!var8 && ~var103 <= ~var102.length) {
                                       ++var100;
                                    } else {
                                       do {
                                          class496 var104 = this.field8555[var102[var103]];
                                          var104.field7078 = var104.field7078 * arg3 >> 7;
                                          var104.field7073 = var104.field7073 * arg2 >> 7;
                                          ++var103;
                                       } while(~var103 > ~var102.length);

                                       ++var100;
                                    }
                                 }
                              } while(~var100 > ~var9);
                           }
                        }

                     } else if (~arg0 == -10) {
                        if (this.field8546 != null) {
                           int var105 = 0;
                           if (var8 || ~var105 > ~var9) {
                              do {
                                 int var106 = arg1[var105];
                                 if (~this.field8546.length >= ~var106) {
                                    ++var105;
                                 } else {
                                    int[] var107 = this.field8546[var106];
                                    int var108 = 0;
                                    if (!var8 && ~var107.length >= ~var108) {
                                       ++var105;
                                    } else {
                                       do {
                                          class496 var109 = this.field8555[var107[var108]];
                                          var109.field7076 = 16383 & var109.field7076 + arg2;
                                          ++var108;
                                       } while(~var107.length < ~var108);

                                       ++var105;
                                    }
                                 }
                              } while(~var105 > ~var9);
                           }
                        }

                     }
                  } else {
                     int var64 = 0;
                     if (var8 || var9 > var64) {
                        do {
                           int var65 = arg1[var64];
                           if (~this.field8454.length >= ~var65) {
                              ++var64;
                           } else {
                              int[] var66 = this.field8454[var65];
                              int var67 = 0;
                              if (!var8 && var66.length <= var67) {
                                 ++var64;
                              } else {
                                 do {
                                    int var68 = var66[var67];
                                    this.field8505[var68] -= class339.field5000;
                                    this.field8453[var68] -= class37.field540;
                                    this.field8487[var68] -= class772.field11165;
                                    this.field8505[var68] = this.field8505[var68] * arg2 >> 7;
                                    this.field8453[var68] = this.field8453[var68] * arg3 >> 7;
                                    this.field8487[var68] = this.field8487[var68] * arg4 >> 7;
                                    this.field8505[var68] += class339.field5000;
                                    this.field8453[var68] += class37.field540;
                                    this.field8487[var68] += class772.field11165;
                                    ++var67;
                                 } while(var66.length > var67);

                                 ++var64;
                              }
                           }
                        } while(var9 > var64);

                     }
                  }
               } else {
                  int var21 = 0;
                  int var46;
                  int var47;
                  int[] var48;
                  int var49;
                  int var50;
                  int var51;
                  int var52;
                  int var53;
                  int var54;
                  int var55;
                  int var56;
                  int var57;
                  int var58;
                  int var59;
                  int var60;
                  int var61;
                  int var62;
                  int var63;
                  if (var8) {
                     var10000 = arg1[var21];
                  } else if (var9 <= var21) {
                     var10000 = arg6;
                     if (!var8) {
                        if (arg6 != 0) {
                           var46 = 0;
                           if (var8 || ~var9 < ~var46) {
                              do {
                                 var47 = arg1[var46];
                                 if (~var47 <= ~this.field8454.length) {
                                    ++var46;
                                 } else {
                                    var48 = this.field8454[var47];
                                    var49 = 0;
                                    if (!var8 && var48.length <= var49) {
                                       ++var46;
                                    } else {
                                       label661:
                                       do {
                                          var50 = var48[var49];
                                          var51 = this.field8523[var50];
                                          var52 = this.field8523[var50 + 1];
                                          var53 = var51;
                                          if (!var8 && ~var52 >= ~var51) {
                                             ++var49;
                                          } else {
                                             do {
                                                var54 = this.field8497[var53] + -1;
                                                if (var54 == -1) {
                                                   ++var49;
                                                   continue label661;
                                                }

                                                if (~arg4 != -1) {
                                                   var55 = class160.field2447[arg4];
                                                   var56 = class160.field2446[arg4];
                                                   var57 = this.field8560[var54] * var56 + this.field8503[var54] * var55 + 16383 >> 14;
                                                   this.field8503[var54] = (short)(this.field8503[var54] * var56 + (-(this.field8560[var54] * var55) - -16383) >> 14);
                                                   this.field8560[var54] = (short)var57;
                                                }

                                                if (arg2 != 0) {
                                                   var58 = class160.field2447[arg2];
                                                   var59 = class160.field2446[arg2];
                                                   var60 = this.field8503[var54] * var59 + 16383 - this.field8500[var54] * var58 >> 14;
                                                   this.field8500[var54] = (short)(this.field8503[var54] * var58 + this.field8500[var54] * var59 + 16383 >> 14);
                                                   this.field8503[var54] = (short)var60;
                                                }

                                                if (arg3 != 0) {
                                                   var61 = class160.field2447[arg3];
                                                   var62 = class160.field2446[arg3];
                                                   var63 = this.field8560[var54] * var62 + this.field8500[var54] * var61 + 16383 >> 14;
                                                   this.field8500[var54] = (short)(this.field8500[var54] * var62 + -(this.field8560[var54] * var61) - -16383 >> 14);
                                                   this.field8560[var54] = (short)var63;
                                                }

                                                ++var53;
                                             } while(~var52 < ~var53);

                                             ++var49;
                                          }
                                       } while(var48.length > var49);

                                       ++var46;
                                    }
                                 }
                              } while(~var9 < ~var46);
                           }

                           this.method4393(9136);
                        }

                        return;
                     }
                  } else {
                     var10000 = arg1[var21];
                  }

                  while(true) {
                     int var22 = var10000;
                     if (this.field8454.length <= var22) {
                        ++var21;
                     } else {
                        label863: {
                           int[] var23 = this.field8454[var22];
                           int var35;
                           int var36;
                           int var37;
                           int var38;
                           int var39;
                           int var40;
                           int var41;
                           int var42;
                           int var43;
                           int var44;
                           int var45;
                           if ((1 & arg5) == 0) {
                              int var24 = 0;
                              int var25;
                              int var26;
                              int var27;
                              int var28;
                              int var29;
                              int var30;
                              int var31;
                              int var32;
                              int var33;
                              int var34;
                              if (var8) {
                                 var25 = var23[var24];
                                 this.field8505[var25] -= class339.field5000;
                                 this.field8453[var25] -= class37.field540;
                                 this.field8487[var25] -= class772.field11165;
                                 if (~arg4 != -1) {
                                    var26 = class160.field2447[arg4];
                                    var27 = class160.field2446[arg4];
                                    var28 = this.field8505[var25] * var27 + this.field8453[var25] * var26 + 16383 >> 14;
                                    this.field8453[var25] = this.field8453[var25] * var27 + -(this.field8505[var25] * var26) + 16383 >> 14;
                                    this.field8505[var25] = var28;
                                 }

                                 if (~arg2 != -1) {
                                    var29 = class160.field2447[arg2];
                                    var30 = class160.field2446[arg2];
                                    var31 = this.field8453[var25] * var30 + -(this.field8487[var25] * var29) + 16383 >> 14;
                                    this.field8487[var25] = this.field8487[var25] * var30 + this.field8453[var25] * var29 - -16383 >> 14;
                                    this.field8453[var25] = var31;
                                 }

                                 if (arg3 != 0) {
                                    var32 = class160.field2447[arg3];
                                    var33 = class160.field2446[arg3];
                                    var34 = this.field8505[var25] * var33 + this.field8487[var25] * var32 + 16383 >> 14;
                                    this.field8487[var25] = this.field8487[var25] * var33 + -(this.field8505[var25] * var32) + 16383 >> 14;
                                    this.field8505[var25] = var34;
                                 }

                                 this.field8505[var25] += class339.field5000;
                                 this.field8453[var25] += class37.field540;
                                 this.field8487[var25] += class772.field11165;
                                 ++var24;
                              }

                              while(var23.length > var24) {
                                 var25 = var23[var24];
                                 this.field8505[var25] -= class339.field5000;
                                 this.field8453[var25] -= class37.field540;
                                 this.field8487[var25] -= class772.field11165;
                                 if (~arg4 != -1) {
                                    var26 = class160.field2447[arg4];
                                    var27 = class160.field2446[arg4];
                                    var28 = this.field8505[var25] * var27 + this.field8453[var25] * var26 + 16383 >> 14;
                                    this.field8453[var25] = this.field8453[var25] * var27 + -(this.field8505[var25] * var26) + 16383 >> 14;
                                    this.field8505[var25] = var28;
                                 }

                                 if (~arg2 != -1) {
                                    var29 = class160.field2447[arg2];
                                    var30 = class160.field2446[arg2];
                                    var31 = this.field8453[var25] * var30 + -(this.field8487[var25] * var29) + 16383 >> 14;
                                    this.field8487[var25] = this.field8487[var25] * var30 + this.field8453[var25] * var29 - -16383 >> 14;
                                    this.field8453[var25] = var31;
                                 }

                                 if (arg3 != 0) {
                                    var32 = class160.field2447[arg3];
                                    var33 = class160.field2446[arg3];
                                    var34 = this.field8505[var25] * var33 + this.field8487[var25] * var32 + 16383 >> 14;
                                    this.field8487[var25] = this.field8487[var25] * var33 + -(this.field8505[var25] * var32) + 16383 >> 14;
                                    this.field8505[var25] = var34;
                                 }

                                 this.field8505[var25] += class339.field5000;
                                 this.field8453[var25] += class37.field540;
                                 this.field8487[var25] += class772.field11165;
                                 ++var24;
                              }

                              if (!var8) {
                                 ++var21;
                                 break label863;
                              }

                              var35 = 0;
                              if (var8) {
                                 var36 = var23[var35];
                                 this.field8505[var36] -= class339.field5000;
                                 this.field8453[var36] -= class37.field540;
                                 this.field8487[var36] -= class772.field11165;
                                 if (~arg2 != -1) {
                                    var37 = class160.field2447[arg2];
                                    var38 = class160.field2446[arg2];
                                    var39 = this.field8453[var36] * var38 + 16383 - this.field8487[var36] * var37 >> 14;
                                    this.field8487[var36] = this.field8487[var36] * var38 + this.field8453[var36] * var37 + 16383 >> 14;
                                    this.field8453[var36] = var39;
                                 }

                                 if (~arg4 != -1) {
                                    var40 = class160.field2447[arg4];
                                    var41 = class160.field2446[arg4];
                                    var42 = this.field8453[var36] * var40 - -(this.field8505[var36] * var41) - -16383 >> 14;
                                    this.field8453[var36] = this.field8453[var36] * var41 + -(this.field8505[var36] * var40) - -16383 >> 14;
                                    this.field8505[var36] = var42;
                                 }

                                 if (~arg3 != -1) {
                                    var43 = class160.field2447[arg3];
                                    var44 = class160.field2446[arg3];
                                    var45 = this.field8505[var36] * var44 + (this.field8487[var36] * var43 - -16383) >> 14;
                                    this.field8487[var36] = this.field8487[var36] * var44 - this.field8505[var36] * var43 + 16383 >> 14;
                                    this.field8505[var36] = var45;
                                 }

                                 this.field8505[var36] += class339.field5000;
                                 this.field8453[var36] += class37.field540;
                                 this.field8487[var36] += class772.field11165;
                                 ++var35;
                              }
                           } else {
                              var35 = 0;
                              if (var8) {
                                 var36 = var23[var35];
                                 this.field8505[var36] -= class339.field5000;
                                 this.field8453[var36] -= class37.field540;
                                 this.field8487[var36] -= class772.field11165;
                                 if (~arg2 != -1) {
                                    var37 = class160.field2447[arg2];
                                    var38 = class160.field2446[arg2];
                                    var39 = this.field8453[var36] * var38 + 16383 - this.field8487[var36] * var37 >> 14;
                                    this.field8487[var36] = this.field8487[var36] * var38 + this.field8453[var36] * var37 + 16383 >> 14;
                                    this.field8453[var36] = var39;
                                 }

                                 if (~arg4 != -1) {
                                    var40 = class160.field2447[arg4];
                                    var41 = class160.field2446[arg4];
                                    var42 = this.field8453[var36] * var40 - -(this.field8505[var36] * var41) - -16383 >> 14;
                                    this.field8453[var36] = this.field8453[var36] * var41 + -(this.field8505[var36] * var40) - -16383 >> 14;
                                    this.field8505[var36] = var42;
                                 }

                                 if (~arg3 != -1) {
                                    var43 = class160.field2447[arg3];
                                    var44 = class160.field2446[arg3];
                                    var45 = this.field8505[var36] * var44 + (this.field8487[var36] * var43 - -16383) >> 14;
                                    this.field8487[var36] = this.field8487[var36] * var44 - this.field8505[var36] * var43 + 16383 >> 14;
                                    this.field8505[var36] = var45;
                                 }

                                 this.field8505[var36] += class339.field5000;
                                 this.field8453[var36] += class37.field540;
                                 this.field8487[var36] += class772.field11165;
                                 ++var35;
                              }
                           }

                           while(var23.length > var35) {
                              var36 = var23[var35];
                              this.field8505[var36] -= class339.field5000;
                              this.field8453[var36] -= class37.field540;
                              this.field8487[var36] -= class772.field11165;
                              if (~arg2 != -1) {
                                 var37 = class160.field2447[arg2];
                                 var38 = class160.field2446[arg2];
                                 var39 = this.field8453[var36] * var38 + 16383 - this.field8487[var36] * var37 >> 14;
                                 this.field8487[var36] = this.field8487[var36] * var38 + this.field8453[var36] * var37 + 16383 >> 14;
                                 this.field8453[var36] = var39;
                              }

                              if (~arg4 != -1) {
                                 var40 = class160.field2447[arg4];
                                 var41 = class160.field2446[arg4];
                                 var42 = this.field8453[var36] * var40 - -(this.field8505[var36] * var41) - -16383 >> 14;
                                 this.field8453[var36] = this.field8453[var36] * var41 + -(this.field8505[var36] * var40) - -16383 >> 14;
                                 this.field8505[var36] = var42;
                              }

                              if (~arg3 != -1) {
                                 var43 = class160.field2447[arg3];
                                 var44 = class160.field2446[arg3];
                                 var45 = this.field8505[var36] * var44 + (this.field8487[var36] * var43 - -16383) >> 14;
                                 this.field8487[var36] = this.field8487[var36] * var44 - this.field8505[var36] * var43 + 16383 >> 14;
                                 this.field8505[var36] = var45;
                              }

                              this.field8505[var36] += class339.field5000;
                              this.field8453[var36] += class37.field540;
                              this.field8487[var36] += class772.field11165;
                              ++var35;
                           }

                           ++var21;
                        }
                     }

                     if (var9 <= var21) {
                        var10000 = arg6;
                        if (!var8) {
                           if (arg6 != 0) {
                              var46 = 0;
                              if (var8 || ~var9 < ~var46) {
                                 do {
                                    var47 = arg1[var46];
                                    if (~var47 <= ~this.field8454.length) {
                                       ++var46;
                                    } else {
                                       var48 = this.field8454[var47];
                                       var49 = 0;
                                       if (!var8 && var48.length <= var49) {
                                          ++var46;
                                       } else {
                                          label264:
                                          do {
                                             var50 = var48[var49];
                                             var51 = this.field8523[var50];
                                             var52 = this.field8523[var50 + 1];
                                             var53 = var51;
                                             if (!var8 && ~var52 >= ~var51) {
                                                ++var49;
                                             } else {
                                                do {
                                                   var54 = this.field8497[var53] + -1;
                                                   if (var54 == -1) {
                                                      ++var49;
                                                      continue label264;
                                                   }

                                                   if (~arg4 != -1) {
                                                      var55 = class160.field2447[arg4];
                                                      var56 = class160.field2446[arg4];
                                                      var57 = this.field8560[var54] * var56 + this.field8503[var54] * var55 + 16383 >> 14;
                                                      this.field8503[var54] = (short)(this.field8503[var54] * var56 + (-(this.field8560[var54] * var55) - -16383) >> 14);
                                                      this.field8560[var54] = (short)var57;
                                                   }

                                                   if (arg2 != 0) {
                                                      var58 = class160.field2447[arg2];
                                                      var59 = class160.field2446[arg2];
                                                      var60 = this.field8503[var54] * var59 + 16383 - this.field8500[var54] * var58 >> 14;
                                                      this.field8500[var54] = (short)(this.field8503[var54] * var58 + this.field8500[var54] * var59 + 16383 >> 14);
                                                      this.field8503[var54] = (short)var60;
                                                   }

                                                   if (arg3 != 0) {
                                                      var61 = class160.field2447[arg3];
                                                      var62 = class160.field2446[arg3];
                                                      var63 = this.field8560[var54] * var62 + this.field8500[var54] * var61 + 16383 >> 14;
                                                      this.field8500[var54] = (short)(this.field8500[var54] * var62 + -(this.field8560[var54] * var61) - -16383 >> 14);
                                                      this.field8560[var54] = (short)var63;
                                                   }

                                                   ++var53;
                                                } while(~var52 < ~var53);

                                                ++var49;
                                             }
                                          } while(var48.length > var49);

                                          ++var46;
                                       }
                                    }
                                 } while(~var9 < ~var46);
                              }

                              this.method4393(9136);
                           }

                           return;
                        }
                     } else {
                        var10000 = arg1[var21];
                     }
                  }
               }
            } else {
               var113 = arg3 << 4;
               var114 = arg4 << 4;
               var112 = arg2 << 4;
               int var16 = 0;
               if (var8 || ~var16 > ~var9) {
                  do {
                     int var17 = arg1[var16];
                     if (this.field8454.length <= var17) {
                        ++var16;
                     } else {
                        int[] var18 = this.field8454[var17];
                        int var19 = 0;
                        if (!var8 && var19 >= var18.length) {
                           ++var16;
                        } else {
                           do {
                              int var20 = var18[var19];
                              this.field8505[var20] += var112;
                              this.field8453[var20] += var113;
                              this.field8487[var20] += var114;
                              ++var19;
                           } while(var19 < var18.length);

                           ++var16;
                        }
                     }
                  } while(~var16 > ~var9);

               }
            }
         } else {
            var113 = arg3 << 4;
            var112 = arg2 << 4;
            var114 = arg4 << 4;
            class772.field11165 = 0;
            class37.field540 = 0;
            int var10 = 0;
            class339.field5000 = 0;
            int var11 = 0;
            if (var8) {
               var10000 = arg1[var11];
            } else if (var9 <= var11) {
               var10000 = var10;
               if (!var8) {
                  if (var10 <= 0) {
                     class37.field540 = var113;
                     class339.field5000 = var112;
                     class772.field11165 = var114;
                     return;
                  }

                  class37.field540 = class37.field540 / var10 - -var113;
                  class772.field11165 = class772.field11165 / var10 + var114;
                  class339.field5000 = class339.field5000 / var10 + var112;
                  return;
               }
            } else {
               var10000 = arg1[var11];
            }

            while(true) {
               int var12 = var10000;
               if (this.field8454.length <= var12) {
                  ++var11;
               } else {
                  int[] var13 = this.field8454[var12];
                  int var14 = 0;
                  int var15;
                  if (var8) {
                     var15 = var13[var14];
                     class339.field5000 += this.field8505[var15];
                     class37.field540 += this.field8453[var15];
                     ++var10;
                     class772.field11165 += this.field8487[var15];
                     ++var14;
                  }

                  while(~var13.length < ~var14) {
                     var15 = var13[var14];
                     class339.field5000 += this.field8505[var15];
                     class37.field540 += this.field8453[var15];
                     ++var10;
                     class772.field11165 += this.field8487[var15];
                     ++var14;
                  }

                  ++var11;
               }

               if (var9 <= var11) {
                  var10000 = var10;
                  if (!var8) {
                     if (var10 <= 0) {
                        class37.field540 = var113;
                        class339.field5000 = var112;
                        class772.field11165 = var114;
                        return;
                     }

                     class37.field540 = class37.field540 / var10 - -var113;
                     class772.field11165 = class772.field11165 / var10 + var114;
                     class339.field5000 = class339.field5000 / var10 + var112;
                     return;
                  }
               } else {
                  var10000 = arg1[var11];
               }
            }
         }
      } catch (RuntimeException var111) {
         throw class612.method4503(var111, field8565[27] + arg0 + ',' + (arg1 != null ? field8565[3] : field8565[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "a",
      descriptor = "(IZIIIILgga;)Z"
   )
   private final boolean method4402(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, class502 arg6) {
      boolean var8 = client.field10022;

      try {
         ++field8493;
         class522 var9 = (class522)arg6;
         class522 var10 = this.field8446.field3396;
         float var11 = var9.field7352 * var10.field7384 + var9.field7377 * var10.field7350 + var9.field7356 * var10.field7391 + var10.field7377;
         float var12 = var9.field7352 * var10.field7363 + var9.field7377 * var10.field7344 + var9.field7356 * var10.field7338 + var10.field7356;
         float var13 = var9.field7352 * var10.field7388 + var9.field7377 * var10.field7376 + var9.field7356 * var10.field7339 + var10.field7352;
         class627.field8950 = var9.field7388 * var10.field7388 + var9.field7384 * var10.field7376 + var9.field7363 * var10.field7339;
         class249.field3819 = var9.field7388 * var10.field7384 + var9.field7384 * var10.field7350 + var9.field7363 * var10.field7391;
         class376.field5492 = var9.field7376 * var10.field7388 + var9.field7350 * var10.field7376 + var9.field7344 * var10.field7339;
         class217.field3109 = var9.field7376 * var10.field7384 + var9.field7350 * var10.field7350 + var9.field7344 * var10.field7391;
         class54.field796 = var9.field7339 * var10.field7384 + var9.field7391 * var10.field7350 + var9.field7338 * var10.field7391;
         class211.field3023 = var9.field7339 * var10.field7363 + var9.field7391 * var10.field7344 + var9.field7338 * var10.field7338;
         class432.field6347 = var9.field7339 * var10.field7388 + var9.field7391 * var10.field7376 + var9.field7338 * var10.field7339;
         class415.field6083 = var9.field7376 * var10.field7363 + var9.field7350 * var10.field7344 + var9.field7344 * var10.field7338;
         class633.field8984 = var9.field7388 * var10.field7363 + var9.field7384 * var10.field7344 + var9.field7363 * var10.field7338;
         byte var14 = 0;
         if (arg5 != 583635438) {
            this.method764();
         }

         float var15 = Float.MAX_VALUE;
         float var16 = -3.4028235E38F;
         float var17 = Float.MAX_VALUE;
         float var18 = -3.4028235E38F;
         int var19 = this.field8446.field3412;
         int var20 = this.field8446.field3449;
         if (!this.field8561) {
            this.method4391((byte)-7);
         }

         int var21 = -this.field8491 + this.field8517 >> 1;
         int var22 = this.field8463 - this.field8450 >> 1;
         int var23 = -this.field8529 + this.field8456 >> 1;
         int var24 = this.field8491 + var21;
         int var25 = this.field8450 + var22;
         int var26 = this.field8529 - -var23;
         int var27 = -(var21 << arg2) + var24;
         int var28 = -(var22 << arg2) + var25;
         int var29 = -(var23 << arg2) + var26;
         int var30 = var24 - -(var21 << arg2);
         int var31 = (var22 << arg2) + var25;
         class578.field8158[0] = var27;
         int var32 = var26 - -(var23 << arg2);
         class451.field6576[0] = var28;
         class778.field11346[0] = var29;
         class578.field8158[1] = var30;
         class451.field6576[1] = var28;
         class778.field11346[1] = var29;
         class578.field8158[2] = var27;
         class451.field6576[2] = var31;
         class778.field11346[2] = var29;
         class578.field8158[3] = var30;
         class451.field6576[3] = var31;
         class778.field11346[3] = var29;
         class578.field8158[4] = var27;
         class451.field6576[4] = var28;
         class578.field8158[5] = var30;
         class778.field11346[4] = var32;
         class451.field6576[5] = var28;
         class778.field11346[5] = var32;
         class578.field8158[6] = var27;
         class451.field6576[6] = var31;
         class778.field11346[6] = var32;
         class578.field8158[7] = var30;
         class451.field6576[7] = var31;
         class778.field11346[7] = var32;
         int var33 = 0;
         float var34;
         float var35;
         float var36;
         float var37;
         float var38;
         float var39;
         float var40;
         float var41;
         if (var8) {
            var34 = (float)class778.field11346[var33];
            var35 = (float)class578.field8158[var33];
            var36 = (float)class451.field6576[var33];
            var37 = class633.field8984 * var34 + class415.field6083 * var35 + class211.field3023 * var36 + var12;
            var38 = class627.field8950 * var34 + class432.field6347 * var36 + class376.field5492 * var35 + var13;
            var39 = class249.field3819 * var34 + class54.field796 * var36 + class217.field3109 * var35 + var11;
            if (var38 >= (float)this.field8446.field3494) {
               if (~arg3 < -1) {
                  var38 = (float)arg3;
               }

               var40 = (float)var19 * var39 / var38 + (float)this.field8446.field3408;
               var41 = (float)var20 * var37 / var38 + (float)this.field8446.field3478;
               if (var40 > var16) {
                  var16 = var40;
               }

               if (var15 > var40) {
                  var15 = var40;
               }

               if (var41 > var18) {
                  var18 = var41;
               }

               if (var17 > var41) {
                  var17 = var41;
               }

               var14 = 1;
            }

            ++var33;
         }

         while(true) {
            int var10000;
            if (var33 >= 8) {
               var10000 = var14;
               if (!var8) {
                  if (var14 != 0 && (float)arg0 > var15 && (float)arg0 < var16 && var17 < (float)arg4 && (float)arg4 < var18) {
                     if (arg1) {
                        return true;
                     }

                     if (~class425.field6223.length > ~this.field8563) {
                        class425.field6223 = new int[this.field8563];
                        class695.field10037 = new int[this.field8563];
                     }

                     label182: {
                        int var42 = 0;
                        if (var8) {
                           var10000 = this.field8487[var42];
                        } else if (~this.field8527 >= ~var42) {
                           var10000 = 0;
                           if (!var8) {
                              break label182;
                           }
                        } else {
                           var10000 = this.field8487[var42];
                        }

                        while(true) {
                           label252: {
                              float var43 = (float)var10000;
                              float var44 = (float)this.field8453[var42];
                              float var45 = (float)this.field8505[var42];
                              float var46 = class249.field3819 * var43 + class54.field796 * var44 + class217.field3109 * var45 + var11;
                              float var47 = class633.field8984 * var43 + class415.field6083 * var45 + class211.field3023 * var44 + var12;
                              float var48 = class627.field8950 * var43 + class432.field6347 * var44 + class376.field5492 * var45 + var13;
                              if (!(var48 >= (float)this.field8446.field3494)) {
                                 int var49 = this.field8523[var42];
                                 int var50 = this.field8523[var42 - -1];
                                 int var51 = var49;
                                 if (var8 || ~var49 > ~var50) {
                                    do {
                                       int var52 = this.field8497[var51] - 1;
                                       if (var52 == -1) {
                                          break;
                                       }

                                       class425.field6223[this.field8497[var51] + -1] = -999999;
                                       ++var51;
                                    } while(~var51 > ~var50);
                                 }

                                 if (!var8) {
                                    ++var42;
                                    break label252;
                                 }

                                 if (~arg3 < -1) {
                                    var48 = (float)arg3;
                                 }
                              } else if (~arg3 < -1) {
                                 var48 = (float)arg3;
                              }

                              int var53 = (int)((float)var19 * var46 / var48 + (float)this.field8446.field3408);
                              int var54 = (int)((float)var20 * var47 / var48 + (float)this.field8446.field3478);
                              int var55 = this.field8523[var42];
                              int var56 = this.field8523[var42 + 1];
                              int var57 = var55;
                              if (!var8 && ~var55 <= ~var56) {
                                 ++var42;
                              } else {
                                 while(true) {
                                    int var58 = this.field8497[var57] + -1;
                                    if (var58 == -1) {
                                       ++var42;
                                       break;
                                    }

                                    class425.field6223[var58] = var53;
                                    class695.field10037[var58] = var54;
                                    ++var57;
                                    if (~var57 <= ~var56) {
                                       ++var42;
                                       break;
                                    }
                                 }
                              }
                           }

                           if (~this.field8527 >= ~var42) {
                              var10000 = 0;
                              if (!var8) {
                                 break;
                              }
                           } else {
                              var10000 = this.field8487[var42];
                           }
                        }
                     }

                     int var59 = var10000;
                     if (var8 || ~var59 > ~this.field8550) {
                        do {
                           if (class425.field6223[this.field8447[var59]] != -999999) {
                              if (class425.field6223[this.field8437[var59]] != -999999) {
                                 if (class425.field6223[this.field8485[var59]] == -999999 && !var8) {
                                    ++var59;
                                 } else {
                                    if (this.method4394(class425.field6223[this.field8437[var59]], class695.field10037[this.field8437[var59]], -84, class695.field10037[this.field8447[var59]], arg0, arg4, class695.field10037[this.field8485[var59]], class425.field6223[this.field8447[var59]], class425.field6223[this.field8485[var59]])) {
                                       return true;
                                    }

                                    ++var59;
                                 }
                              } else {
                                 ++var59;
                              }
                           } else {
                              ++var59;
                           }
                        } while(~var59 > ~this.field8550);
                     }
                  }

                  return false;
               }
            } else {
               var10000 = class778.field11346[var33];
            }

            var34 = (float)var10000;
            var35 = (float)class578.field8158[var33];
            var36 = (float)class451.field6576[var33];
            var37 = class633.field8984 * var34 + class415.field6083 * var35 + class211.field3023 * var36 + var12;
            var38 = class627.field8950 * var34 + class432.field6347 * var36 + class376.field5492 * var35 + var13;
            var39 = class249.field3819 * var34 + class54.field796 * var36 + class217.field3109 * var35 + var11;
            if (var38 >= (float)this.field8446.field3494) {
               if (~arg3 < -1) {
                  var38 = (float)arg3;
               }

               var40 = (float)var19 * var39 / var38 + (float)this.field8446.field3408;
               var41 = (float)var20 * var37 / var38 + (float)this.field8446.field3478;
               if (var40 > var16) {
                  var16 = var40;
               }

               if (var15 > var40) {
                  var15 = var40;
               }

               if (var41 > var18) {
                  var18 = var41;
               }

               if (var17 > var41) {
                  var17 = var41;
               }

               var14 = 1;
            }

            ++var33;
         }
      } catch (RuntimeException var61) {
         throw class612.method4503(var61, field8565[70] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field8565[3] : field8565[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "g",
      descriptor = "()Z"
   )
   public final boolean method803() {
      boolean var1 = client.field10022;

      try {
         ++field8488;
         if (this.field8521 == null) {
            return true;
         } else {
            int var2 = 0;
            short var10000;
            if (var1) {
               var10000 = this.field8521[var2];
            } else if (this.field8521.length <= var2) {
               var10000 = 1;
               if (!var1) {
                  return true;
               }
            } else {
               var10000 = this.field8521[var2];
            }

            while(var10000 == -1 || this.field8446.field240.method2036(this.field8521[var2], (byte)-109)) {
               ++var2;
               if (this.field8521.length <= var2) {
                  var10000 = 1;
                  if (!var1) {
                     return true;
                  }
               } else {
                  var10000 = this.field8521[var2];
               }
            }

            return false;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field8565[55] + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "b",
      descriptor = "(I)V"
   )
   private final void method4403(int arg0) {
      boolean var2 = client.field10022;

      try {
         if (this.field8440 != null) {
            class599 var10000;
            label54: {
               this.field8446.method262(!this.field8507);
               this.field8446.method1971(42, false);
               this.field8446.method2009(arg0 ^ 1309106666, 1, class172.field2572);
               this.field8446.method1937(class172.field2572, 1, 0);
               int var3 = 0;
               if (var2) {
                  var10000 = this;
               } else if (this.field8461 <= var3) {
                  this.field8446.method1937(class77.field1238, 1, 0);
                  this.field8446.method2009(arg0 ^ 1309106666, 1, class77.field1238);
                  var10000 = this;
                  if (!var2) {
                     break label54;
                  }
               } else {
                  var10000 = this;
               }

               while(true) {
                  class138 var4 = var10000.field8440[var3];
                  class496 var5 = this.field8555[var3];
                  if (var4.field2214 && this.field8446.method237()) {
                     ++var3;
                  } else {
                     float var6 = (float)(this.field8505[var4.field2222] + this.field8505[var4.field2221] + this.field8505[var4.field2213]) * 0.3333333F;
                     float var7 = (float)(this.field8453[var4.field2221] - -this.field8453[var4.field2213] + this.field8453[var4.field2222]) * 0.3333333F;
                     float var8 = (float)(this.field8487[var4.field2221] + this.field8487[var4.field2213] - -this.field8487[var4.field2222]) * 0.3333333F;
                     float var9 = class249.field3819 * var8 + class54.field796 * var7 + class217.field3109 * var6 + class197.field2852;
                     float var10 = class633.field8984 * var8 + class415.field6083 * var6 + class211.field3023 * var7 + class51.field768;
                     float var11 = class627.field8950 * var8 + class432.field6347 * var7 + class376.field5492 * var6 + class682.field9863;
                     float var12 = (float)(1.0D / Math.sqrt((double)(var11 * var11 + var9 * var9 + var10 * var10))) * (float)var4.field2223;
                     class522 var13 = this.field8446.method1940((byte)126);
                     var13.method3893(arg0 + -1309106666, var11 - var11 * var12, (float)var5.field7071 + var9 + -(var9 * var12), var5.field7076, var4.field2212 * var5.field7078 >> 7, var4.field2218 * var5.field7073 >> 7, (float)var5.field7070 + var10 - var10 * var12);
                     var13.method3909(this.field8446.field3397, (byte)-117);
                     this.field8446.method2000(false);
                     int var14 = var5.field7069;
                     this.field8446.method2010(false, arg0 ^ 1309106665, var4.field2217, false);
                     this.field8446.method1962((byte)108, var4.field2220);
                     this.field8446.method1939(var14, (byte)-60);
                     this.field8446.method2014((byte)114);
                     ++var3;
                  }

                  if (this.field8461 <= var3) {
                     this.field8446.method1937(class77.field1238, 1, 0);
                     this.field8446.method2009(arg0 ^ 1309106666, 1, class77.field1238);
                     var10000 = this;
                     if (!var2) {
                        break;
                     }
                  } else {
                     var10000 = this;
                  }
               }
            }

            var10000.field8446.method262(true);
         }

         ++field8498;
         if (arg0 != 1309106666) {
            this.field8560 = null;
         }
      } catch (RuntimeException var16) {
         throw class612.method4503(var16, field8565[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "O",
      descriptor = "(III)V"
   )
   public final void method747(int param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!tka",
      name = "s",
      descriptor = "(I)V"
   )
   public final void method798(int arg0) {
      try {
         ++field8531;
         if (this.field8522 != null) {
            this.field8522.field3169 = class201.method1749(this.field8519, arg0, 200);
         }

         if (this.field8481 != null) {
            this.field8481.field3169 = class681.method4972(arg0, (byte)70, this.field8519);
         }

         if (this.field8552 != null) {
            this.field8552.field3169 = class388.method3023(this.field8519, arg0, (byte)40);
         }

         if (this.field8473 != null) {
            this.field8473.field3169 = class633.method4630(arg0, (byte)113, this.field8519);
         }

         this.field8478 = arg0;
         this.field8513 = true;
         if (this.field8466 != null && (this.field8478 & 65536) == 0) {
            this.field8460 = this.field8466.field3740;
            this.field8503 = this.field8466.field3738;
            this.field8500 = this.field8466.field3737;
            this.field8560 = this.field8466.field3735;
            this.field8466 = null;
         }

         this.method4406(123);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8565[29] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "a",
      descriptor = "(B[B)V"
   )
   public final void method786(byte param1, byte[] param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!tka",
      name = "a",
      descriptor = "(Ljga;BII)V"
   )
   public static final void method4404(class91 arg0, byte arg1, int arg2, int arg3) {
      try {
         int var4 = 78 % ((-20 - arg1) / 34);
         ++field8533;
         class684 var5 = arg0.method935(class54.field794, false);
         if (var5 != null) {
            class54.field794.method150(arg3, arg2, arg0.field1513 + arg3, arg2 - -arg0.field1452);
            if (~class359.field5306 <= -4) {
               class54.field794.method173(-16777216, var5, arg3, arg2);
            } else {
               class763.field10886.method1446((float)arg0.field1513 / 2.0F + (float)arg3, (float)arg0.field1452 / 2.0F + (float)arg2, 4096, 65532 & (int)(-class86.field1312) << 2, var5, arg3, arg2);
            }
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field8565[42] + (arg0 != null ? field8565[3] : field8565[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "h",
      descriptor = "(B)V"
   )
   public final void method4405(byte arg0) {
      try {
         ++field8545;
         if (this.field8522 != null) {
            this.field8522.method1917((byte)-77);
         }

         if (this.field8481 != null) {
            this.field8481.method1917((byte)-73);
         }

         if (this.field8552 != null) {
            this.field8552.method1917((byte)-121);
         }

         if (this.field8473 != null) {
            this.field8473.method1917((byte)-97);
         }

         if (this.field8543 != null) {
            this.field8543.method3864(8);
         }

         if (arg0 > -91) {
            this.method805((class502)null, (class213)null, 25);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8565[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "k",
      descriptor = "(I)V"
   )
   public final void method806(int arg0) {
      boolean var2 = client.field10022;

      try {
         ++field8462;
         int var3 = class160.field2447[arg0];
         int var4 = class160.field2446[arg0];
         int var5 = 0;
         int var6;
         if (var2) {
            var6 = this.field8487[var5] * var3 - -(this.field8505[var5] * var4) >> 14;
            this.field8487[var5] = this.field8487[var5] * var4 - this.field8505[var5] * var3 >> 14;
            this.field8505[var5] = var6;
            ++var5;
         }

         while(true) {
            while(~this.field8527 < ~var5) {
               var6 = this.field8487[var5] * var3 - -(this.field8505[var5] * var4) >> 14;
               this.field8487[var5] = this.field8487[var5] * var4 - this.field8505[var5] * var3 >> 14;
               this.field8505[var5] = var6;
               ++var5;
            }

            int var7 = 0;
            if (!var2) {
               if (!var2 && var7 >= this.field8563) {
                  this.method4401((byte)88);
                  this.method4393(9136);
                  this.field8561 = false;
                  return;
               } else {
                  do {
                     int var8 = this.field8560[var7] * var4 + this.field8500[var7] * var3 >> 14;
                     this.field8500[var7] = (short)(this.field8500[var7] * var4 + -(this.field8560[var7] * var3) >> 14);
                     this.field8560[var7] = (short)var8;
                     ++var7;
                  } while(var7 < this.field8563);

                  this.method4401((byte)88);
                  this.method4393(9136);
                  this.field8561 = false;
                  return;
               }
            }

            ++var5;
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field8565[52] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "a",
      descriptor = "(IILgga;ZII)Z"
   )
   public final boolean method804(int arg0, int arg1, class502 arg2, boolean arg3, int arg4, int arg5) {
      try {
         ++field8484;
         return this.method4402(arg0, arg3, arg4, arg5, arg1, 583635438, arg2);
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field8565[60] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8565[3] : field8565[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "f",
      descriptor = "(I)V"
   )
   private final void method4406(int arg0) {
      boolean var2 = client.field10022;

      try {
         ++field8464;
         if (this.field8513) {
            this.field8513 = false;
            if (this.field8468 == null && this.field8443 == null && this.field8440 == null && !class405.method3153(this.field8519, this.field8478, -26058)) {
               boolean var3 = false;
               boolean var4 = false;
               if (this.field8505 != null && !class391.method3037(-94, this.field8478, this.field8519)) {
                  label353: {
                     if (this.field8522 == null || this.field8522.method1919((byte)78)) {
                        var3 = true;
                        if (this.field8561) {
                           break label353;
                        }

                        this.method4391((byte)-51);
                        if (!var2) {
                           break label353;
                        }
                     }

                     this.field8513 = true;
                  }
               }

               boolean var5 = false;
               if (this.field8453 != null && !class556.method4141(this.field8478, this.field8519, 0)) {
                  label354: {
                     if (this.field8522 == null || this.field8522.method1919((byte)96)) {
                        if (!this.field8561) {
                           this.method4391((byte)85);
                        }

                        var4 = true;
                        if (!var2) {
                           break label354;
                        }
                     }

                     this.field8513 = true;
                  }
               }

               if (this.field8487 != null && !class539.method4014(this.field8519, -1, this.field8478)) {
                  label355: {
                     if (this.field8522 == null || this.field8522.method1919((byte)68)) {
                        var5 = true;
                        if (this.field8561) {
                           break label355;
                        }

                        this.method4391((byte)-59);
                        if (!var2) {
                           break label355;
                        }
                     }

                     this.field8513 = true;
                  }
               }

               if (var4) {
                  this.field8453 = null;
               }

               if (var3) {
                  this.field8505 = null;
               }

               if (var5) {
                  this.field8487 = null;
               }
            }

            if (this.field8497 != null && this.field8505 == null && this.field8453 == null && this.field8487 == null) {
               this.field8523 = null;
               this.field8497 = null;
            }

            if (this.field8460 != null && !class54.method576(-90, this.field8519, this.field8478)) {
               label276: {
                  label275: {
                     boolean var10000;
                     if ((55 & this.field8519) != 0) {
                        if (this.field8473 == null || this.field8473.method1919((byte)123)) {
                           break label275;
                        }

                        var10000 = false;
                     } else {
                        if (this.field8552 == null || this.field8552.method1919((byte)55)) {
                           break label275;
                        }

                        var10000 = false;
                     }

                     if (!var10000) {
                        this.field8513 = true;
                        if (!var2) {
                           break label276;
                        }
                     }
                  }

                  this.field8460 = null;
                  this.field8560 = this.field8503 = this.field8500 = null;
               }
            }

            if (this.field8499 != null && !class86.method900(this.field8478, -1, this.field8519)) {
               label258: {
                  if (this.field8552 != null && !this.field8552.method1919((byte)99)) {
                     this.field8513 = true;
                     if (!var2) {
                        break label258;
                     }
                  }

                  this.field8499 = null;
               }
            }

            if (this.field8540 != null && !class431.method3359(this.field8519, true, this.field8478)) {
               label356: {
                  if (this.field8552 == null || this.field8552.method1919((byte)112)) {
                     this.field8540 = null;
                     if (!var2) {
                        break label356;
                     }
                  }

                  this.field8513 = true;
               }
            }

            if (this.field8556 != null && !class773.method5575(this.field8478, this.field8519, 93)) {
               label240: {
                  if (this.field8481 != null && !this.field8481.method1919((byte)118)) {
                     this.field8513 = true;
                     if (!var2) {
                        break label240;
                     }
                  }

                  this.field8556 = this.field8477 = null;
               }
            }

            if (this.field8521 != null && !class164.method1545(false, this.field8478, this.field8519)) {
               label357: {
                  if (this.field8552 == null || this.field8552.method1919((byte)92)) {
                     this.field8521 = null;
                     if (!var2) {
                        break label357;
                     }
                  }

                  this.field8513 = true;
               }
            }

            if (this.field8447 != null && !class537.method4007(-36, this.field8478, this.field8519)) {
               label359: {
                  if (this.field8543 != null && !this.field8543.method3862(false) || this.field8552 != null && !this.field8552.method1919((byte)79)) {
                     this.field8513 = true;
                     if (!var2) {
                        break label359;
                     }
                  }

                  this.field8447 = this.field8437 = this.field8485 = null;
               }
            }

            if (this.field8458 != null) {
               label208: {
                  if (this.field8522 != null && !this.field8522.method1919((byte)89)) {
                     this.field8513 = true;
                     if (!var2) {
                        break label208;
                     }
                  }

                  this.field8458 = null;
               }
            }

            if (this.field8532 != null) {
               label201: {
                  if (this.field8552 != null && !this.field8552.method1919((byte)43)) {
                     this.field8513 = true;
                     if (!var2) {
                        break label201;
                     }
                  }

                  this.field8532 = null;
               }
            }

            if (this.field8495 != null && !class290.method2404(this.field8478, this.field8519, 1)) {
               this.field8525 = null;
               this.field8495 = null;
            }

            if (this.field8454 != null && !class394.method3056(this.field8478, (byte)2, this.field8519)) {
               this.field8514 = null;
               this.field8454 = null;
            }

            int var6 = 51 / ((-35 - arg0) / 63);
            if (this.field8546 != null && !class769.method5537(this.field8478, 87, this.field8519)) {
               this.field8546 = null;
            }

            if (this.field8551 != null && (2048 & this.field8478) == 0 && (262144 & this.field8478) == 0) {
               this.field8515 = null;
               this.field8542 = null;
               this.field8551 = null;
            }
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field8565[26] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "C",
      descriptor = "(I)V"
   )
   public final void method807(int arg0) {
      try {
         this.field8444 = (short)arg0;
         ++field8509;
         this.method4407((byte)-59);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8565[66] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "a",
      descriptor = "(Lgga;Lrh;I)V"
   )
   public final void method805(class502 arg0, class213 arg1, int arg2) {
      boolean var4 = client.field10022;

      try {
         ++field8476;
         if (this.field8563 != 0) {
            class522 var5 = this.field8446.field3396;
            if (!this.field8561) {
               this.method4391((byte)101);
            }

            class522 var6;
            float var9;
            float var10;
            label140: {
               var6 = (class522)arg0;
               class432.field6347 = var5.field7388 * var6.field7339 + var5.field7376 * var6.field7391 + var5.field7339 * var6.field7338;
               class682.field9863 = var5.field7388 * var6.field7352 + var5.field7376 * var6.field7377 + var5.field7339 * var6.field7356 + var5.field7352;
               float var7 = (float)this.field8450 * class432.field6347 + class682.field9863;
               float var8 = (float)this.field8463 * class432.field6347 + class682.field9863;
               if (!(var7 > var8)) {
                  var9 = (float)(-this.field8439) + var7;
                  var10 = (float)this.field8439 + var8;
                  if (!var4) {
                     break label140;
                  }
               }

               var9 = var8 - (float)this.field8439;
               var10 = (float)this.field8439 + var7;
            }

            if (!(this.field8446.field3433 <= var9)) {
               if (!(var10 <= (float)this.field8446.field3494)) {
                  float var13;
                  float var14;
                  label132: {
                     class197.field2852 = var5.field7384 * var6.field7352 + var5.field7391 * var6.field7356 + var5.field7350 * var6.field7377 + var5.field7377;
                     class54.field796 = var5.field7384 * var6.field7339 + var5.field7391 * var6.field7338 + var5.field7350 * var6.field7391;
                     float var11 = (float)this.field8450 * class54.field796 + class197.field2852;
                     float var12 = (float)this.field8463 * class54.field796 + class197.field2852;
                     if (!(var12 < var11)) {
                        var13 = ((float)this.field8439 + var12) * (float)this.field8446.field3412;
                        var14 = (var11 - (float)this.field8439) * (float)this.field8446.field3412;
                        if (!var4) {
                           break label132;
                        }
                     }

                     var14 = (var12 - (float)this.field8439) * (float)this.field8446.field3412;
                     var13 = ((float)this.field8439 + var11) * (float)this.field8446.field3412;
                  }

                  if (!(var14 / var10 >= this.field8446.field3436)) {
                     if (!(this.field8446.field3485 >= var13 / var10)) {
                        float var17;
                        float var18;
                        label124: {
                           class211.field3023 = var5.field7363 * var6.field7339 + var5.field7344 * var6.field7391 + var5.field7338 * var6.field7338;
                           class51.field768 = var5.field7363 * var6.field7352 + var5.field7344 * var6.field7377 + var5.field7338 * var6.field7356 + var5.field7356;
                           float var15 = (float)this.field8450 * class211.field3023 + class51.field768;
                           float var16 = (float)this.field8463 * class211.field3023 + class51.field768;
                           if (var16 < var15) {
                              var17 = (var16 - (float)this.field8439) * (float)this.field8446.field3449;
                              var18 = ((float)this.field8439 + var15) * (float)this.field8446.field3449;
                              if (!var4) {
                                 break label124;
                              }
                           }

                           var17 = ((float)(-this.field8439) + var15) * (float)this.field8446.field3449;
                           var18 = ((float)this.field8439 + var16) * (float)this.field8446.field3449;
                        }

                        if (!(var17 / var10 >= this.field8446.field3453)) {
                           if (!(this.field8446.field3459 >= var18 / var10)) {
                              if (arg1 != null || this.field8440 != null) {
                                 class217.field3109 = var5.field7384 * var6.field7376 + var5.field7391 * var6.field7344 + var5.field7350 * var6.field7350;
                                 class376.field5492 = var5.field7388 * var6.field7376 + var5.field7376 * var6.field7350 + var5.field7339 * var6.field7344;
                                 class415.field6083 = var5.field7363 * var6.field7376 + var5.field7344 * var6.field7350 + var5.field7338 * var6.field7344;
                                 class627.field8950 = var5.field7388 * var6.field7388 + var5.field7376 * var6.field7384 + var5.field7339 * var6.field7363;
                                 class633.field8984 = var5.field7363 * var6.field7388 + var5.field7344 * var6.field7384 + var5.field7338 * var6.field7363;
                                 class249.field3819 = var5.field7384 * var6.field7388 + var5.field7391 * var6.field7363 + var5.field7350 * var6.field7384;
                              }

                              if (arg1 != null) {
                                 boolean var19;
                                 boolean var20;
                                 int var21;
                                 int var22;
                                 int var23;
                                 int var24;
                                 int var25;
                                 label109: {
                                    var19 = false;
                                    var20 = true;
                                    var21 = this.field8517 + this.field8491 >> 1;
                                    var22 = this.field8529 + this.field8456 >> 1;
                                    var23 = (int)((float)var22 * class249.field3819 + (float)this.field8450 * class54.field796 + (float)var21 * class217.field3109 + class197.field2852);
                                    var24 = (int)((float)var22 * class633.field8984 + (float)this.field8450 * class211.field3023 + (float)var21 * class415.field6083 + class51.field768);
                                    var25 = (int)((float)var22 * class627.field8950 + (float)this.field8450 * class432.field6347 + (float)var21 * class376.field5492 + class682.field9863);
                                    if (~var25 <= ~this.field8446.field3494) {
                                       arg1.field3055 = this.field8446.field3478 - -(this.field8446.field3449 * var24 / var25);
                                       arg1.field3054 = this.field8446.field3412 * var23 / var25 + this.field8446.field3408;
                                       if (!var4) {
                                          break label109;
                                       }
                                    }

                                    var19 = true;
                                 }

                                 int var26;
                                 int var27;
                                 int var28;
                                 label104: {
                                    var26 = (int)((float)var22 * class249.field3819 + (float)this.field8463 * class54.field796 + (float)var21 * class217.field3109 + class197.field2852);
                                    var27 = (int)((float)var22 * class633.field8984 + (float)this.field8463 * class211.field3023 + (float)var21 * class415.field6083 + class51.field768);
                                    var28 = (int)((float)var22 * class627.field8950 + (float)this.field8463 * class432.field6347 + (float)var21 * class376.field5492 + class682.field9863);
                                    if (~this.field8446.field3494 < ~var28) {
                                       var19 = true;
                                       if (!var4) {
                                          break label104;
                                       }
                                    }

                                    arg1.field3056 = this.field8446.field3408 - -(this.field8446.field3412 * var26 / var28);
                                    arg1.field3051 = this.field8446.field3449 * var27 / var28 + this.field8446.field3478;
                                 }

                                 if (var19) {
                                    label158: {
                                       if (this.field8446.field3494 > var25 && ~this.field8446.field3494 < ~var28) {
                                          var20 = false;
                                          if (!var4) {
                                             break label158;
                                          }
                                       }

                                       if (~var25 <= ~this.field8446.field3494) {
                                          if (~this.field8446.field3494 >= ~var28) {
                                             break label158;
                                          }

                                          int var29 = (-this.field8446.field3494 + var25 << 16) / (-var28 + var25);
                                          int var30 = var23 - -((-var26 + var23) * var29 >> 16);
                                          arg1.field3054 = this.field8446.field3412 * var30 / this.field8446.field3494 + this.field8446.field3408;
                                          int var31 = var24 - -((-var27 + var24) * var29 >> 16);
                                          arg1.field3055 = this.field8446.field3449 * var31 / this.field8446.field3494 + this.field8446.field3478;
                                          if (!var4) {
                                             break label158;
                                          }
                                       }

                                       int var32 = (-this.field8446.field3494 + var28 << 16) / (-var25 + var28);
                                       int var33 = var26 - -((-var23 + var26) * var32 >> 16);
                                       arg1.field3054 = this.field8446.field3412 * var33 / this.field8446.field3494 + this.field8446.field3408;
                                       int var34 = var27 - -((-var24 + var27) * var32 >> 16);
                                       arg1.field3055 = this.field8446.field3449 * var34 / this.field8446.field3494 + this.field8446.field3478;
                                    }
                                 }

                                 if (var20) {
                                    label85: {
                                       if (~var25 >= ~var28) {
                                          arg1.field3052 = this.field8446.field3408 - (-((var26 - -this.field8439) * this.field8446.field3412 / var28) + arg1.field3056);
                                          if (!var4) {
                                             break label85;
                                          }
                                       }

                                       arg1.field3052 = (this.field8439 + var23) * this.field8446.field3412 / var25 + this.field8446.field3408 + -arg1.field3054;
                                    }

                                    arg1.field3053 = true;
                                 }
                              }

                              this.field8446.method1955(1);
                              this.field8446.method1938(var6, (byte)-70);
                              this.method4390((byte)-51);
                              this.method4403(1309106666);
                           }
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var36) {
         throw class612.method4503(var36, field8565[59] + (arg0 != null ? field8565[3] : field8565[2]) + ',' + (arg1 != null ? field8565[3] : field8565[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "b",
      descriptor = "(B)V"
   )
   private final void method4407(byte arg0) {
      try {
         if (arg0 > -49) {
            this.field8562 = 45;
         }

         if (this.field8552 != null) {
            this.field8552.field3165 = false;
         }

         ++field8438;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8565[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "<init>",
      descriptor = "(Ldaa;IIZZ)V"
   )
   public class599(class226 arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
      try {
         this.field8478 = arg1;
         this.field8446 = arg0;
         this.field8541 = arg4;
         this.field8519 = arg2;
         if (arg3 || class294.method2459(this.field8478, (byte)-58, this.field8519)) {
            this.field8522 = new class223(class201.method1749(this.field8519, this.field8478, 200));
         }

         if (arg3 || class488.method3714(1, this.field8478, this.field8519)) {
            this.field8481 = new class223(class681.method4972(this.field8478, (byte)70, this.field8519));
         }

         if (arg3 || class34.method389(this.field8519, (byte)66, this.field8478)) {
            this.field8552 = new class223(class388.method3023(this.field8519, this.field8478, (byte)101));
         }

         if (arg3 || class46.method507(this.field8519, false, this.field8478)) {
            this.field8473 = new class223(class633.method4630(this.field8478, (byte)118, this.field8519));
         }

         if (arg3 || class722.method5230(this.field8478, this.field8519, -118)) {
            this.field8543 = new class513(class23.method303((byte)111, this.field8519, this.field8478));
         }

      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field8565[32] + (arg0 != null ? field8565[3] : field8565[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4408(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 118);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4409(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 120;
            break;
         case 1:
            var10005 = 25;
            break;
         case 2:
            var10005 = 20;
            break;
         case 3:
            var10005 = 39;
            break;
         default:
            var10005 = 118;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
