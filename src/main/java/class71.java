import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class71 extends class761 {
   @OriginalMember(
      owner = "client!rv",
      name = "pc",
      descriptor = "Z"
   )
   private boolean field1060;
   @OriginalMember(
      owner = "client!rv",
      name = "db",
      descriptor = "I"
   )
   private int field1059;
   @OriginalMember(
      owner = "client!rv",
      name = "Dc",
      descriptor = "I"
   )
   private int field1077;
   @OriginalMember(
      owner = "client!rv",
      name = "bb",
      descriptor = "Z"
   )
   private boolean field1110;
   @OriginalMember(
      owner = "client!rv",
      name = "M",
      descriptor = "Z"
   )
   private boolean field1050;
   @OriginalMember(
      owner = "client!rv",
      name = "qb",
      descriptor = "Z"
   )
   private boolean field1056;
   @OriginalMember(
      owner = "client!rv",
      name = "gb",
      descriptor = "I"
   )
   private int field1066;
   @OriginalMember(
      owner = "client!rv",
      name = "Mb",
      descriptor = "I"
   )
   private int field1114;
   @OriginalMember(
      owner = "client!rv",
      name = "sc",
      descriptor = "I"
   )
   private int field1142;
   @OriginalMember(
      owner = "client!rv",
      name = "w",
      descriptor = "Laea;"
   )
   private class678 field1063;
   @OriginalMember(
      owner = "client!rv",
      name = "J",
      descriptor = "Lwu;"
   )
   private class451 field1120;
   @OriginalMember(
      owner = "client!rv",
      name = "P",
      descriptor = "Lwu;"
   )
   private class451 field1034;
   @OriginalMember(
      owner = "client!rv",
      name = "Ub",
      descriptor = "Lwu;"
   )
   private class451 field1116;
   @OriginalMember(
      owner = "client!rv",
      name = "ac",
      descriptor = "Lwu;"
   )
   private class451 field1045;
   @OriginalMember(
      owner = "client!rv",
      name = "u",
      descriptor = "Lcb;"
   )
   private class699 field1115;
   @OriginalMember(
      owner = "client!rv",
      name = "Eb",
      descriptor = "I"
   )
   private int field1054;
   @OriginalMember(
      owner = "client!rv",
      name = "vc",
      descriptor = "I"
   )
   private int field1129;
   @OriginalMember(
      owner = "client!rv",
      name = "p",
      descriptor = "[I"
   )
   private int[] field1038;
   @OriginalMember(
      owner = "client!rv",
      name = "Tb",
      descriptor = "[S"
   )
   private short[] field1090;
   @OriginalMember(
      owner = "client!rv",
      name = "U",
      descriptor = "[I"
   )
   private int[] field1094;
   @OriginalMember(
      owner = "client!rv",
      name = "Fb",
      descriptor = "[I"
   )
   private int[] field1039;
   @OriginalMember(
      owner = "client!rv",
      name = "vb",
      descriptor = "[I"
   )
   private int[] field1065;
   @OriginalMember(
      owner = "client!rv",
      name = "oc",
      descriptor = "[Lhaa;"
   )
   private class3[] field1153;
   @OriginalMember(
      owner = "client!rv",
      name = "q",
      descriptor = "[Ldga;"
   )
   private class712[] field1139;
   @OriginalMember(
      owner = "client!rv",
      name = "fc",
      descriptor = "I"
   )
   private int field1105;
   @OriginalMember(
      owner = "client!rv",
      name = "tb",
      descriptor = "[Loq;"
   )
   private class152[] field1103;
   @OriginalMember(
      owner = "client!rv",
      name = "r",
      descriptor = "[Lcg;"
   )
   private class750[] field1041;
   @OriginalMember(
      owner = "client!rv",
      name = "mb",
      descriptor = "[S"
   )
   private short[] field1079;
   @OriginalMember(
      owner = "client!rv",
      name = "Vb",
      descriptor = "[S"
   )
   private short[] field1109;
   @OriginalMember(
      owner = "client!rv",
      name = "O",
      descriptor = "[S"
   )
   private short[] field1084;
   @OriginalMember(
      owner = "client!rv",
      name = "Ib",
      descriptor = "[S"
   )
   private short[] field1043;
   @OriginalMember(
      owner = "client!rv",
      name = "K",
      descriptor = "S"
   )
   private short field1089;
   @OriginalMember(
      owner = "client!rv",
      name = "E",
      descriptor = "[F"
   )
   private float[] field1101;
   @OriginalMember(
      owner = "client!rv",
      name = "l",
      descriptor = "S"
   )
   private short field1140;
   @OriginalMember(
      owner = "client!rv",
      name = "n",
      descriptor = "[S"
   )
   private short[] field1107;
   @OriginalMember(
      owner = "client!rv",
      name = "Jb",
      descriptor = "[S"
   )
   private short[] field1117;
   @OriginalMember(
      owner = "client!rv",
      name = "Ob",
      descriptor = "[S"
   )
   private short[] field1074;
   @OriginalMember(
      owner = "client!rv",
      name = "Db",
      descriptor = "[S"
   )
   private short[] field1097;
   @OriginalMember(
      owner = "client!rv",
      name = "dc",
      descriptor = "[S"
   )
   private short[] field1095;
   @OriginalMember(
      owner = "client!rv",
      name = "jb",
      descriptor = "[B"
   )
   private byte[] field1052;
   @OriginalMember(
      owner = "client!rv",
      name = "G",
      descriptor = "[B"
   )
   private byte[] field1155;
   @OriginalMember(
      owner = "client!rv",
      name = "Cb",
      descriptor = "[F"
   )
   private float[] field1144;
   @OriginalMember(
      owner = "client!rv",
      name = "X",
      descriptor = "[S"
   )
   private short[] field1106;
   @OriginalMember(
      owner = "client!rv",
      name = "cb",
      descriptor = "[I"
   )
   private int[] field1123;
   @OriginalMember(
      owner = "client!rv",
      name = "Ac",
      descriptor = "[[I"
   )
   private int[][] field1058;
   @OriginalMember(
      owner = "client!rv",
      name = "z",
      descriptor = "[[I"
   )
   private int[][] field1124;
   @OriginalMember(
      owner = "client!rv",
      name = "lb",
      descriptor = "[[I"
   )
   private int[][] field1035;
   @OriginalMember(
      owner = "client!rv",
      name = "Gc",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1160 = new String[]{method814(method813("t\u001a\u0012kv.")), method814(method813("t\u001a\u0012\u007fu.")), method814(method813("h\u0019PT")), method814(method813("t\u001a\u0012m\u001f")), method814(method813("}B\u0012\u0016J")), method814(method813("t\u001a\u0012\u007f\u001f")), method814(method813("t\u001a\u0012o\u001f")), method814(method813("t\u001a\u0012q\u001f")), method814(method813("t\u001a\u0012lv.")), method814(method813("t\u001a\u0012}\u001f")), method814(method813("t\u001a\u0012tu.")), method814(method813("t\u001a\u0012h\u001f")), method814(method813("t\u001a\u0012vv.")), method814(method813("t\u001a\u0012zu.")), method814(method813("t\u001a\u0012}v.")), method814(method813("t\u001a\u0012r\u001f")), method814(method813("t\u001a\u0012z\u001f")), method814(method813("t\u001a\u0012jv.")), method814(method813("t\u001a\u0012ov.")), method814(method813("t\u001a\u0012zv.")), method814(method813("t\u001a\u0012BV.")), method814(method813("t\u001a\u0012n\u001f")), method814(method813("t\u001a\u0012{v.")), method814(method813("t\u001a\u0012~\u001f")), method814(method813("t\u001a\u0012nv.")), method814(method813("t\u001a\u0012l\u001f")), method814(method813("t\u001a\u0012QV.")), method814(method813("t\u001a\u0012MV.")), method814(method813("t\u001a\u0012w\u001f")), method814(method813("t\u001a\u0012t\u001f")), method814(method813("t\u001a\u0012N\u001f")), method814(method813("t\u001a\u0012ZV.")), method814(method813("t\u001a\u0012|u.")), method814(method813("t\u001a\u0012{\u001f")), method814(method813("t\u001a\u0012tv.")), method814(method813("t\u001a\u0012s\u001f")), method814(method813("t\u001a\u0012~v.")), method814(method813("t\u001a\u0012Y\u001f")), method814(method813("t\u001a\u0012S\u001f")), method814(method813("t\u001a\u0012hv.")), method814(method813("t\u001a\u0012H\u001f")), method814(method813("t\u001a\u0012K\u001f")), method814(method813("t\u001a\u0012}u.")), method814(method813("t\u001a\u0012uv.")), method814(method813("t\u001a\u0012OV.")), method814(method813("t\u001a\u0012|v.")), method814(method813("t\u001a\u0012J\u001f")), method814(method813("t\u001a\u0012\u0004^h\u0005H\u0006\u001f")), method814(method813("t\u001a\u0012YV.")), method814(method813("t\u001a\u0012sv.")), method814(method813("t\u001a\u0012wv.")), method814(method813("t\u001a\u0012ru.")), method814(method813("t\u001a\u0012qu.")), method814(method813("t\u001a\u0012^V.")), method814(method813("t\u001a\u0012mv.")), method814(method813("t\u001a\u0012yu.")), method814(method813("t\u001a\u0012uu.")), method814(method813("t\u001a\u0012|\u001f")), method814(method813("t\u001a\u0012su.")), method814(method813("t\u001a\u0012VV.")), method814(method813("t\u001a\u0012UV.")), method814(method813("t\u001a\u0012~u.")), method814(method813("t\u001a\u0012\\V.")), method814(method813("t\u001a\u0012p\u001f")), method814(method813("t\u001a\u0012pv.")), method814(method813("t\u001a\u0012pu.")), method814(method813("t\u001a\u0012iv.")), method814(method813("n\t]\\^e\u0003RKhv\u001e]ARt")), method814(method813("n\u0005RLhn\t]\\^e\u0003RK")), method814(method813("t\u001a\u0012j\u001f")), method814(method813("k\rL\\Xr\u001f")), method814(method813("k\rL^[g\u000b")), method814(method813("n\u0005RLhk\rLUVt\u0007YJD")), method814(method813("n\t]\\^e\u0003RKhv\u0007")), method814(method813("i\u0018T]Ej\tJ][")), method814(method813("n\u0005HUVt\u0007O")), method814(method813("n\u0005HZVt3X]Qg\u0019PL")), method814(method813("n\u0005RLhk\rL]Sa\t")), method814(method813("`\u0000SWEu\u0004]\\Xq\u001f")), method814(method813("e\u001eSKD")), method814(method813("e\u0003QHVu\u001f")), method814(method813("u\u000fNW[j\u000e]J")), method814(method813("h\rQ]ho\u000fSVD")), method814(method813("r\u0005Q]Ed\rNgSc\n]M[r")), method814(method813("t\u001a\u0012{u."))};
   @OriginalMember(
      owner = "client!rv",
      name = "mc",
      descriptor = "Lfm;"
   )
   public static class164 field1138 = new class164(17, 4);
   @OriginalMember(
      owner = "client!rv",
      name = "k",
      descriptor = "Lhha;"
   )
   public static class724 field1159 = new class724(139, -2);
   @OriginalMember(
      owner = "client!rv",
      name = "C",
      descriptor = "B"
   )
   private byte field1136;
   @OriginalMember(
      owner = "client!rv",
      name = "qc",
      descriptor = "I"
   )
   public static int field1036;
   @OriginalMember(
      owner = "client!rv",
      name = "Nb",
      descriptor = "I"
   )
   public static int field1037;
   @OriginalMember(
      owner = "client!rv",
      name = "wb",
      descriptor = "I"
   )
   public static int field1040;
   @OriginalMember(
      owner = "client!rv",
      name = "v",
      descriptor = "I"
   )
   public static int field1042;
   @OriginalMember(
      owner = "client!rv",
      name = "Kb",
      descriptor = "I"
   )
   public static int field1044;
   @OriginalMember(
      owner = "client!rv",
      name = "y",
      descriptor = "I"
   )
   public static int field1046;
   @OriginalMember(
      owner = "client!rv",
      name = "xb",
      descriptor = "I"
   )
   public static int field1049;
   @OriginalMember(
      owner = "client!rv",
      name = "Fc",
      descriptor = "I"
   )
   public static int field1051;
   @OriginalMember(
      owner = "client!rv",
      name = "rc",
      descriptor = "I"
   )
   public static int field1053;
   @OriginalMember(
      owner = "client!rv",
      name = "x",
      descriptor = "I"
   )
   public static int field1055;
   @OriginalMember(
      owner = "client!rv",
      name = "A",
      descriptor = "I"
   )
   public static int field1057;
   @OriginalMember(
      owner = "client!rv",
      name = "t",
      descriptor = "I"
   )
   public static int field1061;
   @OriginalMember(
      owner = "client!rv",
      name = "nb",
      descriptor = "I"
   )
   public static int field1062;
   @OriginalMember(
      owner = "client!rv",
      name = "wc",
      descriptor = "I"
   )
   public static int field1067;
   @OriginalMember(
      owner = "client!rv",
      name = "Wb",
      descriptor = "I"
   )
   public static int field1068;
   @OriginalMember(
      owner = "client!rv",
      name = "tc",
      descriptor = "I"
   )
   public static int field1069;
   @OriginalMember(
      owner = "client!rv",
      name = "B",
      descriptor = "I"
   )
   public static int field1070;
   @OriginalMember(
      owner = "client!rv",
      name = "Rb",
      descriptor = "I"
   )
   public static int field1072;
   @OriginalMember(
      owner = "client!rv",
      name = "yb",
      descriptor = "I"
   )
   public static int field1073;
   @OriginalMember(
      owner = "client!rv",
      name = "eb",
      descriptor = "I"
   )
   public static int field1075;
   @OriginalMember(
      owner = "client!rv",
      name = "Hb",
      descriptor = "I"
   )
   public static int field1076;
   @OriginalMember(
      owner = "client!rv",
      name = "cc",
      descriptor = "I"
   )
   public static int field1080;
   @OriginalMember(
      owner = "client!rv",
      name = "o",
      descriptor = "I"
   )
   public static int field1081;
   @OriginalMember(
      owner = "client!rv",
      name = "kb",
      descriptor = "I"
   )
   public static int field1082;
   @OriginalMember(
      owner = "client!rv",
      name = "R",
      descriptor = "I"
   )
   public static int field1083;
   @OriginalMember(
      owner = "client!rv",
      name = "Lb",
      descriptor = "I"
   )
   public static int field1085;
   @OriginalMember(
      owner = "client!rv",
      name = "Bb",
      descriptor = "I"
   )
   public static int field1086;
   @OriginalMember(
      owner = "client!rv",
      name = "kc",
      descriptor = "I"
   )
   public static int field1087;
   @OriginalMember(
      owner = "client!rv",
      name = "W",
      descriptor = "I"
   )
   public static int field1088;
   @OriginalMember(
      owner = "client!rv",
      name = "I",
      descriptor = "I"
   )
   public static int field1091;
   @OriginalMember(
      owner = "client!rv",
      name = "Ec",
      descriptor = "I"
   )
   public static int field1092;
   @OriginalMember(
      owner = "client!rv",
      name = "jc",
      descriptor = "I"
   )
   public static int field1093;
   @OriginalMember(
      owner = "client!rv",
      name = "m",
      descriptor = "I"
   )
   public static int field1096;
   @OriginalMember(
      owner = "client!rv",
      name = "ib",
      descriptor = "I"
   )
   public static int field1098;
   @OriginalMember(
      owner = "client!rv",
      name = "xc",
      descriptor = "I"
   )
   public static int field1099;
   @OriginalMember(
      owner = "client!rv",
      name = "ub",
      descriptor = "I"
   )
   public static int field1102;
   @OriginalMember(
      owner = "client!rv",
      name = "zb",
      descriptor = "I"
   )
   public static int field1104;
   @OriginalMember(
      owner = "client!rv",
      name = "ic",
      descriptor = "I"
   )
   public static int field1108;
   @OriginalMember(
      owner = "client!rv",
      name = "Qb",
      descriptor = "I"
   )
   public static int field1113;
   @OriginalMember(
      owner = "client!rv",
      name = "Cc",
      descriptor = "I"
   )
   public static int field1118;
   @OriginalMember(
      owner = "client!rv",
      name = "uc",
      descriptor = "I"
   )
   public static int field1119;
   @OriginalMember(
      owner = "client!rv",
      name = "ob",
      descriptor = "I"
   )
   public static int field1122;
   @OriginalMember(
      owner = "client!rv",
      name = "zc",
      descriptor = "I"
   )
   public static int field1125;
   @OriginalMember(
      owner = "client!rv",
      name = "nc",
      descriptor = "I"
   )
   public static int field1126;
   @OriginalMember(
      owner = "client!rv",
      name = "H",
      descriptor = "I"
   )
   public static int field1128;
   @OriginalMember(
      owner = "client!rv",
      name = "Zb",
      descriptor = "I"
   )
   public static int field1130;
   @OriginalMember(
      owner = "client!rv",
      name = "Sb",
      descriptor = "I"
   )
   public static int field1131;
   @OriginalMember(
      owner = "client!rv",
      name = "Gb",
      descriptor = "I"
   )
   public static int field1132;
   @OriginalMember(
      owner = "client!rv",
      name = "Pb",
      descriptor = "I"
   )
   public static int field1133;
   @OriginalMember(
      owner = "client!rv",
      name = "Q",
      descriptor = "I"
   )
   public static int field1135;
   @OriginalMember(
      owner = "client!rv",
      name = "pb",
      descriptor = "I"
   )
   public static int field1137;
   @OriginalMember(
      owner = "client!rv",
      name = "D",
      descriptor = "I"
   )
   public static int field1141;
   @OriginalMember(
      owner = "client!rv",
      name = "ec",
      descriptor = "I"
   )
   public static int field1143;
   @OriginalMember(
      owner = "client!rv",
      name = "yc",
      descriptor = "I"
   )
   public static int field1145;
   @OriginalMember(
      owner = "client!rv",
      name = "Z",
      descriptor = "I"
   )
   public static int field1146;
   @OriginalMember(
      owner = "client!rv",
      name = "ab",
      descriptor = "I"
   )
   public static int field1147;
   @OriginalMember(
      owner = "client!rv",
      name = "hb",
      descriptor = "I"
   )
   public static int field1148;
   @OriginalMember(
      owner = "client!rv",
      name = "sb",
      descriptor = "I"
   )
   public static int field1149;
   @OriginalMember(
      owner = "client!rv",
      name = "Bc",
      descriptor = "I"
   )
   public static int field1150;
   @OriginalMember(
      owner = "client!rv",
      name = "bc",
      descriptor = "I"
   )
   public static int field1151;
   @OriginalMember(
      owner = "client!rv",
      name = "S",
      descriptor = "I"
   )
   public static int field1152;
   @OriginalMember(
      owner = "client!rv",
      name = "rb",
      descriptor = "I"
   )
   public static int field1154;
   @OriginalMember(
      owner = "client!rv",
      name = "fb",
      descriptor = "I"
   )
   public static int field1156;
   @OriginalMember(
      owner = "client!rv",
      name = "L",
      descriptor = "I"
   )
   public static int field1157;
   @OriginalMember(
      owner = "client!rv",
      name = "N",
      descriptor = "I"
   )
   public static int field1158;
   @OriginalMember(
      owner = "client!rv",
      name = "Yb",
      descriptor = "Luba;"
   )
   private class516 field1047;
   @OriginalMember(
      owner = "client!rv",
      name = "hc",
      descriptor = "Ltk;"
   )
   private class645 field1127;
   @OriginalMember(
      owner = "client!rv",
      name = "Xb",
      descriptor = "Lss;"
   )
   private class723 field1112;
   @OriginalMember(
      owner = "client!rv",
      name = "V",
      descriptor = "S"
   )
   private short field1048;
   @OriginalMember(
      owner = "client!rv",
      name = "gc",
      descriptor = "S"
   )
   private short field1064;
   @OriginalMember(
      owner = "client!rv",
      name = "s",
      descriptor = "S"
   )
   private short field1071;
   @OriginalMember(
      owner = "client!rv",
      name = "T",
      descriptor = "S"
   )
   private short field1078;
   @OriginalMember(
      owner = "client!rv",
      name = "lc",
      descriptor = "S"
   )
   private short field1100;
   @OriginalMember(
      owner = "client!rv",
      name = "F",
      descriptor = "S"
   )
   private short field1111;
   @OriginalMember(
      owner = "client!rv",
      name = "Ab",
      descriptor = "S"
   )
   private short field1121;
   @OriginalMember(
      owner = "client!rv",
      name = "Y",
      descriptor = "S"
   )
   private short field1134;

   @OriginalMember(
      owner = "client!rv",
      name = "O",
      descriptor = "(III)V"
   )
   public final void method747(int arg0, int arg1, int arg2) {
      boolean var4 = client.field10022;

      try {
         int var5 = 0;
         if (var4) {
            if (arg0 != 128) {
               this.field1094[var5] = this.field1094[var5] * arg0 >> 7;
            }

            if (arg1 != 128) {
               this.field1039[var5] = this.field1039[var5] * arg1 >> 7;
            }

            if (~arg2 != -129) {
               this.field1065[var5] = this.field1065[var5] * arg2 >> 7;
               ++var5;
            } else {
               ++var5;
            }
         }

         while(true) {
            while(~var5 > ~this.field1142) {
               if (arg0 != 128) {
                  this.field1094[var5] = this.field1094[var5] * arg0 >> 7;
               }

               if (arg1 != 128) {
                  this.field1039[var5] = this.field1039[var5] * arg1 >> 7;
               }

               if (~arg2 != -129) {
                  this.field1065[var5] = this.field1065[var5] * arg2 >> 7;
                  ++var5;
               } else {
                  ++var5;
               }
            }

            ++field1083;
            if (!var4) {
               if (this.field1120 != null) {
                  this.field1120.field6574 = null;
               }

               this.field1056 = false;
               return;
            }

            this.field1065[var5] = this.field1065[var5] * arg2 >> 7;
            ++var5;
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field1160[28] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "a",
      descriptor = "(IILgga;ZI)Z"
   )
   public final boolean method748(int arg0, int arg1, class502 arg2, boolean arg3, int arg4) {
      try {
         ++field1150;
         return this.method802(arg3, arg4, arg2, arg0, -1, arg1, (byte)123);
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field1160[19] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1160[4] : field1160[2]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "da",
      descriptor = "()I"
   )
   public final int method749() {
      try {
         ++field1072;
         return this.field1140;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1160[62] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "a",
      descriptor = "(Lgga;IZ)V"
   )
   public final void method750(class502 param1, int param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!rv",
      name = "a",
      descriptor = "(BII)V"
   )
   public static final void method751(byte arg0, int arg1, int arg2) {
      try {
         ++field1143;
         class344.method2733(arg2, -26, arg1);
         int var3 = 122 / (arg0 / 52);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field1160[54] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "d",
      descriptor = "()V"
   )
   public final void method752() {
      try {
         ++field1096;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1160[9] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "e",
      descriptor = "()[Ldga;"
   )
   public final class712[] method753() {
      try {
         ++field1158;
         return this.field1139;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1160[22] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "a",
      descriptor = "(Lka;IIIZ)V"
   )
   public final void method754(class761 param1, int param2, int param3, int param4, boolean param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!rv",
      name = "a",
      descriptor = "(BIZ)Lka;"
   )
   public final class761 method755(byte arg0, int arg1, boolean arg2) {
      boolean var4 = client.field10022;

      try {
         ++field1147;
         class71 var5;
         class71 var6;
         if (~arg0 != -2) {
            if (~arg0 != -3) {
               if (~arg0 == -4) {
                  var5 = this.field1063.field9717;
                  var6 = this.field1063.field9784;
                  if (!var4) {
                     return this.method777(arg1, var5, -15815, arg2, arg0 != 0, var6);
                  }
               }

               if (arg0 == 4) {
                  var6 = this.field1063.field9782;
                  var5 = this.field1063.field9824;
                  if (!var4) {
                     return this.method777(arg1, var5, -15815, arg2, arg0 != 0, var6);
                  }
               }

               if (~arg0 == -6) {
                  var6 = this.field1063.field9766;
                  var5 = this.field1063.field9776;
                  if (!var4) {
                     return this.method777(arg1, var5, -15815, arg2, arg0 != 0, var6);
                  }
               }

               var6 = var5 = new class71(this.field1063);
               if (!var4) {
                  return this.method777(arg1, var5, -15815, arg2, arg0 != 0, var6);
               }
            }

            var6 = this.field1063.field9722;
            var5 = this.field1063.field9818;
            if (!var4) {
               return this.method777(arg1, var5, -15815, arg2, arg0 != 0, var6);
            }
         }

         var5 = this.field1063.field9820;
         var6 = this.field1063.field9802;
         return this.method777(arg1, var5, -15815, arg2, arg0 != 0, var6);
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field1160[16] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "f",
      descriptor = "()V"
   )
   public final void method756() {
      try {
         ++field1154;
         if (this.field1059 > 0 && this.field1077 > 0) {
            this.method796(false, (byte)101);
            if (~(this.field1136 & 16) == -1 && this.field1115.field10074 == null) {
               this.method776(4, false);
            }

            this.method790(262144);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1160[49] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "a",
      descriptor = "(Lgga;)V"
   )
   public final void method757(class502 arg0) {
      boolean var2 = client.field10022;

      try {
         ++field1152;
         class290 var3 = (class290)arg0;
         if (this.field1139 != null) {
            int var4 = 0;
            if (var2 || var4 < this.field1139.length) {
               do {
                  class712 var5 = this.field1139[var4];
                  class712 var6 = var5;
                  if (var5.field10229 != null) {
                     var6 = var5.field10229;
                  }

                  var6.field10242 = (int)((float)this.field1065[var5.field10220] * var3.field4308 + (float)this.field1094[var5.field10220] * var3.field4306 + (float)this.field1039[var5.field10220] * var3.field4312 + var3.field4307);
                  var6.field10243 = (int)((float)this.field1065[var5.field10220] * var3.field4345 + (float)this.field1094[var5.field10220] * var3.field4333 + (float)this.field1039[var5.field10220] * var3.field4336 + var3.field4321);
                  var6.field10240 = (int)((float)this.field1065[var5.field10220] * var3.field4334 + (float)this.field1094[var5.field10220] * var3.field4330 + (float)this.field1039[var5.field10220] * var3.field4347 + var3.field4339);
                  var6.field10236 = (int)((float)this.field1065[var5.field10239] * var3.field4308 + (float)this.field1094[var5.field10239] * var3.field4306 + (float)this.field1039[var5.field10239] * var3.field4312 + var3.field4307);
                  var6.field10237 = (int)((float)this.field1065[var5.field10239] * var3.field4345 + (float)this.field1094[var5.field10239] * var3.field4333 + (float)this.field1039[var5.field10239] * var3.field4336 + var3.field4321);
                  var6.field10226 = (int)((float)this.field1065[var5.field10239] * var3.field4334 + (float)this.field1094[var5.field10239] * var3.field4330 + (float)this.field1039[var5.field10239] * var3.field4347 + var3.field4339);
                  var6.field10222 = (int)((float)this.field1065[var5.field10223] * var3.field4308 + (float)this.field1094[var5.field10223] * var3.field4306 + (float)this.field1039[var5.field10223] * var3.field4312 + var3.field4307);
                  var6.field10234 = (int)((float)this.field1065[var5.field10223] * var3.field4345 + (float)this.field1094[var5.field10223] * var3.field4333 + (float)this.field1039[var5.field10223] * var3.field4336 + var3.field4321);
                  var6.field10230 = (int)((float)this.field1065[var5.field10223] * var3.field4334 + (float)this.field1094[var5.field10223] * var3.field4330 + (float)this.field1039[var5.field10223] * var3.field4347 + var3.field4339);
                  ++var4;
               } while(var4 < this.field1139.length);
            }
         }

         if (this.field1153 != null) {
            int var7 = 0;
            if (var2 || var7 < this.field1153.length) {
               do {
                  class3 var8 = this.field1153[var7];
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

                  var9.field25 = (int)((float)this.field1065[var8.field31] * var3.field4308 + (float)this.field1094[var8.field31] * var3.field4306 + (float)this.field1039[var8.field31] * var3.field4312 + var3.field4307);
                  var9.field30 = (int)((float)this.field1065[var8.field31] * var3.field4345 + (float)this.field1094[var8.field31] * var3.field4333 + (float)this.field1039[var8.field31] * var3.field4336 + var3.field4321);
                  var9.field27 = (int)((float)this.field1065[var8.field31] * var3.field4334 + (float)this.field1094[var8.field31] * var3.field4330 + (float)this.field1039[var8.field31] * var3.field4347 + var3.field4339);
                  ++var7;
               } while(var7 < this.field1153.length);

            }
         }
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field1160[15] + (arg0 != null ? field1160[4] : field1160[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "EA",
      descriptor = "()I"
   )
   public final int method758() {
      try {
         ++field1062;
         if (!this.field1056) {
            this.method772(false);
         }

         return this.field1121;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1160[14] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "b",
      descriptor = "(B)V"
   )
   private final void method759(byte arg0) {
      boolean var2 = client.field10022;

      try {
         if (this.field1103 != null) {
            class71 var10000;
            label49: {
               class290 var3 = this.field1063.field9678;
               this.field1063.method4905(65280);
               this.field1063.method262(!this.field1050);
               this.field1063.method4935(false, 3584);
               this.field1063.method4946(-16068, (class451)null, this.field1063.field9732, this.field1063.field9827, (class451)null);
               int var4 = 0;
               if (var2) {
                  var10000 = this;
               } else if (this.field1105 <= var4) {
                  this.field1063.method262(true);
                  var10000 = this;
                  if (!var2) {
                     break label49;
                  }
               } else {
                  var10000 = this;
               }

               while(true) {
                  class152 var5 = var10000.field1103[var4];
                  class750 var6 = this.field1041[var4];
                  if (var5.field2329 && this.field1063.method237()) {
                     ++var4;
                  } else {
                     float var7 = (float)(this.field1094[var5.field2337] - -this.field1094[var5.field2338] + this.field1094[var5.field2335]) * 0.3333333F;
                     float var8 = (float)(this.field1039[var5.field2337] + this.field1039[var5.field2335] + this.field1039[var5.field2338]) * 0.3333333F;
                     float var9 = (float)(this.field1065[var5.field2338] + this.field1065[var5.field2335] + this.field1065[var5.field2337]) * 0.3333333F;
                     float var10 = class755.field10796 * var9 + class211.field3017 * var8 + class195.field2818 * var7 + class481.field6905;
                     float var11 = class207.field2931 * var9 + class613.field8720 * var8 + class608.field8665 * var7 + class370.field5448;
                     float var12 = class139.field2232 * var9 + class565.field8031 * var7 + class39.field597 * var8 + class247.field3783;
                     float var13 = (float)(1.0D / Math.sqrt((double)(var12 * var12 + var10 * var10 + var11 * var11))) * (float)var5.field2331;
                     var3.method2396((byte)-124, (float)var6.field10656 + var10 + -(var10 * var13), var12 * var13 + -var12, var5.field2328 * var6.field10658 >> 7, var5.field2325 * var6.field10660 >> 7, var6.field10653, var11 * var13 + (float)var6.field10655 + -var11);
                     this.field1063.method4902(var3, (byte)85);
                     int var14 = var6.field10654;
                     OpenGL.glColor4ub((byte)(var14 >> 16), (byte)(var14 >> 8), (byte)var14, (byte)(var14 >> 24));
                     this.field1063.method4954(2912, var5.field2334);
                     this.field1063.method4965(var5.field2330, (byte)-118);
                     this.field1063.method4930(7, 4, 0, 0);
                     ++var4;
                  }

                  if (this.field1105 <= var4) {
                     this.field1063.method262(true);
                     var10000 = this;
                     if (!var2) {
                        break;
                     }
                  } else {
                     var10000 = this;
                  }
               }
            }

            var10000.field1063.method4956(34161);
         }

         int var15 = 54 / ((-50 - arg0) / 46);
         ++field1061;
      } catch (RuntimeException var17) {
         throw class612.method4503(var17, field1160[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "a",
      descriptor = "(BLtj;)V"
   )
   private final void method760(byte param1, class545 param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!rv",
      name = "a",
      descriptor = "(BCI)I"
   )
   public static final int method761(byte arg0, char arg1, int arg2) {
      try {
         ++field1148;
         int var3 = arg1 << 4;
         if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
            char var7 = Character.toLowerCase(arg1);
            var3 = (var7 << 4) + 1;
         }

         int var4 = -68 / ((arg0 - 56) / 60);
         return var3;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field1160[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "I",
      descriptor = "(I[IIIIZI[I)V"
   )
   public final void method762(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
      boolean var9 = client.field10022;

      try {
         ++field1104;
         int var10 = arg1.length;
         int var10000;
         if (arg0 != 0) {
            if (~arg0 == -2) {
               if (arg7 != null) {
                  int var17 = arg7[1] * arg3 + arg7[0] * arg2 + arg7[2] * arg4 + 8192 >> 14;
                  int var18 = arg7[4] * arg3 + arg7[3] * arg2 + arg7[5] * arg4 + 8192 >> 14;
                  int var19 = arg7[6] * arg2 - -(arg7[7] * arg3) + arg7[8] * arg4 + 8192 >> 14;
                  arg3 = var18;
                  arg2 = var17;
                  arg4 = var19;
               }

               arg4 <<= 4;
               arg2 <<= 4;
               arg3 <<= 4;
               int var20 = 0;
               if (var9 || ~var10 < ~var20) {
                  do {
                     int var21 = arg1[var20];
                     if (~this.field1058.length >= ~var21) {
                        ++var20;
                     } else {
                        int[] var22 = this.field1058[var21];
                        int var23 = 0;
                        if (!var9 && var22.length <= var23) {
                           ++var20;
                        } else {
                           do {
                              int var24 = var22[var23];
                              if (this.field1090 != null && (this.field1090[var24] & arg6) == 0) {
                                 ++var23;
                              } else {
                                 this.field1094[var24] += arg2;
                                 this.field1039[var24] += arg3;
                                 this.field1065[var24] += arg4;
                                 ++var23;
                              }
                           } while(var22.length > var23);

                           ++var20;
                        }
                     }
                  } while(~var10 < ~var20);

               }
            } else if (arg0 == 2) {
               if (arg7 == null) {
                  label436: {
                     int var25 = 0;
                     if (var9) {
                        var10000 = arg1[var25];
                     } else if (var25 >= var10) {
                        var10000 = arg5;
                        if (!var9) {
                           break label436;
                        }
                     } else {
                        var10000 = arg1[var25];
                     }

                     while(true) {
                        int var26 = var10000;
                        if (this.field1058.length <= var26) {
                           ++var25;
                        } else {
                           int[] var27 = this.field1058[var26];
                           int var28 = 0;
                           if (!var9 && var28 >= var27.length) {
                              ++var25;
                           } else {
                              while(true) {
                                 int var29 = var27[var28];
                                 if (this.field1090 != null && ~(this.field1090[var29] & arg6) == -1) {
                                    ++var28;
                                 } else {
                                    this.field1094[var29] -= class717.field10284;
                                    this.field1039[var29] -= class39.field598;
                                    this.field1065[var29] -= class348.field5113;
                                    if (arg4 != 0) {
                                       int var30 = class160.field2447[arg4];
                                       int var31 = class160.field2446[arg4];
                                       int var32 = this.field1039[var29] * var30 + this.field1094[var29] * var31 + 16383 >> 14;
                                       this.field1039[var29] = this.field1039[var29] * var31 + -(this.field1094[var29] * var30) + 16383 >> 14;
                                       this.field1094[var29] = var32;
                                    }

                                    if (~arg2 != -1) {
                                       int var33 = class160.field2447[arg2];
                                       int var34 = class160.field2446[arg2];
                                       int var35 = this.field1039[var29] * var34 + 16383 + -(this.field1065[var29] * var33) >> 14;
                                       this.field1065[var29] = this.field1039[var29] * var33 - -(this.field1065[var29] * var34) + 16383 >> 14;
                                       this.field1039[var29] = var35;
                                    }

                                    if (~arg3 != -1) {
                                       int var36 = class160.field2447[arg3];
                                       int var37 = class160.field2446[arg3];
                                       int var38 = this.field1094[var29] * var37 + this.field1065[var29] * var36 + 16383 >> 14;
                                       this.field1065[var29] = this.field1065[var29] * var37 - -16383 + -(this.field1094[var29] * var36) >> 14;
                                       this.field1094[var29] = var38;
                                    }

                                    this.field1094[var29] += class717.field10284;
                                    this.field1039[var29] += class39.field598;
                                    this.field1065[var29] += class348.field5113;
                                    ++var28;
                                 }

                                 if (var28 >= var27.length) {
                                    ++var25;
                                    break;
                                 }
                              }
                           }
                        }

                        if (var25 >= var10) {
                           var10000 = arg5;
                           if (!var9) {
                              break;
                           }
                        } else {
                           var10000 = arg1[var25];
                        }
                     }
                  }

                  if (var10000 != 0) {
                     int var39 = 0;
                     if (var9 || ~var10 < ~var39) {
                        do {
                           int var40 = arg1[var39];
                           if (~this.field1058.length >= ~var40) {
                              ++var39;
                           } else {
                              int[] var41 = this.field1058[var40];
                              int var42 = 0;
                              if (!var9 && var41.length <= var42) {
                                 ++var39;
                              } else {
                                 label389:
                                 do {
                                    int var43 = var41[var42];
                                    if (this.field1090 != null && ~(this.field1090[var43] & arg6) == -1) {
                                       ++var42;
                                    } else {
                                       int var44 = this.field1038[var43];
                                       int var45 = this.field1038[var43 + 1];
                                       int var46 = var44;
                                       if (!var9 && var45 <= var44) {
                                          ++var42;
                                       } else {
                                          do {
                                             int var47 = this.field1097[var46] + -1;
                                             if (~var47 == 0) {
                                                ++var42;
                                                continue label389;
                                             }

                                             if (arg4 != 0) {
                                                int var48 = class160.field2447[arg4];
                                                int var49 = class160.field2446[arg4];
                                                int var50 = this.field1095[var47] * var48 + this.field1043[var47] * var49 - -16383 >> 14;
                                                this.field1095[var47] = (short)(this.field1095[var47] * var49 + -(this.field1043[var47] * var48) + 16383 >> 14);
                                                this.field1043[var47] = (short)var50;
                                             }

                                             if (~arg2 != -1) {
                                                int var51 = class160.field2447[arg2];
                                                int var52 = class160.field2446[arg2];
                                                int var53 = this.field1095[var47] * var52 - (this.field1109[var47] * var51 + -16383) >> 14;
                                                this.field1109[var47] = (short)(this.field1109[var47] * var52 + (this.field1095[var47] * var51 - -16383) >> 14);
                                                this.field1095[var47] = (short)var53;
                                             }

                                             if (arg3 != 0) {
                                                int var54 = class160.field2447[arg3];
                                                int var55 = class160.field2446[arg3];
                                                int var56 = this.field1109[var47] * var54 + this.field1043[var47] * var55 + 16383 >> 14;
                                                this.field1109[var47] = (short)(this.field1109[var47] * var55 + -(this.field1043[var47] * var54) + 16383 >> 14);
                                                this.field1043[var47] = (short)var56;
                                             }

                                             ++var46;
                                          } while(var45 > var46);

                                          ++var42;
                                       }
                                    }
                                 } while(var41.length > var42);

                                 ++var39;
                              }
                           }
                        } while(~var10 < ~var39);
                     }

                     if (this.field1116 == null && this.field1045 != null) {
                        this.field1045.field6574 = null;
                     }

                     if (this.field1116 != null) {
                        this.field1116.field6574 = null;
                        return;
                     }
                  }
               } else {
                  int var57 = arg7[9] << 4;
                  int var58 = arg7[10] << 4;
                  int var59 = arg7[11] << 4;
                  int var60 = arg7[12] << 4;
                  int var61 = arg7[13] << 4;
                  int var62 = arg7[14] << 4;
                  if (class259.field3964) {
                     int var63 = arg7[3] * class39.field598 + arg7[0] * class717.field10284 + arg7[6] * class348.field5113 + 8192 >> 14;
                     int var64 = arg7[7] * class348.field5113 + (arg7[1] * class717.field10284 + 8192 - -(arg7[4] * class39.field598)) >> 14;
                     int var65 = arg7[5] * class39.field598 + (arg7[2] * class717.field10284 - (-(arg7[8] * class348.field5113) + -8192)) >> 14;
                     int var66 = var61 + var64;
                     int var67 = var60 + var63;
                     class717.field10284 = var67;
                     int var68 = var62 + var65;
                     class39.field598 = var66;
                     class348.field5113 = var68;
                     class259.field3964 = false;
                  }

                  int[] var84;
                  int var86;
                  int var92;
                  int var93;
                  int[] var94;
                  int var95;
                  label590: {
                     int[] var69 = new int[9];
                     int var70 = class160.field2446[arg2];
                     int var71 = class160.field2447[arg2];
                     int var72 = class160.field2446[arg3];
                     int var73 = class160.field2447[arg3];
                     int var74 = class160.field2446[arg4];
                     int var75 = class160.field2447[arg4];
                     int var76 = var71 * var74 + 8192 >> 14;
                     int var77 = var71 * var75 + 8192 >> 14;
                     var69[5] = -var71;
                     var69[1] = var73 * var76 + (-var72 * var75 - -8192) >> 14;
                     var69[7] = var72 * var76 + var73 * var75 + 8192 >> 14;
                     var69[3] = var70 * var75 + 8192 >> 14;
                     var69[2] = var70 * var73 + 8192 >> 14;
                     var69[8] = var70 * var72 + 8192 >> 14;
                     var69[6] = -var73 * var74 - (-(var72 * var77) + -8192) >> 14;
                     var69[0] = var72 * var74 - -(var73 * var77) + 8192 >> 14;
                     var69[4] = var70 * var74 + 8192 >> 14;
                     int var78 = var69[2] * -class348.field5113 + var69[0] * -class717.field10284 + var69[1] * -class39.field598 + 8192 >> 14;
                     int var79 = var69[4] * -class39.field598 + var69[3] * -class717.field10284 - (-(var69[5] * -class348.field5113) + -8192) >> 14;
                     int var80 = var69[8] * -class348.field5113 + var69[6] * -class717.field10284 + var69[7] * -class39.field598 + 8192 >> 14;
                     int var81 = class717.field10284 + var78;
                     int var82 = class39.field598 + var79;
                     int var83 = class348.field5113 + var80;
                     var84 = new int[9];
                     int var85 = 0;
                     int var89;
                     int var90;
                     int var91;
                     if (var9) {
                        var86 = 0;
                     } else if (var85 >= 3) {
                        var89 = var69[1] * var61 + 8192 + var69[0] * var60 + var69[2] * var62 >> 14;
                        var90 = var69[5] * var62 + var69[3] * var60 + var69[4] * var61 + 8192 >> 14;
                        var86 = var81 + var89;
                        var91 = var69[6] * var60 + var69[8] * var62 + var69[7] * var61 + 8192 >> 14;
                        var92 = var82 + var90;
                        var93 = var83 + var91;
                        var94 = new int[9];
                        var95 = 0;
                        if (!var9) {
                           break label590;
                        }
                     } else {
                        var86 = 0;
                     }

                     while(true) {
                        label587: {
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
                              if (~var86 <= -4) {
                                 break label587;
                              }

                              var87 = 0;
                              var88 = 0;
                              if (var9) {
                                 var87 += var69[var85 * 3 + var88] * arg7[var86 * 3 + var88];
                                 ++var88;
                              }
                           }

                           while(true) {
                              while(var88 < 3) {
                                 var87 += var69[var85 * 3 + var88] * arg7[var86 * 3 + var88];
                                 ++var88;
                              }

                              var84[var85 * 3 + var86] = var87 + 8192 >> 14;
                              if (!var9) {
                                 ++var86;
                                 if (~var86 <= -4) {
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
                        if (var85 >= 3) {
                           var89 = var69[1] * var61 + 8192 + var69[0] * var60 + var69[2] * var62 >> 14;
                           var90 = var69[5] * var62 + var69[3] * var60 + var69[4] * var61 + 8192 >> 14;
                           var86 = var81 + var89;
                           var91 = var69[6] * var60 + var69[8] * var62 + var69[7] * var61 + 8192 >> 14;
                           var92 = var82 + var90;
                           var93 = var83 + var91;
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
                  label529: {
                     int var99;
                     int var100;
                     int var101;
                     if (var9) {
                        var96 = 0;
                     } else if (~var95 <= -4) {
                        var99 = arg7[2] * var93 - -8192 + arg7[1] * var92 + arg7[0] * var86 >> 14;
                        var100 = arg7[5] * var93 + arg7[4] * var92 + arg7[3] * var86 + 8192 >> 14;
                        var96 = var57 + var99;
                        var101 = arg7[7] * var92 + arg7[6] * var86 + arg7[8] * var93 + 8192 >> 14;
                        var102 = var58 + var100;
                        var103 = var59 + var101;
                        var104 = 0;
                        if (!var9) {
                           break label529;
                        }
                     } else {
                        var96 = 0;
                     }

                     while(true) {
                        label526: {
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
                              if (~var96 <= -4) {
                                 break label526;
                              }

                              var97 = 0;
                              var98 = 0;
                              if (var9) {
                                 var97 += arg7[var95 * 3 + var98] * var84[var98 * 3 + var96];
                                 ++var98;
                              }
                           }

                           while(true) {
                              while(var98 < 3) {
                                 var97 += arg7[var95 * 3 + var98] * var84[var98 * 3 + var96];
                                 ++var98;
                              }

                              var94[var95 * 3 + var96] = var97 + 8192 >> 14;
                              if (!var9) {
                                 ++var96;
                                 if (~var96 <= -4) {
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
                           var99 = arg7[2] * var93 - -8192 + arg7[1] * var92 + arg7[0] * var86 >> 14;
                           var100 = arg7[5] * var93 + arg7[4] * var92 + arg7[3] * var86 + 8192 >> 14;
                           var96 = var57 + var99;
                           var101 = arg7[7] * var92 + arg7[6] * var86 + arg7[8] * var93 + 8192 >> 14;
                           var102 = var58 + var100;
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
                        if (this.field1058.length <= var105) {
                           ++var104;
                        } else {
                           int[] var106 = this.field1058[var105];
                           int var107 = 0;
                           if (!var9 && var107 >= var106.length) {
                              ++var104;
                           } else {
                              do {
                                 int var108 = var106[var107];
                                 if (this.field1090 != null && (arg6 & this.field1090[var108]) == 0) {
                                    ++var107;
                                 } else {
                                    int var109 = this.field1039[var108] * var94[1] + this.field1094[var108] * var94[0] + this.field1065[var108] * var94[2] + 8192 >> 14;
                                    int var110 = this.field1065[var108] * var94[5] + this.field1094[var108] * var94[3] + this.field1039[var108] * var94[4] - -8192 >> 14;
                                    int var111 = var102 + var110;
                                    int var112 = var96 + var109;
                                    int var113 = this.field1094[var108] * var94[6] + (this.field1065[var108] * var94[8] + this.field1039[var108] * var94[7] - -8192) >> 14;
                                    int var114 = var103 + var113;
                                    this.field1094[var108] = var112;
                                    this.field1039[var108] = var111;
                                    this.field1065[var108] = var114;
                                    ++var107;
                                 }
                              } while(var107 < var106.length);

                              ++var104;
                           }
                        }
                     } while(var104 < var10);
                  }
               }

            } else if (arg0 == 3) {
               if (arg7 != null) {
                  int var120 = arg7[9] << 4;
                  int var121 = arg7[10] << 4;
                  int var122 = arg7[11] << 4;
                  int var123 = arg7[12] << 4;
                  int var124 = arg7[13] << 4;
                  int var125 = arg7[14] << 4;
                  if (class259.field3964) {
                     int var126 = arg7[6] * class348.field5113 + (arg7[0] * class717.field10284 - -(arg7[3] * class39.field598)) - -8192 >> 14;
                     int var127 = arg7[7] * class348.field5113 + (arg7[1] * class717.field10284 - -(arg7[4] * class39.field598)) + 8192 >> 14;
                     int var128 = var123 + var126;
                     int var129 = var124 + var127;
                     int var130 = arg7[8] * class348.field5113 + (arg7[5] * class39.field598 + arg7[2] * class717.field10284 - -8192) >> 14;
                     class717.field10284 = var128;
                     int var131 = var125 + var130;
                     class39.field598 = var129;
                     class348.field5113 = var131;
                     class259.field3964 = false;
                  }

                  int[] var148;
                  int var150;
                  int var155;
                  int var157;
                  int var158;
                  label656: {
                     int var132 = arg2 << 15 >> 7;
                     int var133 = arg3 << 15 >> 7;
                     int var134 = arg4 << 15 >> 7;
                     int var135 = -class717.field10284 * var132 + 8192 >> 14;
                     int var136 = -class39.field598 * var133 - -8192 >> 14;
                     int var137 = -class348.field5113 * var134 + 8192 >> 14;
                     int var138 = class717.field10284 + var135;
                     int var139 = class39.field598 + var136;
                     int var140 = class348.field5113 + var137;
                     int[] var141 = new int[]{arg7[0] * var132 + 8192 >> 14, arg7[3] * var132 - -8192 >> 14, arg7[6] * var132 - -8192 >> 14, arg7[1] * var133 + 8192 >> 14, arg7[4] * var133 + 8192 >> 14, arg7[7] * var133 + 8192 >> 14, arg7[2] * var134 + 8192 >> 14, arg7[5] * var134 - -8192 >> 14, arg7[8] * var134 + 8192 >> 14};
                     int var142 = var123 * var132 - -8192 >> 14;
                     int var143 = var124 * var133 + 8192 >> 14;
                     int var144 = var139 + var143;
                     int var145 = var125 * var134 + 8192 >> 14;
                     int var146 = var138 + var142;
                     int var147 = var140 + var145;
                     var148 = new int[9];
                     int var149 = 0;
                     int var153;
                     int var154;
                     int var156;
                     if (var9) {
                        var150 = 0;
                     } else if (var149 >= 3) {
                        var153 = arg7[0] * var146 - -(arg7[1] * var144) + 8192 - -(arg7[2] * var147) >> 14;
                        var154 = arg7[3] * var146 - (-(arg7[4] * var144) - arg7[5] * var147) + 8192 >> 14;
                        var155 = var121 + var154;
                        var156 = arg7[6] * var146 - (-(arg7[7] * var144) + -(arg7[8] * var147)) + 8192 >> 14;
                        var150 = var120 + var153;
                        var157 = var122 + var156;
                        var158 = 0;
                        if (!var9) {
                           break label656;
                        }
                     } else {
                        var150 = 0;
                     }

                     while(true) {
                        label653: {
                           int var151;
                           int var152;
                           if (var9) {
                              var151 = 0;
                              var152 = 0;
                              if (var9) {
                                 var151 += arg7[var149 * 3 - -var152] * var141[var152 * 3 + var150];
                                 ++var152;
                              }
                           } else {
                              if (var150 >= 3) {
                                 break label653;
                              }

                              var151 = 0;
                              var152 = 0;
                              if (var9) {
                                 var151 += arg7[var149 * 3 - -var152] * var141[var152 * 3 + var150];
                                 ++var152;
                              }
                           }

                           while(true) {
                              while(~var152 > -4) {
                                 var151 += arg7[var149 * 3 - -var152] * var141[var152 * 3 + var150];
                                 ++var152;
                              }

                              var148[var149 * 3 - -var150] = var151 + 8192 >> 14;
                              if (!var9) {
                                 ++var150;
                                 if (var150 >= 3) {
                                    break;
                                 }

                                 var151 = 0;
                                 var152 = 0;
                                 if (var9) {
                                    var151 += arg7[var149 * 3 - -var152] * var141[var152 * 3 + var150];
                                    ++var152;
                                 }
                              } else {
                                 ++var152;
                              }
                           }
                        }

                        ++var149;
                        if (var149 >= 3) {
                           var153 = arg7[0] * var146 - -(arg7[1] * var144) + 8192 - -(arg7[2] * var147) >> 14;
                           var154 = arg7[3] * var146 - (-(arg7[4] * var144) - arg7[5] * var147) + 8192 >> 14;
                           var155 = var121 + var154;
                           var156 = arg7[6] * var146 - (-(arg7[7] * var144) + -(arg7[8] * var147)) + 8192 >> 14;
                           var150 = var120 + var153;
                           var157 = var122 + var156;
                           var158 = 0;
                           if (!var9) {
                              break;
                           }
                        } else {
                           var150 = 0;
                        }
                     }
                  }

                  if (var9 || var158 < var10) {
                     do {
                        int var159 = arg1[var158];
                        if (~var159 <= ~this.field1058.length) {
                           ++var158;
                        } else {
                           int[] var160 = this.field1058[var159];
                           int var161 = 0;
                           if (!var9 && ~var160.length >= ~var161) {
                              ++var158;
                           } else {
                              do {
                                 int var162 = var160[var161];
                                 if (this.field1090 != null && (this.field1090[var162] & arg6) == 0) {
                                    ++var161;
                                 } else {
                                    int var163 = this.field1094[var162] * var148[0] + this.field1039[var162] * var148[1] - -(this.field1065[var162] * var148[2]) + 8192 >> 14;
                                    int var164 = this.field1094[var162] * var148[3] + this.field1039[var162] * var148[4] - (-(this.field1065[var162] * var148[5]) - 8192) >> 14;
                                    int var165 = this.field1039[var162] * var148[7] + this.field1094[var162] * var148[6] + this.field1065[var162] * var148[8] + 8192 >> 14;
                                    int var166 = var150 + var163;
                                    int var167 = var155 + var164;
                                    this.field1094[var162] = var166;
                                    int var168 = var157 + var165;
                                    this.field1039[var162] = var167;
                                    this.field1065[var162] = var168;
                                    ++var161;
                                 }
                              } while(~var160.length < ~var161);

                              ++var158;
                           }
                        }
                     } while(var158 < var10);

                  }
               } else {
                  int var115 = 0;
                  if (var9 || ~var10 < ~var115) {
                     do {
                        int var116 = arg1[var115];
                        if (var116 >= this.field1058.length) {
                           ++var115;
                        } else {
                           int[] var117 = this.field1058[var116];
                           int var118 = 0;
                           if (!var9 && ~var118 <= ~var117.length) {
                              ++var115;
                           } else {
                              do {
                                 int var119 = var117[var118];
                                 if (this.field1090 != null && ~(this.field1090[var119] & arg6) == -1) {
                                    ++var118;
                                 } else {
                                    this.field1094[var119] -= class717.field10284;
                                    this.field1039[var119] -= class39.field598;
                                    this.field1065[var119] -= class348.field5113;
                                    this.field1094[var119] = this.field1094[var119] * arg2 >> 7;
                                    this.field1039[var119] = this.field1039[var119] * arg3 >> 7;
                                    this.field1065[var119] = this.field1065[var119] * arg4 >> 7;
                                    this.field1094[var119] += class717.field10284;
                                    this.field1039[var119] += class39.field598;
                                    this.field1065[var119] += class348.field5113;
                                    ++var118;
                                 }
                              } while(~var118 > ~var117.length);

                              ++var115;
                           }
                        }
                     } while(~var10 < ~var115);

                  }
               }
            } else if (~arg0 == -6) {
               if (this.field1035 != null) {
                  int var169 = 0;
                  if (var9 || ~var169 > ~var10) {
                     do {
                        int var170 = arg1[var169];
                        if (var170 >= this.field1035.length) {
                           ++var169;
                        } else {
                           int[] var171 = this.field1035[var170];
                           int var172 = 0;
                           if (!var9 && var172 >= var171.length) {
                              ++var169;
                           } else {
                              do {
                                 int var173 = var171[var172];
                                 if (this.field1117 != null && ~(arg6 & this.field1117[var173]) == -1) {
                                    ++var172;
                                 } else {
                                    int var174 = (255 & this.field1155[var173]) + arg2 * 8;
                                    if (~var174 > -1) {
                                       var174 = 0;
                                       if (var9 && ~var174 < -256) {
                                          var174 = 255;
                                       }
                                    } else if (~var174 < -256) {
                                       var174 = 255;
                                    }

                                    this.field1155[var173] = (byte)var174;
                                    if (this.field1045 != null) {
                                       this.field1045.field6574 = null;
                                    }

                                    ++var172;
                                 }
                              } while(var172 < var171.length);

                              ++var169;
                           }
                        }
                     } while(~var169 > ~var10);
                  }

                  if (this.field1103 != null) {
                     int var175 = 0;
                     if (var9 || var175 < this.field1105) {
                        do {
                           class152 var176 = this.field1103[var175];
                           class750 var177 = this.field1041[var175];
                           var177.field10654 = 16777215 & var177.field10654 | -(255 & this.field1155[var176.field2332]) + 255 << 24;
                           ++var175;
                        } while(var175 < this.field1105);
                     }
                  }
               }

            } else if (~arg0 == -8) {
               if (this.field1035 != null) {
                  int var178 = 0;
                  if (var9 || var10 > var178) {
                     do {
                        int var179 = arg1[var178];
                        if (var179 >= this.field1035.length) {
                           ++var178;
                        } else {
                           int[] var180 = this.field1035[var179];
                           int var181 = 0;
                           if (!var9 && var181 >= var180.length) {
                              ++var178;
                           } else {
                              do {
                                 int var182 = var180[var181];
                                 if (this.field1117 != null && ~(this.field1117[var182] & arg6) == -1) {
                                    ++var181;
                                 } else {
                                    int var183 = 65535 & this.field1106[var182];
                                    int var184 = var183 >> 10 & 63;
                                    int var185 = (var183 & 947) >> 7;
                                    int var186 = var183 & 127;
                                    int var187 = 63 & var184 - -arg2;
                                    int var188 = arg3 / 4 + var185;
                                    if (~var188 <= -1) {
                                       if (var188 > 7) {
                                          var188 = 7;
                                          if (var9) {
                                             var188 = 0;
                                          }
                                       }
                                    } else {
                                       var188 = 0;
                                    }

                                    int var189 = arg4 + var186;
                                    if (~var189 > -1) {
                                       var189 = 0;
                                       if (var9 && var189 > 127) {
                                          var189 = 127;
                                       }
                                    } else if (var189 > 127) {
                                       var189 = 127;
                                    }

                                    this.field1106[var182] = (short)class91.method932(class91.method932(var187 << 10, var188 << 7), var189);
                                    if (this.field1045 != null) {
                                       this.field1045.field6574 = null;
                                    }

                                    ++var181;
                                 }
                              } while(var181 < var180.length);

                              ++var178;
                           }
                        }
                     } while(var10 > var178);
                  }

                  if (this.field1103 != null) {
                     int var190 = 0;
                     if (var9 || ~var190 > ~this.field1105) {
                        do {
                           class152 var191 = this.field1103[var190];
                           class750 var192 = this.field1041[var190];
                           var192.field10654 = var192.field10654 & -16777216 | class744.field10589[this.field1106[var191.field2332] & 65535] & 16777215;
                           ++var190;
                        } while(~var190 > ~this.field1105);
                     }
                  }
               }

            } else if (arg0 == 8) {
               if (this.field1124 != null) {
                  int var193 = 0;
                  if (var9 || var193 < var10) {
                     do {
                        int var194 = arg1[var193];
                        if (var194 >= this.field1124.length) {
                           ++var193;
                        } else {
                           int[] var195 = this.field1124[var194];
                           int var196 = 0;
                           if (!var9 && ~var195.length >= ~var196) {
                              ++var193;
                           } else {
                              do {
                                 class750 var197 = this.field1041[var195[var196]];
                                 var197.field10656 += arg2;
                                 var197.field10655 += arg3;
                                 ++var196;
                              } while(~var195.length < ~var196);

                              ++var193;
                           }
                        }
                     } while(var193 < var10);
                  }
               }

            } else if (~arg0 == -11) {
               if (this.field1124 != null) {
                  int var198 = 0;
                  if (var9 || ~var10 < ~var198) {
                     do {
                        int var199 = arg1[var198];
                        if (this.field1124.length <= var199) {
                           ++var198;
                        } else {
                           int[] var200 = this.field1124[var199];
                           int var201 = 0;
                           if (!var9 && var200.length <= var201) {
                              ++var198;
                           } else {
                              do {
                                 class750 var202 = this.field1041[var200[var201]];
                                 var202.field10658 = var202.field10658 * arg3 >> 7;
                                 var202.field10660 = var202.field10660 * arg2 >> 7;
                                 ++var201;
                              } while(var200.length > var201);

                              ++var198;
                           }
                        }
                     } while(~var10 < ~var198);
                  }
               }

            } else if (arg0 == 9) {
               if (this.field1124 != null) {
                  int var203 = 0;
                  if (var9 || ~var203 > ~var10) {
                     do {
                        int var204 = arg1[var203];
                        if (~var204 <= ~this.field1124.length) {
                           ++var203;
                        } else {
                           int[] var205 = this.field1124[var204];
                           int var206 = 0;
                           if (!var9 && var206 >= var205.length) {
                              ++var203;
                           } else {
                              do {
                                 class750 var207 = this.field1041[var205[var206]];
                                 var207.field10653 = var207.field10653 + arg2 & 16383;
                                 ++var206;
                              } while(var206 < var205.length);

                              ++var203;
                           }
                        }
                     } while(~var203 > ~var10);
                  }
               }

            }
         } else {
            arg2 <<= 4;
            arg4 <<= 4;
            arg3 <<= 4;
            class717.field10284 = 0;
            class348.field5113 = 0;
            class39.field598 = 0;
            int var11 = 0;
            int var12 = 0;
            if (var9) {
               var10000 = arg1[var12];
            } else if (~var12 <= ~var10) {
               var10000 = ~var11;
               if (!var9) {
                  if (var10000 >= -1) {
                     class39.field598 = arg3;
                     class717.field10284 = arg2;
                     class348.field5113 = arg4;
                     return;
                  }

                  class39.field598 = class39.field598 / var11 + arg3;
                  class259.field3964 = true;
                  class348.field5113 = class348.field5113 / var11 + arg4;
                  class717.field10284 = class717.field10284 / var11 - -arg2;
                  return;
               }
            } else {
               var10000 = arg1[var12];
            }

            while(true) {
               int var13 = var10000;
               if (this.field1058.length <= var13) {
                  ++var12;
               } else {
                  int[] var14 = this.field1058[var13];
                  int var15 = 0;
                  int var16;
                  if (var9) {
                     var16 = var14[var15];
                     if (this.field1090 != null) {
                        if ((arg6 & this.field1090[var16]) != 0) {
                           class717.field10284 += this.field1094[var16];
                           class39.field598 += this.field1039[var16];
                           class348.field5113 += this.field1065[var16];
                           ++var11;
                           ++var15;
                        } else {
                           ++var15;
                        }
                     } else {
                        class717.field10284 += this.field1094[var16];
                        class39.field598 += this.field1039[var16];
                        class348.field5113 += this.field1065[var16];
                        ++var11;
                        ++var15;
                     }
                  }

                  while(~var15 > ~var14.length) {
                     var16 = var14[var15];
                     if (this.field1090 != null) {
                        if ((arg6 & this.field1090[var16]) != 0) {
                           class717.field10284 += this.field1094[var16];
                           class39.field598 += this.field1039[var16];
                           class348.field5113 += this.field1065[var16];
                           ++var11;
                           ++var15;
                        } else {
                           ++var15;
                        }
                     } else {
                        class717.field10284 += this.field1094[var16];
                        class39.field598 += this.field1039[var16];
                        class348.field5113 += this.field1065[var16];
                        ++var11;
                        ++var15;
                     }
                  }

                  ++var12;
               }

               if (~var12 <= ~var10) {
                  var10000 = ~var11;
                  if (!var9) {
                     if (var10000 >= -1) {
                        class39.field598 = arg3;
                        class717.field10284 = arg2;
                        class348.field5113 = arg4;
                        return;
                     }

                     class39.field598 = class39.field598 / var11 + arg3;
                     class259.field3964 = true;
                     class348.field5113 = class348.field5113 / var11 + arg4;
                     class717.field10284 = class717.field10284 / var11 - -arg2;
                     return;
                  }
               } else {
                  var10000 = arg1[var12];
               }
            }
         }
      } catch (RuntimeException var209) {
         throw class612.method4503(var209, field1160[7] + arg0 + ',' + (arg1 != null ? field1160[4] : field1160[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field1160[4] : field1160[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "a",
      descriptor = "(Lgga;Lrh;II)V"
   )
   public final void method763(class502 arg0, class213 arg1, int arg2, int arg3) {
      boolean var5 = client.field10022;

      try {
         ++field1073;
         if (this.field1059 != 0) {
            class290 var6 = this.field1063.field9709;
            class290 var7 = (class290)arg0;
            if (!this.field1056) {
               this.method772(false);
            }

            float var10;
            float var11;
            label93: {
               class39.field597 = var6.field4334 * var7.field4347 + var6.field4347 * var7.field4336 + var6.field4330 * var7.field4312;
               class247.field3783 = var6.field4334 * var7.field4339 + var6.field4347 * var7.field4321 + var6.field4330 * var7.field4307 + var6.field4339;
               float var8 = (float)this.field1048 * class39.field597 + class247.field3783;
               float var9 = (float)this.field1121 * class39.field597 + class247.field3783;
               if (!(var8 > var9)) {
                  var10 = (float)this.field1134 + var9;
                  var11 = var8 - (float)this.field1134;
                  if (!var5) {
                     break label93;
                  }
               }

               var11 = (float)(-this.field1134) + var9;
               var10 = (float)this.field1134 + var8;
            }

            if (!(var11 >= this.field1063.field9744)) {
               if (!((float)this.field1063.field9768 >= var10)) {
                  float var14;
                  float var15;
                  label85: {
                     class211.field3017 = var6.field4308 * var7.field4347 + var6.field4312 * var7.field4336 + var6.field4306 * var7.field4312;
                     class481.field6905 = var6.field4308 * var7.field4339 + var6.field4312 * var7.field4321 + var6.field4306 * var7.field4307 + var6.field4307;
                     float var12 = (float)this.field1048 * class211.field3017 + class481.field6905;
                     float var13 = (float)this.field1121 * class211.field3017 + class481.field6905;
                     if (var12 > var13) {
                        var14 = ((float)(-this.field1134) + var13) * (float)this.field1063.field9735;
                        var15 = ((float)this.field1134 + var12) * (float)this.field1063.field9735;
                        if (!var5) {
                           break label85;
                        }
                     }

                     var15 = ((float)this.field1134 + var13) * (float)this.field1063.field9735;
                     var14 = (var12 - (float)this.field1134) * (float)this.field1063.field9735;
                  }

                  if (!(var14 / (float)arg2 >= this.field1063.field9720)) {
                     if (!(var15 / (float)arg2 <= this.field1063.field9809)) {
                        float var18;
                        float var19;
                        label77: {
                           class613.field8720 = var6.field4345 * var7.field4347 + var6.field4336 * var7.field4336 + var6.field4333 * var7.field4312;
                           class370.field5448 = var6.field4345 * var7.field4339 + var6.field4336 * var7.field4321 + var6.field4333 * var7.field4307 + var6.field4321;
                           float var16 = (float)this.field1048 * class613.field8720 + class370.field5448;
                           float var17 = (float)this.field1121 * class613.field8720 + class370.field5448;
                           if (!(var16 > var17)) {
                              var18 = ((float)this.field1134 + var17) * (float)this.field1063.field9822;
                              var19 = (var16 - (float)this.field1134) * (float)this.field1063.field9822;
                              if (!var5) {
                                 break label77;
                              }
                           }

                           var19 = ((float)(-this.field1134) + var17) * (float)this.field1063.field9822;
                           var18 = ((float)this.field1134 + var16) * (float)this.field1063.field9822;
                        }

                        if (!(var19 / (float)arg2 >= this.field1063.field9759)) {
                           if (!(this.field1063.field9721 >= var18 / (float)arg2)) {
                              if (arg1 != null || this.field1103 != null) {
                                 class755.field10796 = var6.field4308 * var7.field4334 + var6.field4312 * var7.field4345 + var6.field4306 * var7.field4308;
                                 class207.field2931 = var6.field4345 * var7.field4334 + var6.field4336 * var7.field4345 + var6.field4333 * var7.field4308;
                                 class195.field2818 = var6.field4308 * var7.field4330 + var6.field4312 * var7.field4333 + var6.field4306 * var7.field4306;
                                 class139.field2232 = var6.field4334 * var7.field4334 + var6.field4347 * var7.field4345 + var6.field4330 * var7.field4308;
                                 class608.field8665 = var6.field4345 * var7.field4330 + var6.field4336 * var7.field4333 + var6.field4333 * var7.field4306;
                                 class565.field8031 = var6.field4334 * var7.field4330 + var6.field4347 * var7.field4333 + var6.field4330 * var7.field4306;
                              }

                              if (arg1 != null) {
                                 int var20 = this.field1078 - -this.field1071 >> 1;
                                 int var21 = this.field1064 - -this.field1100 >> 1;
                                 int var22 = (int)((float)var21 * class755.field10796 + (float)this.field1048 * class211.field3017 + (float)var20 * class195.field2818 + class481.field6905);
                                 int var23 = (int)((float)var21 * class207.field2931 + (float)this.field1048 * class613.field8720 + (float)var20 * class608.field8665 + class370.field5448);
                                 int var24 = (int)((float)var21 * class139.field2232 + (float)this.field1048 * class39.field597 + (float)var20 * class565.field8031 + class247.field3783);
                                 int var25 = (int)((float)var21 * class755.field10796 + (float)this.field1121 * class211.field3017 + (float)var20 * class195.field2818 + class481.field6905);
                                 int var26 = (int)((float)var21 * class207.field2931 + (float)this.field1121 * class613.field8720 + (float)var20 * class608.field8665 + class370.field5448);
                                 arg1.field3055 = this.field1063.field9822 * var23 / arg2 + this.field1063.field9798;
                                 arg1.field3056 = this.field1063.field9737 - -(this.field1063.field9735 * var25 / arg2);
                                 int var27 = (int)((float)var21 * class139.field2232 + (float)this.field1121 * class39.field597 + (float)var20 * class565.field8031 + class247.field3783);
                                 arg1.field3051 = this.field1063.field9822 * var26 / arg2 + this.field1063.field9798;
                                 arg1.field3054 = this.field1063.field9735 * var22 / arg2 + this.field1063.field9737;
                                 if (this.field1063.field9768 <= var24 || ~this.field1063.field9768 >= ~var27) {
                                    arg1.field3052 = (this.field1134 + var22) * this.field1063.field9735 / arg2 + -arg1.field3054 + this.field1063.field9737;
                                    arg1.field3053 = true;
                                 }
                              }

                              this.field1063.method4955((float)arg2, 58);
                              this.field1063.method4957(31691);
                              this.field1063.method4907(var7, (byte)80);
                              this.method789((byte)-111);
                              this.field1063.method4956(34161);
                              this.method759((byte)-108);
                           }
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var29) {
         throw class612.method4503(var29, field1160[66] + (arg0 != null ? field1160[4] : field1160[2]) + ',' + (arg1 != null ? field1160[4] : field1160[2]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "wa",
      descriptor = "()V"
   )
   public final void method764() {
      boolean var1 = client.field10022;

      try {
         int var2 = 0;
         if (var1) {
            this.field1094[var2] = this.field1094[var2] + 7 >> 4;
            this.field1039[var2] = this.field1039[var2] + 7 >> 4;
            this.field1065[var2] = this.field1065[var2] + 7 >> 4;
            ++var2;
         }

         while(true) {
            while(this.field1114 > var2) {
               this.field1094[var2] = this.field1094[var2] + 7 >> 4;
               this.field1039[var2] = this.field1039[var2] + 7 >> 4;
               this.field1065[var2] = this.field1065[var2] + 7 >> 4;
               ++var2;
            }

            ++field1151;
            this.field1056 = false;
            if (!var1) {
               if (this.field1120 != null) {
                  this.field1120.field6574 = null;
                  return;
               }

               return;
            }

            this.field1065[var2] = this.field1065[var2] + 7 >> 4;
            ++var2;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field1160[44] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "a",
      descriptor = "(I[IIIIIZ)V"
   )
   public final void method765(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
      boolean var8 = client.field10022;

      try {
         ++field1092;
         int var9 = arg1.length;
         int var10000;
         int var110;
         int var111;
         int var112;
         if (~arg0 != -1) {
            if (~arg0 != -2) {
               if (~arg0 != -3) {
                  if (~arg0 != -4) {
                     if (arg0 == 5) {
                        if (this.field1035 != null) {
                           int var69 = 0;
                           if (var8 || var69 < var9) {
                              do {
                                 int var70 = arg1[var69];
                                 if (~var70 <= ~this.field1035.length) {
                                    ++var69;
                                 } else {
                                    int[] var71 = this.field1035[var70];
                                    int var72 = 0;
                                    if (var8) {
                                       var10000 = var71[var72];
                                    } else if (~var72 <= ~var71.length) {
                                       var10000 = ~var71.length;
                                       if (!var8) {
                                          if (var10000 < -1 && this.field1045 != null) {
                                             this.field1045.field6574 = null;
                                          }

                                          ++var69;
                                          continue;
                                       }
                                    } else {
                                       var10000 = var71[var72];
                                    }

                                    while(true) {
                                       int var73 = var10000;
                                       int var74 = (255 & this.field1155[var73]) - -(arg2 * 8);
                                       if (var74 >= 0) {
                                          if (var74 > 255) {
                                             var74 = 255;
                                             if (var8) {
                                                var74 = 0;
                                             }
                                          }
                                       } else {
                                          var74 = 0;
                                       }

                                       this.field1155[var73] = (byte)var74;
                                       ++var72;
                                       if (~var72 <= ~var71.length) {
                                          var10000 = ~var71.length;
                                          if (!var8) {
                                             if (var10000 < -1 && this.field1045 != null) {
                                                this.field1045.field6574 = null;
                                             }

                                             ++var69;
                                             break;
                                          }
                                       } else {
                                          var10000 = var71[var72];
                                       }
                                    }
                                 }
                              } while(var69 < var9);
                           }

                           if (this.field1103 != null) {
                              int var75 = 0;
                              if (var8 || ~var75 > ~this.field1105) {
                                 do {
                                    class152 var76 = this.field1103[var75];
                                    class750 var77 = this.field1041[var75];
                                    var77.field10654 = var77.field10654 & 16777215 | -(this.field1155[var76.field2332] & 255) + 255 << 24;
                                    ++var75;
                                 } while(~var75 > ~this.field1105);
                              }
                           }
                        }

                     } else if (arg0 == 7) {
                        if (this.field1035 != null) {
                           int var78 = 0;
                           if (var8 || ~var9 < ~var78) {
                              do {
                                 int var79 = arg1[var78];
                                 if (var79 >= this.field1035.length) {
                                    ++var78;
                                 } else {
                                    int[] var80 = this.field1035[var79];
                                    int var81 = 0;
                                    if (var8) {
                                       var10000 = var80[var81];
                                    } else if (var81 >= var80.length) {
                                       var10000 = var80.length;
                                       if (!var8) {
                                          if (var10000 > 0 && this.field1045 != null) {
                                             this.field1045.field6574 = null;
                                          }

                                          ++var78;
                                          continue;
                                       }
                                    } else {
                                       var10000 = var80[var81];
                                    }

                                    while(true) {
                                       int var82 = var10000;
                                       int var83 = 65535 & this.field1106[var82];
                                       int var84 = (65435 & var83) >> 10;
                                       int var85 = var83 >> 7 & 7;
                                       int var86 = arg3 / 4 + var85;
                                       int var87 = var83 & 127;
                                       int var88 = 63 & arg2 + var84;
                                       int var89 = arg4 + var87;
                                       if (~var86 <= -1) {
                                          if (var86 > 7) {
                                             var86 = 7;
                                             if (var8) {
                                                var86 = 0;
                                             }
                                          }
                                       } else {
                                          var86 = 0;
                                       }

                                       if (~var89 <= -1) {
                                          if (~var89 < -128) {
                                             var89 = 127;
                                             if (var8) {
                                                var89 = 0;
                                             }
                                          }
                                       } else {
                                          var89 = 0;
                                       }

                                       this.field1106[var82] = (short)class91.method932(class91.method932(var86 << 7, var88 << 10), var89);
                                       ++var81;
                                       if (var81 >= var80.length) {
                                          var10000 = var80.length;
                                          if (!var8) {
                                             if (var10000 > 0 && this.field1045 != null) {
                                                this.field1045.field6574 = null;
                                             }

                                             ++var78;
                                             break;
                                          }
                                       } else {
                                          var10000 = var80[var81];
                                       }
                                    }
                                 }
                              } while(~var9 < ~var78);
                           }

                           if (this.field1103 != null) {
                              int var90 = 0;
                              if (var8 || ~var90 > ~this.field1105) {
                                 do {
                                    class152 var91 = this.field1103[var90];
                                    class750 var92 = this.field1041[var90];
                                    var92.field10654 = -16777216 & var92.field10654 | class744.field10589[this.field1106[var91.field2332] & 65535] & 16777215;
                                    ++var90;
                                 } while(~var90 > ~this.field1105);
                              }
                           }
                        }

                     } else if (~arg0 == -9) {
                        if (this.field1124 != null) {
                           int var93 = 0;
                           if (var8 || var93 < var9) {
                              do {
                                 int var94 = arg1[var93];
                                 if (var94 >= this.field1124.length) {
                                    ++var93;
                                 } else {
                                    int[] var95 = this.field1124[var94];
                                    int var96 = 0;
                                    if (!var8 && var96 >= var95.length) {
                                       ++var93;
                                    } else {
                                       do {
                                          class750 var97 = this.field1041[var95[var96]];
                                          var97.field10656 += arg2;
                                          var97.field10655 += arg3;
                                          ++var96;
                                       } while(var96 < var95.length);

                                       ++var93;
                                    }
                                 }
                              } while(var93 < var9);
                           }
                        }

                     } else if (~arg0 == -11) {
                        if (this.field1124 != null) {
                           int var98 = 0;
                           if (var8 || var9 > var98) {
                              do {
                                 int var99 = arg1[var98];
                                 if (this.field1124.length <= var99) {
                                    ++var98;
                                 } else {
                                    int[] var100 = this.field1124[var99];
                                    int var101 = 0;
                                    if (!var8 && ~var101 <= ~var100.length) {
                                       ++var98;
                                    } else {
                                       do {
                                          class750 var102 = this.field1041[var100[var101]];
                                          var102.field10660 = var102.field10660 * arg2 >> 7;
                                          var102.field10658 = var102.field10658 * arg3 >> 7;
                                          ++var101;
                                       } while(~var101 > ~var100.length);

                                       ++var98;
                                    }
                                 }
                              } while(var9 > var98);
                           }
                        }

                     } else if (~arg0 == -10) {
                        if (this.field1124 != null) {
                           int var103 = 0;
                           if (var8 || var9 > var103) {
                              do {
                                 int var104 = arg1[var103];
                                 if (var104 >= this.field1124.length) {
                                    ++var103;
                                 } else {
                                    int[] var105 = this.field1124[var104];
                                    int var106 = 0;
                                    if (!var8 && var106 >= var105.length) {
                                       ++var103;
                                    } else {
                                       do {
                                          class750 var107 = this.field1041[var105[var106]];
                                          var107.field10653 = var107.field10653 + arg2 & 16383;
                                          ++var106;
                                       } while(var106 < var105.length);

                                       ++var103;
                                    }
                                 }
                              } while(var9 > var103);
                           }
                        }

                     }
                  } else {
                     int var64 = 0;
                     if (var8 || var9 > var64) {
                        do {
                           int var65 = arg1[var64];
                           if (~this.field1058.length >= ~var65) {
                              ++var64;
                           } else {
                              int[] var66 = this.field1058[var65];
                              int var67 = 0;
                              if (!var8 && var66.length <= var67) {
                                 ++var64;
                              } else {
                                 do {
                                    int var68 = var66[var67];
                                    this.field1094[var68] -= class717.field10284;
                                    this.field1039[var68] -= class39.field598;
                                    this.field1065[var68] -= class348.field5113;
                                    this.field1094[var68] = this.field1094[var68] * arg2 >> 7;
                                    this.field1039[var68] = this.field1039[var68] * arg3 >> 7;
                                    this.field1065[var68] = this.field1065[var68] * arg4 >> 7;
                                    this.field1094[var68] += class717.field10284;
                                    this.field1039[var68] += class39.field598;
                                    this.field1065[var68] += class348.field5113;
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
                  } else if (~var9 >= ~var21) {
                     var10000 = arg6;
                     if (!var8) {
                        if (arg6 != 0) {
                           var46 = 0;
                           if (var8 || ~var46 > ~var9) {
                              do {
                                 var47 = arg1[var46];
                                 if (var47 >= this.field1058.length) {
                                    ++var46;
                                 } else {
                                    var48 = this.field1058[var47];
                                    var49 = 0;
                                    if (!var8 && ~var49 <= ~var48.length) {
                                       ++var46;
                                    } else {
                                       label632:
                                       do {
                                          var50 = var48[var49];
                                          var51 = this.field1038[var50];
                                          var52 = this.field1038[var50 - -1];
                                          var53 = var51;
                                          if (!var8 && ~var52 >= ~var51) {
                                             ++var49;
                                          } else {
                                             do {
                                                var54 = this.field1097[var53] + -1;
                                                if (~var54 == 0) {
                                                   ++var49;
                                                   continue label632;
                                                }

                                                if (arg4 != 0) {
                                                   var55 = class160.field2447[arg4];
                                                   var56 = class160.field2446[arg4];
                                                   var57 = this.field1095[var54] * var55 - -(this.field1043[var54] * var56) + 16383 >> 14;
                                                   this.field1095[var54] = (short)(this.field1095[var54] * var56 + -(this.field1043[var54] * var55) + 16383 >> 14);
                                                   this.field1043[var54] = (short)var57;
                                                }

                                                if (arg2 != 0) {
                                                   var58 = class160.field2447[arg2];
                                                   var59 = class160.field2446[arg2];
                                                   var60 = this.field1095[var54] * var59 + 16383 - this.field1109[var54] * var58 >> 14;
                                                   this.field1109[var54] = (short)(this.field1095[var54] * var58 + this.field1109[var54] * var59 + 16383 >> 14);
                                                   this.field1095[var54] = (short)var60;
                                                }

                                                if (arg3 != 0) {
                                                   var61 = class160.field2447[arg3];
                                                   var62 = class160.field2446[arg3];
                                                   var63 = this.field1109[var54] * var61 + this.field1043[var54] * var62 + 16383 >> 14;
                                                   this.field1109[var54] = (short)(this.field1109[var54] * var62 + -(this.field1043[var54] * var61) + 16383 >> 14);
                                                   this.field1043[var54] = (short)var63;
                                                }

                                                ++var53;
                                             } while(~var52 < ~var53);

                                             ++var49;
                                          }
                                       } while(~var49 > ~var48.length);

                                       ++var46;
                                    }
                                 }
                              } while(~var46 > ~var9);
                           }

                           if (this.field1116 == null && this.field1045 != null) {
                              this.field1045.field6574 = null;
                           }

                           if (this.field1116 != null) {
                              this.field1116.field6574 = null;
                           }
                        }

                        return;
                     }
                  } else {
                     var10000 = arg1[var21];
                  }

                  while(true) {
                     int var22 = var10000;
                     if (~var22 <= ~this.field1058.length) {
                        ++var21;
                     } else {
                        label833: {
                           int[] var23 = this.field1058[var22];
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
                                 this.field1094[var25] -= class717.field10284;
                                 this.field1039[var25] -= class39.field598;
                                 this.field1065[var25] -= class348.field5113;
                                 if (~arg4 != -1) {
                                    var26 = class160.field2447[arg4];
                                    var27 = class160.field2446[arg4];
                                    var28 = this.field1094[var25] * var27 + this.field1039[var25] * var26 + 16383 >> 14;
                                    this.field1039[var25] = this.field1039[var25] * var27 - -16383 + -(this.field1094[var25] * var26) >> 14;
                                    this.field1094[var25] = var28;
                                 }

                                 if (~arg2 != -1) {
                                    var29 = class160.field2447[arg2];
                                    var30 = class160.field2446[arg2];
                                    var31 = this.field1039[var25] * var30 + 16383 + -(this.field1065[var25] * var29) >> 14;
                                    this.field1065[var25] = this.field1039[var25] * var29 + this.field1065[var25] * var30 + 16383 >> 14;
                                    this.field1039[var25] = var31;
                                 }

                                 if (~arg3 != -1) {
                                    var32 = class160.field2447[arg3];
                                    var33 = class160.field2446[arg3];
                                    var34 = this.field1094[var25] * var33 + (this.field1065[var25] * var32 - -16383) >> 14;
                                    this.field1065[var25] = this.field1065[var25] * var33 + -(this.field1094[var25] * var32) - -16383 >> 14;
                                    this.field1094[var25] = var34;
                                 }

                                 this.field1094[var25] += class717.field10284;
                                 this.field1039[var25] += class39.field598;
                                 this.field1065[var25] += class348.field5113;
                                 ++var24;
                              }

                              while(var24 < var23.length) {
                                 var25 = var23[var24];
                                 this.field1094[var25] -= class717.field10284;
                                 this.field1039[var25] -= class39.field598;
                                 this.field1065[var25] -= class348.field5113;
                                 if (~arg4 != -1) {
                                    var26 = class160.field2447[arg4];
                                    var27 = class160.field2446[arg4];
                                    var28 = this.field1094[var25] * var27 + this.field1039[var25] * var26 + 16383 >> 14;
                                    this.field1039[var25] = this.field1039[var25] * var27 - -16383 + -(this.field1094[var25] * var26) >> 14;
                                    this.field1094[var25] = var28;
                                 }

                                 if (~arg2 != -1) {
                                    var29 = class160.field2447[arg2];
                                    var30 = class160.field2446[arg2];
                                    var31 = this.field1039[var25] * var30 + 16383 + -(this.field1065[var25] * var29) >> 14;
                                    this.field1065[var25] = this.field1039[var25] * var29 + this.field1065[var25] * var30 + 16383 >> 14;
                                    this.field1039[var25] = var31;
                                 }

                                 if (~arg3 != -1) {
                                    var32 = class160.field2447[arg3];
                                    var33 = class160.field2446[arg3];
                                    var34 = this.field1094[var25] * var33 + (this.field1065[var25] * var32 - -16383) >> 14;
                                    this.field1065[var25] = this.field1065[var25] * var33 + -(this.field1094[var25] * var32) - -16383 >> 14;
                                    this.field1094[var25] = var34;
                                 }

                                 this.field1094[var25] += class717.field10284;
                                 this.field1039[var25] += class39.field598;
                                 this.field1065[var25] += class348.field5113;
                                 ++var24;
                              }

                              if (!var8) {
                                 ++var21;
                                 break label833;
                              }

                              var35 = 0;
                              if (var8) {
                                 var36 = var23[var35];
                                 this.field1094[var36] -= class717.field10284;
                                 this.field1039[var36] -= class39.field598;
                                 this.field1065[var36] -= class348.field5113;
                                 if (~arg2 != -1) {
                                    var37 = class160.field2447[arg2];
                                    var38 = class160.field2446[arg2];
                                    var39 = this.field1039[var36] * var38 + -(this.field1065[var36] * var37) + 16383 >> 14;
                                    this.field1065[var36] = this.field1065[var36] * var38 + this.field1039[var36] * var37 + 16383 >> 14;
                                    this.field1039[var36] = var39;
                                 }

                                 if (~arg4 != -1) {
                                    var40 = class160.field2447[arg4];
                                    var41 = class160.field2446[arg4];
                                    var42 = this.field1039[var36] * var40 - (-(this.field1094[var36] * var41) - 16383) >> 14;
                                    this.field1039[var36] = this.field1039[var36] * var41 - this.field1094[var36] * var40 + 16383 >> 14;
                                    this.field1094[var36] = var42;
                                 }

                                 if (arg3 != 0) {
                                    var43 = class160.field2447[arg3];
                                    var44 = class160.field2446[arg3];
                                    var45 = this.field1094[var36] * var44 + (this.field1065[var36] * var43 - -16383) >> 14;
                                    this.field1065[var36] = this.field1065[var36] * var44 + 16383 - this.field1094[var36] * var43 >> 14;
                                    this.field1094[var36] = var45;
                                 }

                                 this.field1094[var36] += class717.field10284;
                                 this.field1039[var36] += class39.field598;
                                 this.field1065[var36] += class348.field5113;
                                 ++var35;
                              }
                           } else {
                              var35 = 0;
                              if (var8) {
                                 var36 = var23[var35];
                                 this.field1094[var36] -= class717.field10284;
                                 this.field1039[var36] -= class39.field598;
                                 this.field1065[var36] -= class348.field5113;
                                 if (~arg2 != -1) {
                                    var37 = class160.field2447[arg2];
                                    var38 = class160.field2446[arg2];
                                    var39 = this.field1039[var36] * var38 + -(this.field1065[var36] * var37) + 16383 >> 14;
                                    this.field1065[var36] = this.field1065[var36] * var38 + this.field1039[var36] * var37 + 16383 >> 14;
                                    this.field1039[var36] = var39;
                                 }

                                 if (~arg4 != -1) {
                                    var40 = class160.field2447[arg4];
                                    var41 = class160.field2446[arg4];
                                    var42 = this.field1039[var36] * var40 - (-(this.field1094[var36] * var41) - 16383) >> 14;
                                    this.field1039[var36] = this.field1039[var36] * var41 - this.field1094[var36] * var40 + 16383 >> 14;
                                    this.field1094[var36] = var42;
                                 }

                                 if (arg3 != 0) {
                                    var43 = class160.field2447[arg3];
                                    var44 = class160.field2446[arg3];
                                    var45 = this.field1094[var36] * var44 + (this.field1065[var36] * var43 - -16383) >> 14;
                                    this.field1065[var36] = this.field1065[var36] * var44 + 16383 - this.field1094[var36] * var43 >> 14;
                                    this.field1094[var36] = var45;
                                 }

                                 this.field1094[var36] += class717.field10284;
                                 this.field1039[var36] += class39.field598;
                                 this.field1065[var36] += class348.field5113;
                                 ++var35;
                              }
                           }

                           while(~var35 > ~var23.length) {
                              var36 = var23[var35];
                              this.field1094[var36] -= class717.field10284;
                              this.field1039[var36] -= class39.field598;
                              this.field1065[var36] -= class348.field5113;
                              if (~arg2 != -1) {
                                 var37 = class160.field2447[arg2];
                                 var38 = class160.field2446[arg2];
                                 var39 = this.field1039[var36] * var38 + -(this.field1065[var36] * var37) + 16383 >> 14;
                                 this.field1065[var36] = this.field1065[var36] * var38 + this.field1039[var36] * var37 + 16383 >> 14;
                                 this.field1039[var36] = var39;
                              }

                              if (~arg4 != -1) {
                                 var40 = class160.field2447[arg4];
                                 var41 = class160.field2446[arg4];
                                 var42 = this.field1039[var36] * var40 - (-(this.field1094[var36] * var41) - 16383) >> 14;
                                 this.field1039[var36] = this.field1039[var36] * var41 - this.field1094[var36] * var40 + 16383 >> 14;
                                 this.field1094[var36] = var42;
                              }

                              if (arg3 != 0) {
                                 var43 = class160.field2447[arg3];
                                 var44 = class160.field2446[arg3];
                                 var45 = this.field1094[var36] * var44 + (this.field1065[var36] * var43 - -16383) >> 14;
                                 this.field1065[var36] = this.field1065[var36] * var44 + 16383 - this.field1094[var36] * var43 >> 14;
                                 this.field1094[var36] = var45;
                              }

                              this.field1094[var36] += class717.field10284;
                              this.field1039[var36] += class39.field598;
                              this.field1065[var36] += class348.field5113;
                              ++var35;
                           }

                           ++var21;
                        }
                     }

                     if (~var9 >= ~var21) {
                        var10000 = arg6;
                        if (!var8) {
                           if (arg6 != 0) {
                              var46 = 0;
                              if (var8 || ~var46 > ~var9) {
                                 do {
                                    var47 = arg1[var46];
                                    if (var47 >= this.field1058.length) {
                                       ++var46;
                                    } else {
                                       var48 = this.field1058[var47];
                                       var49 = 0;
                                       if (!var8 && ~var49 <= ~var48.length) {
                                          ++var46;
                                       } else {
                                          label264:
                                          do {
                                             var50 = var48[var49];
                                             var51 = this.field1038[var50];
                                             var52 = this.field1038[var50 - -1];
                                             var53 = var51;
                                             if (!var8 && ~var52 >= ~var51) {
                                                ++var49;
                                             } else {
                                                do {
                                                   var54 = this.field1097[var53] + -1;
                                                   if (~var54 == 0) {
                                                      ++var49;
                                                      continue label264;
                                                   }

                                                   if (arg4 != 0) {
                                                      var55 = class160.field2447[arg4];
                                                      var56 = class160.field2446[arg4];
                                                      var57 = this.field1095[var54] * var55 - -(this.field1043[var54] * var56) + 16383 >> 14;
                                                      this.field1095[var54] = (short)(this.field1095[var54] * var56 + -(this.field1043[var54] * var55) + 16383 >> 14);
                                                      this.field1043[var54] = (short)var57;
                                                   }

                                                   if (arg2 != 0) {
                                                      var58 = class160.field2447[arg2];
                                                      var59 = class160.field2446[arg2];
                                                      var60 = this.field1095[var54] * var59 + 16383 - this.field1109[var54] * var58 >> 14;
                                                      this.field1109[var54] = (short)(this.field1095[var54] * var58 + this.field1109[var54] * var59 + 16383 >> 14);
                                                      this.field1095[var54] = (short)var60;
                                                   }

                                                   if (arg3 != 0) {
                                                      var61 = class160.field2447[arg3];
                                                      var62 = class160.field2446[arg3];
                                                      var63 = this.field1109[var54] * var61 + this.field1043[var54] * var62 + 16383 >> 14;
                                                      this.field1109[var54] = (short)(this.field1109[var54] * var62 + -(this.field1043[var54] * var61) + 16383 >> 14);
                                                      this.field1043[var54] = (short)var63;
                                                   }

                                                   ++var53;
                                                } while(~var52 < ~var53);

                                                ++var49;
                                             }
                                          } while(~var49 > ~var48.length);

                                          ++var46;
                                       }
                                    }
                                 } while(~var46 > ~var9);
                              }

                              if (this.field1116 == null && this.field1045 != null) {
                                 this.field1045.field6574 = null;
                              }

                              if (this.field1116 != null) {
                                 this.field1116.field6574 = null;
                              }
                           }

                           return;
                        }
                     } else {
                        var10000 = arg1[var21];
                     }
                  }
               }
            } else {
               var112 = arg4 << 4;
               var110 = arg2 << 4;
               var111 = arg3 << 4;
               int var16 = 0;
               if (var8 || var9 > var16) {
                  do {
                     int var17 = arg1[var16];
                     if (this.field1058.length <= var17) {
                        ++var16;
                     } else {
                        int[] var18 = this.field1058[var17];
                        int var19 = 0;
                        if (!var8 && var18.length <= var19) {
                           ++var16;
                        } else {
                           do {
                              int var20 = var18[var19];
                              this.field1094[var20] += var110;
                              this.field1039[var20] += var111;
                              this.field1065[var20] += var112;
                              ++var19;
                           } while(var18.length > var19);

                           ++var16;
                        }
                     }
                  } while(var9 > var16);

               }
            }
         } else {
            var110 = arg2 << 4;
            var111 = arg3 << 4;
            var112 = arg4 << 4;
            class39.field598 = 0;
            class348.field5113 = 0;
            class717.field10284 = 0;
            int var10 = 0;
            int var11 = 0;
            if (var8) {
               var10000 = arg1[var11];
            } else if (var11 >= var9) {
               var10000 = var10;
               if (!var8) {
                  if (var10 <= 0) {
                     class348.field5113 = var112;
                     class39.field598 = var111;
                     class717.field10284 = var110;
                     return;
                  }

                  class39.field598 = class39.field598 / var10 + var111;
                  class348.field5113 = class348.field5113 / var10 + var112;
                  class717.field10284 = class717.field10284 / var10 + var110;
                  return;
               }
            } else {
               var10000 = arg1[var11];
            }

            while(true) {
               int var12 = var10000;
               if (~this.field1058.length >= ~var12) {
                  ++var11;
               } else {
                  int[] var13 = this.field1058[var12];
                  int var14 = 0;
                  int var15;
                  if (var8) {
                     var15 = var13[var14];
                     class717.field10284 += this.field1094[var15];
                     class39.field598 += this.field1039[var15];
                     class348.field5113 += this.field1065[var15];
                     ++var10;
                     ++var14;
                  }

                  while(var13.length > var14) {
                     var15 = var13[var14];
                     class717.field10284 += this.field1094[var15];
                     class39.field598 += this.field1039[var15];
                     class348.field5113 += this.field1065[var15];
                     ++var10;
                     ++var14;
                  }

                  ++var11;
               }

               if (var11 >= var9) {
                  var10000 = var10;
                  if (!var8) {
                     if (var10 <= 0) {
                        class348.field5113 = var112;
                        class39.field598 = var111;
                        class717.field10284 = var110;
                        return;
                     }

                     class39.field598 = class39.field598 / var10 + var111;
                     class348.field5113 = class348.field5113 / var10 + var112;
                     class717.field10284 = class717.field10284 / var10 + var110;
                     return;
                  }
               } else {
                  var10000 = arg1[var11];
               }
            }
         }
      } catch (RuntimeException var109) {
         throw class612.method4503(var109, field1160[35] + arg0 + ',' + (arg1 != null ? field1160[4] : field1160[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "P",
      descriptor = "(IIII)V"
   )
   public final void method766(int arg0, int arg1, int arg2, int arg3) {
      boolean var5 = client.field10022;

      try {
         ++field1118;
         if (~arg0 != -1) {
            if (arg0 != 1) {
               if (arg0 != 2) {
                  if (~arg0 != -4) {
                     if (~arg0 != -6) {
                        if (arg0 != 7) {
                           if (arg0 != 8) {
                              if (~arg0 != -11) {
                                 if (arg0 == 9) {
                                    int var40 = 0;
                                    if (var5 || var40 < this.field1105) {
                                       do {
                                          class750 var41 = this.field1041[var40];
                                          var41.field10653 = 16383 & var41.field10653 + arg1;
                                          ++var40;
                                       } while(var40 < this.field1105);

                                    }
                                 }
                              } else {
                                 int var38 = 0;
                                 if (var5 || ~var38 > ~this.field1105) {
                                    do {
                                       class750 var39 = this.field1041[var38];
                                       var39.field10660 = var39.field10660 * arg1 >> 7;
                                       var39.field10658 = var39.field10658 * arg2 >> 7;
                                       ++var38;
                                    } while(~var38 > ~this.field1105);

                                 }
                              }
                           } else {
                              int var36 = 0;
                              if (var5 || this.field1105 > var36) {
                                 do {
                                    class750 var37 = this.field1041[var36];
                                    var37.field10655 += arg2;
                                    var37.field10656 += arg1;
                                    ++var36;
                                 } while(this.field1105 > var36);

                              }
                           }
                        } else {
                           int var25 = 0;
                           int var33;
                           class152 var34;
                           class750 var35;
                           class71 var44;
                           if (var5) {
                              var44 = this;
                           } else if (~var25 <= ~this.field1066) {
                              var44 = this;
                              if (!var5) {
                                 if (this.field1045 != null) {
                                    this.field1045.field6574 = null;
                                 }

                                 if (this.field1103 != null) {
                                    var33 = 0;
                                    if (var5 || ~var33 > ~this.field1105) {
                                       do {
                                          var34 = this.field1103[var33];
                                          var35 = this.field1041[var33];
                                          var35.field10654 = -16777216 & var35.field10654 | class744.field10589[65535 & this.field1106[var34.field2332]] & 16777215;
                                          ++var33;
                                       } while(~var33 > ~this.field1105);
                                    }
                                 }

                                 return;
                              }
                           } else {
                              var44 = this;
                           }

                           while(true) {
                              int var26 = var44.field1106[var25] & 65535;
                              int var27 = var26 >> 10 & 63;
                              int var28 = (1008 & var26) >> 7;
                              int var29 = 63 & arg1 + var27;
                              int var30 = arg2 / 4 + var28;
                              int var31 = 127 & var26;
                              if (var30 < 0) {
                                 var30 = 0;
                                 if (var5 && ~var30 < -8) {
                                    var30 = 7;
                                 }
                              } else if (~var30 < -8) {
                                 var30 = 7;
                              }

                              int var32 = arg3 + var31;
                              if (~var32 > -1) {
                                 var32 = 0;
                                 if (var5 && ~var32 < -128) {
                                    var32 = 127;
                                 }
                              } else if (~var32 < -128) {
                                 var32 = 127;
                              }

                              this.field1106[var25] = (short)class91.method932(var32, class91.method932(var30 << 7, var29 << 10));
                              ++var25;
                              if (~var25 <= ~this.field1066) {
                                 var44 = this;
                                 if (!var5) {
                                    if (this.field1045 != null) {
                                       this.field1045.field6574 = null;
                                    }

                                    if (this.field1103 != null) {
                                       var33 = 0;
                                       if (var5 || ~var33 > ~this.field1105) {
                                          do {
                                             var34 = this.field1103[var33];
                                             var35 = this.field1041[var33];
                                             var35.field10654 = -16777216 & var35.field10654 | class744.field10589[65535 & this.field1106[var34.field2332]] & 16777215;
                                             ++var33;
                                          } while(~var33 > ~this.field1105);
                                       }
                                    }

                                    return;
                                 }
                              } else {
                                 var44 = this;
                              }
                           }
                        }
                     } else {
                        int var20 = 0;
                        int var21;
                        if (var5) {
                           var21 = (255 & this.field1155[var20]) + arg1 * 8;
                           if (~var21 <= -1) {
                              if (~var21 < -256) {
                                 var21 = 255;
                                 if (var5) {
                                    var21 = 0;
                                 }
                              }
                           } else {
                              var21 = 0;
                           }

                           this.field1155[var20] = (byte)var21;
                           ++var20;
                        }

                        while(this.field1066 > var20) {
                           var21 = (255 & this.field1155[var20]) + arg1 * 8;
                           if (~var21 <= -1) {
                              if (~var21 < -256) {
                                 var21 = 255;
                                 if (var5) {
                                    var21 = 0;
                                 }
                              }
                           } else {
                              var21 = 0;
                           }

                           this.field1155[var20] = (byte)var21;
                           ++var20;
                        }

                        if (this.field1045 != null) {
                           this.field1045.field6574 = null;
                        }

                        if (this.field1103 != null) {
                           int var22 = 0;
                           if (var5 || ~var22 > ~this.field1105) {
                              do {
                                 class152 var23 = this.field1103[var22];
                                 class750 var24 = this.field1041[var22];
                                 var24.field10654 = 16777215 & var24.field10654 | -(this.field1155[var23.field2332] & 255) + 255 << 24;
                                 ++var22;
                              } while(~var22 > ~this.field1105);
                           }
                        }

                     }
                  } else {
                     int var19 = 0;
                     if (var5) {
                        this.field1094[var19] -= class717.field10284;
                        this.field1039[var19] -= class39.field598;
                        this.field1065[var19] -= class348.field5113;
                        this.field1094[var19] = this.field1094[var19] * arg1 / 128;
                        this.field1039[var19] = this.field1039[var19] * arg2 / 128;
                        this.field1065[var19] = this.field1065[var19] * arg3 / 128;
                        this.field1094[var19] += class717.field10284;
                        this.field1039[var19] += class39.field598;
                        this.field1065[var19] += class348.field5113;
                        ++var19;
                     }

                     while(true) {
                        while(this.field1142 > var19) {
                           this.field1094[var19] -= class717.field10284;
                           this.field1039[var19] -= class39.field598;
                           this.field1065[var19] -= class348.field5113;
                           this.field1094[var19] = this.field1094[var19] * arg1 / 128;
                           this.field1039[var19] = this.field1039[var19] * arg2 / 128;
                           this.field1065[var19] = this.field1065[var19] * arg3 / 128;
                           this.field1094[var19] += class717.field10284;
                           this.field1039[var19] += class39.field598;
                           this.field1065[var19] += class348.field5113;
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
                     this.field1094[var9] -= class717.field10284;
                     this.field1039[var9] -= class39.field598;
                     this.field1065[var9] -= class348.field5113;
                  } else if (var9 >= this.field1142) {
                     if (!var5) {
                        return;
                     }
                  } else {
                     this.field1094[var9] -= class717.field10284;
                     this.field1039[var9] -= class39.field598;
                     this.field1065[var9] -= class348.field5113;
                  }

                  while(true) {
                     if (~arg3 != -1) {
                        int var10 = class160.field2447[arg3];
                        int var11 = class160.field2446[arg3];
                        int var12 = this.field1094[var9] * var11 + this.field1039[var9] * var10 + 16383 >> 14;
                        this.field1039[var9] = this.field1039[var9] * var11 + -(this.field1094[var9] * var10) + 16383 >> 14;
                        this.field1094[var9] = var12;
                     }

                     if (~arg1 != -1) {
                        int var13 = class160.field2447[arg1];
                        int var14 = class160.field2446[arg1];
                        int var15 = this.field1039[var9] * var14 + 16383 - this.field1065[var9] * var13 >> 14;
                        this.field1065[var9] = this.field1065[var9] * var14 + this.field1039[var9] * var13 + 16383 >> 14;
                        this.field1039[var9] = var15;
                     }

                     if (~arg2 != -1) {
                        int var16 = class160.field2447[arg2];
                        int var17 = class160.field2446[arg2];
                        int var18 = this.field1065[var9] * var16 + this.field1094[var9] * var17 + 16383 >> 14;
                        this.field1065[var9] = this.field1065[var9] * var17 + -(this.field1094[var9] * var16) + 16383 >> 14;
                        this.field1094[var9] = var18;
                     }

                     this.field1094[var9] += class717.field10284;
                     this.field1039[var9] += class39.field598;
                     this.field1065[var9] += class348.field5113;
                     ++var9;
                     if (var9 >= this.field1142) {
                        if (!var5) {
                           return;
                        }
                     } else {
                        this.field1094[var9] -= class717.field10284;
                        this.field1039[var9] -= class39.field598;
                        this.field1065[var9] -= class348.field5113;
                     }
                  }
               }
            } else {
               int var8 = 0;
               if (var5) {
                  this.field1094[var8] += arg1;
                  this.field1039[var8] += arg2;
                  this.field1065[var8] += arg3;
                  ++var8;
               }

               while(true) {
                  while(var8 < this.field1142) {
                     this.field1094[var8] += arg1;
                     this.field1039[var8] += arg2;
                     this.field1065[var8] += arg3;
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
            class717.field10284 = 0;
            class348.field5113 = 0;
            class39.field598 = 0;
            int var7 = 0;
            if (var5) {
               class717.field10284 += this.field1094[var7];
               class39.field598 += this.field1039[var7];
               ++var6;
               class348.field5113 += this.field1065[var7];
               ++var7;
            }

            while(true) {
               while(~this.field1142 < ~var7) {
                  class717.field10284 += this.field1094[var7];
                  class39.field598 += this.field1039[var7];
                  ++var6;
                  class348.field5113 += this.field1065[var7];
                  ++var7;
               }

               int var10000 = ~var6;
               if (!var5) {
                  if (var10000 >= -1) {
                     class348.field5113 = arg3;
                     class717.field10284 = arg1;
                     class39.field598 = arg2;
                     return;
                  }

                  class39.field598 = class39.field598 / var6 + arg2;
                  class717.field10284 = class717.field10284 / var6 + arg1;
                  class348.field5113 = class348.field5113 / var6 - -arg3;
                  return;
               }

               class348.field5113 = var10000 + -1;
               ++var7;
            }
         }
      } catch (RuntimeException var43) {
         throw class612.method4503(var43, field1160[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "r",
      descriptor = "()Z"
   )
   public final boolean method767() {
      try {
         ++field1085;
         return this.field1060;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1160[46] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "a",
      descriptor = "(IIII)V"
   )
   public final void method768(int arg0, int arg1, int arg2, int arg3) {
      boolean var5 = client.field10022;

      try {
         int var6 = 0;
         int var11;
         class152 var12;
         class750 var13;
         int var10000;
         if (var5) {
            var10000 = 65535 & this.field1106[var6];
         } else if (this.field1066 <= var6) {
            var10000 = field1149 + 1;
            if (!var5) {
               field1149 = var10000;
               if (this.field1103 != null) {
                  var11 = 0;
                  if (var5 || this.field1105 > var11) {
                     do {
                        var12 = this.field1103[var11];
                        var13 = this.field1041[var11];
                        var13.field10654 = class744.field10589[this.field1106[var12.field2332] & 65535] & 16777215 | var13.field10654 & -16777216;
                        ++var11;
                     } while(this.field1105 > var11);
                  }
               }

               if (this.field1045 != null) {
                  this.field1045.field6574 = null;
                  return;
               }

               return;
            }
         } else {
            var10000 = 65535 & this.field1106[var6];
         }

         while(true) {
            int var7 = var10000;
            int var8 = (var7 & 65175) >> 10;
            int var9 = (920 & var7) >> 7;
            int var10 = var7 & 127;
            if (~arg1 != 0) {
               var9 += (-var9 + arg1) * arg3 >> 7;
            }

            if (~arg0 != 0) {
               var8 += (-var8 + arg0) * arg3 >> 7;
            }

            if (~arg2 != 0) {
               var10 += (-var10 + arg2) * arg3 >> 7;
            }

            this.field1106[var6] = (short)class91.method932(var10, class91.method932(var8 << 10, var9 << 7));
            ++var6;
            if (this.field1066 <= var6) {
               var10000 = field1149 + 1;
               if (!var5) {
                  field1149 = var10000;
                  if (this.field1103 != null) {
                     var11 = 0;
                     if (var5 || this.field1105 > var11) {
                        do {
                           var12 = this.field1103[var11];
                           var13 = this.field1041[var11];
                           var13.field10654 = class744.field10589[this.field1106[var12.field2332] & 65535] & 16777215 | var13.field10654 & -16777216;
                           ++var11;
                        } while(this.field1105 > var11);
                     }
                  }

                  if (this.field1045 != null) {
                     this.field1045.field6574 = null;
                     return;
                  }

                  return;
               }
            } else {
               var10000 = 65535 & this.field1106[var6];
            }
         }
      } catch (RuntimeException var15) {
         throw class612.method4503(var15, field1160[39] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "NA",
      descriptor = "()Z"
   )
   public final boolean method769() {
      boolean var1 = client.field10022;

      try {
         ++field1135;
         if (this.field1058 == null) {
            return false;
         } else {
            int var2 = 0;
            if (var1) {
               this.field1094[var2] <<= 4;
               this.field1039[var2] <<= 4;
               this.field1065[var2] <<= 4;
               ++var2;
            }

            while(true) {
               while(~var2 > ~this.field1114) {
                  this.field1094[var2] <<= 4;
                  this.field1039[var2] <<= 4;
                  this.field1065[var2] <<= 4;
                  ++var2;
               }

               class39.field598 = 0;
               class348.field5113 = 0;
               class717.field10284 = 0;
               if (!var1) {
                  return true;
               }

               ++var2;
            }
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field1160[12] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "p",
      descriptor = "(IILs;Ls;III)V"
   )
   public final void method770(int arg0, int arg1, class751 arg2, class751 arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field10022;

      try {
         if (!this.field1056) {
            this.method772(false);
         }

         ++field1088;
         int var9 = this.field1078 + arg4;
         int var10 = this.field1071 + arg4;
         int var11 = this.field1064 + arg6;
         int var12 = this.field1100 + arg6;
         if (~arg0 != -2 && ~arg0 != -3 && arg0 != 3 && ~arg0 != -6 || ~var9 <= -1 && ~arg2.field10665 < ~(arg2.field10672 + var10 >> arg2.field10671) && ~var11 <= -1 && var12 - -arg2.field10672 >> arg2.field10671 < arg2.field10666) {
            if (arg0 != 4 && arg0 != 5) {
               int var13 = var9 >> arg2.field10671;
               int var14 = arg2.field10672 + var10 + -1 >> arg2.field10671;
               int var15 = var11 >> arg2.field10671;
               int var16 = var12 + -1 + arg2.field10672 >> arg2.field10671;
               if (arg2.method5400(-1, var15, var13) == arg5 && ~arg2.method5400(-1, var15, var14) == ~arg5 && ~arg2.method5400(-1, var16, var13) == ~arg5 && arg5 == arg2.method5400(-1, var16, var14)) {
                  return;
               }
            } else {
               if (arg3 == null) {
                  return;
               }

               if (~var9 > -1 || arg3.field10665 <= arg3.field10672 + var10 >> arg3.field10671 || var11 < 0 || arg3.field10666 <= arg3.field10672 + var12 >> arg3.field10671) {
                  return;
               }
            }

            label249: {
               if (arg0 == 1) {
                  int var17 = 0;
                  if (var8) {
                     this.field1039[var17] -= -arg2.method5401(this.field1094[var17] + arg4, true, this.field1065[var17] + arg6) - -arg5;
                     ++var17;
                  }

                  while(true) {
                     while(~var17 > ~this.field1142) {
                        this.field1039[var17] -= -arg2.method5401(this.field1094[var17] + arg4, true, this.field1065[var17] + arg6) - -arg5;
                        ++var17;
                     }

                     if (!var8) {
                        if (!var8) {
                           break label249;
                        }
                        break;
                     }

                     ++var17;
                  }
               }

               if (~arg0 == -3) {
                  short var18 = this.field1048;
                  if (var18 == 0) {
                     return;
                  }

                  int var19 = 0;
                  if (var8 || this.field1142 > var19) {
                     do {
                        int var20 = (this.field1039[var19] << 16) / var18;
                        if (~arg1 < ~var20) {
                           this.field1039[var19] += (-var20 + arg1) * (arg2.method5401(this.field1094[var19] + arg4, true, this.field1065[var19] - -arg6) + -arg5) / arg1;
                        }

                        ++var19;
                     } while(this.field1142 > var19);
                  }

                  if (!var8) {
                     break label249;
                  }
               }

               if (arg0 == 3) {
                  int var21 = (255 & arg1) * 4;
                  int var22 = (arg1 >> 8 & 255) * 4;
                  int var23 = 16320 & arg1 >> 16 << 6;
                  int var24 = (255 & arg1 >> 24) << 6;
                  if (~(-(var21 >> 1) + arg4) > -1 || ~(arg2.field10665 << arg2.field10671) >= ~((var21 >> 1) + arg2.field10672 + arg4) || ~(-(var22 >> 1) + arg6) > -1 || ~(arg2.field10666 << arg2.field10671) >= ~(arg6 - -(var22 >> 1) + arg2.field10672)) {
                     return;
                  }

                  this.method5491(var22, var23, arg5, var21, arg6, 61, arg4, var24, arg2);
                  if (!var8) {
                     break label249;
                  }
               }

               if (arg0 == 4) {
                  int var25 = this.field1121 - this.field1048;
                  int var26 = 0;
                  if (var8) {
                     this.field1039[var26] = var25 + (this.field1039[var26] - -arg3.method5401(this.field1094[var26] + arg4, true, this.field1065[var26] + arg6)) - arg5;
                     ++var26;
                  }

                  while(true) {
                     while(~var26 > ~this.field1142) {
                        this.field1039[var26] = var25 + (this.field1039[var26] - -arg3.method5401(this.field1094[var26] + arg4, true, this.field1065[var26] + arg6)) - arg5;
                        ++var26;
                     }

                     if (!var8) {
                        if (!var8) {
                           break label249;
                        }
                        break;
                     }

                     ++var26;
                  }
               }

               if (~arg0 == -6) {
                  int var27 = -this.field1048 + this.field1121;
                  int var28 = 0;
                  if (var8 || ~var28 > ~this.field1142) {
                     do {
                        int var29 = this.field1094[var28] + arg4;
                        int var30 = this.field1065[var28] + arg6;
                        int var31 = arg2.method5401(var29, true, var30);
                        int var32 = arg3.method5401(var29, true, var30);
                        int var33 = -arg1 + -var32 + var31;
                        this.field1039[var28] = ((this.field1039[var28] << 8) / var27 * var33 >> 8) + (-arg5 - -var31);
                        ++var28;
                     } while(~var28 > ~this.field1142);
                  }
               }
            }

            if (this.field1120 != null) {
               this.field1120.field6574 = null;
            }

            this.field1056 = false;
         }
      } catch (RuntimeException var35) {
         throw class612.method4503(var35, field1160[40] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1160[4] : field1160[2]) + ',' + (arg3 != null ? field1160[4] : field1160[2]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "LA",
      descriptor = "(I)V"
   )
   public final void method771(int arg0) {
      try {
         this.field1140 = (short)arg0;
         if (this.field1045 != null) {
            this.field1045.field6574 = null;
         }

         ++field1132;
         if (this.field1116 != null) {
            this.field1116.field6574 = null;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1160[34] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "a",
      descriptor = "(Z)V"
   )
   private final void method772(boolean arg0) {
      boolean var2 = client.field10022;

      try {
         ++field1082;
         int var3 = 32767;
         int var4 = 32767;
         int var5 = 32767;
         int var6 = -32768;
         int var7 = -32768;
         int var8 = -32768;
         int var9 = 0;
         int var10 = 0;
         int var11 = 0;
         int var10000;
         if (var2) {
            var10000 = this.field1094[var11];
         } else if (this.field1142 <= var11) {
            this.field1048 = (short)var4;
            var10000 = arg0;
            if (!var2) {
               if (arg0 != 0) {
                  this.field1089 = -99;
               }

               this.field1121 = (short)var7;
               this.field1078 = (short)var3;
               this.field1100 = (short)var8;
               this.field1064 = (short)var5;
               this.field1071 = (short)var6;
               this.field1134 = (short)((int)(Math.sqrt((double)var9) + 0.99D));
               this.field1111 = (short)((int)(0.99D + Math.sqrt((double)var10)));
               this.field1056 = true;
               return;
            }
         } else {
            var10000 = this.field1094[var11];
         }

         while(true) {
            int var12 = var10000;
            int var13 = this.field1039[var11];
            if (var12 > var6) {
               var6 = var12;
            }

            if (~var7 > ~var13) {
               var7 = var13;
            }

            int var14 = this.field1065[var11];
            if (var3 > var12) {
               var3 = var12;
            }

            if (~var13 > ~var4) {
               var4 = var13;
            }

            if (~var5 < ~var14) {
               var5 = var14;
            }

            if (var8 < var14) {
               var8 = var14;
            }

            int var15 = var12 * var12 + var14 * var14;
            if (~var9 > ~var15) {
               var9 = var15;
            }

            int var16 = var13 * var13 + (var12 * var12 - -(var14 * var14));
            if (~var16 < ~var10) {
               var10 = var16;
            }

            ++var11;
            if (this.field1142 <= var11) {
               this.field1048 = (short)var4;
               var10000 = arg0;
               if (!var2) {
                  if (arg0 != 0) {
                     this.field1089 = -99;
                  }

                  this.field1121 = (short)var7;
                  this.field1078 = (short)var3;
                  this.field1100 = (short)var8;
                  this.field1064 = (short)var5;
                  this.field1071 = (short)var6;
                  this.field1134 = (short)((int)(Math.sqrt((double)var9) + 0.99D));
                  this.field1111 = (short)((int)(0.99D + Math.sqrt((double)var10)));
                  this.field1056 = true;
                  return;
               }
            } else {
               var10000 = this.field1094[var11];
            }
         }
      } catch (RuntimeException var18) {
         throw class612.method4503(var18, field1160[42] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "VA",
      descriptor = "(I)V"
   )
   public final void method773(int arg0) {
      boolean var2 = client.field10022;

      try {
         ++field1156;
         int var3 = class160.field2447[arg0];
         int var4 = class160.field2446[arg0];
         int var5 = 0;
         if (!var2 && ~var5 <= ~this.field1142) {
            if (this.field1120 != null) {
               this.field1120.field6574 = null;
            }

            this.field1056 = false;
         } else {
            do {
               int var6 = this.field1039[var5] * var3 - -(this.field1094[var5] * var4) >> 14;
               this.field1039[var5] = this.field1039[var5] * var4 + -(this.field1094[var5] * var3) >> 14;
               this.field1094[var5] = var6;
               ++var5;
            } while(~var5 > ~this.field1142);

            if (this.field1120 != null) {
               this.field1120.field6574 = null;
            }

            this.field1056 = false;
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field1160[24] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "b",
      descriptor = "()[B"
   )
   public final byte[] method774() {
      try {
         ++field1081;
         return this.field1155;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1160[25] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "ua",
      descriptor = "()I"
   )
   public final int method775() {
      try {
         ++field1126;
         return this.field1054;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1160[27] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "a",
      descriptor = "(IZ)V"
   )
   private final void method776(int arg0, boolean arg1) {
      boolean var3 = client.field10022;

      try {
         label82: {
            ++field1098;
            if (this.field1063.field9816.field942.length < this.field1077 * 6) {
               this.field1063.field9816 = new class637(this.field1077 * 6 + 600);
               if (!var3) {
                  break label82;
               }
            }

            this.field1063.field9816.field945 = 0;
         }

         class637 var4 = this.field1063.field9816;
         int var5;
         if (this.field1063.field9826) {
            var5 = 0;
            if (var3) {
               var4.method653(this.field1107[var5], -124);
               var4.method653(this.field1084[var5], -121);
               var4.method653(this.field1079[var5], -92);
               ++var5;
            }

            while(true) {
               while(~this.field1077 < ~var5) {
                  var4.method653(this.field1107[var5], -124);
                  var4.method653(this.field1084[var5], -121);
                  var4.method653(this.field1079[var5], -92);
                  ++var5;
               }

               if (!var3) {
                  if (var3) {
                     var5 = 0;
                     if (var3) {
                        var4.method695(this.field1107[var5], (byte)-67);
                        var4.method695(this.field1084[var5], (byte)-52);
                        var4.method695(this.field1079[var5], (byte)-23);
                        ++var5;
                     }
                  } else {
                     if (!var3) {
                        if (var4.field945 == 0) {
                           return;
                        }

                        if (arg0 != 4) {
                           this.method809(53);
                        }

                        label167: {
                           if (!arg1) {
                              this.field1115.field10074 = this.field1063.method4899(5123, arg0 + -129, var4.field942, false, var4.field945);
                              if (!var3) {
                                 break label167;
                              }
                           }

                           label131: {
                              if (this.field1112 == null) {
                                 this.field1112 = this.field1063.method4899(5123, 100, var4.field942, true, var4.field945);
                                 if (!var3) {
                                    break label131;
                                 }
                              }

                              this.field1112.method996(5123, var4.field942, -85, var4.field945);
                           }

                           this.field1115.field10074 = this.field1112;
                        }

                        if (!arg1) {
                           this.field1110 = true;
                           return;
                        }

                        return;
                     }

                     var4.method695(this.field1079[var5], (byte)-23);
                     ++var5;
                  }
                  break;
               }

               ++var5;
            }
         } else {
            var5 = 0;
            if (var3) {
               var4.method695(this.field1107[var5], (byte)-67);
               var4.method695(this.field1084[var5], (byte)-52);
               var4.method695(this.field1079[var5], (byte)-23);
               ++var5;
            }
         }

         while(true) {
            while(~var5 > ~this.field1077) {
               var4.method695(this.field1107[var5], (byte)-67);
               var4.method695(this.field1084[var5], (byte)-52);
               var4.method695(this.field1079[var5], (byte)-23);
               ++var5;
            }

            if (!var3) {
               if (var4.field945 == 0) {
                  return;
               }

               if (arg0 != 4) {
                  this.method809(53);
               }

               label171: {
                  if (!arg1) {
                     this.field1115.field10074 = this.field1063.method4899(5123, arg0 + -129, var4.field942, false, var4.field945);
                     if (!var3) {
                        break label171;
                     }
                  }

                  label49: {
                     if (this.field1112 == null) {
                        this.field1112 = this.field1063.method4899(5123, 100, var4.field942, true, var4.field945);
                        if (!var3) {
                           break label49;
                        }
                     }

                     this.field1112.method996(5123, var4.field942, -85, var4.field945);
                  }

                  this.field1115.field10074 = this.field1112;
               }

               if (!arg1) {
                  this.field1110 = true;
                  return;
               }

               return;
            }

            var4.method695(this.field1079[var5], (byte)-23);
            ++var5;
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field1160[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "a",
      descriptor = "(ILrv;IZZLrv;)Lka;"
   )
   private final class761 method777(int arg0, class71 arg1, int arg2, boolean arg3, boolean arg4, class71 arg5) {
      boolean var7 = client.field10022;

      try {
         label614: {
            arg5.field1136 = 0;
            arg5.field1142 = this.field1142;
            arg5.field1054 = arg0;
            arg5.field1114 = this.field1114;
            arg5.field1129 = this.field1129;
            arg5.field1077 = this.field1077;
            arg5.field1105 = this.field1105;
            if ((256 & arg0) == 0) {
               arg5.field1050 = this.field1050;
               if (!var7) {
                  break label614;
               }
            }

            arg5.field1050 = true;
         }

         label619: {
            arg5.field1140 = this.field1140;
            arg5.field1066 = this.field1066;
            ++field1157;
            arg5.field1089 = this.field1089;
            arg5.field1059 = this.field1059;
            arg5.field1060 = this.field1060;
            boolean var8 = class129.method1322(this.field1129, arg0, (byte)112);
            boolean var9 = class237.method2091(this.field1129, arg0, -19540);
            boolean var10 = class445.method3451(this.field1129, arg2 + -13203, arg0);
            boolean var11 = var10 | var8 | var9;
            if (!var11) {
               arg5.field1065 = this.field1065;
               arg5.field1094 = this.field1094;
               arg5.field1039 = this.field1039;
               if (!var7) {
                  break label619;
               }
            }

            label620: {
               if (!var8) {
                  arg5.field1094 = this.field1094;
                  if (!var7) {
                     break label620;
                  }
               }

               if (arg1.field1094 != null && ~arg1.field1094.length <= ~this.field1114) {
                  arg5.field1094 = arg1.field1094;
                  if (!var7) {
                     break label620;
                  }
               }

               arg5.field1094 = arg1.field1094 = new int[this.field1114];
            }

            label595: {
               if (var9) {
                  if (arg1.field1039 != null && this.field1114 <= arg1.field1039.length) {
                     arg5.field1039 = arg1.field1039;
                     if (!var7) {
                        break label595;
                     }
                  }

                  arg5.field1039 = arg1.field1039 = new int[this.field1114];
                  if (!var7) {
                     break label595;
                  }
               }

               arg5.field1039 = this.field1039;
            }

            label586: {
               if (var10) {
                  if (arg1.field1065 == null || this.field1114 > arg1.field1065.length) {
                     arg5.field1065 = arg1.field1065 = new int[this.field1114];
                     if (!var7) {
                        break label586;
                     }
                  }

                  arg5.field1065 = arg1.field1065;
                  if (!var7) {
                     break label586;
                  }
               }

               arg5.field1065 = this.field1065;
            }

            int var12 = 0;
            if (var7 || this.field1114 > var12) {
               do {
                  if (var8) {
                     arg5.field1094[var12] = this.field1094[var12];
                  }

                  if (var9) {
                     arg5.field1039[var12] = this.field1039[var12];
                  }

                  if (var10) {
                     arg5.field1065[var12] = this.field1065[var12];
                  }

                  ++var12;
               } while(this.field1114 > var12);
            }
         }

         label622: {
            if (class190.method1688(22296, this.field1129, arg0)) {
               arg5.field1120 = arg1.field1120;
               if (arg4) {
                  arg5.field1136 = (byte)(arg5.field1136 | 1);
               }

               arg5.field1120.field6574 = this.field1120.field6574;
               arg5.field1120.field6569 = this.field1120.field6569;
               if (!var7) {
                  break label622;
               }
            }

            if (class367.method2890(arg0, -80, this.field1129)) {
               arg5.field1120 = this.field1120;
               if (!var7) {
                  break label622;
               }
            }

            arg5.field1120 = null;
         }

         label556: {
            if (class431.method3361(this.field1129, arg0, (byte)32)) {
               label659: {
                  if (arg1.field1106 == null || this.field1066 > arg1.field1106.length) {
                     arg5.field1106 = arg1.field1106 = new short[this.field1066];
                     if (!var7) {
                        break label659;
                     }
                  }

                  arg5.field1106 = arg1.field1106;
               }

               int var13 = 0;
               if (var7) {
                  arg5.field1106[var13] = this.field1106[var13];
                  ++var13;
               }

               while(true) {
                  while(~var13 > ~this.field1066) {
                     arg5.field1106[var13] = this.field1106[var13];
                     ++var13;
                  }

                  if (!var7) {
                     if (!var7) {
                        break label556;
                     }
                     break;
                  }

                  ++var13;
               }
            }

            arg5.field1106 = this.field1106;
         }

         label626: {
            if (!class51.method553(false, arg0, this.field1129)) {
               arg5.field1155 = this.field1155;
               if (!var7) {
                  break label626;
               }
            }

            label661: {
               if (arg1.field1155 == null || arg1.field1155.length < this.field1066) {
                  arg5.field1155 = arg1.field1155 = new byte[this.field1066];
                  if (!var7) {
                     break label661;
                  }
               }

               arg5.field1155 = arg1.field1155;
            }

            int var14 = 0;
            if (var7 || this.field1066 > var14) {
               do {
                  arg5.field1155[var14] = this.field1155[var14];
                  ++var14;
               } while(this.field1066 > var14);
            }
         }

         label627: {
            if (!class266.method2276(arg0, this.field1129, arg2 + 15938)) {
               if (!class428.method3349(this.field1129, arg0, -88)) {
                  arg5.field1045 = null;
                  if (!var7) {
                     break label627;
                  }
               }

               arg5.field1045 = this.field1045;
               if (!var7) {
                  break label627;
               }
            }

            if (arg4) {
               arg5.field1136 = (byte)(arg5.field1136 | 2);
            }

            arg5.field1045 = arg1.field1045;
            arg5.field1045.field6569 = this.field1045.field6569;
            arg5.field1045.field6574 = this.field1045.field6574;
         }

         label493: {
            if (class512.method3859(arg0, 544, this.field1129)) {
               label490: {
                  if (arg1.field1043 != null && this.field1059 <= arg1.field1043.length) {
                     arg5.field1095 = arg1.field1095;
                     arg5.field1043 = arg1.field1043;
                     arg5.field1109 = arg1.field1109;
                     if (!var7) {
                        break label490;
                     }
                  }

                  int var15 = this.field1059;
                  arg5.field1109 = arg1.field1109 = new short[var15];
                  arg5.field1095 = arg1.field1095 = new short[var15];
                  arg5.field1043 = arg1.field1043 = new short[var15];
               }

               label629: {
                  if (this.field1127 != null) {
                     if (arg1.field1127 == null) {
                        arg1.field1127 = new class645();
                     }

                     class645 var16 = arg5.field1127 = arg1.field1127;
                     if (var16.field9079 == null || ~this.field1059 < ~var16.field9079.length) {
                        int var17 = this.field1059;
                        var16.field9075 = new byte[var17];
                        var16.field9078 = new short[var17];
                        var16.field9079 = new short[var17];
                        var16.field9074 = new short[var17];
                     }

                     int var18 = 0;
                     if (var7) {
                        arg5.field1043[var18] = this.field1043[var18];
                        arg5.field1095[var18] = this.field1095[var18];
                        arg5.field1109[var18] = this.field1109[var18];
                        var16.field9079[var18] = this.field1127.field9079[var18];
                        var16.field9074[var18] = this.field1127.field9074[var18];
                        var16.field9078[var18] = this.field1127.field9078[var18];
                        var16.field9075[var18] = this.field1127.field9075[var18];
                        ++var18;
                     }

                     while(true) {
                        while(this.field1059 > var18) {
                           arg5.field1043[var18] = this.field1043[var18];
                           arg5.field1095[var18] = this.field1095[var18];
                           arg5.field1109[var18] = this.field1109[var18];
                           var16.field9079[var18] = this.field1127.field9079[var18];
                           var16.field9074[var18] = this.field1127.field9074[var18];
                           var16.field9078[var18] = this.field1127.field9078[var18];
                           var16.field9075[var18] = this.field1127.field9075[var18];
                           ++var18;
                        }

                        if (!var7) {
                           if (!var7) {
                              break label629;
                           }
                           break;
                        }

                        ++var18;
                     }
                  }

                  int var19 = 0;
                  if (var7 || ~this.field1059 < ~var19) {
                     do {
                        arg5.field1043[var19] = this.field1043[var19];
                        arg5.field1095[var19] = this.field1095[var19];
                        arg5.field1109[var19] = this.field1109[var19];
                        ++var19;
                     } while(~this.field1059 < ~var19);
                  }
               }

               arg5.field1052 = this.field1052;
               if (!var7) {
                  break label493;
               }
            }

            arg5.field1127 = this.field1127;
            arg5.field1095 = this.field1095;
            arg5.field1043 = this.field1043;
            arg5.field1109 = this.field1109;
            arg5.field1052 = this.field1052;
         }

         label633: {
            if (class479.method3665(126, arg0, this.field1129)) {
               if (arg4) {
                  arg5.field1136 = (byte)(arg5.field1136 | 4);
               }

               arg5.field1116 = arg1.field1116;
               arg5.field1116.field6574 = this.field1116.field6574;
               arg5.field1116.field6569 = this.field1116.field6569;
               if (!var7) {
                  break label633;
               }
            }

            if (class284.method2376(arg0, this.field1129, 72)) {
               arg5.field1116 = this.field1116;
               if (!var7) {
                  break label633;
               }
            }

            arg5.field1116 = null;
         }

         label432: {
            if (class318.method2574(this.field1129, arg0, 3452)) {
               label663: {
                  if (arg1.field1144 == null || ~this.field1066 < ~arg1.field1144.length) {
                     int var20 = this.field1059;
                     arg5.field1144 = arg1.field1144 = new float[var20];
                     arg5.field1101 = arg1.field1101 = new float[var20];
                     if (!var7) {
                        break label663;
                     }
                  }

                  arg5.field1144 = arg1.field1144;
                  arg5.field1101 = arg1.field1101;
               }

               int var21 = 0;
               if (var7) {
                  arg5.field1144[var21] = this.field1144[var21];
                  arg5.field1101[var21] = this.field1101[var21];
                  ++var21;
               }

               while(true) {
                  while(~this.field1059 < ~var21) {
                     arg5.field1144[var21] = this.field1144[var21];
                     arg5.field1101[var21] = this.field1101[var21];
                     ++var21;
                  }

                  if (!var7) {
                     if (!var7) {
                        break label432;
                     }
                     break;
                  }

                  ++var21;
               }
            }

            arg5.field1144 = this.field1144;
            arg5.field1101 = this.field1101;
         }

         label637: {
            if (!class377.method2943(this.field1129, false, arg0)) {
               if (!class226.method1959(this.field1129, arg0, arg2 + 9808)) {
                  arg5.field1034 = null;
                  if (!var7) {
                     break label637;
                  }
               }

               arg5.field1034 = this.field1034;
               if (!var7) {
                  break label637;
               }
            }

            arg5.field1034 = arg1.field1034;
            if (arg4) {
               arg5.field1136 = (byte)(arg5.field1136 | 8);
            }

            arg5.field1034.field6574 = this.field1034.field6574;
            arg5.field1034.field6569 = this.field1034.field6569;
         }

         label391: {
            if (class405.method3152(arg0, this.field1129, true)) {
               label388: {
                  if (arg1.field1107 != null && ~arg1.field1107.length <= ~this.field1066) {
                     arg5.field1084 = arg1.field1084;
                     arg5.field1107 = arg1.field1107;
                     arg5.field1079 = arg1.field1079;
                     if (!var7) {
                        break label388;
                     }
                  }

                  int var22 = this.field1066;
                  arg5.field1079 = arg1.field1079 = new short[var22];
                  arg5.field1084 = arg1.field1084 = new short[var22];
                  arg5.field1107 = arg1.field1107 = new short[var22];
               }

               int var23 = 0;
               if (var7) {
                  arg5.field1107[var23] = this.field1107[var23];
                  arg5.field1084[var23] = this.field1084[var23];
                  arg5.field1079[var23] = this.field1079[var23];
                  ++var23;
               }

               while(true) {
                  while(this.field1066 > var23) {
                     arg5.field1107[var23] = this.field1107[var23];
                     arg5.field1084[var23] = this.field1084[var23];
                     arg5.field1079[var23] = this.field1079[var23];
                     ++var23;
                  }

                  if (!var7) {
                     if (!var7) {
                        break label391;
                     }
                     break;
                  }

                  ++var23;
               }
            }

            arg5.field1107 = this.field1107;
            arg5.field1084 = this.field1084;
            arg5.field1079 = this.field1079;
         }

         label641: {
            if (!class119.method1159(arg0, arg2 + 15816, this.field1129)) {
               if (class68.method714(this.field1129, arg2 + 34905, arg0)) {
                  arg5.field1115 = this.field1115;
                  if (!var7) {
                     break label641;
                  }
               }

               arg5.field1115 = null;
               if (!var7) {
                  break label641;
               }
            }

            arg5.field1115 = arg1.field1115;
            if (arg4) {
               arg5.field1136 = (byte)(arg5.field1136 | 16);
            }

            arg5.field1115.field10074 = this.field1115.field10074;
         }

         label352: {
            if (class162.method1528(this.field1129, arg2 ^ arg2, arg0)) {
               label349: {
                  if (arg1.field1074 != null && ~arg1.field1074.length <= ~this.field1066) {
                     arg5.field1074 = arg1.field1074;
                     if (!var7) {
                        break label349;
                     }
                  }

                  int var24 = this.field1066;
                  arg5.field1074 = arg1.field1074 = new short[var24];
               }

               int var25 = 0;
               if (var7) {
                  arg5.field1074[var25] = this.field1074[var25];
                  ++var25;
               }

               while(true) {
                  while(this.field1066 > var25) {
                     arg5.field1074[var25] = this.field1074[var25];
                     ++var25;
                  }

                  if (!var7) {
                     if (!var7) {
                        break label352;
                     }
                     break;
                  }

                  ++var25;
               }
            }

            arg5.field1074 = this.field1074;
         }

         label321: {
            if (class746.method5373(arg0, this.field1129, arg2 + 15773)) {
               if (arg1.field1041 == null || this.field1105 > arg1.field1041.length) {
                  int var26 = this.field1105;
                  arg5.field1041 = arg1.field1041 = new class750[var26];
                  int var27 = 0;
                  if (var7) {
                     arg5.field1041[var27] = this.field1041[var27].method5395(-95);
                     ++var27;
                  }

                  while(true) {
                     while(~var27 > ~this.field1105) {
                        arg5.field1041[var27] = this.field1041[var27].method5395(-95);
                        ++var27;
                     }

                     if (!var7) {
                        if (!var7) {
                           break label321;
                        }
                        break;
                     }

                     ++var27;
                  }
               }

               arg5.field1041 = arg1.field1041;
               int var28 = 0;
               if (var7) {
                  arg5.field1041[var28].method5393(this.field1041[var28], (byte)-30);
                  ++var28;
               }

               while(true) {
                  while(~var28 > ~this.field1105) {
                     arg5.field1041[var28].method5393(this.field1041[var28], (byte)-30);
                     ++var28;
                  }

                  if (!var7) {
                     if (!var7) {
                        break label321;
                     }
                     break;
                  }

                  ++var28;
               }
            }

            arg5.field1041 = this.field1041;
         }

         label271: {
            arg5.field1058 = this.field1058;
            arg5.field1124 = this.field1124;
            arg5.field1097 = this.field1097;
            if (this.field1056) {
               arg5.field1134 = this.field1134;
               arg5.field1071 = this.field1071;
               arg5.field1048 = this.field1048;
               arg5.field1064 = this.field1064;
               arg5.field1111 = this.field1111;
               arg5.field1078 = this.field1078;
               arg5.field1121 = this.field1121;
               arg5.field1100 = this.field1100;
               arg5.field1056 = true;
               if (!var7) {
                  break label271;
               }
            }

            arg5.field1056 = false;
         }

         arg5.field1139 = this.field1139;
         arg5.field1038 = this.field1038;
         arg5.field1117 = this.field1117;
         arg5.field1090 = this.field1090;
         arg5.field1103 = this.field1103;
         arg5.field1153 = this.field1153;
         arg5.field1123 = this.field1123;
         arg5.field1035 = this.field1035;
         return arg5;
      } catch (RuntimeException var30) {
         throw class612.method4503(var30, field1160[51] + arg0 + ',' + (arg1 != null ? field1160[4] : field1160[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field1160[4] : field1160[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "WA",
      descriptor = "()I"
   )
   public final int method778() {
      try {
         ++field1068;
         return this.field1089;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1160[18] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "HA",
      descriptor = "()I"
   )
   public final int method779() {
      try {
         if (!this.field1056) {
            this.method772(false);
         }

         ++field1036;
         return this.field1064;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1160[64] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "v",
      descriptor = "()V"
   )
   public final void method780() {
      boolean var1 = client.field10022;

      try {
         int var2 = 0;
         if (var1) {
            this.field1065[var2] = -this.field1065[var2];
            ++var2;
         }

         while(true) {
            while(var2 < this.field1142) {
               this.field1065[var2] = -this.field1065[var2];
               ++var2;
            }

            ++field1130;
            int var3 = 0;
            if (!var1) {
               if (var1) {
                  this.field1109[var3] = (short)(-this.field1109[var3]);
                  ++var3;
               }

               while(true) {
                  while(~this.field1059 < ~var3) {
                     this.field1109[var3] = (short)(-this.field1109[var3]);
                     ++var3;
                  }

                  int var4 = 0;
                  if (!var1) {
                     short var5;
                     if (var1) {
                        var5 = this.field1107[var4];
                        this.field1107[var4] = this.field1079[var4];
                        this.field1079[var4] = var5;
                        ++var4;
                     }

                     while(true) {
                        class71 var10000;
                        if (~this.field1066 >= ~var4) {
                           var10000 = this;
                           if (!var1) {
                              if (this.field1116 == null && this.field1045 != null) {
                                 this.field1045.field6574 = null;
                              }

                              if (this.field1116 != null) {
                                 this.field1116.field6574 = null;
                              }

                              if (this.field1115 != null) {
                                 this.field1115.field10074 = null;
                              }

                              this.field1056 = false;
                              if (this.field1120 != null) {
                                 this.field1120.field6574 = null;
                                 return;
                              }

                              return;
                           }
                        } else {
                           var10000 = this;
                        }

                        var5 = var10000.field1107[var4];
                        this.field1107[var4] = this.field1079[var4];
                        this.field1079[var4] = var5;
                        ++var4;
                     }
                  }

                  ++var3;
               }
            }

            ++var2;
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field1160[30] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "F",
      descriptor = "()Z"
   )
   public final boolean method781() {
      try {
         ++field1075;
         return this.field1050;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1160[23] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "na",
      descriptor = "()I"
   )
   public final int method782() {
      try {
         ++field1070;
         if (!this.field1056) {
            this.method772(false);
         }

         return this.field1134;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1160[59] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "G",
      descriptor = "()I"
   )
   public final int method783() {
      try {
         ++field1057;
         if (!this.field1056) {
            this.method772(false);
         }

         return this.field1100;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1160[5] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "a",
      descriptor = "()[Lhaa;"
   )
   public final class3[] method784() {
      try {
         ++field1091;
         return this.field1153;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1160[43] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "FA",
      descriptor = "(I)V"
   )
   public final void method785(int arg0) {
      boolean var2 = client.field10022;

      try {
         ++field1086;
         int var3 = class160.field2447[arg0];
         int var4 = class160.field2446[arg0];
         int var5 = 0;
         if (!var2 && var5 >= this.field1142) {
            this.field1056 = false;
            if (this.field1120 != null) {
               this.field1120.field6574 = null;
            }
         } else {
            do {
               int var6 = this.field1039[var5] * var4 + -(this.field1065[var5] * var3) >> 14;
               this.field1065[var5] = this.field1065[var5] * var4 + this.field1039[var5] * var3 >> 14;
               this.field1039[var5] = var6;
               ++var5;
            } while(var5 < this.field1142);

            this.field1056 = false;
            if (this.field1120 != null) {
               this.field1120.field6574 = null;
            }
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field1160[36] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "a",
      descriptor = "(B[B)V"
   )
   public final void method786(byte arg0, byte[] arg1) {
      boolean var3 = client.field10022;

      try {
         label70: {
            ++field1099;
            if (arg1 == null) {
               int var4 = 0;
               if (var3) {
                  this.field1155[var4] = arg0;
                  ++var4;
               }

               while(true) {
                  while(~this.field1066 < ~var4) {
                     this.field1155[var4] = arg0;
                     ++var4;
                  }

                  if (!var3) {
                     if (!var3) {
                        break label70;
                     }
                     break;
                  }

                  ++var4;
               }
            }

            int var5 = 0;
            if (var3 || ~this.field1066 < ~var5) {
               do {
                  int var6 = -((-(255 & arg1[var5]) + 255) * (-(arg0 & 255) + 255) / 255) + 255;
                  this.field1155[var5] = (byte)var6;
                  ++var5;
               } while(~this.field1066 < ~var5);
            }
         }

         if (this.field1045 != null) {
            this.field1045.field6574 = null;
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field1160[45] + arg0 + ',' + (arg1 != null ? field1160[4] : field1160[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "a",
      descriptor = "(IBJIIFLeca;IIF)S"
   )
   private final short method787(int arg0, byte arg1, long arg2, int arg3, int arg4, float arg5, class590 arg6, int arg7, int arg8, float arg9) {
      boolean var12 = client.field10022;

      try {
         ++field1128;
         int var13 = this.field1038[arg4];
         int var14 = this.field1038[arg4 + 1];
         int var15 = 0;
         int var16 = var13;
         int var10000;
         int var17;
         if (var12) {
            var17 = this.field1097[var13];
            var10000 = ~var17;
         } else if (~var14 >= ~var13) {
            var17 = -39 / ((arg1 - -8) / 43);
            this.field1097[var15] = (short)(this.field1059 - -1);
            class724.field10350[var15] = arg2;
            this.field1043[this.field1059] = (short)arg8;
            this.field1095[this.field1059] = (short)arg3;
            this.field1109[this.field1059] = (short)arg0;
            this.field1052[this.field1059] = (byte)arg7;
            this.field1144[this.field1059] = arg9;
            this.field1101[this.field1059] = arg5;
            var10000 = (short)(this.field1059++);
            if (!var12) {
               return (short)var10000;
            }
         } else {
            var17 = this.field1097[var13];
            var10000 = ~var17;
         }

         do {
            while(true) {
               if (var10000 == -1) {
                  var15 = var16;
                  if (!var12) {
                     var17 = -39 / ((arg1 - -8) / 43);
                     this.field1097[var16] = (short)(this.field1059 - -1);
                     class724.field10350[var16] = arg2;
                     this.field1043[this.field1059] = (short)arg8;
                     this.field1095[this.field1059] = (short)arg3;
                     this.field1109[this.field1059] = (short)arg0;
                     this.field1052[this.field1059] = (byte)arg7;
                     this.field1144[this.field1059] = arg9;
                     this.field1101[this.field1059] = arg5;
                     var10000 = (short)(this.field1059++);
                     break;
                  }

                  if (class724.field10350[var16] == arg2) {
                     return (short)(var17 + -1);
                  }

                  ++var16;
               } else {
                  if (class724.field10350[var16] == arg2) {
                     return (short)(var17 + -1);
                  }

                  ++var16;
               }

               if (~var14 >= ~var16) {
                  var17 = -39 / ((arg1 - -8) / 43);
                  this.field1097[var15] = (short)(this.field1059 - -1);
                  class724.field10350[var15] = arg2;
                  this.field1043[this.field1059] = (short)arg8;
                  this.field1095[this.field1059] = (short)arg3;
                  this.field1109[this.field1059] = (short)arg0;
                  this.field1052[this.field1059] = (byte)arg7;
                  this.field1144[this.field1059] = arg9;
                  this.field1101[this.field1059] = arg5;
                  var10000 = (short)(this.field1059++);
                  if (!var12) {
                     return (short)var10000;
                  }
               } else {
                  var17 = this.field1097[var16];
                  var10000 = ~var17;
               }
            }
         } while(var12);

         return (short)var10000;
      } catch (RuntimeException var19) {
         throw class612.method4503(var19, field1160[58] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field1160[4] : field1160[2]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "a",
      descriptor = "(IIIIIIIIZ)Z"
   )
   private final boolean method788(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
      try {
         ++field1037;
         if (!arg8) {
            this.field1115 = null;
         }

         if (~arg6 < ~arg1 && ~arg1 > ~arg7 && arg1 < arg3) {
            return false;
         } else if (~arg1 < ~arg6 && arg1 > arg7 && arg3 < arg1) {
            return false;
         } else if (arg0 > arg4 && arg2 > arg4 && ~arg5 < ~arg4) {
            return false;
         } else {
            return arg0 >= arg4 || arg4 <= arg2 || arg5 >= arg4;
         }
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field1160[84] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "c",
      descriptor = "(B)V"
   )
   private final void method789(byte arg0) {
      boolean var2 = client.field10022;

      try {
         ++field1046;
         if (this.field1077 != 0) {
            if (arg0 >= -58) {
               this.field1109 = null;
            }

            if (this.field1136 != 0) {
               this.method796(true, (byte)69);
            }

            this.method796(false, (byte)105);
            if (this.field1115 != null) {
               if (this.field1115.field10074 == null) {
                  this.method776(4, ~(this.field1136 & 16) != -1);
               }

               if (this.field1115.field10074 != null) {
                  this.field1063.method4935(this.field1116 != null, 3584);
                  this.field1063.method4946(-16068, this.field1045, this.field1034, this.field1120, this.field1116);
                  int var3 = this.field1123.length + -1;
                  int var4 = 0;
                  if (var2 || var3 > var4) {
                     do {
                        int var5 = this.field1123[var4];
                        int var6 = this.field1123[var4 + 1];
                        int var7 = this.field1074[var5] & 65535;
                        if (~var7 == -65536) {
                           var7 = -1;
                        }

                        this.field1063.method4925((byte)97, var7, this.field1116 != null);
                        this.field1063.method4952(126, 4, (-var5 + var6) * 3, var5 * 3, this.field1115.field10074);
                        ++var4;
                     } while(var3 > var4);
                  }
               }
            }

            this.method790(262144);
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field1160[32] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "b",
      descriptor = "(I)V"
   )
   private final void method790(int arg0) {
      boolean var2 = client.field10022;

      try {
         ++field1053;
         if (this.field1110) {
            this.field1110 = false;
            if (this.field1139 == null && this.field1153 == null && this.field1103 == null && !class150.method1463(this.field1129, arg0 ^ -262145, this.field1054)) {
               boolean var3 = false;
               boolean var4 = false;
               boolean var5 = false;
               if (this.field1094 != null && !class197.method1729(this.field1129, (byte)63, this.field1054)) {
                  label316: {
                     if (this.field1120 == null || this.field1120.field6574 != null) {
                        if (!this.field1056) {
                           this.method772(false);
                        }

                        var3 = true;
                        if (!var2) {
                           break label316;
                        }
                     }

                     this.field1110 = true;
                  }
               }

               if (this.field1039 != null && !class759.method5481(this.field1054, 0, this.field1129)) {
                  label317: {
                     if (this.field1120 == null || this.field1120.field6574 != null) {
                        if (!this.field1056) {
                           this.method772(false);
                        }

                        var4 = true;
                        if (!var2) {
                           break label317;
                        }
                     }

                     this.field1110 = true;
                  }
               }

               if (this.field1065 != null && !class443.method3442(this.field1129, this.field1054, true)) {
                  label311: {
                     if (this.field1120 != null && this.field1120.field6574 == null) {
                        this.field1110 = true;
                        if (!var2) {
                           break label311;
                        }
                     }

                     var5 = true;
                     if (!this.field1056) {
                        this.method772(false);
                     }
                  }
               }

               if (var4) {
                  this.field1039 = null;
               }

               if (var5) {
                  this.field1065 = null;
               }

               if (var3) {
                  this.field1094 = null;
               }
            }

            if (this.field1097 != null && this.field1094 == null && this.field1039 == null && this.field1065 == null) {
               this.field1038 = null;
               this.field1097 = null;
            }

            if (this.field1052 != null && !class279.method2345(this.field1129, 0, this.field1054)) {
               label303: {
                  if (this.field1116 != null) {
                     if (this.field1116.field6574 != null) {
                        this.field1052 = null;
                        this.field1043 = this.field1095 = this.field1109 = null;
                        if (!var2) {
                           break label303;
                        }
                     }

                     this.field1110 = true;
                     if (!var2) {
                        break label303;
                     }
                  }

                  if (this.field1045 != null && this.field1045.field6574 == null) {
                     this.field1110 = true;
                     if (!var2) {
                        break label303;
                     }
                  }

                  this.field1043 = this.field1095 = this.field1109 = null;
                  this.field1052 = null;
               }
            }

            if (this.field1106 != null && !class801.method5774(20, this.field1054, this.field1129)) {
               label232: {
                  if (this.field1045 != null && this.field1045.field6574 == null) {
                     this.field1110 = true;
                     if (!var2) {
                        break label232;
                     }
                  }

                  this.field1106 = null;
               }
            }

            if (this.field1155 != null && !class242.method2113((byte)-8, this.field1129, this.field1054)) {
               label224: {
                  if (this.field1045 != null && this.field1045.field6574 == null) {
                     this.field1110 = true;
                     if (!var2) {
                        break label224;
                     }
                  }

                  this.field1155 = null;
               }
            }

            if (this.field1144 != null && !class679.method4968(this.field1129, true, this.field1054)) {
               label216: {
                  if (this.field1034 != null && this.field1034.field6574 == null) {
                     this.field1110 = true;
                     if (!var2) {
                        break label216;
                     }
                  }

                  this.field1144 = this.field1101 = null;
               }
            }

            if (this.field1074 != null && !class381.method2974(this.field1054, (byte)-70, this.field1129)) {
               label318: {
                  if (this.field1045 == null || this.field1045.field6574 != null) {
                     this.field1074 = null;
                     if (!var2) {
                        break label318;
                     }
                  }

                  this.field1110 = true;
               }
            }

            if (this.field1107 != null && !class708.method5148(this.field1054, this.field1129, arg0 + -262145)) {
               label319: {
                  if ((this.field1115 == null || this.field1115.field10074 != null) && (this.field1045 == null || this.field1045.field6574 != null)) {
                     this.field1107 = this.field1084 = this.field1079 = null;
                     if (!var2) {
                        break label319;
                     }
                  }

                  this.field1110 = true;
               }
            }

            if (this.field1035 != null && !class533.method3988(this.field1054, 127, this.field1129)) {
               this.field1117 = null;
               this.field1035 = null;
            }

            if (this.field1058 != null && !class570.method4223(-24229, this.field1054, this.field1129)) {
               this.field1058 = null;
               this.field1090 = null;
            }

            if (this.field1124 != null && !class268.method2291(this.field1054, this.field1129, -81)) {
               this.field1124 = null;
            }

            if (this.field1123 != null && ~(2048 & this.field1054) == -1 && ~(262144 & this.field1054) == -1) {
               this.field1123 = null;
            }

            if (arg0 != 262144) {
               this.method792((class412)null);
            }
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field1160[56] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "ia",
      descriptor = "(SS)V"
   )
   public final void method791(short arg0, short arg1) {
      boolean var3 = client.field10022;

      try {
         ++field1093;
         int var4 = 0;
         if (var3) {
            if (this.field1106[var4] == arg0) {
               this.field1106[var4] = arg1;
               ++var4;
            } else {
               ++var4;
            }
         }

         while(true) {
            while(this.field1066 > var4) {
               if (this.field1106[var4] == arg0) {
                  this.field1106[var4] = arg1;
                  ++var4;
               } else {
                  ++var4;
               }
            }

            if (!var3) {
               if (this.field1103 != null) {
                  int var5 = 0;
                  if (var3 || var5 < this.field1105) {
                     do {
                        class152 var6 = this.field1103[var5];
                        class750 var7 = this.field1041[var5];
                        var7.field10654 = -16777216 & var7.field10654 | class744.field10589[65535 & this.field1106[var6.field2332]] & 16777215;
                        ++var5;
                     } while(var5 < this.field1105);
                  }
               }

               if (this.field1045 != null) {
                  this.field1045.field6574 = null;
                  return;
               }

               return;
            }

            this.field1106[var4] = arg1;
            ++var4;
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field1160[26] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "ba",
      descriptor = "(Lr;)Lr;"
   )
   public final class412 method792(class412 arg0) {
      boolean var2 = client.field10022;

      try {
         ++field1051;
         if (this.field1059 == 0) {
            return null;
         } else {
            if (!this.field1056) {
               this.method772(false);
            }

            int var3;
            int var4;
            label46: {
               if (this.field1063.field9746 > 0) {
                  var3 = -(this.field1063.field9746 * this.field1121 >> 8) + this.field1078 >> this.field1063.field9683;
                  var4 = -(this.field1063.field9746 * this.field1048 >> 8) + this.field1071 >> this.field1063.field9683;
                  if (!var2) {
                     break label46;
                  }
               }

               var3 = this.field1078 - (this.field1063.field9746 * this.field1048 >> 8) >> this.field1063.field9683;
               var4 = -(this.field1063.field9746 * this.field1121 >> 8) + this.field1071 >> this.field1063.field9683;
            }

            int var5;
            int var6;
            label41: {
               if (~this.field1063.field9812 >= -1) {
                  var5 = -(this.field1063.field9812 * this.field1048 >> 8) + this.field1064 >> this.field1063.field9683;
                  var6 = -(this.field1063.field9812 * this.field1121 >> 8) + this.field1100 >> this.field1063.field9683;
                  if (!var2) {
                     break label41;
                  }
               }

               var5 = -(this.field1063.field9812 * this.field1121 >> 8) + this.field1064 >> this.field1063.field9683;
               var6 = -(this.field1063.field9812 * this.field1048 >> 8) + this.field1100 >> this.field1063.field9683;
            }

            class545 var10;
            label36: {
               int var7 = var4 - var3 + 1;
               int var8 = var6 + 1 + -var5;
               class545 var9 = (class545)arg0;
               if (var9 != null && var9.method4085(var7, var8, false)) {
                  var10 = var9;
                  var9.method4084((byte)0);
                  if (!var2) {
                     break label36;
                  }
               }

               var10 = new class545(this.field1063, var7, var8);
            }

            var10.method4083(var4, var5, var3, var6, (byte)74);
            this.method760((byte)91, var10);
            return var10;
         }
      } catch (RuntimeException var12) {
         throw class612.method4503(var12, field1160[31] + (arg0 != null ? field1160[4] : field1160[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method793(int arg0) {
      try {
         field1138 = null;
         field1159 = null;
         if (arg0 > -47) {
            field1138 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1160[61] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "ma",
      descriptor = "()I"
   )
   public final int method794() {
      try {
         if (!this.field1056) {
            this.method772(false);
         }

         ++field1122;
         return this.field1111;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1160[60] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "c",
      descriptor = "()V"
   )
   public final void method795() {
      try {
         ++field1119;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1160[29] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "a",
      descriptor = "(ZB)V"
   )
   private final void method796(boolean arg0, byte arg1) {
      boolean var3 = client.field10022;

      try {
         ++field1145;
         boolean var4 = this.field1045 != null && this.field1045.field6574 == null;
         boolean var5 = this.field1116 != null && this.field1116.field6574 == null;
         boolean var6 = this.field1120 != null && this.field1120.field6574 == null;
         boolean var7 = this.field1034 != null && this.field1034.field6574 == null;
         if (arg0) {
            var4 &= ~(2 & this.field1136) != -1;
            var5 &= ~(4 & this.field1136) != -1;
            var6 &= ~(this.field1136 & 1) != -1;
            var7 &= ~(8 & this.field1136) != -1;
         }

         byte var8 = 0;
         byte var9 = 0;
         byte var10 = 0;
         byte var11 = 0;
         if (var6) {
            var9 = var8;
            var8 = (byte)(var8 + 12);
         }

         byte var12 = 0;
         if (arg1 > 57) {
            if (var4) {
               var10 = var8;
               var8 = (byte)(var8 + 4);
            }

            if (var5) {
               var11 = var8;
               var8 = (byte)(var8 + 12);
            }

            if (var7) {
               var12 = var8;
               var8 = (byte)(var8 + 8);
            }

            if (~var8 != -1) {
               label488: {
                  if (~this.field1063.field9816.field942.length <= ~(this.field1059 * var8)) {
                     this.field1063.field9816.field945 = 0;
                     if (!var3) {
                        break label488;
                     }
                  }

                  this.field1063.field9816 = new class637((this.field1059 + 100) * var8);
               }

               class637 var13 = this.field1063.field9816;
               if (var6) {
                  label524: {
                     if (!this.field1063.field9826) {
                        int var14 = 0;
                        if (var3 || var14 < this.field1142) {
                           label478:
                           do {
                              int var15 = Stream.floatToRawIntBits((float)this.field1094[var14]);
                              int var16 = Stream.floatToRawIntBits((float)this.field1039[var14]);
                              int var17 = Stream.floatToRawIntBits((float)this.field1065[var14]);
                              int var18 = this.field1038[var14];
                              int var19 = this.field1038[var14 + 1];
                              int var20 = var18;
                              if (!var3 && ~var18 <= ~var19) {
                                 ++var14;
                              } else {
                                 do {
                                    int var21 = this.field1097[var20] + -1;
                                    if (~var21 == 0) {
                                       ++var14;
                                       continue label478;
                                    }

                                    var13.field945 = var8 * var21;
                                    var13.method664(false, var15);
                                    var13.method664(false, var16);
                                    var13.method664(false, var17);
                                    ++var20;
                                 } while(~var20 > ~var19);

                                 ++var14;
                              }
                           } while(var14 < this.field1142);
                        }

                        if (!var3) {
                           break label524;
                        }
                     }

                     int var22 = 0;
                     if (var3 || var22 < this.field1142) {
                        label452:
                        do {
                           int var23 = Stream.floatToRawIntBits((float)this.field1094[var22]);
                           int var24 = Stream.floatToRawIntBits((float)this.field1039[var22]);
                           int var25 = Stream.floatToRawIntBits((float)this.field1065[var22]);
                           int var26 = this.field1038[var22];
                           int var27 = this.field1038[var22 + 1];
                           int var28 = var26;
                           if (!var3 && ~var27 >= ~var26) {
                              ++var22;
                           } else {
                              do {
                                 int var29 = this.field1097[var28] + -1;
                                 if (~var29 == 0) {
                                    ++var22;
                                    continue label452;
                                 }

                                 var13.field945 = var8 * var29;
                                 var13.method674(-57, var23);
                                 var13.method674(-89, var24);
                                 var13.method674(-30, var25);
                                 ++var28;
                              } while(~var27 < ~var28);

                              ++var22;
                           }
                        } while(var22 < this.field1142);
                     }
                  }
               }

               if (var4) {
                  label527: {
                     if (this.field1116 != null) {
                        int var30 = 0;
                        if (var3 || var30 < this.field1066) {
                           do {
                              int var31 = this.method808(this.field1074[var30], this.field1155[var30], this.field1089, this.field1106[var30], 0);
                              var13.field945 = this.field1107[var30] * var8 + var10;
                              var13.method674(-85, var31);
                              var13.field945 = var10 - -(this.field1084[var30] * var8);
                              var13.method674(-56, var31);
                              var13.field945 = var10 - -(this.field1079[var30] * var8);
                              var13.method674(-107, var31);
                              ++var30;
                           } while(var30 < this.field1066);
                        }

                        if (!var3) {
                           break label527;
                        }
                     }

                     byte[] var32;
                     short[] var33;
                     short[] var34;
                     short[] var35;
                     label412: {
                        if (this.field1127 == null) {
                           var32 = this.field1052;
                           var33 = this.field1043;
                           var34 = this.field1095;
                           var35 = this.field1109;
                           if (!var3) {
                              break label412;
                           }
                        }

                        var33 = this.field1127.field9079;
                        var34 = this.field1127.field9074;
                        var32 = this.field1127.field9075;
                        var35 = this.field1127.field9078;
                     }

                     float var36 = this.field1063.field9758[0];
                     float var37 = this.field1063.field9758[1];
                     float var38 = this.field1063.field9758[2];
                     float var39 = this.field1063.field9807;
                     float var40 = this.field1063.field9755 * 768.0F / (float)this.field1140;
                     float var41 = this.field1063.field9745 * 768.0F / (float)this.field1140;
                     int var42 = 0;
                     if (var3 || ~this.field1066 < ~var42) {
                        do {
                           short var44;
                           float var45;
                           float var46;
                           float var47;
                           float var49;
                           label393: {
                              int var43 = this.method808(this.field1074[var42], this.field1155[var42], this.field1089, this.field1106[var42], 0);
                              var44 = this.field1107[var42];
                              var45 = (float)(var43 >>> 24) * this.field1063.field9796;
                              var46 = (float)(255 & var43 >> 16) * this.field1063.field9794;
                              var47 = (float)((65480 & var43) >> 8) * this.field1063.field9799;
                              short var48 = (short)var32[var44];
                              if (var48 != 0) {
                                 var49 = ((float)var35[var44] * var38 + (float)var33[var44] * var36 + (float)var34[var44] * var37) / (float)(var48 * 256);
                                 if (!var3) {
                                    break label393;
                                 }
                              }

                              var49 = ((float)var35[var44] * var38 + (float)var33[var44] * var36 + (float)var34[var44] * var37) * 0.0026041667F;
                           }

                           float var50 = var39 + (!(var49 < 0.0F) ? var40 : var41) * var49;
                           int var51 = (int)(var45 * var50);
                           int var52 = (int)(var46 * var50);
                           if (var51 >= 0) {
                              if (~var51 < -256) {
                                 var51 = 255;
                                 if (var3) {
                                    var51 = 0;
                                 }
                              }
                           } else {
                              var51 = 0;
                           }

                           int var53 = (int)(var47 * var50);
                           if (~var52 <= -1) {
                              if (~var52 < -256) {
                                 var52 = 255;
                                 if (var3) {
                                    var52 = 0;
                                 }
                              }
                           } else {
                              var52 = 0;
                           }

                           if (var53 < 0) {
                              var53 = 0;
                              if (var3 && var53 > 255) {
                                 var53 = 255;
                              }
                           } else if (var53 > 255) {
                              var53 = 255;
                           }

                           short var54;
                           float var56;
                           label398: {
                              var13.field945 = var10 - -(var8 * var44);
                              var13.method656((byte)-119, var51);
                              var13.method656((byte)-103, var52);
                              var13.method656((byte)35, var53);
                              var13.method656((byte)-113, -(255 & this.field1155[var42]) + 255);
                              var54 = this.field1084[var42];
                              short var55 = (short)var32[var54];
                              if (~var55 != -1) {
                                 var56 = ((float)var35[var54] * var38 + (float)var33[var54] * var36 + (float)var34[var54] * var37) / (float)(var55 * 256);
                                 if (!var3) {
                                    break label398;
                                 }
                              }

                              var56 = ((float)var35[var54] * var38 + (float)var33[var54] * var36 + (float)var34[var54] * var37) * 0.0026041667F;
                           }

                           float var57 = var56 * (var56 < 0.0F ? var41 : var40) + var39;
                           int var58 = (int)(var45 * var57);
                           int var59 = (int)(var46 * var57);
                           if (var58 >= 0) {
                              if (~var58 < -256) {
                                 var58 = 255;
                                 if (var3) {
                                    var58 = 0;
                                 }
                              }
                           } else {
                              var58 = 0;
                           }

                           int var60 = (int)(var47 * var57);
                           if (~var59 <= -1) {
                              if (var59 > 255) {
                                 var59 = 255;
                                 if (var3) {
                                    var59 = 0;
                                 }
                              }
                           } else {
                              var59 = 0;
                           }

                           var13.field945 = var8 * var54 + var10;
                           if (var60 < 0) {
                              var60 = 0;
                              if (var3 && var60 > 255) {
                                 var60 = 255;
                              }
                           } else if (var60 > 255) {
                              var60 = 255;
                           }

                           short var61;
                           float var63;
                           label404: {
                              var13.method656((byte)-126, var58);
                              var13.method656((byte)-116, var59);
                              var13.method656((byte)-108, var60);
                              var13.method656((byte)38, 255 - (255 & this.field1155[var42]));
                              var61 = this.field1079[var42];
                              short var62 = (short)var32[var61];
                              if (~var62 != -1) {
                                 var63 = ((float)var35[var61] * var38 + (float)var33[var61] * var36 + (float)var34[var61] * var37) / (float)(var62 * 256);
                                 if (!var3) {
                                    break label404;
                                 }
                              }

                              var63 = ((float)var35[var61] * var38 + (float)var33[var61] * var36 + (float)var34[var61] * var37) * 0.0026041667F;
                           }

                           float var64 = var63 * (var63 < 0.0F ? var41 : var40) + var39;
                           int var65 = (int)(var45 * var64);
                           int var66 = (int)(var46 * var64);
                           if (var65 >= 0) {
                              if (~var65 < -256) {
                                 var65 = 255;
                                 if (var3) {
                                    var65 = 0;
                                 }
                              }
                           } else {
                              var65 = 0;
                           }

                           int var67 = (int)(var47 * var64);
                           if (~var66 > -1) {
                              var66 = 0;
                              if (var3 && ~var66 < -256) {
                                 var66 = 255;
                              }
                           } else if (~var66 < -256) {
                              var66 = 255;
                           }

                           var13.field945 = var10 - -(var8 * var61);
                           if (~var67 <= -1) {
                              if (~var67 < -256) {
                                 var67 = 255;
                                 if (var3) {
                                    var67 = 0;
                                 }
                              }
                           } else {
                              var67 = 0;
                           }

                           var13.method656((byte)76, var65);
                           var13.method656((byte)-93, var66);
                           var13.method656((byte)107, var67);
                           var13.method656((byte)30, -(255 & this.field1155[var42]) + 255);
                           ++var42;
                        } while(~this.field1066 < ~var42);
                     }
                  }
               }

               if (var5) {
                  label529: {
                     short[] var68;
                     byte[] var69;
                     short[] var70;
                     short[] var71;
                     label318: {
                        if (this.field1127 == null) {
                           var68 = this.field1109;
                           var69 = this.field1052;
                           var70 = this.field1095;
                           var71 = this.field1043;
                           if (!var3) {
                              break label318;
                           }
                        }

                        var70 = this.field1127.field9074;
                        var71 = this.field1127.field9079;
                        var68 = this.field1127.field9078;
                        var69 = this.field1127.field9075;
                     }

                     float var72 = 3.0F / (float)this.field1140;
                     var13.field945 = var11;
                     float var73 = 3.0F / (float)(this.field1140 / 2 + this.field1140);
                     if (!this.field1063.field9826) {
                        int var74 = 0;
                        if (var3 || ~this.field1059 < ~var74) {
                           do {
                              label308: {
                                 int var75 = 255 & var69[var74];
                                 if (var75 != 0) {
                                    float var76 = var72 / (float)var75;
                                    var13.method4648(14571, (float)var71[var74] * var76);
                                    var13.method4648(14571, (float)var70[var74] * var76);
                                    var13.method4648(14571, (float)var68[var74] * var76);
                                    if (!var3) {
                                       break label308;
                                    }
                                 }

                                 var13.method4648(14571, (float)var71[var74] * var73);
                                 var13.method4648(14571, (float)var70[var74] * var73);
                                 var13.method4648(14571, (float)var68[var74] * var73);
                              }

                              var13.field945 += var8 + -12;
                              ++var74;
                           } while(~this.field1059 < ~var74);
                        }

                        if (!var3) {
                           break label529;
                        }
                     }

                     int var77 = 0;
                     if (var3 || var77 < this.field1059) {
                        do {
                           label292: {
                              int var78 = var69[var77] & 255;
                              if (var78 != 0) {
                                 float var79 = var72 / (float)var78;
                                 var13.method4649((float)var71[var77] * var79, 1409);
                                 var13.method4649((float)var70[var77] * var79, 1409);
                                 var13.method4649((float)var68[var77] * var79, 1409);
                                 if (!var3) {
                                    break label292;
                                 }
                              }

                              var13.method4649((float)var71[var77] * var73, 1409);
                              var13.method4649((float)var70[var77] * var73, 1409);
                              var13.method4649((float)var68[var77] * var73, 1409);
                           }

                           var13.field945 += var8 + -12;
                           ++var77;
                        } while(var77 < this.field1059);
                     }
                  }
               }

               if (var7) {
                  label532: {
                     var13.field945 = var12;
                     if (!this.field1063.field9826) {
                        int var80 = 0;
                        if (var3) {
                           var13.method4648(14571, this.field1144[var80]);
                           var13.method4648(14571, this.field1101[var80]);
                           var13.field945 += var8 - 8;
                           ++var80;
                        }

                        while(true) {
                           while(~this.field1059 < ~var80) {
                              var13.method4648(14571, this.field1144[var80]);
                              var13.method4648(14571, this.field1101[var80]);
                              var13.field945 += var8 - 8;
                              ++var80;
                           }

                           if (!var3) {
                              if (!var3) {
                                 break label532;
                              }
                              break;
                           }

                           ++var80;
                        }
                     }

                     int var81 = 0;
                     if (var3 || this.field1059 > var81) {
                        do {
                           var13.method4649(this.field1144[var81], 1409);
                           var13.method4649(this.field1101[var81], 1409);
                           var13.field945 += var8 + -8;
                           ++var81;
                        } while(this.field1059 > var81);
                     }
                  }
               }

               class516 var82;
               label536: {
                  var13.field945 = this.field1059 * var8;
                  if (!arg0) {
                     var82 = this.field1063.method4912(var8, (byte)15, var13.field945, false, var13.field942);
                     this.field1110 = true;
                     if (!var3) {
                        break label536;
                     }
                  }

                  label240: {
                     if (this.field1047 == null) {
                        this.field1047 = this.field1063.method4912(var8, (byte)15, var13.field945, true, var13.field942);
                        if (!var3) {
                           break label240;
                        }
                     }

                     this.field1047.method1402(var8, 8680, var13.field945, var13.field942);
                  }

                  var82 = this.field1047;
                  this.field1136 = 0;
               }

               if (var6) {
                  this.field1120.field6569 = var9;
                  this.field1120.field6574 = var82;
               }

               if (var7) {
                  this.field1034.field6569 = var12;
                  this.field1034.field6574 = var82;
               }

               if (var4) {
                  this.field1045.field6574 = var82;
                  this.field1045.field6569 = var10;
               }

               if (var5) {
                  this.field1116.field6574 = var82;
                  this.field1116.field6569 = var11;
               }
            }
         }
      } catch (RuntimeException var84) {
         throw class612.method4503(var84, field1160[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "RA",
      descriptor = "()I"
   )
   public final int method797() {
      try {
         ++field1141;
         if (!this.field1056) {
            this.method772(false);
         }

         return this.field1071;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1160[17] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "s",
      descriptor = "(I)V"
   )
   public final void method798(int arg0) {
      try {
         this.field1054 = arg0;
         ++field1108;
         this.field1110 = true;
         if (this.field1127 != null && (this.field1054 & 65536) == 0) {
            this.field1043 = this.field1127.field9079;
            this.field1052 = this.field1127.field9075;
            this.field1109 = this.field1127.field9078;
            this.field1095 = this.field1127.field9074;
            this.field1127 = null;
         }

         this.method790(262144);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1160[41] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "H",
      descriptor = "(III)V"
   )
   public final void method799(int arg0, int arg1, int arg2) {
      boolean var4 = client.field10022;

      try {
         ++field1044;
         int var5 = 0;
         if (var4) {
            if (arg0 != 0) {
               this.field1094[var5] += arg0;
            }

            if (arg1 != 0) {
               this.field1039[var5] += arg1;
            }

            if (arg2 != 0) {
               this.field1065[var5] += arg2;
               ++var5;
            } else {
               ++var5;
            }
         }

         while(true) {
            while(~this.field1142 < ~var5) {
               if (arg0 != 0) {
                  this.field1094[var5] += arg0;
               }

               if (arg1 != 0) {
                  this.field1039[var5] += arg1;
               }

               if (arg2 != 0) {
                  this.field1065[var5] += arg2;
                  ++var5;
               } else {
                  ++var5;
               }
            }

            if (!var4) {
               if (this.field1120 != null) {
                  this.field1120.field6574 = null;
               }

               this.field1056 = false;
               return;
            }

            this.field1065[var5] += arg2;
            ++var5;
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field1160[63] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "V",
      descriptor = "()I"
   )
   public final int method800() {
      try {
         if (!this.field1056) {
            this.method772(false);
         }

         ++field1076;
         return this.field1078;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1160[21] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "fa",
      descriptor = "()I"
   )
   public final int method801() {
      try {
         ++field1125;
         if (!this.field1056) {
            this.method772(false);
         }

         return this.field1048;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1160[53] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "a",
      descriptor = "(ZILgga;IIIB)Z"
   )
   private final boolean method802(boolean arg0, int arg1, class502 arg2, int arg3, int arg4, int arg5, byte arg6) {
      boolean var8 = client.field10022;

      try {
         ++field1067;
         class290 var9 = (class290)arg2;
         class290 var10 = this.field1063.field9709;
         float var11 = var9.field4339 * var10.field4308 + var9.field4321 * var10.field4312 + var9.field4307 * var10.field4306 + var10.field4307;
         float var12 = var9.field4339 * var10.field4345 + var9.field4321 * var10.field4336 + var9.field4307 * var10.field4333 + var10.field4321;
         class565.field8031 = var9.field4330 * var10.field4334 + var9.field4333 * var10.field4347 + var9.field4306 * var10.field4330;
         class613.field8720 = var9.field4347 * var10.field4345 + var9.field4336 * var10.field4336 + var9.field4312 * var10.field4333;
         class39.field597 = var9.field4347 * var10.field4334 + var9.field4336 * var10.field4347 + var9.field4312 * var10.field4330;
         class139.field2232 = var9.field4334 * var10.field4334 + var9.field4345 * var10.field4347 + var9.field4308 * var10.field4330;
         float var13 = var9.field4339 * var10.field4334 + var9.field4321 * var10.field4347 + var9.field4307 * var10.field4330 + var10.field4339;
         class207.field2931 = var9.field4334 * var10.field4345 + var9.field4345 * var10.field4336 + var9.field4308 * var10.field4333;
         class211.field3017 = var9.field4347 * var10.field4308 + var9.field4336 * var10.field4312 + var9.field4312 * var10.field4306;
         class608.field8665 = var9.field4330 * var10.field4345 + var9.field4333 * var10.field4336 + var9.field4306 * var10.field4333;
         class755.field10796 = var9.field4334 * var10.field4308 + var9.field4345 * var10.field4312 + var9.field4308 * var10.field4306;
         class195.field2818 = var9.field4330 * var10.field4308 + var9.field4333 * var10.field4312 + var9.field4306 * var10.field4306;
         byte var14 = 0;
         float var15 = Float.MAX_VALUE;
         if (arg6 <= 122) {
            this.field1155 = null;
         }

         float var16 = -3.4028235E38F;
         float var17 = Float.MAX_VALUE;
         float var18 = -3.4028235E38F;
         int var19 = this.field1063.field9735;
         int var20 = this.field1063.field9822;
         if (!this.field1056) {
            this.method772(false);
         }

         int var21 = -this.field1078 + this.field1071 >> 1;
         int var22 = -this.field1048 + this.field1121 >> 1;
         int var23 = this.field1100 - this.field1064 >> 1;
         int var24 = this.field1078 + var21;
         int var25 = this.field1048 + var22;
         int var26 = this.field1064 + var23;
         int var27 = -(var21 << arg1) + var24;
         int var28 = -(var22 << arg1) + var25;
         int var29 = -(var23 << arg1) + var26;
         int var30 = (var21 << arg1) + var24;
         int var31 = (var22 << arg1) + var25;
         class2.field17[0] = var27;
         int var32 = (var23 << arg1) + var26;
         class197.field2848[0] = var28;
         class2.field17[1] = var30;
         class719.field10308[0] = var29;
         class197.field2848[1] = var28;
         class719.field10308[1] = var29;
         class2.field17[2] = var27;
         class197.field2848[2] = var31;
         class719.field10308[2] = var29;
         class2.field17[3] = var30;
         class197.field2848[3] = var31;
         class2.field17[4] = var27;
         class719.field10308[3] = var29;
         class197.field2848[4] = var28;
         class719.field10308[4] = var32;
         class2.field17[5] = var30;
         class197.field2848[5] = var28;
         class719.field10308[5] = var32;
         class2.field17[6] = var27;
         class197.field2848[6] = var31;
         class719.field10308[6] = var32;
         class2.field17[7] = var30;
         class197.field2848[7] = var31;
         class719.field10308[7] = var32;
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
            var34 = (float)class197.field2848[var33];
            var35 = (float)class2.field17[var33];
            var36 = (float)class719.field10308[var33];
            var37 = class207.field2931 * var36 + class613.field8720 * var34 + class608.field8665 * var35 + var12;
            var38 = class755.field10796 * var36 + class211.field3017 * var34 + class195.field2818 * var35 + var11;
            var39 = class139.field2232 * var36 + class565.field8031 * var35 + class39.field597 * var34 + var13;
            if ((float)this.field1063.field9768 <= var39) {
               if (arg4 > 0) {
                  var39 = (float)arg4;
               }

               var40 = (float)var19 * var38 / var39 + (float)this.field1063.field9737;
               if (var40 > var16) {
                  var16 = var40;
               }

               if (var40 < var15) {
                  var15 = var40;
               }

               var41 = (float)var20 * var37 / var39 + (float)this.field1063.field9798;
               if (var41 > var18) {
                  var18 = var41;
               }

               if (var41 < var17) {
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
                  if (var14 != 0 && var15 < (float)arg3 && (float)arg3 < var16 && var17 < (float)arg5 && var18 > (float)arg5) {
                     if (arg0) {
                        return true;
                     }

                     if (~this.field1059 < ~this.field1063.field9831.length) {
                        this.field1063.field9831 = new int[this.field1059];
                        this.field1063.field9830 = new int[this.field1059];
                     }

                     int[] var42;
                     int[] var43;
                     label177: {
                        var42 = this.field1063.field9831;
                        var43 = this.field1063.field9830;
                        int var44 = 0;
                        if (var8) {
                           var10000 = this.field1039[var44];
                        } else if (~var44 <= ~this.field1142) {
                           var10000 = 0;
                           if (!var8) {
                              break label177;
                           }
                        } else {
                           var10000 = this.field1039[var44];
                        }

                        while(true) {
                           label247: {
                              float var45 = (float)var10000;
                              float var46 = (float)this.field1094[var44];
                              float var47 = (float)this.field1065[var44];
                              float var48 = class207.field2931 * var47 + class613.field8720 * var45 + class608.field8665 * var46 + var12;
                              float var49 = class139.field2232 * var47 + class565.field8031 * var46 + class39.field597 * var45 + var13;
                              float var50 = class755.field10796 * var47 + class211.field3017 * var45 + class195.field2818 * var46 + var11;
                              if ((float)this.field1063.field9768 <= var49) {
                                 if (arg4 > 0) {
                                    var49 = (float)arg4;
                                 }

                                 int var51 = (int)((float)var19 * var50 / var49 + (float)this.field1063.field9737);
                                 int var52 = (int)((float)var20 * var48 / var49 + (float)this.field1063.field9798);
                                 int var53 = this.field1038[var44];
                                 int var54 = this.field1038[var44 - -1];
                                 int var55 = var53;
                                 if (var8 || ~var53 > ~var54) {
                                    do {
                                       int var56 = this.field1097[var55] + -1;
                                       if (var56 == -1) {
                                          break;
                                       }

                                       var42[var56] = var51;
                                       var43[var56] = var52;
                                       ++var55;
                                    } while(~var55 > ~var54);
                                 }

                                 if (!var8) {
                                    ++var44;
                                    break label247;
                                 }
                              }

                              int var57 = this.field1038[var44];
                              int var58 = this.field1038[var44 + 1];
                              int var59 = var57;
                              if (!var8 && var57 >= var58) {
                                 ++var44;
                              } else {
                                 while(true) {
                                    int var60 = this.field1097[var59] + -1;
                                    if (~var60 == 0) {
                                       ++var44;
                                       break;
                                    }

                                    var42[this.field1097[var59] - 1] = -999999;
                                    ++var59;
                                    if (var59 >= var58) {
                                       ++var44;
                                       break;
                                    }
                                 }
                              }
                           }

                           if (~var44 <= ~this.field1142) {
                              var10000 = 0;
                              if (!var8) {
                                 break;
                              }
                           } else {
                              var10000 = this.field1039[var44];
                           }
                        }
                     }

                     int var61 = var10000;
                     if (var8 || var61 < this.field1066) {
                        do {
                           if (~var42[this.field1107[var61]] != 999998) {
                              if (~var42[this.field1084[var61]] != 999998) {
                                 if (var42[this.field1079[var61]] == -999999 && !var8) {
                                    ++var61;
                                 } else {
                                    if (this.method788(var42[this.field1107[var61]], arg5, var42[this.field1084[var61]], var43[this.field1079[var61]], arg3, var42[this.field1079[var61]], var43[this.field1107[var61]], var43[this.field1084[var61]], true)) {
                                       return true;
                                    }

                                    ++var61;
                                 }
                              } else {
                                 ++var61;
                              }
                           } else {
                              ++var61;
                           }
                        } while(var61 < this.field1066);
                     }
                  }

                  return false;
               }
            } else {
               var10000 = class197.field2848[var33];
            }

            var34 = (float)var10000;
            var35 = (float)class2.field17[var33];
            var36 = (float)class719.field10308[var33];
            var37 = class207.field2931 * var36 + class613.field8720 * var34 + class608.field8665 * var35 + var12;
            var38 = class755.field10796 * var36 + class211.field3017 * var34 + class195.field2818 * var35 + var11;
            var39 = class139.field2232 * var36 + class565.field8031 * var35 + class39.field597 * var34 + var13;
            if ((float)this.field1063.field9768 <= var39) {
               if (arg4 > 0) {
                  var39 = (float)arg4;
               }

               var40 = (float)var19 * var38 / var39 + (float)this.field1063.field9737;
               if (var40 > var16) {
                  var16 = var40;
               }

               if (var40 < var15) {
                  var15 = var40;
               }

               var41 = (float)var20 * var37 / var39 + (float)this.field1063.field9798;
               if (var41 > var18) {
                  var18 = var41;
               }

               if (var41 < var17) {
                  var17 = var41;
               }

               var14 = 1;
            }

            ++var33;
         }
      } catch (RuntimeException var63) {
         throw class612.method4503(var63, field1160[52] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1160[4] : field1160[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "g",
      descriptor = "()Z"
   )
   public final boolean method803() {
      boolean var1 = client.field10022;

      try {
         ++field1146;
         if (this.field1074 == null) {
            return true;
         } else {
            int var2 = 0;
            short var10000;
            if (var1) {
               var10000 = this.field1074[var2];
            } else if (this.field1074.length <= var2) {
               var10000 = 1;
               if (!var1) {
                  return true;
               }
            } else {
               var10000 = this.field1074[var2];
            }

            while(var10000 == -1 || this.field1063.field240.method2036(this.field1074[var2], (byte)-127)) {
               ++var2;
               if (this.field1074.length <= var2) {
                  var10000 = 1;
                  if (!var1) {
                     return true;
                  }
               } else {
                  var10000 = this.field1074[var2];
               }
            }

            return false;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field1160[57] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "a",
      descriptor = "(IILgga;ZII)Z"
   )
   public final boolean method804(int arg0, int arg1, class502 arg2, boolean arg3, int arg4, int arg5) {
      try {
         ++field1137;
         return this.method802(arg3, arg4, arg2, arg0, arg5, arg1, (byte)126);
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field1160[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1160[4] : field1160[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "a",
      descriptor = "(Lgga;Lrh;I)V"
   )
   public final void method805(class502 arg0, class213 arg1, int arg2) {
      boolean var4 = client.field10022;

      try {
         ++field1087;
         if (~this.field1059 != -1) {
            class290 var5 = this.field1063.field9709;
            class290 var6 = (class290)arg0;
            if (!this.field1056) {
               this.method772(false);
            }

            float var9;
            float var10;
            label136: {
               class247.field3783 = var5.field4334 * var6.field4339 + var5.field4347 * var6.field4321 + var5.field4330 * var6.field4307 + var5.field4339;
               class39.field597 = var5.field4334 * var6.field4347 + var5.field4347 * var6.field4336 + var5.field4330 * var6.field4312;
               float var7 = (float)this.field1048 * class39.field597 + class247.field3783;
               float var8 = (float)this.field1121 * class39.field597 + class247.field3783;
               if (var7 > var8) {
                  var9 = (float)this.field1134 + var7;
                  var10 = (float)(-this.field1134) + var8;
                  if (!var4) {
                     break label136;
                  }
               }

               var9 = (float)this.field1134 + var8;
               var10 = var7 - (float)this.field1134;
            }

            if (!(this.field1063.field9764 <= var10)) {
               if (!(var9 <= (float)this.field1063.field9768)) {
                  float var13;
                  float var14;
                  label128: {
                     class211.field3017 = var5.field4308 * var6.field4347 + var5.field4312 * var6.field4336 + var5.field4306 * var6.field4312;
                     class481.field6905 = var5.field4308 * var6.field4339 + var5.field4312 * var6.field4321 + var5.field4306 * var6.field4307 + var5.field4307;
                     float var11 = (float)this.field1048 * class211.field3017 + class481.field6905;
                     float var12 = (float)this.field1121 * class211.field3017 + class481.field6905;
                     if (var11 > var12) {
                        var13 = ((float)(-this.field1134) + var12) * (float)this.field1063.field9735;
                        var14 = ((float)this.field1134 + var11) * (float)this.field1063.field9735;
                        if (!var4) {
                           break label128;
                        }
                     }

                     var14 = ((float)this.field1134 + var12) * (float)this.field1063.field9735;
                     var13 = (var11 - (float)this.field1134) * (float)this.field1063.field9735;
                  }

                  if (!(this.field1063.field9720 <= var13 / var9)) {
                     if (!(this.field1063.field9809 >= var14 / var9)) {
                        float var17;
                        float var18;
                        label120: {
                           class370.field5448 = var5.field4345 * var6.field4339 + var5.field4336 * var6.field4321 + var5.field4333 * var6.field4307 + var5.field4321;
                           class613.field8720 = var5.field4345 * var6.field4347 + var5.field4336 * var6.field4336 + var5.field4333 * var6.field4312;
                           float var15 = (float)this.field1048 * class613.field8720 + class370.field5448;
                           float var16 = (float)this.field1121 * class613.field8720 + class370.field5448;
                           if (!(var16 < var15)) {
                              var17 = ((float)this.field1134 + var16) * (float)this.field1063.field9822;
                              var18 = ((float)(-this.field1134) + var15) * (float)this.field1063.field9822;
                              if (!var4) {
                                 break label120;
                              }
                           }

                           var17 = ((float)this.field1134 + var15) * (float)this.field1063.field9822;
                           var18 = ((float)(-this.field1134) + var16) * (float)this.field1063.field9822;
                        }

                        if (!(this.field1063.field9759 <= var18 / var9)) {
                           if (!(this.field1063.field9721 >= var17 / var9)) {
                              if (arg1 != null || this.field1103 != null) {
                                 class755.field10796 = var5.field4308 * var6.field4334 + var5.field4312 * var6.field4345 + var5.field4306 * var6.field4308;
                                 class139.field2232 = var5.field4334 * var6.field4334 + var5.field4347 * var6.field4345 + var5.field4330 * var6.field4308;
                                 class608.field8665 = var5.field4345 * var6.field4330 + var5.field4336 * var6.field4333 + var5.field4333 * var6.field4306;
                                 class195.field2818 = var5.field4308 * var6.field4330 + var5.field4312 * var6.field4333 + var5.field4306 * var6.field4306;
                                 class565.field8031 = var5.field4334 * var6.field4330 + var5.field4347 * var6.field4333 + var5.field4330 * var6.field4306;
                                 class207.field2931 = var5.field4345 * var6.field4334 + var5.field4336 * var6.field4345 + var5.field4333 * var6.field4308;
                              }

                              if (arg1 != null) {
                                 boolean var19;
                                 boolean var20;
                                 int var21;
                                 int var22;
                                 int var23;
                                 int var24;
                                 int var25;
                                 label105: {
                                    var19 = false;
                                    var20 = true;
                                    var21 = this.field1078 + this.field1071 >> 1;
                                    var22 = this.field1100 + this.field1064 >> 1;
                                    var23 = (int)((float)var22 * class755.field10796 + (float)this.field1048 * class211.field3017 + (float)var21 * class195.field2818 + class481.field6905);
                                    var24 = (int)((float)var22 * class207.field2931 + (float)this.field1048 * class613.field8720 + (float)var21 * class608.field8665 + class370.field5448);
                                    var25 = (int)((float)var22 * class139.field2232 + (float)this.field1048 * class39.field597 + (float)var21 * class565.field8031 + class247.field3783);
                                    if (~var25 > ~this.field1063.field9768) {
                                       var19 = true;
                                       if (!var4) {
                                          break label105;
                                       }
                                    }

                                    arg1.field3055 = this.field1063.field9822 * var24 / var25 + this.field1063.field9798;
                                    arg1.field3054 = this.field1063.field9735 * var23 / var25 + this.field1063.field9737;
                                 }

                                 int var26;
                                 int var27;
                                 int var28;
                                 label100: {
                                    var26 = (int)((float)var22 * class755.field10796 + (float)this.field1121 * class211.field3017 + (float)var21 * class195.field2818 + class481.field6905);
                                    var27 = (int)((float)var22 * class207.field2931 + (float)this.field1121 * class613.field8720 + (float)var21 * class608.field8665 + class370.field5448);
                                    var28 = (int)((float)var22 * class139.field2232 + (float)this.field1121 * class39.field597 + (float)var21 * class565.field8031 + class247.field3783);
                                    if (var28 < this.field1063.field9768) {
                                       var19 = true;
                                       if (!var4) {
                                          break label100;
                                       }
                                    }

                                    arg1.field3056 = this.field1063.field9735 * var26 / var28 + this.field1063.field9737;
                                    arg1.field3051 = this.field1063.field9822 * var27 / var28 + this.field1063.field9798;
                                 }

                                 if (var19) {
                                    label154: {
                                       if (var25 < this.field1063.field9768 && var28 < this.field1063.field9768) {
                                          var20 = false;
                                          if (!var4) {
                                             break label154;
                                          }
                                       }

                                       if (this.field1063.field9768 > var25) {
                                          int var29 = (-this.field1063.field9768 + var28 << 16) / (-var25 + var28);
                                          int var30 = ((-var23 + var26) * var29 >> 16) + var26;
                                          arg1.field3054 = this.field1063.field9735 * var30 / this.field1063.field9768 + this.field1063.field9737;
                                          int var31 = var27 - -((-var24 + var27) * var29 >> 16);
                                          arg1.field3055 = this.field1063.field9798 - -(this.field1063.field9822 * var31 / this.field1063.field9768);
                                          if (!var4) {
                                             break label154;
                                          }
                                       }

                                       if (~var28 > ~this.field1063.field9768) {
                                          int var32 = (-this.field1063.field9768 + var25 << 16) / (-var28 + var25);
                                          int var33 = ((-var26 + var23) * var32 >> 16) + var23;
                                          int var34 = ((-var27 + var24) * var32 >> 16) + var24;
                                          arg1.field3054 = this.field1063.field9735 * var33 / this.field1063.field9768 + this.field1063.field9737;
                                          arg1.field3055 = this.field1063.field9822 * var34 / this.field1063.field9768 + this.field1063.field9798;
                                       }
                                    }
                                 }

                                 if (var20) {
                                    label84: {
                                       arg1.field3053 = true;
                                       if (var28 < var25) {
                                          arg1.field3052 = (var23 - -this.field1134) * this.field1063.field9735 / var25 + this.field1063.field9737 + -arg1.field3054;
                                          if (!var4) {
                                             break label84;
                                          }
                                       }

                                       arg1.field3052 = -arg1.field3056 + this.field1063.field9737 - -((this.field1134 + var26) * this.field1063.field9735 / var28);
                                    }
                                 }
                              }

                              this.field1063.method4945(false);
                              this.field1063.method4907(var6, (byte)80);
                              this.method789((byte)-75);
                              this.field1063.method4956(34161);
                              this.method759((byte)32);
                           }
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var36) {
         throw class612.method4503(var36, field1160[6] + (arg0 != null ? field1160[4] : field1160[2]) + ',' + (arg1 != null ? field1160[4] : field1160[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "k",
      descriptor = "(I)V"
   )
   public final void method806(int arg0) {
      boolean var2 = client.field10022;

      try {
         ++field1113;
         int var3 = class160.field2447[arg0];
         int var4 = class160.field2446[arg0];
         int var5 = 0;
         int var6;
         if (var2) {
            var6 = this.field1065[var5] * var3 - -(this.field1094[var5] * var4) >> 14;
            this.field1065[var5] = this.field1065[var5] * var4 + -(this.field1094[var5] * var3) >> 14;
            this.field1094[var5] = var6;
            ++var5;
         }

         while(true) {
            while(~this.field1142 < ~var5) {
               var6 = this.field1065[var5] * var3 - -(this.field1094[var5] * var4) >> 14;
               this.field1065[var5] = this.field1065[var5] * var4 + -(this.field1094[var5] * var3) >> 14;
               this.field1094[var5] = var6;
               ++var5;
            }

            int var7 = 0;
            if (!var2) {
               class71 var10000;
               if (var2) {
                  var10000 = this;
               } else if (this.field1059 <= var7) {
                  var10000 = this;
                  if (!var2) {
                     if (this.field1116 == null && this.field1045 != null) {
                        this.field1045.field6574 = null;
                     }

                     if (this.field1116 != null) {
                        this.field1116.field6574 = null;
                     }

                     this.field1056 = false;
                     if (this.field1120 != null) {
                        this.field1120.field6574 = null;
                        return;
                     }

                     return;
                  }
               } else {
                  var10000 = this;
               }

               while(true) {
                  int var8 = var10000.field1043[var7] * var4 + this.field1109[var7] * var3 >> 14;
                  this.field1109[var7] = (short)(this.field1109[var7] * var4 + -(this.field1043[var7] * var3) >> 14);
                  this.field1043[var7] = (short)var8;
                  ++var7;
                  if (this.field1059 <= var7) {
                     var10000 = this;
                     if (!var2) {
                        if (this.field1116 == null && this.field1045 != null) {
                           this.field1045.field6574 = null;
                        }

                        if (this.field1116 != null) {
                           this.field1116.field6574 = null;
                        }

                        this.field1056 = false;
                        if (this.field1120 != null) {
                           this.field1120.field6574 = null;
                           return;
                        }

                        return;
                     }
                  } else {
                     var10000 = this;
                  }
               }
            }

            ++var5;
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field1160[38] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "C",
      descriptor = "(I)V"
   )
   public final void method807(int arg0) {
      try {
         this.field1089 = (short)arg0;
         ++field1049;
         if (this.field1045 != null) {
            this.field1045.field6574 = null;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1160[33] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "a",
      descriptor = "(SBIII)I"
   )
   private final int method808(short arg0, byte arg1, int arg2, int arg3, int arg4) {
      boolean var6 = client.field10022;

      try {
         ++field1102;
         int var7 = class744.field10589[class614.method4515(99, arg2, arg3)];
         if (~arg0 != arg4) {
            class390 var8 = this.field1063.field240.method2043(-81, 65535 & arg0);
            int var9 = 255 & var8.field5679;
            if (var9 != 0) {
               label59: {
                  int var10;
                  label57: {
                     if (arg2 < 0) {
                        var10 = 0;
                        if (!var6) {
                           break label57;
                        }
                     }

                     if (arg2 <= 127) {
                        var10 = arg2 * 131586;
                        if (!var6) {
                           break label57;
                        }
                     }

                     var10 = 16777215;
                  }

                  if (~var9 == -257) {
                     var7 = var10;
                     if (!var6) {
                        break label59;
                     }
                  }

                  int var12 = 256 - var9;
                  var7 = (-16711936 & (var7 & 16711935) * var12 + (16711935 & var10) * var9) + (16711680 & (65280 & var7) * var12 + (var10 & 65280) * var9) >> 8;
               }
            }

            int var13 = 255 & var8.field5677;
            if (var13 != 0) {
               var13 += 256;
               int var14 = ((var7 & 16711680) >> 16) * var13;
               if (~var14 < -65536) {
                  var14 = 65535;
               }

               int var15 = ((65280 & var7) >> 8) * var13;
               if (~var15 < -65536) {
                  var15 = 65535;
               }

               int var16 = (var7 & 255) * var13;
               if (var16 > 65535) {
                  var16 = 65535;
               }

               var7 = (var14 << 8 & 16711873) + (var15 & 65280) - -(var16 >> 8);
            }
         }

         return (var7 << 8) + (255 - (255 & arg1));
      } catch (RuntimeException var18) {
         throw class612.method4503(var18, field1160[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method809(int arg0) {
      boolean var2 = client.field10022;

      try {
         ++field1042;
         int var3 = class160.field2447[arg0];
         int var4 = class160.field2446[arg0];
         int var5 = 0;
         class71 var10000;
         if (var2) {
            var10000 = this;
         } else if (this.field1142 <= var5) {
            this.field1056 = false;
            var10000 = this;
            if (!var2) {
               if (this.field1120 != null) {
                  this.field1120.field6574 = null;
                  return;
               }

               return;
            }
         } else {
            var10000 = this;
         }

         while(true) {
            int var6 = var10000.field1065[var5] * var3 - -(this.field1094[var5] * var4) >> 14;
            this.field1065[var5] = this.field1065[var5] * var4 - this.field1094[var5] * var3 >> 14;
            this.field1094[var5] = var6;
            ++var5;
            if (this.field1142 <= var5) {
               this.field1056 = false;
               var10000 = this;
               if (!var2) {
                  if (this.field1120 != null) {
                     this.field1120.field6574 = null;
                     return;
                  }

                  return;
               }
            } else {
               var10000 = this;
            }
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field1160[37] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "a",
      descriptor = "(Lsa;B)V"
   )
   public static final void method810(class39 arg0, byte arg1) {
      try {
         ++field1133;
         class703.field10123 = arg0.method443(field1160[75], arg1 ^ 98);
         class395.field5789 = arg0.method443(field1160[76], arg1 + -98);
         class631.field8973 = arg0.method443(field1160[83], 16);
         class122.field1964 = arg0.method443(field1160[73], arg1 + -98);
         class595.field8390 = arg0.method443(field1160[67], 16);
         class235.field3641 = arg0.method443(field1160[68], arg1 ^ 98);
         class69.field1003 = arg0.method443(field1160[72], 16);
         class121.field1939 = arg0.method443(field1160[71], arg1 + -98);
         class238.field3674 = arg0.method443(field1160[79], 16);
         class692.field9954 = arg0.method443(field1160[70], 16);
         class692.field9977 = arg0.method443(field1160[81], 16);
         class691.field9945 = arg0.method443(field1160[82], 16);
         class521.field7331 = arg0.method443(field1160[78], 16);
         if (arg1 != 114) {
            field1138 = null;
         }

         class533.field7517 = arg0.method443(field1160[80], arg1 ^ 98);
         class264.field4041 = arg0.method443(field1160[74], 16);
         class589.field8278 = arg0.method443(field1160[77], 16);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1160[69] + (arg0 != null ? field1160[4] : field1160[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "aa",
      descriptor = "(SS)V"
   )
   public final void method811(short arg0, short arg1) {
      boolean var3 = client.field10022;

      try {
         ++field1080;
         class672 var4 = this.field1063.field240;
         int var5 = 0;
         if (var3) {
            if (~arg0 == ~this.field1074[var5]) {
               this.field1074[var5] = arg1;
            }

            ++var5;
         }

         while(true) {
            while(~var5 > ~this.field1066) {
               if (~arg0 == ~this.field1074[var5]) {
                  this.field1074[var5] = arg1;
               }

               ++var5;
            }

            byte var6 = 0;
            byte var7 = 0;
            if (!var3) {
               if (arg0 != -1) {
                  class390 var8 = var4.method2043(-85, arg0 & 65535);
                  var7 = var8.field5677;
                  var6 = var8.field5679;
               }

               byte var9 = 0;
               byte var10 = 0;
               if (arg1 != -1) {
                  class390 var11 = var4.method2043(-100, arg1 & 65535);
                  var9 = var11.field5679;
                  if (var11.field5681 != 0 || var11.field5667 != 0) {
                     this.field1060 = true;
                  }

                  var10 = var11.field5677;
               }

               if (var6 != var9 | var7 != var10) {
                  if (this.field1103 != null) {
                     int var12 = 0;
                     if (var3 || ~this.field1105 < ~var12) {
                        do {
                           class152 var13 = this.field1103[var12];
                           class750 var14 = this.field1041[var12];
                           var14.field10654 = class744.field10589[65535 & this.field1106[var13.field2332]] & 16777215 | -16777216 & var14.field10654;
                           ++var12;
                        } while(~this.field1105 < ~var12);
                     }
                  }

                  if (this.field1045 != null) {
                     this.field1045.field6574 = null;
                     return;
                  }
               }

               return;
            }

            if (arg0 == -1) {
               this.field1074[var5] = arg1;
            }

            ++var5;
         }
      } catch (RuntimeException var16) {
         throw class612.method4503(var16, field1160[48] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "a",
      descriptor = "(BLjava/lang/String;)I"
   )
   public static final int method812(byte arg0, String arg1) {
      boolean var2 = client.field10022;

      try {
         ++field1069;
         if (arg1 == null) {
            return -1;
         } else {
            int var3 = 0;
            if (var2) {
               if (arg1.equalsIgnoreCase(class201.field2879[var3])) {
                  return var3;
               }

               ++var3;
            }

            while(true) {
               while(~var3 > ~class428.field6272) {
                  if (arg1.equalsIgnoreCase(class201.field2879[var3])) {
                     return var3;
                  }

                  ++var3;
               }

               if (!var2) {
                  if (arg0 != -112) {
                     method751((byte)31, -111, 89);
                  }

                  return -1;
               }

               if (arg0 != 0) {
                  return var3;
               }

               ++var3;
            }
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field1160[55] + arg0 + ',' + (arg1 != null ? field1160[4] : field1160[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "<init>",
      descriptor = "(Laea;)V"
   )
   public class71(class678 arg0) {
      this.field1060 = false;
      this.field1059 = 0;
      this.field1077 = 0;
      this.field1110 = true;
      this.field1050 = false;
      this.field1056 = false;
      this.field1066 = 0;
      this.field1114 = 0;
      this.field1142 = 0;

      try {
         this.field1063 = arg0;
         this.field1120 = new class451((class516)null, 5126, 3, 0);
         this.field1034 = new class451((class516)null, 5126, 2, 0);
         this.field1116 = new class451((class516)null, 5126, 3, 0);
         this.field1045 = new class451((class516)null, 5121, 4, 0);
         this.field1115 = new class699();
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1160[47] + (arg0 != null ? field1160[4] : field1160[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "<init>",
      descriptor = "(Laea;Leca;IIII)V"
   )
   public class71(class678 arg0, class590 arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var7 = client.field10022;
      super();
      this.field1060 = false;
      this.field1059 = 0;
      this.field1077 = 0;
      this.field1110 = true;
      this.field1050 = false;
      this.field1056 = false;
      this.field1066 = 0;
      this.field1114 = 0;
      this.field1142 = 0;

      try {
         this.field1063 = arg0;
         this.field1054 = arg2;
         this.field1129 = arg5;
         if (class367.method2890(arg2, -50, arg5)) {
            this.field1120 = new class451((class516)null, 5126, 3, 0);
         }

         if (class226.method1959(arg5, arg2, -6007)) {
            this.field1034 = new class451((class516)null, 5126, 2, 0);
         }

         if (class284.method2376(arg2, arg5, 44)) {
            this.field1116 = new class451((class516)null, 5126, 3, 0);
         }

         if (class428.method3349(arg5, arg2, -116)) {
            this.field1045 = new class451((class516)null, 5121, 4, 0);
         }

         if (class68.method714(arg5, 19090, arg2)) {
            this.field1115 = new class699();
         }

         class672 var8 = arg0.field240;
         int[] var9 = new int[arg1.field8324];
         this.field1038 = new int[arg1.field8306 + 1];
         int var10 = 0;
         class390 var11;
         if (var7) {
            if (arg1.field8318 != null) {
               if (arg1.field8318[var10] != 2) {
                  if (arg1.field8304 != null) {
                     if (~arg1.field8304[var10] != 0) {
                        var11 = var8.method2043(-73, arg1.field8304[var10] & 65535);
                        if ((64 & this.field1129) != 0) {
                           if (!var11.field5670) {
                              if (var11.field5684) {
                                 if (var7) {
                                    var9[this.field1066++] = var10;
                                    ++this.field1038[arg1.field8342[var10]];
                                    ++this.field1038[arg1.field8341[var10]];
                                    ++this.field1038[arg1.field8323[var10]];
                                    ++var10;
                                 } else {
                                    ++var10;
                                 }
                              } else {
                                 var9[this.field1066++] = var10;
                                 ++this.field1038[arg1.field8342[var10]];
                                 ++this.field1038[arg1.field8341[var10]];
                                 ++this.field1038[arg1.field8323[var10]];
                                 ++var10;
                              }
                           } else {
                              var9[this.field1066++] = var10;
                              ++this.field1038[arg1.field8342[var10]];
                              ++this.field1038[arg1.field8341[var10]];
                              ++this.field1038[arg1.field8323[var10]];
                              ++var10;
                           }
                        } else if (var11.field5684) {
                           if (var7) {
                              var9[this.field1066++] = var10;
                              ++this.field1038[arg1.field8342[var10]];
                              ++this.field1038[arg1.field8341[var10]];
                              ++this.field1038[arg1.field8323[var10]];
                              ++var10;
                           } else {
                              ++var10;
                           }
                        } else {
                           var9[this.field1066++] = var10;
                           ++this.field1038[arg1.field8342[var10]];
                           ++this.field1038[arg1.field8341[var10]];
                           ++this.field1038[arg1.field8323[var10]];
                           ++var10;
                        }
                     } else {
                        var9[this.field1066++] = var10;
                        ++this.field1038[arg1.field8342[var10]];
                        ++this.field1038[arg1.field8341[var10]];
                        ++this.field1038[arg1.field8323[var10]];
                        ++var10;
                     }
                  } else {
                     var9[this.field1066++] = var10;
                     ++this.field1038[arg1.field8342[var10]];
                     ++this.field1038[arg1.field8341[var10]];
                     ++this.field1038[arg1.field8323[var10]];
                     ++var10;
                  }
               } else {
                  ++var10;
               }
            } else if (arg1.field8304 != null) {
               if (~arg1.field8304[var10] != 0) {
                  var11 = var8.method2043(-73, arg1.field8304[var10] & 65535);
                  if ((64 & this.field1129) != 0) {
                     if (!var11.field5670) {
                        if (var11.field5684) {
                           if (var7) {
                              var9[this.field1066++] = var10;
                              ++this.field1038[arg1.field8342[var10]];
                              ++this.field1038[arg1.field8341[var10]];
                              ++this.field1038[arg1.field8323[var10]];
                              ++var10;
                           } else {
                              ++var10;
                           }
                        } else {
                           var9[this.field1066++] = var10;
                           ++this.field1038[arg1.field8342[var10]];
                           ++this.field1038[arg1.field8341[var10]];
                           ++this.field1038[arg1.field8323[var10]];
                           ++var10;
                        }
                     } else {
                        var9[this.field1066++] = var10;
                        ++this.field1038[arg1.field8342[var10]];
                        ++this.field1038[arg1.field8341[var10]];
                        ++this.field1038[arg1.field8323[var10]];
                        ++var10;
                     }
                  } else if (var11.field5684) {
                     if (var7) {
                        var9[this.field1066++] = var10;
                        ++this.field1038[arg1.field8342[var10]];
                        ++this.field1038[arg1.field8341[var10]];
                        ++this.field1038[arg1.field8323[var10]];
                        ++var10;
                     } else {
                        ++var10;
                     }
                  } else {
                     var9[this.field1066++] = var10;
                     ++this.field1038[arg1.field8342[var10]];
                     ++this.field1038[arg1.field8341[var10]];
                     ++this.field1038[arg1.field8323[var10]];
                     ++var10;
                  }
               } else {
                  var9[this.field1066++] = var10;
                  ++this.field1038[arg1.field8342[var10]];
                  ++this.field1038[arg1.field8341[var10]];
                  ++this.field1038[arg1.field8323[var10]];
                  ++var10;
               }
            } else {
               var9[this.field1066++] = var10;
               ++this.field1038[arg1.field8342[var10]];
               ++this.field1038[arg1.field8341[var10]];
               ++this.field1038[arg1.field8323[var10]];
               ++var10;
            }
         }

         while(true) {
            while(arg1.field8324 > var10) {
               if (arg1.field8318 != null) {
                  if (arg1.field8318[var10] != 2) {
                     if (arg1.field8304 != null) {
                        if (~arg1.field8304[var10] != 0) {
                           var11 = var8.method2043(-73, arg1.field8304[var10] & 65535);
                           if ((64 & this.field1129) != 0) {
                              if (!var11.field5670) {
                                 if (var11.field5684) {
                                    if (var7) {
                                       var9[this.field1066++] = var10;
                                       ++this.field1038[arg1.field8342[var10]];
                                       ++this.field1038[arg1.field8341[var10]];
                                       ++this.field1038[arg1.field8323[var10]];
                                       ++var10;
                                    } else {
                                       ++var10;
                                    }
                                 } else {
                                    var9[this.field1066++] = var10;
                                    ++this.field1038[arg1.field8342[var10]];
                                    ++this.field1038[arg1.field8341[var10]];
                                    ++this.field1038[arg1.field8323[var10]];
                                    ++var10;
                                 }
                              } else {
                                 var9[this.field1066++] = var10;
                                 ++this.field1038[arg1.field8342[var10]];
                                 ++this.field1038[arg1.field8341[var10]];
                                 ++this.field1038[arg1.field8323[var10]];
                                 ++var10;
                              }
                           } else if (var11.field5684) {
                              if (var7) {
                                 var9[this.field1066++] = var10;
                                 ++this.field1038[arg1.field8342[var10]];
                                 ++this.field1038[arg1.field8341[var10]];
                                 ++this.field1038[arg1.field8323[var10]];
                                 ++var10;
                              } else {
                                 ++var10;
                              }
                           } else {
                              var9[this.field1066++] = var10;
                              ++this.field1038[arg1.field8342[var10]];
                              ++this.field1038[arg1.field8341[var10]];
                              ++this.field1038[arg1.field8323[var10]];
                              ++var10;
                           }
                        } else {
                           var9[this.field1066++] = var10;
                           ++this.field1038[arg1.field8342[var10]];
                           ++this.field1038[arg1.field8341[var10]];
                           ++this.field1038[arg1.field8323[var10]];
                           ++var10;
                        }
                     } else {
                        var9[this.field1066++] = var10;
                        ++this.field1038[arg1.field8342[var10]];
                        ++this.field1038[arg1.field8341[var10]];
                        ++this.field1038[arg1.field8323[var10]];
                        ++var10;
                     }
                  } else {
                     ++var10;
                  }
               } else if (arg1.field8304 != null) {
                  if (~arg1.field8304[var10] != 0) {
                     var11 = var8.method2043(-73, arg1.field8304[var10] & 65535);
                     if ((64 & this.field1129) != 0) {
                        if (!var11.field5670) {
                           if (var11.field5684) {
                              if (var7) {
                                 var9[this.field1066++] = var10;
                                 ++this.field1038[arg1.field8342[var10]];
                                 ++this.field1038[arg1.field8341[var10]];
                                 ++this.field1038[arg1.field8323[var10]];
                                 ++var10;
                              } else {
                                 ++var10;
                              }
                           } else {
                              var9[this.field1066++] = var10;
                              ++this.field1038[arg1.field8342[var10]];
                              ++this.field1038[arg1.field8341[var10]];
                              ++this.field1038[arg1.field8323[var10]];
                              ++var10;
                           }
                        } else {
                           var9[this.field1066++] = var10;
                           ++this.field1038[arg1.field8342[var10]];
                           ++this.field1038[arg1.field8341[var10]];
                           ++this.field1038[arg1.field8323[var10]];
                           ++var10;
                        }
                     } else if (var11.field5684) {
                        if (var7) {
                           var9[this.field1066++] = var10;
                           ++this.field1038[arg1.field8342[var10]];
                           ++this.field1038[arg1.field8341[var10]];
                           ++this.field1038[arg1.field8323[var10]];
                           ++var10;
                        } else {
                           ++var10;
                        }
                     } else {
                        var9[this.field1066++] = var10;
                        ++this.field1038[arg1.field8342[var10]];
                        ++this.field1038[arg1.field8341[var10]];
                        ++this.field1038[arg1.field8323[var10]];
                        ++var10;
                     }
                  } else {
                     var9[this.field1066++] = var10;
                     ++this.field1038[arg1.field8342[var10]];
                     ++this.field1038[arg1.field8341[var10]];
                     ++this.field1038[arg1.field8323[var10]];
                     ++var10;
                  }
               } else {
                  var9[this.field1066++] = var10;
                  ++this.field1038[arg1.field8342[var10]];
                  ++this.field1038[arg1.field8341[var10]];
                  ++this.field1038[arg1.field8323[var10]];
                  ++var10;
               }
            }

            this.field1077 = this.field1066;
            long[] var12 = new long[this.field1066];
            int var10000 = this.field1054 & 256;
            if (!var7) {
               label1266: {
                  boolean var13 = var10000 != 0;
                  int var14 = 0;
                  if (var7) {
                     var10000 = var9[var14];
                  } else if (var14 >= this.field1066) {
                     class245.method2133(var12, var9, -29949);
                     this.field1090 = arg1.field8325;
                     this.field1142 = arg1.field8306;
                     this.field1114 = arg1.field8307;
                     this.field1094 = arg1.field8344;
                     this.field1039 = arg1.field8311;
                     this.field1065 = arg1.field8332;
                     this.field1153 = arg1.field8350;
                     var10000 = this.field1142;
                     if (!var7) {
                        break label1266;
                     }
                  } else {
                     var10000 = var9[var14];
                  }

                  while(true) {
                     label3882: {
                        int var15 = var10000;
                        class390 var16 = null;
                        int var17 = 0;
                        byte var18 = 0;
                        byte var19 = 0;
                        byte var20 = 0;
                        if (arg1.field8343 != null) {
                           boolean var21 = false;
                           int var22 = 0;
                           class747 var23;
                           class766 var24;
                           class390 var25;
                           if (var7) {
                              var23 = arg1.field8343[var22];
                              if (~var23.field10624 == ~var15) {
                                 var24 = class107.method1044(106, var23.field10623);
                                 if (var24.field10993) {
                                    var21 = true;
                                 }

                                 if (~var24.field10994 != 0) {
                                    var25 = var8.method2043(-95, var24.field10994);
                                    if (var25.field5678 == 2) {
                                       this.field1050 = true;
                                    }
                                 }
                              }

                              ++var22;
                           }

                           while(~arg1.field8343.length < ~var22) {
                              var23 = arg1.field8343[var22];
                              if (~var23.field10624 == ~var15) {
                                 var24 = class107.method1044(106, var23.field10623);
                                 if (var24.field10993) {
                                    var21 = true;
                                 }

                                 if (~var24.field10994 != 0) {
                                    var25 = var8.method2043(-95, var24.field10994);
                                    if (var25.field5678 == 2) {
                                       this.field1050 = true;
                                    }
                                 }
                              }

                              ++var22;
                           }

                           if (var21) {
                              var12[var14] = Long.MAX_VALUE;
                              --this.field1077;
                              if (!var7) {
                                 ++var14;
                                 break label3882;
                              }
                           }
                        }

                        short var26 = -1;
                        if (arg1.field8304 != null) {
                           var26 = arg1.field8304[var15];
                           if (var26 != -1) {
                              var16 = var8.method2043(-83, 65535 & var26);
                              if (~(this.field1129 & 64) != -1) {
                                 if (var16.field5670) {
                                    var26 = -1;
                                    var16 = null;
                                 } else {
                                    var19 = var16.field5668;
                                    if (var16.field5681 == 0) {
                                       if (var16.field5667 != 0) {
                                          this.field1060 = true;
                                       }
                                    } else {
                                       this.field1060 = true;
                                    }

                                    var20 = var16.field5671;
                                 }
                              } else {
                                 var19 = var16.field5668;
                                 if (var16.field5681 == 0) {
                                    if (var16.field5667 != 0) {
                                       this.field1060 = true;
                                    }
                                 } else {
                                    this.field1060 = true;
                                 }

                                 var20 = var16.field5671;
                              }
                           }
                        }

                        boolean var27 = arg1.field8353 != null ? (arg1.field8353[var15] == 0 ? (var16 != null ? var16.field5678 != 0 : false) : true) : (var16 != null ? var16.field5678 != 0 : false);
                        if (!var13) {
                           if (var27 && arg1.field8327 != null) {
                              var17 += arg1.field8327[var15] << 17;
                           }
                        } else if (arg1.field8327 != null) {
                           var17 += arg1.field8327[var15] << 17;
                        }

                        if (var27) {
                           var17 += 65536;
                        }

                        int var28 = ((255 & var19) << 8) + var17;
                        int var29 = ((var26 & 65535) << 16) + var18;
                        int var30 = (255 & var20) + var28;
                        int var31 = (var14 & 65535) + var29;
                        var12[var14] = ((long)var30 << 32) + (long)var31;
                        this.field1060 |= var16 != null ? (var16.field5681 == 0 ? ~var16.field5667 != -1 : true) : false;
                        this.field1050 |= var27;
                        ++var14;
                     }

                     if (var14 >= this.field1066) {
                        class245.method2133(var12, var9, -29949);
                        this.field1090 = arg1.field8325;
                        this.field1142 = arg1.field8306;
                        this.field1114 = arg1.field8307;
                        this.field1094 = arg1.field8344;
                        this.field1039 = arg1.field8311;
                        this.field1065 = arg1.field8332;
                        this.field1153 = arg1.field8350;
                        var10000 = this.field1142;
                        if (!var7) {
                           break;
                        }
                     } else {
                        var10000 = var9[var14];
                     }
                  }
               }

               class752[] var32 = new class752[var10000];
               this.field1139 = arg1.field8339;
               int var10002;
               int var33;
               int var40;
               int var41;
               int var42;
               class552 var43;
               class650[] var44;
               int var45;
               int var46;
               short var47;
               short var48;
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
               byte var62;
               class650 var63;
               class752 var64;
               class752 var65;
               class752 var66;
               int var67;
               int var68;
               int var69;
               int var70;
               short var71;
               class390 var72;
               float var73;
               float var74;
               float var75;
               float var76;
               float var77;
               float var78;
               byte var79;
               byte var80;
               int var81;
               byte var82;
               short var83;
               short var84;
               short var85;
               short var86;
               short var87;
               short var88;
               float var89;
               float var90;
               float var91;
               float var92;
               float var93;
               float var94;
               float var95;
               float var96;
               float var97;
               float var98;
               float var99;
               float var100;
               float var101;
               float var102;
               float var103;
               float var104;
               float var105;
               float var106;
               float var107;
               float var108;
               float var109;
               float var110;
               float var111;
               float var112;
               float var113;
               float var114;
               float var115;
               float var116;
               float var117;
               short var118;
               short var119;
               short var120;
               int var121;
               int var122;
               int var123;
               float[] var124;
               byte var125;
               float var126;
               float var127;
               float var128;
               int var129;
               int var130;
               int var131;
               int var132;
               int var133;
               int var134;
               int var135;
               int var136;
               int var137;
               float var138;
               float var139;
               float var140;
               float var141;
               float var142;
               float var143;
               float var144;
               float var145;
               byte var146;
               class650 var147;
               long var148;
               long var150;
               short var152;
               short var153;
               short var154;
               class752 var155;
               class752 var156;
               class752 var157;
               int var158;
               short var159;
               short var160;
               int var161;
               int[] var162;
               int var163;
               int var164;
               int var165;
               int var166;
               byte var169;
               int var170;
               class590 var171;
               byte var172;
               class71 var173;
               if (arg1.field8343 != null) {
                  this.field1105 = arg1.field8343.length;
                  this.field1103 = new class152[this.field1105];
                  this.field1041 = new class750[this.field1105];
                  var33 = 0;
                  if (var7) {
                     var171 = arg1;
                  } else if (this.field1105 <= var33) {
                     var33 = this.field1066 * 3;
                     this.field1079 = new short[this.field1066];
                     this.field1109 = new short[var33];
                     this.field1084 = new short[this.field1066];
                     this.field1043 = new short[var33];
                     this.field1089 = (short)arg3;
                     this.field1101 = new float[var33];
                     this.field1140 = (short)arg4;
                     this.field1107 = new short[this.field1066];
                     var171 = arg1;
                     if (!var7) {
                        if (arg1.field8335 != null) {
                           this.field1117 = new short[this.field1066];
                        }

                        this.field1074 = new short[this.field1066];
                        this.field1097 = new short[var33];
                        this.field1095 = new short[var33];
                        this.field1052 = new byte[var33];
                        this.field1155 = new byte[this.field1066];
                        class724.field10350 = new long[var33];
                        this.field1144 = new float[var33];
                        this.field1106 = new short[this.field1066];
                        var40 = 0;
                        var41 = 0;
                        if (var7) {
                           var42 = this.field1038[var41];
                           this.field1038[var41] = var40;
                           var40 += var42;
                           var32[var41] = new class752();
                           ++var41;
                        }

                        while(true) {
                           if (var41 >= arg1.field8306) {
                              this.field1038[arg1.field8306] = var40;
                              var43 = class227.method2023(var9, arg1, 255, this.field1066);
                              var44 = new class650[arg1.field8324];
                              var10000 = 0;
                              if (!var7) {
                                 label2429: {
                                    var45 = 0;
                                    if (var7) {
                                       var46 = arg1.field8342[var45];
                                    } else if (var45 >= arg1.field8324) {
                                       var46 = 0;
                                       if (!var7) {
                                          break label2429;
                                       }
                                    } else {
                                       var46 = arg1.field8342[var45];
                                    }

                                    label2432:
                                    while(true) {
                                       var47 = arg1.field8341[var45];
                                       var48 = arg1.field8323[var45];
                                       var49 = this.field1094[var47] + -this.field1094[var46];
                                       var50 = this.field1039[var47] + -this.field1039[var46];
                                       var51 = this.field1065[var47] - this.field1065[var46];
                                       var52 = this.field1094[var48] + -this.field1094[var46];
                                       var53 = this.field1039[var48] - this.field1039[var46];
                                       var54 = this.field1065[var48] - this.field1065[var46];
                                       var55 = var50 * var54 + -(var51 * var53);
                                       var56 = var51 * var52 + -(var49 * var54);
                                       var57 = var49 * var53 - var50 * var52;
                                       if (var7) {
                                          var55 >>= 1;
                                          var56 >>= 1;
                                          var57 >>= 1;
                                       }

                                       while(true) {
                                          while(true) {
                                             if (~var55 >= -8193) {
                                                var10000 = ~var56;
                                                if (var7) {
                                                   var57 = var10000 >> -8193;
                                                   continue;
                                                }

                                                if (var10000 >= -8193 && ~var57 >= -8193 && var55 >= -8192 && var56 >= -8192 && var57 >= -8192) {
                                                   var58 = (int)Math.sqrt((double)(var55 * var55 + var56 * var56 - -(var57 * var57)));
                                                   if (var58 <= 0) {
                                                      var169 = 1;
                                                      var59 = var56 * 256 / var169;
                                                      var60 = var57 * 256 / var169;
                                                      var61 = var55 * 256 / var169;
                                                      var172 = arg1.field8318 == null ? 0 : arg1.field8318[var45];
                                                   } else {
                                                      var59 = var56 * 256 / var58;
                                                      var60 = var57 * 256 / var58;
                                                      var61 = var55 * 256 / var58;
                                                      var172 = arg1.field8318 == null ? 0 : arg1.field8318[var45];
                                                   }

                                                   label3889: {
                                                      var62 = var172;
                                                      if (~var62 != -1) {
                                                         if (var62 != 1) {
                                                            ++var45;
                                                            break label3889;
                                                         }

                                                         var63 = var44[var45] = new class650();
                                                         var63.field9191 = var61;
                                                         var63.field9192 = var60;
                                                         var63.field9198 = var59;
                                                         if (!var7) {
                                                            ++var45;
                                                            break label3889;
                                                         }
                                                      }

                                                      var64 = var32[var46];
                                                      ++var64.field10680;
                                                      var64.field10675 += var61;
                                                      var64.field10677 += var60;
                                                      var64.field10678 += var59;
                                                      var65 = var32[var47];
                                                      var65.field10678 += var59;
                                                      ++var65.field10680;
                                                      var65.field10675 += var61;
                                                      var65.field10677 += var60;
                                                      var66 = var32[var48];
                                                      var66.field10678 += var59;
                                                      var66.field10677 += var60;
                                                      ++var66.field10680;
                                                      var66.field10675 += var61;
                                                      ++var45;
                                                   }

                                                   if (var45 >= arg1.field8324) {
                                                      var46 = 0;
                                                      if (!var7) {
                                                         break label2432;
                                                      }
                                                   } else {
                                                      var46 = arg1.field8342[var45];
                                                   }
                                                   continue label2432;
                                                }
                                             }

                                             var55 >>= 1;
                                             var56 >>= 1;
                                             var57 >>= 1;
                                          }
                                       }
                                    }
                                 }

                                 if (var7) {
                                    var67 = var9[var46];
                                    var68 = 65535 & arg1.field8317[var67];
                                    if (arg1.field8348 != null) {
                                       var69 = arg1.field8348[var67];
                                       if (var7) {
                                          var69 = -1;
                                       }
                                    } else {
                                       var69 = -1;
                                    }

                                    if (arg1.field8353 == null) {
                                       var70 = 0;
                                       if (var7) {
                                          var70 = 255 & arg1.field8353[var67];
                                       }
                                    } else {
                                       var70 = 255 & arg1.field8353[var67];
                                    }

                                    var71 = arg1.field8304 != null ? arg1.field8304[var67] : -1;
                                    if (var71 != -1 && ~(this.field1129 & 64) != -1) {
                                       var72 = var8.method2043(-66, var71 & 65535);
                                       if (var72.field5670) {
                                          var71 = -1;
                                       }
                                    }
                                 } else {
                                    if (~this.field1066 >= ~var46) {
                                       var67 = 0;
                                       var68 = -10000;
                                       var158 = 0;
                                       if (!var7) {
                                          if (var7) {
                                             var159 = this.field1074[var158];
                                             if (var68 != var159) {
                                                ++var67;
                                                var68 = var159;
                                             }

                                             ++var158;
                                          }

                                          while(true) {
                                             if (~var158 <= ~this.field1077) {
                                                this.field1123 = new int[var67 + 1];
                                                var67 = 0;
                                                var68 = -10000;
                                                var170 = 0;
                                                if (!var7) {
                                                   if (var7) {
                                                      var160 = this.field1074[var170];
                                                      if (~var68 != ~var160) {
                                                         this.field1123[var67++] = var170;
                                                         var68 = var160;
                                                      }

                                                      ++var170;
                                                   }

                                                   while(true) {
                                                      if (this.field1077 <= var170) {
                                                         this.field1123[var67] = this.field1077;
                                                         class724.field10350 = null;
                                                         this.field1043 = class147.method1437(this.field1059, this.field1043, false);
                                                         this.field1095 = class147.method1437(this.field1059, this.field1095, false);
                                                         this.field1109 = class147.method1437(this.field1059, this.field1109, false);
                                                         this.field1052 = class284.method2377(43, this.field1052, this.field1059);
                                                         this.field1144 = class499.method3778(this.field1144, (byte)-50, this.field1059);
                                                         var173 = this;
                                                         if (!var7) {
                                                            this.field1101 = class499.method3778(this.field1101, (byte)-50, this.field1059);
                                                            if (arg1.field8329 != null && class570.method4223(-24229, arg2, this.field1129)) {
                                                               this.field1058 = arg1.method4333(false, (byte)29);
                                                            }

                                                            if (arg1.field8343 != null && class268.method2291(arg2, this.field1129, 82)) {
                                                               this.field1124 = arg1.method4336(0);
                                                            }

                                                            if (arg1.field8310 != null && class533.method3988(arg2, 77, this.field1129)) {
                                                               var161 = 0;
                                                               var162 = new int[256];
                                                               var163 = 0;
                                                               if (var7) {
                                                                  var164 = arg1.field8310[var9[var163]];
                                                                  if (~var164 <= -1) {
                                                                     var10002 = var162[var164]++;
                                                                     if (var164 > var161) {
                                                                        var161 = var164;
                                                                     }
                                                                  }

                                                                  ++var163;
                                                               }

                                                               while(true) {
                                                                  if (~this.field1066 >= ~var163) {
                                                                     this.field1035 = new int[var161 + 1][];
                                                                     var164 = 0;
                                                                     if (!var7) {
                                                                        if (var7) {
                                                                           this.field1035[var164] = new int[var162[var164]];
                                                                           var162[var164] = 0;
                                                                           ++var164;
                                                                        }

                                                                        while(true) {
                                                                           while(~var164 >= ~var161) {
                                                                              this.field1035[var164] = new int[var162[var164]];
                                                                              var162[var164] = 0;
                                                                              ++var164;
                                                                           }

                                                                           var165 = 0;
                                                                           if (!var7) {
                                                                              if (!var7 && ~var165 <= ~this.field1066) {
                                                                                 return;
                                                                              }

                                                                              do {
                                                                                 var166 = arg1.field8310[var9[var165]];
                                                                                 if (~var166 <= -1) {
                                                                                    this.field1035[var166][var162[var166]++] = var165;
                                                                                 }

                                                                                 ++var165;
                                                                              } while(~var165 > ~this.field1066);

                                                                              return;
                                                                           }

                                                                           ++var164;
                                                                        }
                                                                     }
                                                                  } else {
                                                                     var164 = arg1.field8310[var9[var163]];
                                                                  }

                                                                  if (~var164 <= -1) {
                                                                     var10002 = var162[var164]++;
                                                                     if (var164 > var161) {
                                                                        var161 = var164;
                                                                     }
                                                                  }

                                                                  ++var163;
                                                               }
                                                            }

                                                            return;
                                                         }
                                                      } else {
                                                         var173 = this;
                                                      }

                                                      var160 = var173.field1074[var170];
                                                      if (~var68 != ~var160) {
                                                         this.field1123[var67++] = var170;
                                                         var68 = var160;
                                                      }

                                                      ++var170;
                                                   }
                                                }
                                             } else {
                                                var170 = this.field1074[var158];
                                             }

                                             if (var68 != var170) {
                                                ++var67;
                                                var68 = var170;
                                             }

                                             ++var158;
                                          }
                                       }
                                    } else {
                                       var67 = var9[var46];
                                       var68 = 65535 & arg1.field8317[var67];
                                    }

                                    if (arg1.field8348 != null) {
                                       var69 = arg1.field8348[var67];
                                       if (var7) {
                                          var69 = -1;
                                       }
                                    } else {
                                       var69 = -1;
                                    }

                                    if (arg1.field8353 == null) {
                                       var70 = 0;
                                       if (var7) {
                                          var70 = 255 & arg1.field8353[var67];
                                       }
                                    } else {
                                       var70 = 255 & arg1.field8353[var67];
                                    }

                                    var71 = arg1.field8304 != null ? arg1.field8304[var67] : -1;
                                    if (var71 != -1 && ~(this.field1129 & 64) != -1) {
                                       var72 = var8.method2043(-66, var71 & 65535);
                                       if (var72.field5670) {
                                          var71 = -1;
                                       }
                                    }
                                 }

                                 while(true) {
                                    var73 = 0.0F;
                                    var74 = 0.0F;
                                    var75 = 0.0F;
                                    var76 = 0.0F;
                                    var77 = 0.0F;
                                    var78 = 0.0F;
                                    var79 = 0;
                                    var80 = 0;
                                    var81 = 0;
                                    if (~var71 != 0) {
                                       label4020: {
                                          if (var69 == -1) {
                                             var77 = 0.0F;
                                             var80 = 2;
                                             var79 = 1;
                                             var75 = 1.0F;
                                             var78 = 0.0F;
                                             var73 = 0.0F;
                                             var74 = 1.0F;
                                             var76 = 1.0F;
                                             if (!var7) {
                                                break label4020;
                                             }
                                          }

                                          var69 &= 255;
                                          var82 = arg1.field8337[var69];
                                          if (var82 == 0) {
                                             var83 = arg1.field8342[var67];
                                             var84 = arg1.field8341[var67];
                                             var85 = arg1.field8323[var67];
                                             var86 = arg1.field8331[var69];
                                             var87 = arg1.field8308[var69];
                                             var88 = arg1.field8340[var69];
                                             var89 = (float)arg1.field8344[var86];
                                             var90 = (float)arg1.field8311[var86];
                                             var91 = (float)arg1.field8332[var86];
                                             var92 = (float)arg1.field8344[var87] - var89;
                                             var93 = (float)arg1.field8311[var87] - var90;
                                             var94 = (float)arg1.field8332[var87] + -var91;
                                             var95 = (float)arg1.field8344[var88] - var89;
                                             var96 = (float)arg1.field8311[var88] - var90;
                                             var97 = (float)arg1.field8332[var88] - var91;
                                             var98 = (float)arg1.field8344[var83] - var89;
                                             var99 = (float)arg1.field8311[var83] - var90;
                                             var100 = (float)arg1.field8332[var83] - var91;
                                             var101 = (float)arg1.field8344[var84] - var89;
                                             var102 = (float)arg1.field8311[var84] - var90;
                                             var103 = (float)arg1.field8332[var84] - var91;
                                             var104 = (float)arg1.field8344[var85] - var89;
                                             var105 = (float)arg1.field8311[var85] - var90;
                                             var106 = (float)arg1.field8332[var85] - var91;
                                             var107 = var93 * var97 - var94 * var96;
                                             var108 = var94 * var95 + -(var92 * var97);
                                             var109 = var92 * var96 - var93 * var95;
                                             var110 = var96 * var109 - var97 * var108;
                                             var111 = var97 * var107 + -(var95 * var109);
                                             var112 = var95 * var108 - var96 * var107;
                                             var113 = 1.0F / (var94 * var112 + var92 * var110 + var93 * var111);
                                             var73 = (var100 * var112 + var98 * var110 + var99 * var111) * var113;
                                             var77 = (var106 * var112 + var104 * var110 + var105 * var111) * var113;
                                             var75 = (var103 * var112 + var101 * var110 + var102 * var111) * var113;
                                             var114 = var93 * var109 + -(var94 * var108);
                                             var115 = var92 * var108 - var93 * var107;
                                             var116 = var94 * var107 + -(var92 * var109);
                                             var117 = 1.0F / (var97 * var115 + var95 * var114 + var96 * var116);
                                             var74 = (var100 * var115 + var98 * var114 + var99 * var116) * var117;
                                             var78 = (var106 * var115 + var104 * var114 + var105 * var116) * var117;
                                             var76 = (var103 * var115 + var101 * var114 + var102 * var116) * var117;
                                             if (!var7) {
                                                break label4020;
                                             }
                                          }

                                          var118 = arg1.field8342[var67];
                                          var119 = arg1.field8341[var67];
                                          var120 = arg1.field8323[var67];
                                          var121 = var43.field7875[var69];
                                          var122 = var43.field7871[var69];
                                          var123 = var43.field7873[var69];
                                          var124 = var43.field7872[var69];
                                          var125 = arg1.field8354[var69];
                                          var126 = (float)arg1.field8315[var69] / 256.0F;
                                          if (~var82 != -2) {
                                             label2848: {
                                                if (~var82 != -3) {
                                                   if (~var82 != -4) {
                                                      break label2848;
                                                   }

                                                   class563.method4193(var126, var123, var124, arg1.field8311[var118], var125, var122, class712.field10238, var121, arg1.field8332[var118], (byte)25, arg1.field8344[var118]);
                                                   var74 = class712.field10238[1];
                                                   var73 = class712.field10238[0];
                                                   class563.method4193(var126, var123, var124, arg1.field8311[var119], var125, var122, class712.field10238, var121, arg1.field8332[var119], (byte)25, arg1.field8344[var119]);
                                                   var76 = class712.field10238[1];
                                                   var75 = class712.field10238[0];
                                                   class563.method4193(var126, var123, var124, arg1.field8311[var120], var125, var122, class712.field10238, var121, arg1.field8332[var120], (byte)25, arg1.field8344[var120]);
                                                   var77 = class712.field10238[0];
                                                   var78 = class712.field10238[1];
                                                   if (~(1 & var125) != -1) {
                                                      if (!(-var74 + var78 > 0.5F)) {
                                                         if (var74 - var78 > 0.5F) {
                                                            ++var78;
                                                            var80 = 2;
                                                            if (var7) {
                                                               --var78;
                                                               var80 = 1;
                                                            }
                                                         }
                                                      } else {
                                                         --var78;
                                                         var80 = 1;
                                                      }

                                                      if (var76 - var74 > 0.5F) {
                                                         var79 = 1;
                                                         --var76;
                                                         if (!var7) {
                                                            break label2848;
                                                         }
                                                      }

                                                      if (!(var74 - var76 > 0.5F)) {
                                                         break label2848;
                                                      }

                                                      var79 = 2;
                                                      ++var76;
                                                      if (!var7) {
                                                         break label2848;
                                                      }

                                                      if (var77 - var73 > 0.5F) {
                                                         --var77;
                                                         var80 = 1;
                                                         if (var7 && var73 - var77 > 0.5F) {
                                                            ++var77;
                                                            var80 = 2;
                                                         }
                                                      } else if (var73 - var77 > 0.5F) {
                                                         ++var77;
                                                         var80 = 2;
                                                      }
                                                   } else if (var77 - var73 > 0.5F) {
                                                      --var77;
                                                      var80 = 1;
                                                      if (var7 && var73 - var77 > 0.5F) {
                                                         ++var77;
                                                         var80 = 2;
                                                      }
                                                   } else if (var73 - var77 > 0.5F) {
                                                      ++var77;
                                                      var80 = 2;
                                                   }

                                                   if (var75 - var73 > 0.5F) {
                                                      --var75;
                                                      var79 = 1;
                                                      if (!var7) {
                                                         break label2848;
                                                      }
                                                   }

                                                   if (!(-var75 + var73 > 0.5F)) {
                                                      break label2848;
                                                   }

                                                   var79 = 2;
                                                   ++var75;
                                                   if (!var7) {
                                                      break label2848;
                                                   }
                                                }

                                                var127 = (float)arg1.field8346[var69] / 256.0F;
                                                var128 = (float)arg1.field8309[var69] / 256.0F;
                                                var129 = arg1.field8344[var119] + -arg1.field8344[var118];
                                                var130 = arg1.field8311[var119] + -arg1.field8311[var118];
                                                var131 = arg1.field8332[var119] + -arg1.field8332[var118];
                                                var132 = arg1.field8344[var120] - arg1.field8344[var118];
                                                var133 = arg1.field8311[var120] + -arg1.field8311[var118];
                                                var134 = arg1.field8332[var120] + -arg1.field8332[var118];
                                                var135 = var130 * var134 - var131 * var133;
                                                var136 = var131 * var132 + -(var129 * var134);
                                                var137 = var129 * var133 - var130 * var132;
                                                var138 = 64.0F / (float)arg1.field8322[var69];
                                                var139 = 64.0F / (float)arg1.field8330[var69];
                                                var140 = 64.0F / (float)arg1.field8338[var69];
                                                var141 = (var124[2] * (float)var137 + var124[1] * (float)var136 + var124[0] * (float)var135) / var138;
                                                var142 = (var124[5] * (float)var137 + var124[4] * (float)var136 + var124[3] * (float)var135) / var139;
                                                var143 = (var124[8] * (float)var137 + var124[6] * (float)var135 + var124[7] * (float)var136) / var140;
                                                var81 = class343.method2727(var141, var142, (byte)118, var143);
                                                class4.method20(var127, arg1.field8311[var118], class712.field10238, var123, var124, var122, (byte)-106, var125, var81, arg1.field8332[var118], var128, var121, var126, arg1.field8344[var118]);
                                                var74 = class712.field10238[1];
                                                var73 = class712.field10238[0];
                                                class4.method20(var127, arg1.field8311[var119], class712.field10238, var123, var124, var122, (byte)-71, var125, var81, arg1.field8332[var119], var128, var121, var126, arg1.field8344[var119]);
                                                var76 = class712.field10238[1];
                                                var75 = class712.field10238[0];
                                                class4.method20(var127, arg1.field8311[var120], class712.field10238, var123, var124, var122, (byte)-73, var125, var81, arg1.field8332[var120], var128, var121, var126, arg1.field8344[var120]);
                                                var77 = class712.field10238[0];
                                                var78 = class712.field10238[1];
                                                if (var7) {
                                                   var144 = (float)arg1.field8338[var69] / 1024.0F;
                                                   class23.method306(var126, var121, var124, -16589, var123, var122, arg1.field8332[var118], var125, arg1.field8311[var118], arg1.field8344[var118], class712.field10238, var144);
                                                   var73 = class712.field10238[0];
                                                   var74 = class712.field10238[1];
                                                   class23.method306(var126, var121, var124, -16589, var123, var122, arg1.field8332[var119], var125, arg1.field8311[var119], arg1.field8344[var119], class712.field10238, var144);
                                                   var75 = class712.field10238[0];
                                                   var76 = class712.field10238[1];
                                                   class23.method306(var126, var121, var124, -16589, var123, var122, arg1.field8332[var120], var125, arg1.field8311[var120], arg1.field8344[var120], class712.field10238, var144);
                                                   var78 = class712.field10238[1];
                                                   var77 = class712.field10238[0];
                                                   var145 = var144 / 2.0F;
                                                   if (~(var125 & 1) == -1) {
                                                      if (var145 < -var73 + var77) {
                                                         var80 = 1;
                                                         var77 -= var144;
                                                         if (var7 && -var77 + var73 > var145) {
                                                            var77 += var144;
                                                            var80 = 2;
                                                         }
                                                      } else if (-var77 + var73 > var145) {
                                                         var77 += var144;
                                                         var80 = 2;
                                                      }

                                                      if (!(-var73 + var75 > var145)) {
                                                         if (-var75 + var73 > var145) {
                                                            var79 = 2;
                                                            var75 += var144;
                                                            if (var7) {
                                                               var79 = 1;
                                                               var75 -= var144;
                                                               if (var7) {
                                                                  if (var78 - var74 > var145) {
                                                                     var80 = 1;
                                                                     var78 -= var144;
                                                                     if (var7 && var145 < -var78 + var74) {
                                                                        var80 = 2;
                                                                        var78 += var144;
                                                                     }
                                                                  } else if (var145 < -var78 + var74) {
                                                                     var80 = 2;
                                                                     var78 += var144;
                                                                  }

                                                                  if (!(var145 < -var74 + var76)) {
                                                                     if (var145 < -var76 + var74) {
                                                                        var76 += var144;
                                                                        var79 = 2;
                                                                        if (var7) {
                                                                           var79 = 1;
                                                                           var76 -= var144;
                                                                        }
                                                                     }
                                                                  } else {
                                                                     var79 = 1;
                                                                     var76 -= var144;
                                                                  }
                                                               }
                                                            }
                                                         }
                                                      } else {
                                                         var79 = 1;
                                                         var75 -= var144;
                                                         if (var7) {
                                                            if (var78 - var74 > var145) {
                                                               var80 = 1;
                                                               var78 -= var144;
                                                               if (var7 && var145 < -var78 + var74) {
                                                                  var80 = 2;
                                                                  var78 += var144;
                                                               }
                                                            } else if (var145 < -var78 + var74) {
                                                               var80 = 2;
                                                               var78 += var144;
                                                            }

                                                            if (!(var145 < -var74 + var76)) {
                                                               if (var145 < -var76 + var74) {
                                                                  var76 += var144;
                                                                  var79 = 2;
                                                                  if (var7) {
                                                                     var79 = 1;
                                                                     var76 -= var144;
                                                                  }
                                                               }
                                                            } else {
                                                               var79 = 1;
                                                               var76 -= var144;
                                                            }
                                                         }
                                                      }
                                                   } else {
                                                      if (var78 - var74 > var145) {
                                                         var80 = 1;
                                                         var78 -= var144;
                                                         if (var7 && var145 < -var78 + var74) {
                                                            var80 = 2;
                                                            var78 += var144;
                                                         }
                                                      } else if (var145 < -var78 + var74) {
                                                         var80 = 2;
                                                         var78 += var144;
                                                      }

                                                      if (!(var145 < -var74 + var76)) {
                                                         if (var145 < -var76 + var74) {
                                                            var76 += var144;
                                                            var79 = 2;
                                                            if (var7) {
                                                               var79 = 1;
                                                               var76 -= var144;
                                                            }
                                                         }
                                                      } else {
                                                         var79 = 1;
                                                         var76 -= var144;
                                                      }
                                                   }
                                                }
                                             }
                                          } else {
                                             var144 = (float)arg1.field8338[var69] / 1024.0F;
                                             class23.method306(var126, var121, var124, -16589, var123, var122, arg1.field8332[var118], var125, arg1.field8311[var118], arg1.field8344[var118], class712.field10238, var144);
                                             var73 = class712.field10238[0];
                                             var74 = class712.field10238[1];
                                             class23.method306(var126, var121, var124, -16589, var123, var122, arg1.field8332[var119], var125, arg1.field8311[var119], arg1.field8344[var119], class712.field10238, var144);
                                             var75 = class712.field10238[0];
                                             var76 = class712.field10238[1];
                                             class23.method306(var126, var121, var124, -16589, var123, var122, arg1.field8332[var120], var125, arg1.field8311[var120], arg1.field8344[var120], class712.field10238, var144);
                                             var78 = class712.field10238[1];
                                             var77 = class712.field10238[0];
                                             var145 = var144 / 2.0F;
                                             if (~(var125 & 1) == -1) {
                                                if (var145 < -var73 + var77) {
                                                   var80 = 1;
                                                   var77 -= var144;
                                                   if (var7 && -var77 + var73 > var145) {
                                                      var77 += var144;
                                                      var80 = 2;
                                                   }
                                                } else if (-var77 + var73 > var145) {
                                                   var77 += var144;
                                                   var80 = 2;
                                                }

                                                if (!(-var73 + var75 > var145)) {
                                                   if (-var75 + var73 > var145) {
                                                      var79 = 2;
                                                      var75 += var144;
                                                      if (var7) {
                                                         var79 = 1;
                                                         var75 -= var144;
                                                         if (var7) {
                                                            if (var78 - var74 > var145) {
                                                               var80 = 1;
                                                               var78 -= var144;
                                                               if (var7 && var145 < -var78 + var74) {
                                                                  var80 = 2;
                                                                  var78 += var144;
                                                               }
                                                            } else if (var145 < -var78 + var74) {
                                                               var80 = 2;
                                                               var78 += var144;
                                                            }

                                                            if (!(var145 < -var74 + var76)) {
                                                               if (var145 < -var76 + var74) {
                                                                  var76 += var144;
                                                                  var79 = 2;
                                                                  if (var7) {
                                                                     var79 = 1;
                                                                     var76 -= var144;
                                                                  }
                                                               }
                                                            } else {
                                                               var79 = 1;
                                                               var76 -= var144;
                                                            }
                                                         }
                                                      }
                                                   }
                                                } else {
                                                   var79 = 1;
                                                   var75 -= var144;
                                                   if (var7) {
                                                      if (var78 - var74 > var145) {
                                                         var80 = 1;
                                                         var78 -= var144;
                                                         if (var7 && var145 < -var78 + var74) {
                                                            var80 = 2;
                                                            var78 += var144;
                                                         }
                                                      } else if (var145 < -var78 + var74) {
                                                         var80 = 2;
                                                         var78 += var144;
                                                      }

                                                      if (!(var145 < -var74 + var76)) {
                                                         if (var145 < -var76 + var74) {
                                                            var76 += var144;
                                                            var79 = 2;
                                                            if (var7) {
                                                               var79 = 1;
                                                               var76 -= var144;
                                                            }
                                                         }
                                                      } else {
                                                         var79 = 1;
                                                         var76 -= var144;
                                                      }
                                                   }
                                                }
                                             } else {
                                                if (var78 - var74 > var145) {
                                                   var80 = 1;
                                                   var78 -= var144;
                                                   if (var7 && var145 < -var78 + var74) {
                                                      var80 = 2;
                                                      var78 += var144;
                                                   }
                                                } else if (var145 < -var78 + var74) {
                                                   var80 = 2;
                                                   var78 += var144;
                                                }

                                                if (!(var145 < -var74 + var76)) {
                                                   if (var145 < -var76 + var74) {
                                                      var76 += var144;
                                                      var79 = 2;
                                                      if (var7) {
                                                         var79 = 1;
                                                         var76 -= var144;
                                                      }
                                                   }
                                                } else {
                                                   var79 = 1;
                                                   var76 -= var144;
                                                }
                                             }
                                          }
                                       }
                                    }

                                    if (arg1.field8318 == null) {
                                       var146 = 0;
                                       if (var7) {
                                          var146 = arg1.field8318[var67];
                                       }
                                    } else {
                                       var146 = arg1.field8318[var67];
                                    }

                                    if (~var146 != -1) {
                                       if (var146 == 1) {
                                          var147 = var44[var67];
                                          var148 = ((long)(var68 << 8) + (long)(var81 << 24) - -((long)var70) << 32) + (long)((var147.field9198 + 256 << 12) + (~var147.field9191 < -1 ? 1024 : 2048) + (var147.field9192 + 256 << 22) + (var69 << 2));
                                          this.field1107[var46] = this.method787(var147.field9192, (byte)-111, var148, var147.field9198, arg1.field8342[var67], var74, arg1, 0, var147.field9191, var73);
                                          this.field1084[var46] = this.method787(var147.field9192, (byte)42, (long)var79 + var148, var147.field9198, arg1.field8341[var67], var76, arg1, 0, var147.field9191, var75);
                                          this.field1079[var46] = this.method787(var147.field9192, (byte)-94, (long)var80 + var148, var147.field9198, arg1.field8323[var67], var78, arg1, 0, var147.field9191, var77);
                                          if (var7) {
                                             var150 = ((long)(var81 << 24) - -((long)(var68 << 8)) + (long)var70 << 32) + (long)(var69 << 2);
                                             var152 = arg1.field8342[var67];
                                             var153 = arg1.field8341[var67];
                                             var154 = arg1.field8323[var67];
                                             var155 = var32[var152];
                                             this.field1107[var46] = this.method787(var155.field10677, (byte)60, var150, var155.field10678, var152, var74, arg1, var155.field10680, var155.field10675, var73);
                                             var156 = var32[var153];
                                             this.field1084[var46] = this.method787(var156.field10677, (byte)108, (long)var79 + var150, var156.field10678, var153, var76, arg1, var156.field10680, var156.field10675, var75);
                                             var157 = var32[var154];
                                             this.field1079[var46] = this.method787(var157.field10677, (byte)-66, (long)var80 + var150, var157.field10678, var154, var78, arg1, var157.field10680, var157.field10675, var77);
                                             if (arg1.field8353 != null) {
                                                this.field1155[var46] = arg1.field8353[var67];
                                             }

                                             if (arg1.field8335 != null) {
                                                this.field1117[var46] = arg1.field8335[var67];
                                             }

                                             this.field1106[var46] = arg1.field8317[var67];
                                             this.field1074[var46] = var71;
                                             ++var46;
                                          } else {
                                             if (arg1.field8353 != null) {
                                                this.field1155[var46] = arg1.field8353[var67];
                                             }

                                             if (arg1.field8335 != null) {
                                                this.field1117[var46] = arg1.field8335[var67];
                                             }

                                             this.field1106[var46] = arg1.field8317[var67];
                                             this.field1074[var46] = var71;
                                             ++var46;
                                          }
                                       } else {
                                          if (arg1.field8353 != null) {
                                             this.field1155[var46] = arg1.field8353[var67];
                                          }

                                          if (arg1.field8335 != null) {
                                             this.field1117[var46] = arg1.field8335[var67];
                                          }

                                          this.field1106[var46] = arg1.field8317[var67];
                                          this.field1074[var46] = var71;
                                          ++var46;
                                       }
                                    } else {
                                       var150 = ((long)(var81 << 24) - -((long)(var68 << 8)) + (long)var70 << 32) + (long)(var69 << 2);
                                       var152 = arg1.field8342[var67];
                                       var153 = arg1.field8341[var67];
                                       var154 = arg1.field8323[var67];
                                       var155 = var32[var152];
                                       this.field1107[var46] = this.method787(var155.field10677, (byte)60, var150, var155.field10678, var152, var74, arg1, var155.field10680, var155.field10675, var73);
                                       var156 = var32[var153];
                                       this.field1084[var46] = this.method787(var156.field10677, (byte)108, (long)var79 + var150, var156.field10678, var153, var76, arg1, var156.field10680, var156.field10675, var75);
                                       var157 = var32[var154];
                                       this.field1079[var46] = this.method787(var157.field10677, (byte)-66, (long)var80 + var150, var157.field10678, var154, var78, arg1, var157.field10680, var157.field10675, var77);
                                       if (arg1.field8353 != null) {
                                          this.field1155[var46] = arg1.field8353[var67];
                                       }

                                       if (arg1.field8335 != null) {
                                          this.field1117[var46] = arg1.field8335[var67];
                                       }

                                       this.field1106[var46] = arg1.field8317[var67];
                                       this.field1074[var46] = var71;
                                       ++var46;
                                    }

                                    if (~this.field1066 >= ~var46) {
                                       var67 = 0;
                                       var68 = -10000;
                                       var158 = 0;
                                       if (!var7) {
                                          if (var7) {
                                             var159 = this.field1074[var158];
                                             if (var68 != var159) {
                                                ++var67;
                                                var68 = var159;
                                             }

                                             ++var158;
                                          }

                                          while(true) {
                                             if (~var158 <= ~this.field1077) {
                                                this.field1123 = new int[var67 + 1];
                                                var67 = 0;
                                                var68 = -10000;
                                                var170 = 0;
                                                if (!var7) {
                                                   if (var7) {
                                                      var160 = this.field1074[var170];
                                                      if (~var68 != ~var160) {
                                                         this.field1123[var67++] = var170;
                                                         var68 = var160;
                                                      }

                                                      ++var170;
                                                   }

                                                   while(true) {
                                                      if (this.field1077 <= var170) {
                                                         this.field1123[var67] = this.field1077;
                                                         class724.field10350 = null;
                                                         this.field1043 = class147.method1437(this.field1059, this.field1043, false);
                                                         this.field1095 = class147.method1437(this.field1059, this.field1095, false);
                                                         this.field1109 = class147.method1437(this.field1059, this.field1109, false);
                                                         this.field1052 = class284.method2377(43, this.field1052, this.field1059);
                                                         this.field1144 = class499.method3778(this.field1144, (byte)-50, this.field1059);
                                                         var173 = this;
                                                         if (!var7) {
                                                            this.field1101 = class499.method3778(this.field1101, (byte)-50, this.field1059);
                                                            if (arg1.field8329 != null && class570.method4223(-24229, arg2, this.field1129)) {
                                                               this.field1058 = arg1.method4333(false, (byte)29);
                                                            }

                                                            if (arg1.field8343 != null && class268.method2291(arg2, this.field1129, 82)) {
                                                               this.field1124 = arg1.method4336(0);
                                                            }

                                                            if (arg1.field8310 != null && class533.method3988(arg2, 77, this.field1129)) {
                                                               var161 = 0;
                                                               var162 = new int[256];
                                                               var163 = 0;
                                                               if (var7) {
                                                                  var164 = arg1.field8310[var9[var163]];
                                                                  if (~var164 <= -1) {
                                                                     var10002 = var162[var164]++;
                                                                     if (var164 > var161) {
                                                                        var161 = var164;
                                                                     }
                                                                  }

                                                                  ++var163;
                                                               }

                                                               while(true) {
                                                                  if (~this.field1066 >= ~var163) {
                                                                     this.field1035 = new int[var161 + 1][];
                                                                     var164 = 0;
                                                                     if (!var7) {
                                                                        if (var7) {
                                                                           this.field1035[var164] = new int[var162[var164]];
                                                                           var162[var164] = 0;
                                                                           ++var164;
                                                                        }

                                                                        while(true) {
                                                                           while(~var164 >= ~var161) {
                                                                              this.field1035[var164] = new int[var162[var164]];
                                                                              var162[var164] = 0;
                                                                              ++var164;
                                                                           }

                                                                           var165 = 0;
                                                                           if (!var7) {
                                                                              if (!var7 && ~var165 <= ~this.field1066) {
                                                                                 return;
                                                                              }

                                                                              do {
                                                                                 var166 = arg1.field8310[var9[var165]];
                                                                                 if (~var166 <= -1) {
                                                                                    this.field1035[var166][var162[var166]++] = var165;
                                                                                 }

                                                                                 ++var165;
                                                                              } while(~var165 > ~this.field1066);

                                                                              return;
                                                                           }

                                                                           ++var164;
                                                                        }
                                                                     }
                                                                  } else {
                                                                     var164 = arg1.field8310[var9[var163]];
                                                                  }

                                                                  if (~var164 <= -1) {
                                                                     var10002 = var162[var164]++;
                                                                     if (var164 > var161) {
                                                                        var161 = var164;
                                                                     }
                                                                  }

                                                                  ++var163;
                                                               }
                                                            }

                                                            return;
                                                         }
                                                      } else {
                                                         var173 = this;
                                                      }

                                                      var160 = var173.field1074[var170];
                                                      if (~var68 != ~var160) {
                                                         this.field1123[var67++] = var170;
                                                         var68 = var160;
                                                      }

                                                      ++var170;
                                                   }
                                                }
                                             } else {
                                                var170 = this.field1074[var158];
                                             }

                                             if (var68 != var170) {
                                                ++var67;
                                                var68 = var170;
                                             }

                                             ++var158;
                                          }
                                       }
                                    } else {
                                       var67 = var9[var46];
                                       var68 = 65535 & arg1.field8317[var67];
                                    }

                                    if (arg1.field8348 != null) {
                                       var69 = arg1.field8348[var67];
                                       if (var7) {
                                          var69 = -1;
                                       }
                                    } else {
                                       var69 = -1;
                                    }

                                    if (arg1.field8353 == null) {
                                       var70 = 0;
                                       if (var7) {
                                          var70 = 255 & arg1.field8353[var67];
                                       }
                                    } else {
                                       var70 = 255 & arg1.field8353[var67];
                                    }

                                    var71 = arg1.field8304 != null ? arg1.field8304[var67] : -1;
                                    if (var71 != -1 && ~(this.field1129 & 64) != -1) {
                                       var72 = var8.method2043(-66, var71 & 65535);
                                       if (var72.field5670) {
                                          var71 = -1;
                                       }
                                    }
                                 }
                              }
                           } else {
                              var10000 = this.field1038[var41];
                           }

                           var42 = var10000;
                           this.field1038[var41] = var40;
                           var40 += var42;
                           var32[var41] = new class752();
                           ++var41;
                        }
                     }
                  } else {
                     var171 = arg1;
                  }
               } else {
                  var33 = this.field1066 * 3;
                  this.field1079 = new short[this.field1066];
                  this.field1109 = new short[var33];
                  this.field1084 = new short[this.field1066];
                  this.field1043 = new short[var33];
                  this.field1089 = (short)arg3;
                  this.field1101 = new float[var33];
                  this.field1140 = (short)arg4;
                  this.field1107 = new short[this.field1066];
                  var171 = arg1;
                  if (!var7) {
                     if (arg1.field8335 != null) {
                        this.field1117 = new short[this.field1066];
                     }

                     this.field1074 = new short[this.field1066];
                     this.field1097 = new short[var33];
                     this.field1095 = new short[var33];
                     this.field1052 = new byte[var33];
                     this.field1155 = new byte[this.field1066];
                     class724.field10350 = new long[var33];
                     this.field1144 = new float[var33];
                     this.field1106 = new short[this.field1066];
                     var40 = 0;
                     var41 = 0;
                     if (var7) {
                        var42 = this.field1038[var41];
                        this.field1038[var41] = var40;
                        var40 += var42;
                        var32[var41] = new class752();
                        ++var41;
                     }

                     while(true) {
                        if (var41 >= arg1.field8306) {
                           this.field1038[arg1.field8306] = var40;
                           var43 = class227.method2023(var9, arg1, 255, this.field1066);
                           var44 = new class650[arg1.field8324];
                           var10000 = 0;
                           if (!var7) {
                              label1307: {
                                 var45 = 0;
                                 if (var7) {
                                    var46 = arg1.field8342[var45];
                                 } else if (var45 >= arg1.field8324) {
                                    var46 = 0;
                                    if (!var7) {
                                       break label1307;
                                    }
                                 } else {
                                    var46 = arg1.field8342[var45];
                                 }

                                 label1310:
                                 while(true) {
                                    var47 = arg1.field8341[var45];
                                    var48 = arg1.field8323[var45];
                                    var49 = this.field1094[var47] + -this.field1094[var46];
                                    var50 = this.field1039[var47] + -this.field1039[var46];
                                    var51 = this.field1065[var47] - this.field1065[var46];
                                    var52 = this.field1094[var48] + -this.field1094[var46];
                                    var53 = this.field1039[var48] - this.field1039[var46];
                                    var54 = this.field1065[var48] - this.field1065[var46];
                                    var55 = var50 * var54 + -(var51 * var53);
                                    var56 = var51 * var52 + -(var49 * var54);
                                    var57 = var49 * var53 - var50 * var52;
                                    if (var7) {
                                       var55 >>= 1;
                                       var56 >>= 1;
                                       var57 >>= 1;
                                    }

                                    while(true) {
                                       while(true) {
                                          if (~var55 >= -8193) {
                                             var10000 = ~var56;
                                             if (var7) {
                                                var57 = var10000 >> -8193;
                                                continue;
                                             }

                                             if (var10000 >= -8193 && ~var57 >= -8193 && var55 >= -8192 && var56 >= -8192 && var57 >= -8192) {
                                                var58 = (int)Math.sqrt((double)(var55 * var55 + var56 * var56 - -(var57 * var57)));
                                                if (var58 <= 0) {
                                                   var169 = 1;
                                                   var59 = var56 * 256 / var169;
                                                   var60 = var57 * 256 / var169;
                                                   var61 = var55 * 256 / var169;
                                                   var172 = arg1.field8318 == null ? 0 : arg1.field8318[var45];
                                                } else {
                                                   var59 = var56 * 256 / var58;
                                                   var60 = var57 * 256 / var58;
                                                   var61 = var55 * 256 / var58;
                                                   var172 = arg1.field8318 == null ? 0 : arg1.field8318[var45];
                                                }

                                                label3930: {
                                                   var62 = var172;
                                                   if (~var62 != -1) {
                                                      if (var62 != 1) {
                                                         ++var45;
                                                         break label3930;
                                                      }

                                                      var63 = var44[var45] = new class650();
                                                      var63.field9191 = var61;
                                                      var63.field9192 = var60;
                                                      var63.field9198 = var59;
                                                      if (!var7) {
                                                         ++var45;
                                                         break label3930;
                                                      }
                                                   }

                                                   var64 = var32[var46];
                                                   ++var64.field10680;
                                                   var64.field10675 += var61;
                                                   var64.field10677 += var60;
                                                   var64.field10678 += var59;
                                                   var65 = var32[var47];
                                                   var65.field10678 += var59;
                                                   ++var65.field10680;
                                                   var65.field10675 += var61;
                                                   var65.field10677 += var60;
                                                   var66 = var32[var48];
                                                   var66.field10678 += var59;
                                                   var66.field10677 += var60;
                                                   ++var66.field10680;
                                                   var66.field10675 += var61;
                                                   ++var45;
                                                }

                                                if (var45 >= arg1.field8324) {
                                                   var46 = 0;
                                                   if (!var7) {
                                                      break label1310;
                                                   }
                                                } else {
                                                   var46 = arg1.field8342[var45];
                                                }
                                                continue label1310;
                                             }
                                          }

                                          var55 >>= 1;
                                          var56 >>= 1;
                                          var57 >>= 1;
                                       }
                                    }
                                 }
                              }

                              if (var7) {
                                 var67 = var9[var46];
                                 var68 = 65535 & arg1.field8317[var67];
                                 if (arg1.field8348 != null) {
                                    var69 = arg1.field8348[var67];
                                    if (var7) {
                                       var69 = -1;
                                    }
                                 } else {
                                    var69 = -1;
                                 }

                                 if (arg1.field8353 == null) {
                                    var70 = 0;
                                    if (var7) {
                                       var70 = 255 & arg1.field8353[var67];
                                    }
                                 } else {
                                    var70 = 255 & arg1.field8353[var67];
                                 }

                                 var71 = arg1.field8304 != null ? arg1.field8304[var67] : -1;
                                 if (var71 != -1 && ~(this.field1129 & 64) != -1) {
                                    var72 = var8.method2043(-66, var71 & 65535);
                                    if (var72.field5670) {
                                       var71 = -1;
                                    }
                                 }
                              } else {
                                 if (~this.field1066 >= ~var46) {
                                    var67 = 0;
                                    var68 = -10000;
                                    var158 = 0;
                                    if (!var7) {
                                       if (var7) {
                                          var159 = this.field1074[var158];
                                          if (var68 != var159) {
                                             ++var67;
                                             var68 = var159;
                                          }

                                          ++var158;
                                       }

                                       while(true) {
                                          if (~var158 <= ~this.field1077) {
                                             this.field1123 = new int[var67 + 1];
                                             var67 = 0;
                                             var68 = -10000;
                                             var170 = 0;
                                             if (!var7) {
                                                if (var7) {
                                                   var160 = this.field1074[var170];
                                                   if (~var68 != ~var160) {
                                                      this.field1123[var67++] = var170;
                                                      var68 = var160;
                                                   }

                                                   ++var170;
                                                }

                                                while(true) {
                                                   if (this.field1077 <= var170) {
                                                      this.field1123[var67] = this.field1077;
                                                      class724.field10350 = null;
                                                      this.field1043 = class147.method1437(this.field1059, this.field1043, false);
                                                      this.field1095 = class147.method1437(this.field1059, this.field1095, false);
                                                      this.field1109 = class147.method1437(this.field1059, this.field1109, false);
                                                      this.field1052 = class284.method2377(43, this.field1052, this.field1059);
                                                      this.field1144 = class499.method3778(this.field1144, (byte)-50, this.field1059);
                                                      var173 = this;
                                                      if (!var7) {
                                                         this.field1101 = class499.method3778(this.field1101, (byte)-50, this.field1059);
                                                         if (arg1.field8329 != null && class570.method4223(-24229, arg2, this.field1129)) {
                                                            this.field1058 = arg1.method4333(false, (byte)29);
                                                         }

                                                         if (arg1.field8343 != null && class268.method2291(arg2, this.field1129, 82)) {
                                                            this.field1124 = arg1.method4336(0);
                                                         }

                                                         if (arg1.field8310 != null && class533.method3988(arg2, 77, this.field1129)) {
                                                            var161 = 0;
                                                            var162 = new int[256];
                                                            var163 = 0;
                                                            if (var7) {
                                                               var164 = arg1.field8310[var9[var163]];
                                                               if (~var164 <= -1) {
                                                                  var10002 = var162[var164]++;
                                                                  if (var164 > var161) {
                                                                     var161 = var164;
                                                                  }
                                                               }

                                                               ++var163;
                                                            }

                                                            while(true) {
                                                               if (~this.field1066 >= ~var163) {
                                                                  this.field1035 = new int[var161 + 1][];
                                                                  var164 = 0;
                                                                  if (!var7) {
                                                                     if (var7) {
                                                                        this.field1035[var164] = new int[var162[var164]];
                                                                        var162[var164] = 0;
                                                                        ++var164;
                                                                     }

                                                                     while(true) {
                                                                        while(~var164 >= ~var161) {
                                                                           this.field1035[var164] = new int[var162[var164]];
                                                                           var162[var164] = 0;
                                                                           ++var164;
                                                                        }

                                                                        var165 = 0;
                                                                        if (!var7) {
                                                                           if (!var7 && ~var165 <= ~this.field1066) {
                                                                              return;
                                                                           }

                                                                           do {
                                                                              var166 = arg1.field8310[var9[var165]];
                                                                              if (~var166 <= -1) {
                                                                                 this.field1035[var166][var162[var166]++] = var165;
                                                                              }

                                                                              ++var165;
                                                                           } while(~var165 > ~this.field1066);

                                                                           return;
                                                                        }

                                                                        ++var164;
                                                                     }
                                                                  }
                                                               } else {
                                                                  var164 = arg1.field8310[var9[var163]];
                                                               }

                                                               if (~var164 <= -1) {
                                                                  var10002 = var162[var164]++;
                                                                  if (var164 > var161) {
                                                                     var161 = var164;
                                                                  }
                                                               }

                                                               ++var163;
                                                            }
                                                         }

                                                         return;
                                                      }
                                                   } else {
                                                      var173 = this;
                                                   }

                                                   var160 = var173.field1074[var170];
                                                   if (~var68 != ~var160) {
                                                      this.field1123[var67++] = var170;
                                                      var68 = var160;
                                                   }

                                                   ++var170;
                                                }
                                             }
                                          } else {
                                             var170 = this.field1074[var158];
                                          }

                                          if (var68 != var170) {
                                             ++var67;
                                             var68 = var170;
                                          }

                                          ++var158;
                                       }
                                    }
                                 } else {
                                    var67 = var9[var46];
                                    var68 = 65535 & arg1.field8317[var67];
                                 }

                                 if (arg1.field8348 != null) {
                                    var69 = arg1.field8348[var67];
                                    if (var7) {
                                       var69 = -1;
                                    }
                                 } else {
                                    var69 = -1;
                                 }

                                 if (arg1.field8353 == null) {
                                    var70 = 0;
                                    if (var7) {
                                       var70 = 255 & arg1.field8353[var67];
                                    }
                                 } else {
                                    var70 = 255 & arg1.field8353[var67];
                                 }

                                 var71 = arg1.field8304 != null ? arg1.field8304[var67] : -1;
                                 if (var71 != -1 && ~(this.field1129 & 64) != -1) {
                                    var72 = var8.method2043(-66, var71 & 65535);
                                    if (var72.field5670) {
                                       var71 = -1;
                                    }
                                 }
                              }

                              while(true) {
                                 var73 = 0.0F;
                                 var74 = 0.0F;
                                 var75 = 0.0F;
                                 var76 = 0.0F;
                                 var77 = 0.0F;
                                 var78 = 0.0F;
                                 var79 = 0;
                                 var80 = 0;
                                 var81 = 0;
                                 if (~var71 != 0) {
                                    label4027: {
                                       if (var69 == -1) {
                                          var77 = 0.0F;
                                          var80 = 2;
                                          var79 = 1;
                                          var75 = 1.0F;
                                          var78 = 0.0F;
                                          var73 = 0.0F;
                                          var74 = 1.0F;
                                          var76 = 1.0F;
                                          if (!var7) {
                                             break label4027;
                                          }
                                       }

                                       var69 &= 255;
                                       var82 = arg1.field8337[var69];
                                       if (var82 == 0) {
                                          var83 = arg1.field8342[var67];
                                          var84 = arg1.field8341[var67];
                                          var85 = arg1.field8323[var67];
                                          var86 = arg1.field8331[var69];
                                          var87 = arg1.field8308[var69];
                                          var88 = arg1.field8340[var69];
                                          var89 = (float)arg1.field8344[var86];
                                          var90 = (float)arg1.field8311[var86];
                                          var91 = (float)arg1.field8332[var86];
                                          var92 = (float)arg1.field8344[var87] - var89;
                                          var93 = (float)arg1.field8311[var87] - var90;
                                          var94 = (float)arg1.field8332[var87] + -var91;
                                          var95 = (float)arg1.field8344[var88] - var89;
                                          var96 = (float)arg1.field8311[var88] - var90;
                                          var97 = (float)arg1.field8332[var88] - var91;
                                          var98 = (float)arg1.field8344[var83] - var89;
                                          var99 = (float)arg1.field8311[var83] - var90;
                                          var100 = (float)arg1.field8332[var83] - var91;
                                          var101 = (float)arg1.field8344[var84] - var89;
                                          var102 = (float)arg1.field8311[var84] - var90;
                                          var103 = (float)arg1.field8332[var84] - var91;
                                          var104 = (float)arg1.field8344[var85] - var89;
                                          var105 = (float)arg1.field8311[var85] - var90;
                                          var106 = (float)arg1.field8332[var85] - var91;
                                          var107 = var93 * var97 - var94 * var96;
                                          var108 = var94 * var95 + -(var92 * var97);
                                          var109 = var92 * var96 - var93 * var95;
                                          var110 = var96 * var109 - var97 * var108;
                                          var111 = var97 * var107 + -(var95 * var109);
                                          var112 = var95 * var108 - var96 * var107;
                                          var113 = 1.0F / (var94 * var112 + var92 * var110 + var93 * var111);
                                          var73 = (var100 * var112 + var98 * var110 + var99 * var111) * var113;
                                          var77 = (var106 * var112 + var104 * var110 + var105 * var111) * var113;
                                          var75 = (var103 * var112 + var101 * var110 + var102 * var111) * var113;
                                          var114 = var93 * var109 + -(var94 * var108);
                                          var115 = var92 * var108 - var93 * var107;
                                          var116 = var94 * var107 + -(var92 * var109);
                                          var117 = 1.0F / (var97 * var115 + var95 * var114 + var96 * var116);
                                          var74 = (var100 * var115 + var98 * var114 + var99 * var116) * var117;
                                          var78 = (var106 * var115 + var104 * var114 + var105 * var116) * var117;
                                          var76 = (var103 * var115 + var101 * var114 + var102 * var116) * var117;
                                          if (!var7) {
                                             break label4027;
                                          }
                                       }

                                       var118 = arg1.field8342[var67];
                                       var119 = arg1.field8341[var67];
                                       var120 = arg1.field8323[var67];
                                       var121 = var43.field7875[var69];
                                       var122 = var43.field7871[var69];
                                       var123 = var43.field7873[var69];
                                       var124 = var43.field7872[var69];
                                       var125 = arg1.field8354[var69];
                                       var126 = (float)arg1.field8315[var69] / 256.0F;
                                       if (~var82 != -2) {
                                          label1726: {
                                             if (~var82 != -3) {
                                                if (~var82 != -4) {
                                                   break label1726;
                                                }

                                                class563.method4193(var126, var123, var124, arg1.field8311[var118], var125, var122, class712.field10238, var121, arg1.field8332[var118], (byte)25, arg1.field8344[var118]);
                                                var74 = class712.field10238[1];
                                                var73 = class712.field10238[0];
                                                class563.method4193(var126, var123, var124, arg1.field8311[var119], var125, var122, class712.field10238, var121, arg1.field8332[var119], (byte)25, arg1.field8344[var119]);
                                                var76 = class712.field10238[1];
                                                var75 = class712.field10238[0];
                                                class563.method4193(var126, var123, var124, arg1.field8311[var120], var125, var122, class712.field10238, var121, arg1.field8332[var120], (byte)25, arg1.field8344[var120]);
                                                var77 = class712.field10238[0];
                                                var78 = class712.field10238[1];
                                                if (~(1 & var125) != -1) {
                                                   if (!(-var74 + var78 > 0.5F)) {
                                                      if (var74 - var78 > 0.5F) {
                                                         ++var78;
                                                         var80 = 2;
                                                         if (var7) {
                                                            --var78;
                                                            var80 = 1;
                                                         }
                                                      }
                                                   } else {
                                                      --var78;
                                                      var80 = 1;
                                                   }

                                                   if (var76 - var74 > 0.5F) {
                                                      var79 = 1;
                                                      --var76;
                                                      if (!var7) {
                                                         break label1726;
                                                      }
                                                   }

                                                   if (!(var74 - var76 > 0.5F)) {
                                                      break label1726;
                                                   }

                                                   var79 = 2;
                                                   ++var76;
                                                   if (!var7) {
                                                      break label1726;
                                                   }

                                                   if (var77 - var73 > 0.5F) {
                                                      --var77;
                                                      var80 = 1;
                                                      if (var7 && var73 - var77 > 0.5F) {
                                                         ++var77;
                                                         var80 = 2;
                                                      }
                                                   } else if (var73 - var77 > 0.5F) {
                                                      ++var77;
                                                      var80 = 2;
                                                   }
                                                } else if (var77 - var73 > 0.5F) {
                                                   --var77;
                                                   var80 = 1;
                                                   if (var7 && var73 - var77 > 0.5F) {
                                                      ++var77;
                                                      var80 = 2;
                                                   }
                                                } else if (var73 - var77 > 0.5F) {
                                                   ++var77;
                                                   var80 = 2;
                                                }

                                                if (var75 - var73 > 0.5F) {
                                                   --var75;
                                                   var79 = 1;
                                                   if (!var7) {
                                                      break label1726;
                                                   }
                                                }

                                                if (!(-var75 + var73 > 0.5F)) {
                                                   break label1726;
                                                }

                                                var79 = 2;
                                                ++var75;
                                                if (!var7) {
                                                   break label1726;
                                                }
                                             }

                                             var127 = (float)arg1.field8346[var69] / 256.0F;
                                             var128 = (float)arg1.field8309[var69] / 256.0F;
                                             var129 = arg1.field8344[var119] + -arg1.field8344[var118];
                                             var130 = arg1.field8311[var119] + -arg1.field8311[var118];
                                             var131 = arg1.field8332[var119] + -arg1.field8332[var118];
                                             var132 = arg1.field8344[var120] - arg1.field8344[var118];
                                             var133 = arg1.field8311[var120] + -arg1.field8311[var118];
                                             var134 = arg1.field8332[var120] + -arg1.field8332[var118];
                                             var135 = var130 * var134 - var131 * var133;
                                             var136 = var131 * var132 + -(var129 * var134);
                                             var137 = var129 * var133 - var130 * var132;
                                             var138 = 64.0F / (float)arg1.field8322[var69];
                                             var139 = 64.0F / (float)arg1.field8330[var69];
                                             var140 = 64.0F / (float)arg1.field8338[var69];
                                             var141 = (var124[2] * (float)var137 + var124[1] * (float)var136 + var124[0] * (float)var135) / var138;
                                             var142 = (var124[5] * (float)var137 + var124[4] * (float)var136 + var124[3] * (float)var135) / var139;
                                             var143 = (var124[8] * (float)var137 + var124[6] * (float)var135 + var124[7] * (float)var136) / var140;
                                             var81 = class343.method2727(var141, var142, (byte)118, var143);
                                             class4.method20(var127, arg1.field8311[var118], class712.field10238, var123, var124, var122, (byte)-106, var125, var81, arg1.field8332[var118], var128, var121, var126, arg1.field8344[var118]);
                                             var74 = class712.field10238[1];
                                             var73 = class712.field10238[0];
                                             class4.method20(var127, arg1.field8311[var119], class712.field10238, var123, var124, var122, (byte)-71, var125, var81, arg1.field8332[var119], var128, var121, var126, arg1.field8344[var119]);
                                             var76 = class712.field10238[1];
                                             var75 = class712.field10238[0];
                                             class4.method20(var127, arg1.field8311[var120], class712.field10238, var123, var124, var122, (byte)-73, var125, var81, arg1.field8332[var120], var128, var121, var126, arg1.field8344[var120]);
                                             var77 = class712.field10238[0];
                                             var78 = class712.field10238[1];
                                             if (var7) {
                                                var144 = (float)arg1.field8338[var69] / 1024.0F;
                                                class23.method306(var126, var121, var124, -16589, var123, var122, arg1.field8332[var118], var125, arg1.field8311[var118], arg1.field8344[var118], class712.field10238, var144);
                                                var73 = class712.field10238[0];
                                                var74 = class712.field10238[1];
                                                class23.method306(var126, var121, var124, -16589, var123, var122, arg1.field8332[var119], var125, arg1.field8311[var119], arg1.field8344[var119], class712.field10238, var144);
                                                var75 = class712.field10238[0];
                                                var76 = class712.field10238[1];
                                                class23.method306(var126, var121, var124, -16589, var123, var122, arg1.field8332[var120], var125, arg1.field8311[var120], arg1.field8344[var120], class712.field10238, var144);
                                                var78 = class712.field10238[1];
                                                var77 = class712.field10238[0];
                                                var145 = var144 / 2.0F;
                                                if (~(var125 & 1) == -1) {
                                                   if (var145 < -var73 + var77) {
                                                      var80 = 1;
                                                      var77 -= var144;
                                                      if (var7 && -var77 + var73 > var145) {
                                                         var77 += var144;
                                                         var80 = 2;
                                                      }
                                                   } else if (-var77 + var73 > var145) {
                                                      var77 += var144;
                                                      var80 = 2;
                                                   }

                                                   if (!(-var73 + var75 > var145)) {
                                                      if (-var75 + var73 > var145) {
                                                         var79 = 2;
                                                         var75 += var144;
                                                         if (var7) {
                                                            var79 = 1;
                                                            var75 -= var144;
                                                            if (var7) {
                                                               if (var78 - var74 > var145) {
                                                                  var80 = 1;
                                                                  var78 -= var144;
                                                                  if (var7 && var145 < -var78 + var74) {
                                                                     var80 = 2;
                                                                     var78 += var144;
                                                                  }
                                                               } else if (var145 < -var78 + var74) {
                                                                  var80 = 2;
                                                                  var78 += var144;
                                                               }

                                                               if (!(var145 < -var74 + var76)) {
                                                                  if (var145 < -var76 + var74) {
                                                                     var76 += var144;
                                                                     var79 = 2;
                                                                     if (var7) {
                                                                        var79 = 1;
                                                                        var76 -= var144;
                                                                     }
                                                                  }
                                                               } else {
                                                                  var79 = 1;
                                                                  var76 -= var144;
                                                               }
                                                            }
                                                         }
                                                      }
                                                   } else {
                                                      var79 = 1;
                                                      var75 -= var144;
                                                      if (var7) {
                                                         if (var78 - var74 > var145) {
                                                            var80 = 1;
                                                            var78 -= var144;
                                                            if (var7 && var145 < -var78 + var74) {
                                                               var80 = 2;
                                                               var78 += var144;
                                                            }
                                                         } else if (var145 < -var78 + var74) {
                                                            var80 = 2;
                                                            var78 += var144;
                                                         }

                                                         if (!(var145 < -var74 + var76)) {
                                                            if (var145 < -var76 + var74) {
                                                               var76 += var144;
                                                               var79 = 2;
                                                               if (var7) {
                                                                  var79 = 1;
                                                                  var76 -= var144;
                                                               }
                                                            }
                                                         } else {
                                                            var79 = 1;
                                                            var76 -= var144;
                                                         }
                                                      }
                                                   }
                                                } else {
                                                   if (var78 - var74 > var145) {
                                                      var80 = 1;
                                                      var78 -= var144;
                                                      if (var7 && var145 < -var78 + var74) {
                                                         var80 = 2;
                                                         var78 += var144;
                                                      }
                                                   } else if (var145 < -var78 + var74) {
                                                      var80 = 2;
                                                      var78 += var144;
                                                   }

                                                   if (!(var145 < -var74 + var76)) {
                                                      if (var145 < -var76 + var74) {
                                                         var76 += var144;
                                                         var79 = 2;
                                                         if (var7) {
                                                            var79 = 1;
                                                            var76 -= var144;
                                                         }
                                                      }
                                                   } else {
                                                      var79 = 1;
                                                      var76 -= var144;
                                                   }
                                                }
                                             }
                                          }
                                       } else {
                                          var144 = (float)arg1.field8338[var69] / 1024.0F;
                                          class23.method306(var126, var121, var124, -16589, var123, var122, arg1.field8332[var118], var125, arg1.field8311[var118], arg1.field8344[var118], class712.field10238, var144);
                                          var73 = class712.field10238[0];
                                          var74 = class712.field10238[1];
                                          class23.method306(var126, var121, var124, -16589, var123, var122, arg1.field8332[var119], var125, arg1.field8311[var119], arg1.field8344[var119], class712.field10238, var144);
                                          var75 = class712.field10238[0];
                                          var76 = class712.field10238[1];
                                          class23.method306(var126, var121, var124, -16589, var123, var122, arg1.field8332[var120], var125, arg1.field8311[var120], arg1.field8344[var120], class712.field10238, var144);
                                          var78 = class712.field10238[1];
                                          var77 = class712.field10238[0];
                                          var145 = var144 / 2.0F;
                                          if (~(var125 & 1) == -1) {
                                             if (var145 < -var73 + var77) {
                                                var80 = 1;
                                                var77 -= var144;
                                                if (var7 && -var77 + var73 > var145) {
                                                   var77 += var144;
                                                   var80 = 2;
                                                }
                                             } else if (-var77 + var73 > var145) {
                                                var77 += var144;
                                                var80 = 2;
                                             }

                                             if (!(-var73 + var75 > var145)) {
                                                if (-var75 + var73 > var145) {
                                                   var79 = 2;
                                                   var75 += var144;
                                                   if (var7) {
                                                      var79 = 1;
                                                      var75 -= var144;
                                                      if (var7) {
                                                         if (var78 - var74 > var145) {
                                                            var80 = 1;
                                                            var78 -= var144;
                                                            if (var7 && var145 < -var78 + var74) {
                                                               var80 = 2;
                                                               var78 += var144;
                                                            }
                                                         } else if (var145 < -var78 + var74) {
                                                            var80 = 2;
                                                            var78 += var144;
                                                         }

                                                         if (!(var145 < -var74 + var76)) {
                                                            if (var145 < -var76 + var74) {
                                                               var76 += var144;
                                                               var79 = 2;
                                                               if (var7) {
                                                                  var79 = 1;
                                                                  var76 -= var144;
                                                               }
                                                            }
                                                         } else {
                                                            var79 = 1;
                                                            var76 -= var144;
                                                         }
                                                      }
                                                   }
                                                }
                                             } else {
                                                var79 = 1;
                                                var75 -= var144;
                                                if (var7) {
                                                   if (var78 - var74 > var145) {
                                                      var80 = 1;
                                                      var78 -= var144;
                                                      if (var7 && var145 < -var78 + var74) {
                                                         var80 = 2;
                                                         var78 += var144;
                                                      }
                                                   } else if (var145 < -var78 + var74) {
                                                      var80 = 2;
                                                      var78 += var144;
                                                   }

                                                   if (!(var145 < -var74 + var76)) {
                                                      if (var145 < -var76 + var74) {
                                                         var76 += var144;
                                                         var79 = 2;
                                                         if (var7) {
                                                            var79 = 1;
                                                            var76 -= var144;
                                                         }
                                                      }
                                                   } else {
                                                      var79 = 1;
                                                      var76 -= var144;
                                                   }
                                                }
                                             }
                                          } else {
                                             if (var78 - var74 > var145) {
                                                var80 = 1;
                                                var78 -= var144;
                                                if (var7 && var145 < -var78 + var74) {
                                                   var80 = 2;
                                                   var78 += var144;
                                                }
                                             } else if (var145 < -var78 + var74) {
                                                var80 = 2;
                                                var78 += var144;
                                             }

                                             if (!(var145 < -var74 + var76)) {
                                                if (var145 < -var76 + var74) {
                                                   var76 += var144;
                                                   var79 = 2;
                                                   if (var7) {
                                                      var79 = 1;
                                                      var76 -= var144;
                                                   }
                                                }
                                             } else {
                                                var79 = 1;
                                                var76 -= var144;
                                             }
                                          }
                                       }
                                    }
                                 }

                                 if (arg1.field8318 == null) {
                                    var146 = 0;
                                    if (var7) {
                                       var146 = arg1.field8318[var67];
                                    }
                                 } else {
                                    var146 = arg1.field8318[var67];
                                 }

                                 if (~var146 != -1) {
                                    if (var146 == 1) {
                                       var147 = var44[var67];
                                       var148 = ((long)(var68 << 8) + (long)(var81 << 24) - -((long)var70) << 32) + (long)((var147.field9198 + 256 << 12) + (~var147.field9191 < -1 ? 1024 : 2048) + (var147.field9192 + 256 << 22) + (var69 << 2));
                                       this.field1107[var46] = this.method787(var147.field9192, (byte)-111, var148, var147.field9198, arg1.field8342[var67], var74, arg1, 0, var147.field9191, var73);
                                       this.field1084[var46] = this.method787(var147.field9192, (byte)42, (long)var79 + var148, var147.field9198, arg1.field8341[var67], var76, arg1, 0, var147.field9191, var75);
                                       this.field1079[var46] = this.method787(var147.field9192, (byte)-94, (long)var80 + var148, var147.field9198, arg1.field8323[var67], var78, arg1, 0, var147.field9191, var77);
                                       if (var7) {
                                          var150 = ((long)(var81 << 24) - -((long)(var68 << 8)) + (long)var70 << 32) + (long)(var69 << 2);
                                          var152 = arg1.field8342[var67];
                                          var153 = arg1.field8341[var67];
                                          var154 = arg1.field8323[var67];
                                          var155 = var32[var152];
                                          this.field1107[var46] = this.method787(var155.field10677, (byte)60, var150, var155.field10678, var152, var74, arg1, var155.field10680, var155.field10675, var73);
                                          var156 = var32[var153];
                                          this.field1084[var46] = this.method787(var156.field10677, (byte)108, (long)var79 + var150, var156.field10678, var153, var76, arg1, var156.field10680, var156.field10675, var75);
                                          var157 = var32[var154];
                                          this.field1079[var46] = this.method787(var157.field10677, (byte)-66, (long)var80 + var150, var157.field10678, var154, var78, arg1, var157.field10680, var157.field10675, var77);
                                          if (arg1.field8353 != null) {
                                             this.field1155[var46] = arg1.field8353[var67];
                                          }

                                          if (arg1.field8335 != null) {
                                             this.field1117[var46] = arg1.field8335[var67];
                                          }

                                          this.field1106[var46] = arg1.field8317[var67];
                                          this.field1074[var46] = var71;
                                          ++var46;
                                       } else {
                                          if (arg1.field8353 != null) {
                                             this.field1155[var46] = arg1.field8353[var67];
                                          }

                                          if (arg1.field8335 != null) {
                                             this.field1117[var46] = arg1.field8335[var67];
                                          }

                                          this.field1106[var46] = arg1.field8317[var67];
                                          this.field1074[var46] = var71;
                                          ++var46;
                                       }
                                    } else {
                                       if (arg1.field8353 != null) {
                                          this.field1155[var46] = arg1.field8353[var67];
                                       }

                                       if (arg1.field8335 != null) {
                                          this.field1117[var46] = arg1.field8335[var67];
                                       }

                                       this.field1106[var46] = arg1.field8317[var67];
                                       this.field1074[var46] = var71;
                                       ++var46;
                                    }
                                 } else {
                                    var150 = ((long)(var81 << 24) - -((long)(var68 << 8)) + (long)var70 << 32) + (long)(var69 << 2);
                                    var152 = arg1.field8342[var67];
                                    var153 = arg1.field8341[var67];
                                    var154 = arg1.field8323[var67];
                                    var155 = var32[var152];
                                    this.field1107[var46] = this.method787(var155.field10677, (byte)60, var150, var155.field10678, var152, var74, arg1, var155.field10680, var155.field10675, var73);
                                    var156 = var32[var153];
                                    this.field1084[var46] = this.method787(var156.field10677, (byte)108, (long)var79 + var150, var156.field10678, var153, var76, arg1, var156.field10680, var156.field10675, var75);
                                    var157 = var32[var154];
                                    this.field1079[var46] = this.method787(var157.field10677, (byte)-66, (long)var80 + var150, var157.field10678, var154, var78, arg1, var157.field10680, var157.field10675, var77);
                                    if (arg1.field8353 != null) {
                                       this.field1155[var46] = arg1.field8353[var67];
                                    }

                                    if (arg1.field8335 != null) {
                                       this.field1117[var46] = arg1.field8335[var67];
                                    }

                                    this.field1106[var46] = arg1.field8317[var67];
                                    this.field1074[var46] = var71;
                                    ++var46;
                                 }

                                 if (~this.field1066 >= ~var46) {
                                    var67 = 0;
                                    var68 = -10000;
                                    var158 = 0;
                                    if (!var7) {
                                       if (var7) {
                                          var159 = this.field1074[var158];
                                          if (var68 != var159) {
                                             ++var67;
                                             var68 = var159;
                                          }

                                          ++var158;
                                       }

                                       while(true) {
                                          if (~var158 <= ~this.field1077) {
                                             this.field1123 = new int[var67 + 1];
                                             var67 = 0;
                                             var68 = -10000;
                                             var170 = 0;
                                             if (!var7) {
                                                if (var7) {
                                                   var160 = this.field1074[var170];
                                                   if (~var68 != ~var160) {
                                                      this.field1123[var67++] = var170;
                                                      var68 = var160;
                                                   }

                                                   ++var170;
                                                }

                                                while(true) {
                                                   if (this.field1077 <= var170) {
                                                      this.field1123[var67] = this.field1077;
                                                      class724.field10350 = null;
                                                      this.field1043 = class147.method1437(this.field1059, this.field1043, false);
                                                      this.field1095 = class147.method1437(this.field1059, this.field1095, false);
                                                      this.field1109 = class147.method1437(this.field1059, this.field1109, false);
                                                      this.field1052 = class284.method2377(43, this.field1052, this.field1059);
                                                      this.field1144 = class499.method3778(this.field1144, (byte)-50, this.field1059);
                                                      var173 = this;
                                                      if (!var7) {
                                                         this.field1101 = class499.method3778(this.field1101, (byte)-50, this.field1059);
                                                         if (arg1.field8329 != null && class570.method4223(-24229, arg2, this.field1129)) {
                                                            this.field1058 = arg1.method4333(false, (byte)29);
                                                         }

                                                         if (arg1.field8343 != null && class268.method2291(arg2, this.field1129, 82)) {
                                                            this.field1124 = arg1.method4336(0);
                                                         }

                                                         if (arg1.field8310 != null && class533.method3988(arg2, 77, this.field1129)) {
                                                            var161 = 0;
                                                            var162 = new int[256];
                                                            var163 = 0;
                                                            if (var7) {
                                                               var164 = arg1.field8310[var9[var163]];
                                                               if (~var164 <= -1) {
                                                                  var10002 = var162[var164]++;
                                                                  if (var164 > var161) {
                                                                     var161 = var164;
                                                                  }
                                                               }

                                                               ++var163;
                                                            }

                                                            while(true) {
                                                               if (~this.field1066 >= ~var163) {
                                                                  this.field1035 = new int[var161 + 1][];
                                                                  var164 = 0;
                                                                  if (!var7) {
                                                                     if (var7) {
                                                                        this.field1035[var164] = new int[var162[var164]];
                                                                        var162[var164] = 0;
                                                                        ++var164;
                                                                     }

                                                                     while(true) {
                                                                        while(~var164 >= ~var161) {
                                                                           this.field1035[var164] = new int[var162[var164]];
                                                                           var162[var164] = 0;
                                                                           ++var164;
                                                                        }

                                                                        var165 = 0;
                                                                        if (!var7) {
                                                                           if (!var7 && ~var165 <= ~this.field1066) {
                                                                              return;
                                                                           }

                                                                           do {
                                                                              var166 = arg1.field8310[var9[var165]];
                                                                              if (~var166 <= -1) {
                                                                                 this.field1035[var166][var162[var166]++] = var165;
                                                                              }

                                                                              ++var165;
                                                                           } while(~var165 > ~this.field1066);

                                                                           return;
                                                                        }

                                                                        ++var164;
                                                                     }
                                                                  }
                                                               } else {
                                                                  var164 = arg1.field8310[var9[var163]];
                                                               }

                                                               if (~var164 <= -1) {
                                                                  var10002 = var162[var164]++;
                                                                  if (var164 > var161) {
                                                                     var161 = var164;
                                                                  }
                                                               }

                                                               ++var163;
                                                            }
                                                         }

                                                         return;
                                                      }
                                                   } else {
                                                      var173 = this;
                                                   }

                                                   var160 = var173.field1074[var170];
                                                   if (~var68 != ~var160) {
                                                      this.field1123[var67++] = var170;
                                                      var68 = var160;
                                                   }

                                                   ++var170;
                                                }
                                             }
                                          } else {
                                             var170 = this.field1074[var158];
                                          }

                                          if (var68 != var170) {
                                             ++var67;
                                             var68 = var170;
                                          }

                                          ++var158;
                                       }
                                    }
                                 } else {
                                    var67 = var9[var46];
                                    var68 = 65535 & arg1.field8317[var67];
                                 }

                                 if (arg1.field8348 != null) {
                                    var69 = arg1.field8348[var67];
                                    if (var7) {
                                       var69 = -1;
                                    }
                                 } else {
                                    var69 = -1;
                                 }

                                 if (arg1.field8353 == null) {
                                    var70 = 0;
                                    if (var7) {
                                       var70 = 255 & arg1.field8353[var67];
                                    }
                                 } else {
                                    var70 = 255 & arg1.field8353[var67];
                                 }

                                 var71 = arg1.field8304 != null ? arg1.field8304[var67] : -1;
                                 if (var71 != -1 && ~(this.field1129 & 64) != -1) {
                                    var72 = var8.method2043(-66, var71 & 65535);
                                    if (var72.field5670) {
                                       var71 = -1;
                                    }
                                 }
                              }
                           }
                        } else {
                           var10000 = this.field1038[var41];
                        }

                        var42 = var10000;
                        this.field1038[var41] = var40;
                        var40 += var42;
                        var32[var41] = new class752();
                        ++var41;
                     }
                  }
               }

               while(true) {
                  int var10001;
                  class747 var34;
                  class766 var35;
                  int var36;
                  label3540: {
                     var34 = var171.field8343[var33];
                     var35 = class107.method1044(103, var34.field10623);
                     var36 = -1;
                     int var37 = 0;
                     if (var7) {
                        var10000 = ~var34.field10624;
                        var10001 = ~var9[var37];
                     } else if (~var37 <= ~this.field1066) {
                        var10000 = var36;
                        var10001 = -1;
                        if (!var7) {
                           break label3540;
                        }
                     } else {
                        var10000 = ~var34.field10624;
                        var10001 = ~var9[var37];
                     }

                     label3539:
                     do {
                        while(true) {
                           if (var10000 == var10001) {
                              var36 = var37;
                              if (!var7) {
                                 var10000 = var37;
                                 var10001 = -1;
                                 break;
                              }

                              ++var37;
                           } else {
                              ++var37;
                           }

                           if (~var37 <= ~this.field1066) {
                              var10000 = var36;
                              var10001 = -1;
                              if (!var7) {
                                 break label3539;
                              }
                           } else {
                              var10000 = ~var34.field10624;
                              var10001 = ~var9[var37];
                           }
                        }
                     } while(var7);
                  }

                  if (var10000 == var10001) {
                     throw new RuntimeException();
                  }

                  int var38 = class744.field10589[arg1.field8317[var34.field10624] & 65535] & 16777215;
                  int var39 = var38 | 255 + -(arg1.field8353 == null ? 0 : arg1.field8353[var34.field10624]) << 24;
                  this.field1103[var33] = new class152(var36, arg1.field8342[var34.field10624], arg1.field8341[var34.field10624], arg1.field8323[var34.field10624], var35.field10990, var35.field10991, var35.field10994, var35.field10997, var35.field10992, var35.field10993, var35.field10989, var34.field10616);
                  this.field1041[var33] = new class750(var39);
                  ++var33;
                  if (this.field1105 <= var33) {
                     var33 = this.field1066 * 3;
                     this.field1079 = new short[this.field1066];
                     this.field1109 = new short[var33];
                     this.field1084 = new short[this.field1066];
                     this.field1043 = new short[var33];
                     this.field1089 = (short)arg3;
                     this.field1101 = new float[var33];
                     this.field1140 = (short)arg4;
                     this.field1107 = new short[this.field1066];
                     var171 = arg1;
                     if (!var7) {
                        if (arg1.field8335 != null) {
                           this.field1117 = new short[this.field1066];
                        }

                        this.field1074 = new short[this.field1066];
                        this.field1097 = new short[var33];
                        this.field1095 = new short[var33];
                        this.field1052 = new byte[var33];
                        this.field1155 = new byte[this.field1066];
                        class724.field10350 = new long[var33];
                        this.field1144 = new float[var33];
                        this.field1106 = new short[this.field1066];
                        var40 = 0;
                        var41 = 0;
                        if (var7) {
                           var42 = this.field1038[var41];
                           this.field1038[var41] = var40;
                           var40 += var42;
                           var32[var41] = new class752();
                           ++var41;
                        }

                        while(true) {
                           if (var41 >= arg1.field8306) {
                              this.field1038[arg1.field8306] = var40;
                              var43 = class227.method2023(var9, arg1, 255, this.field1066);
                              var44 = new class650[arg1.field8324];
                              var10000 = 0;
                              if (!var7) {
                                 label508: {
                                    var45 = 0;
                                    if (var7) {
                                       var46 = arg1.field8342[var45];
                                    } else if (var45 >= arg1.field8324) {
                                       var46 = 0;
                                       if (!var7) {
                                          break label508;
                                       }
                                    } else {
                                       var46 = arg1.field8342[var45];
                                    }

                                    label507:
                                    while(true) {
                                       var47 = arg1.field8341[var45];
                                       var48 = arg1.field8323[var45];
                                       var49 = this.field1094[var47] + -this.field1094[var46];
                                       var50 = this.field1039[var47] + -this.field1039[var46];
                                       var51 = this.field1065[var47] - this.field1065[var46];
                                       var52 = this.field1094[var48] + -this.field1094[var46];
                                       var53 = this.field1039[var48] - this.field1039[var46];
                                       var54 = this.field1065[var48] - this.field1065[var46];
                                       var55 = var50 * var54 + -(var51 * var53);
                                       var56 = var51 * var52 + -(var49 * var54);
                                       var57 = var49 * var53 - var50 * var52;
                                       if (var7) {
                                          var55 >>= 1;
                                          var56 >>= 1;
                                          var57 >>= 1;
                                       }

                                       while(true) {
                                          while(true) {
                                             if (~var55 >= -8193) {
                                                var10000 = ~var56;
                                                if (var7) {
                                                   var57 = var10000 >> -8193;
                                                   continue;
                                                }

                                                if (var10000 >= -8193 && ~var57 >= -8193 && var55 >= -8192 && var56 >= -8192 && var57 >= -8192) {
                                                   var58 = (int)Math.sqrt((double)(var55 * var55 + var56 * var56 - -(var57 * var57)));
                                                   if (var58 <= 0) {
                                                      var169 = 1;
                                                      var59 = var56 * 256 / var169;
                                                      var60 = var57 * 256 / var169;
                                                      var61 = var55 * 256 / var169;
                                                      var172 = arg1.field8318 == null ? 0 : arg1.field8318[var45];
                                                   } else {
                                                      var59 = var56 * 256 / var58;
                                                      var60 = var57 * 256 / var58;
                                                      var61 = var55 * 256 / var58;
                                                      var172 = arg1.field8318 == null ? 0 : arg1.field8318[var45];
                                                   }

                                                   label3972: {
                                                      var62 = var172;
                                                      if (~var62 != -1) {
                                                         if (var62 != 1) {
                                                            ++var45;
                                                            break label3972;
                                                         }

                                                         var63 = var44[var45] = new class650();
                                                         var63.field9191 = var61;
                                                         var63.field9192 = var60;
                                                         var63.field9198 = var59;
                                                         if (!var7) {
                                                            ++var45;
                                                            break label3972;
                                                         }
                                                      }

                                                      var64 = var32[var46];
                                                      ++var64.field10680;
                                                      var64.field10675 += var61;
                                                      var64.field10677 += var60;
                                                      var64.field10678 += var59;
                                                      var65 = var32[var47];
                                                      var65.field10678 += var59;
                                                      ++var65.field10680;
                                                      var65.field10675 += var61;
                                                      var65.field10677 += var60;
                                                      var66 = var32[var48];
                                                      var66.field10678 += var59;
                                                      var66.field10677 += var60;
                                                      ++var66.field10680;
                                                      var66.field10675 += var61;
                                                      ++var45;
                                                   }

                                                   if (var45 >= arg1.field8324) {
                                                      var46 = 0;
                                                      if (!var7) {
                                                         break label507;
                                                      }
                                                   } else {
                                                      var46 = arg1.field8342[var45];
                                                   }
                                                   continue label507;
                                                }
                                             }

                                             var55 >>= 1;
                                             var56 >>= 1;
                                             var57 >>= 1;
                                          }
                                       }
                                    }
                                 }

                                 if (var7) {
                                    var67 = var9[var46];
                                    var68 = 65535 & arg1.field8317[var67];
                                    if (arg1.field8348 != null) {
                                       var69 = arg1.field8348[var67];
                                       if (var7) {
                                          var69 = -1;
                                       }
                                    } else {
                                       var69 = -1;
                                    }

                                    if (arg1.field8353 == null) {
                                       var70 = 0;
                                       if (var7) {
                                          var70 = 255 & arg1.field8353[var67];
                                       }
                                    } else {
                                       var70 = 255 & arg1.field8353[var67];
                                    }

                                    var71 = arg1.field8304 != null ? arg1.field8304[var67] : -1;
                                    if (var71 != -1 && ~(this.field1129 & 64) != -1) {
                                       var72 = var8.method2043(-66, var71 & 65535);
                                       if (var72.field5670) {
                                          var71 = -1;
                                       }
                                    }
                                 } else {
                                    if (~this.field1066 >= ~var46) {
                                       var67 = 0;
                                       var68 = -10000;
                                       var158 = 0;
                                       if (!var7) {
                                          if (var7) {
                                             var159 = this.field1074[var158];
                                             if (var68 != var159) {
                                                ++var67;
                                                var68 = var159;
                                             }

                                             ++var158;
                                          }

                                          while(true) {
                                             if (~var158 <= ~this.field1077) {
                                                this.field1123 = new int[var67 + 1];
                                                var67 = 0;
                                                var68 = -10000;
                                                var170 = 0;
                                                if (!var7) {
                                                   if (var7) {
                                                      var160 = this.field1074[var170];
                                                      if (~var68 != ~var160) {
                                                         this.field1123[var67++] = var170;
                                                         var68 = var160;
                                                      }

                                                      ++var170;
                                                   }

                                                   while(true) {
                                                      if (this.field1077 <= var170) {
                                                         this.field1123[var67] = this.field1077;
                                                         class724.field10350 = null;
                                                         this.field1043 = class147.method1437(this.field1059, this.field1043, false);
                                                         this.field1095 = class147.method1437(this.field1059, this.field1095, false);
                                                         this.field1109 = class147.method1437(this.field1059, this.field1109, false);
                                                         this.field1052 = class284.method2377(43, this.field1052, this.field1059);
                                                         this.field1144 = class499.method3778(this.field1144, (byte)-50, this.field1059);
                                                         var173 = this;
                                                         if (!var7) {
                                                            this.field1101 = class499.method3778(this.field1101, (byte)-50, this.field1059);
                                                            if (arg1.field8329 != null && class570.method4223(-24229, arg2, this.field1129)) {
                                                               this.field1058 = arg1.method4333(false, (byte)29);
                                                            }

                                                            if (arg1.field8343 != null && class268.method2291(arg2, this.field1129, 82)) {
                                                               this.field1124 = arg1.method4336(0);
                                                            }

                                                            if (arg1.field8310 != null && class533.method3988(arg2, 77, this.field1129)) {
                                                               var161 = 0;
                                                               var162 = new int[256];
                                                               var163 = 0;
                                                               if (var7) {
                                                                  var164 = arg1.field8310[var9[var163]];
                                                                  if (~var164 <= -1) {
                                                                     var10002 = var162[var164]++;
                                                                     if (var164 > var161) {
                                                                        var161 = var164;
                                                                     }
                                                                  }

                                                                  ++var163;
                                                               }

                                                               while(true) {
                                                                  if (~this.field1066 >= ~var163) {
                                                                     this.field1035 = new int[var161 + 1][];
                                                                     var164 = 0;
                                                                     if (!var7) {
                                                                        if (var7) {
                                                                           this.field1035[var164] = new int[var162[var164]];
                                                                           var162[var164] = 0;
                                                                           ++var164;
                                                                        }

                                                                        while(true) {
                                                                           while(~var164 >= ~var161) {
                                                                              this.field1035[var164] = new int[var162[var164]];
                                                                              var162[var164] = 0;
                                                                              ++var164;
                                                                           }

                                                                           var165 = 0;
                                                                           if (!var7) {
                                                                              if (!var7 && ~var165 <= ~this.field1066) {
                                                                                 return;
                                                                              }

                                                                              do {
                                                                                 var166 = arg1.field8310[var9[var165]];
                                                                                 if (~var166 <= -1) {
                                                                                    this.field1035[var166][var162[var166]++] = var165;
                                                                                 }

                                                                                 ++var165;
                                                                              } while(~var165 > ~this.field1066);

                                                                              return;
                                                                           }

                                                                           ++var164;
                                                                        }
                                                                     }
                                                                  } else {
                                                                     var164 = arg1.field8310[var9[var163]];
                                                                  }

                                                                  if (~var164 <= -1) {
                                                                     var10002 = var162[var164]++;
                                                                     if (var164 > var161) {
                                                                        var161 = var164;
                                                                     }
                                                                  }

                                                                  ++var163;
                                                               }
                                                            }

                                                            return;
                                                         }
                                                      } else {
                                                         var173 = this;
                                                      }

                                                      var160 = var173.field1074[var170];
                                                      if (~var68 != ~var160) {
                                                         this.field1123[var67++] = var170;
                                                         var68 = var160;
                                                      }

                                                      ++var170;
                                                   }
                                                }
                                             } else {
                                                var170 = this.field1074[var158];
                                             }

                                             if (var68 != var170) {
                                                ++var67;
                                                var68 = var170;
                                             }

                                             ++var158;
                                          }
                                       }
                                    } else {
                                       var67 = var9[var46];
                                       var68 = 65535 & arg1.field8317[var67];
                                    }

                                    if (arg1.field8348 != null) {
                                       var69 = arg1.field8348[var67];
                                       if (var7) {
                                          var69 = -1;
                                       }
                                    } else {
                                       var69 = -1;
                                    }

                                    if (arg1.field8353 == null) {
                                       var70 = 0;
                                       if (var7) {
                                          var70 = 255 & arg1.field8353[var67];
                                       }
                                    } else {
                                       var70 = 255 & arg1.field8353[var67];
                                    }

                                    var71 = arg1.field8304 != null ? arg1.field8304[var67] : -1;
                                    if (var71 != -1 && ~(this.field1129 & 64) != -1) {
                                       var72 = var8.method2043(-66, var71 & 65535);
                                       if (var72.field5670) {
                                          var71 = -1;
                                       }
                                    }
                                 }

                                 while(true) {
                                    var73 = 0.0F;
                                    var74 = 0.0F;
                                    var75 = 0.0F;
                                    var76 = 0.0F;
                                    var77 = 0.0F;
                                    var78 = 0.0F;
                                    var79 = 0;
                                    var80 = 0;
                                    var81 = 0;
                                    if (~var71 != 0) {
                                       label4034: {
                                          if (var69 == -1) {
                                             var77 = 0.0F;
                                             var80 = 2;
                                             var79 = 1;
                                             var75 = 1.0F;
                                             var78 = 0.0F;
                                             var73 = 0.0F;
                                             var74 = 1.0F;
                                             var76 = 1.0F;
                                             if (!var7) {
                                                break label4034;
                                             }
                                          }

                                          var69 &= 255;
                                          var82 = arg1.field8337[var69];
                                          if (var82 == 0) {
                                             var83 = arg1.field8342[var67];
                                             var84 = arg1.field8341[var67];
                                             var85 = arg1.field8323[var67];
                                             var86 = arg1.field8331[var69];
                                             var87 = arg1.field8308[var69];
                                             var88 = arg1.field8340[var69];
                                             var89 = (float)arg1.field8344[var86];
                                             var90 = (float)arg1.field8311[var86];
                                             var91 = (float)arg1.field8332[var86];
                                             var92 = (float)arg1.field8344[var87] - var89;
                                             var93 = (float)arg1.field8311[var87] - var90;
                                             var94 = (float)arg1.field8332[var87] + -var91;
                                             var95 = (float)arg1.field8344[var88] - var89;
                                             var96 = (float)arg1.field8311[var88] - var90;
                                             var97 = (float)arg1.field8332[var88] - var91;
                                             var98 = (float)arg1.field8344[var83] - var89;
                                             var99 = (float)arg1.field8311[var83] - var90;
                                             var100 = (float)arg1.field8332[var83] - var91;
                                             var101 = (float)arg1.field8344[var84] - var89;
                                             var102 = (float)arg1.field8311[var84] - var90;
                                             var103 = (float)arg1.field8332[var84] - var91;
                                             var104 = (float)arg1.field8344[var85] - var89;
                                             var105 = (float)arg1.field8311[var85] - var90;
                                             var106 = (float)arg1.field8332[var85] - var91;
                                             var107 = var93 * var97 - var94 * var96;
                                             var108 = var94 * var95 + -(var92 * var97);
                                             var109 = var92 * var96 - var93 * var95;
                                             var110 = var96 * var109 - var97 * var108;
                                             var111 = var97 * var107 + -(var95 * var109);
                                             var112 = var95 * var108 - var96 * var107;
                                             var113 = 1.0F / (var94 * var112 + var92 * var110 + var93 * var111);
                                             var73 = (var100 * var112 + var98 * var110 + var99 * var111) * var113;
                                             var77 = (var106 * var112 + var104 * var110 + var105 * var111) * var113;
                                             var75 = (var103 * var112 + var101 * var110 + var102 * var111) * var113;
                                             var114 = var93 * var109 + -(var94 * var108);
                                             var115 = var92 * var108 - var93 * var107;
                                             var116 = var94 * var107 + -(var92 * var109);
                                             var117 = 1.0F / (var97 * var115 + var95 * var114 + var96 * var116);
                                             var74 = (var100 * var115 + var98 * var114 + var99 * var116) * var117;
                                             var78 = (var106 * var115 + var104 * var114 + var105 * var116) * var117;
                                             var76 = (var103 * var115 + var101 * var114 + var102 * var116) * var117;
                                             if (!var7) {
                                                break label4034;
                                             }
                                          }

                                          var118 = arg1.field8342[var67];
                                          var119 = arg1.field8341[var67];
                                          var120 = arg1.field8323[var67];
                                          var121 = var43.field7875[var69];
                                          var122 = var43.field7871[var69];
                                          var123 = var43.field7873[var69];
                                          var124 = var43.field7872[var69];
                                          var125 = arg1.field8354[var69];
                                          var126 = (float)arg1.field8315[var69] / 256.0F;
                                          if (~var82 != -2) {
                                             label1124: {
                                                if (~var82 != -3) {
                                                   if (~var82 != -4) {
                                                      break label1124;
                                                   }

                                                   class563.method4193(var126, var123, var124, arg1.field8311[var118], var125, var122, class712.field10238, var121, arg1.field8332[var118], (byte)25, arg1.field8344[var118]);
                                                   var74 = class712.field10238[1];
                                                   var73 = class712.field10238[0];
                                                   class563.method4193(var126, var123, var124, arg1.field8311[var119], var125, var122, class712.field10238, var121, arg1.field8332[var119], (byte)25, arg1.field8344[var119]);
                                                   var76 = class712.field10238[1];
                                                   var75 = class712.field10238[0];
                                                   class563.method4193(var126, var123, var124, arg1.field8311[var120], var125, var122, class712.field10238, var121, arg1.field8332[var120], (byte)25, arg1.field8344[var120]);
                                                   var77 = class712.field10238[0];
                                                   var78 = class712.field10238[1];
                                                   if (~(1 & var125) != -1) {
                                                      if (!(-var74 + var78 > 0.5F)) {
                                                         if (var74 - var78 > 0.5F) {
                                                            ++var78;
                                                            var80 = 2;
                                                            if (var7) {
                                                               --var78;
                                                               var80 = 1;
                                                            }
                                                         }
                                                      } else {
                                                         --var78;
                                                         var80 = 1;
                                                      }

                                                      if (var76 - var74 > 0.5F) {
                                                         var79 = 1;
                                                         --var76;
                                                         if (!var7) {
                                                            break label1124;
                                                         }
                                                      }

                                                      if (!(var74 - var76 > 0.5F)) {
                                                         break label1124;
                                                      }

                                                      var79 = 2;
                                                      ++var76;
                                                      if (!var7) {
                                                         break label1124;
                                                      }

                                                      if (var77 - var73 > 0.5F) {
                                                         --var77;
                                                         var80 = 1;
                                                         if (var7 && var73 - var77 > 0.5F) {
                                                            ++var77;
                                                            var80 = 2;
                                                         }
                                                      } else if (var73 - var77 > 0.5F) {
                                                         ++var77;
                                                         var80 = 2;
                                                      }
                                                   } else if (var77 - var73 > 0.5F) {
                                                      --var77;
                                                      var80 = 1;
                                                      if (var7 && var73 - var77 > 0.5F) {
                                                         ++var77;
                                                         var80 = 2;
                                                      }
                                                   } else if (var73 - var77 > 0.5F) {
                                                      ++var77;
                                                      var80 = 2;
                                                   }

                                                   if (var75 - var73 > 0.5F) {
                                                      --var75;
                                                      var79 = 1;
                                                      if (!var7) {
                                                         break label1124;
                                                      }
                                                   }

                                                   if (!(-var75 + var73 > 0.5F)) {
                                                      break label1124;
                                                   }

                                                   var79 = 2;
                                                   ++var75;
                                                   if (!var7) {
                                                      break label1124;
                                                   }
                                                }

                                                var127 = (float)arg1.field8346[var69] / 256.0F;
                                                var128 = (float)arg1.field8309[var69] / 256.0F;
                                                var129 = arg1.field8344[var119] + -arg1.field8344[var118];
                                                var130 = arg1.field8311[var119] + -arg1.field8311[var118];
                                                var131 = arg1.field8332[var119] + -arg1.field8332[var118];
                                                var132 = arg1.field8344[var120] - arg1.field8344[var118];
                                                var133 = arg1.field8311[var120] + -arg1.field8311[var118];
                                                var134 = arg1.field8332[var120] + -arg1.field8332[var118];
                                                var135 = var130 * var134 - var131 * var133;
                                                var136 = var131 * var132 + -(var129 * var134);
                                                var137 = var129 * var133 - var130 * var132;
                                                var138 = 64.0F / (float)arg1.field8322[var69];
                                                var139 = 64.0F / (float)arg1.field8330[var69];
                                                var140 = 64.0F / (float)arg1.field8338[var69];
                                                var141 = (var124[2] * (float)var137 + var124[1] * (float)var136 + var124[0] * (float)var135) / var138;
                                                var142 = (var124[5] * (float)var137 + var124[4] * (float)var136 + var124[3] * (float)var135) / var139;
                                                var143 = (var124[8] * (float)var137 + var124[6] * (float)var135 + var124[7] * (float)var136) / var140;
                                                var81 = class343.method2727(var141, var142, (byte)118, var143);
                                                class4.method20(var127, arg1.field8311[var118], class712.field10238, var123, var124, var122, (byte)-106, var125, var81, arg1.field8332[var118], var128, var121, var126, arg1.field8344[var118]);
                                                var74 = class712.field10238[1];
                                                var73 = class712.field10238[0];
                                                class4.method20(var127, arg1.field8311[var119], class712.field10238, var123, var124, var122, (byte)-71, var125, var81, arg1.field8332[var119], var128, var121, var126, arg1.field8344[var119]);
                                                var76 = class712.field10238[1];
                                                var75 = class712.field10238[0];
                                                class4.method20(var127, arg1.field8311[var120], class712.field10238, var123, var124, var122, (byte)-73, var125, var81, arg1.field8332[var120], var128, var121, var126, arg1.field8344[var120]);
                                                var77 = class712.field10238[0];
                                                var78 = class712.field10238[1];
                                                if (var7) {
                                                   var144 = (float)arg1.field8338[var69] / 1024.0F;
                                                   class23.method306(var126, var121, var124, -16589, var123, var122, arg1.field8332[var118], var125, arg1.field8311[var118], arg1.field8344[var118], class712.field10238, var144);
                                                   var73 = class712.field10238[0];
                                                   var74 = class712.field10238[1];
                                                   class23.method306(var126, var121, var124, -16589, var123, var122, arg1.field8332[var119], var125, arg1.field8311[var119], arg1.field8344[var119], class712.field10238, var144);
                                                   var75 = class712.field10238[0];
                                                   var76 = class712.field10238[1];
                                                   class23.method306(var126, var121, var124, -16589, var123, var122, arg1.field8332[var120], var125, arg1.field8311[var120], arg1.field8344[var120], class712.field10238, var144);
                                                   var78 = class712.field10238[1];
                                                   var77 = class712.field10238[0];
                                                   var145 = var144 / 2.0F;
                                                   if (~(var125 & 1) == -1) {
                                                      if (var145 < -var73 + var77) {
                                                         var80 = 1;
                                                         var77 -= var144;
                                                         if (var7 && -var77 + var73 > var145) {
                                                            var77 += var144;
                                                            var80 = 2;
                                                         }
                                                      } else if (-var77 + var73 > var145) {
                                                         var77 += var144;
                                                         var80 = 2;
                                                      }

                                                      if (!(-var73 + var75 > var145)) {
                                                         if (-var75 + var73 > var145) {
                                                            var79 = 2;
                                                            var75 += var144;
                                                            if (var7) {
                                                               var79 = 1;
                                                               var75 -= var144;
                                                               if (var7) {
                                                                  if (var78 - var74 > var145) {
                                                                     var80 = 1;
                                                                     var78 -= var144;
                                                                     if (var7 && var145 < -var78 + var74) {
                                                                        var80 = 2;
                                                                        var78 += var144;
                                                                     }
                                                                  } else if (var145 < -var78 + var74) {
                                                                     var80 = 2;
                                                                     var78 += var144;
                                                                  }

                                                                  if (!(var145 < -var74 + var76)) {
                                                                     if (var145 < -var76 + var74) {
                                                                        var76 += var144;
                                                                        var79 = 2;
                                                                        if (var7) {
                                                                           var79 = 1;
                                                                           var76 -= var144;
                                                                        }
                                                                     }
                                                                  } else {
                                                                     var79 = 1;
                                                                     var76 -= var144;
                                                                  }
                                                               }
                                                            }
                                                         }
                                                      } else {
                                                         var79 = 1;
                                                         var75 -= var144;
                                                         if (var7) {
                                                            if (var78 - var74 > var145) {
                                                               var80 = 1;
                                                               var78 -= var144;
                                                               if (var7 && var145 < -var78 + var74) {
                                                                  var80 = 2;
                                                                  var78 += var144;
                                                               }
                                                            } else if (var145 < -var78 + var74) {
                                                               var80 = 2;
                                                               var78 += var144;
                                                            }

                                                            if (!(var145 < -var74 + var76)) {
                                                               if (var145 < -var76 + var74) {
                                                                  var76 += var144;
                                                                  var79 = 2;
                                                                  if (var7) {
                                                                     var79 = 1;
                                                                     var76 -= var144;
                                                                  }
                                                               }
                                                            } else {
                                                               var79 = 1;
                                                               var76 -= var144;
                                                            }
                                                         }
                                                      }
                                                   } else {
                                                      if (var78 - var74 > var145) {
                                                         var80 = 1;
                                                         var78 -= var144;
                                                         if (var7 && var145 < -var78 + var74) {
                                                            var80 = 2;
                                                            var78 += var144;
                                                         }
                                                      } else if (var145 < -var78 + var74) {
                                                         var80 = 2;
                                                         var78 += var144;
                                                      }

                                                      if (!(var145 < -var74 + var76)) {
                                                         if (var145 < -var76 + var74) {
                                                            var76 += var144;
                                                            var79 = 2;
                                                            if (var7) {
                                                               var79 = 1;
                                                               var76 -= var144;
                                                            }
                                                         }
                                                      } else {
                                                         var79 = 1;
                                                         var76 -= var144;
                                                      }
                                                   }
                                                }
                                             }
                                          } else {
                                             var144 = (float)arg1.field8338[var69] / 1024.0F;
                                             class23.method306(var126, var121, var124, -16589, var123, var122, arg1.field8332[var118], var125, arg1.field8311[var118], arg1.field8344[var118], class712.field10238, var144);
                                             var73 = class712.field10238[0];
                                             var74 = class712.field10238[1];
                                             class23.method306(var126, var121, var124, -16589, var123, var122, arg1.field8332[var119], var125, arg1.field8311[var119], arg1.field8344[var119], class712.field10238, var144);
                                             var75 = class712.field10238[0];
                                             var76 = class712.field10238[1];
                                             class23.method306(var126, var121, var124, -16589, var123, var122, arg1.field8332[var120], var125, arg1.field8311[var120], arg1.field8344[var120], class712.field10238, var144);
                                             var78 = class712.field10238[1];
                                             var77 = class712.field10238[0];
                                             var145 = var144 / 2.0F;
                                             if (~(var125 & 1) == -1) {
                                                if (var145 < -var73 + var77) {
                                                   var80 = 1;
                                                   var77 -= var144;
                                                   if (var7 && -var77 + var73 > var145) {
                                                      var77 += var144;
                                                      var80 = 2;
                                                   }
                                                } else if (-var77 + var73 > var145) {
                                                   var77 += var144;
                                                   var80 = 2;
                                                }

                                                if (!(-var73 + var75 > var145)) {
                                                   if (-var75 + var73 > var145) {
                                                      var79 = 2;
                                                      var75 += var144;
                                                      if (var7) {
                                                         var79 = 1;
                                                         var75 -= var144;
                                                         if (var7) {
                                                            if (var78 - var74 > var145) {
                                                               var80 = 1;
                                                               var78 -= var144;
                                                               if (var7 && var145 < -var78 + var74) {
                                                                  var80 = 2;
                                                                  var78 += var144;
                                                               }
                                                            } else if (var145 < -var78 + var74) {
                                                               var80 = 2;
                                                               var78 += var144;
                                                            }

                                                            if (!(var145 < -var74 + var76)) {
                                                               if (var145 < -var76 + var74) {
                                                                  var76 += var144;
                                                                  var79 = 2;
                                                                  if (var7) {
                                                                     var79 = 1;
                                                                     var76 -= var144;
                                                                  }
                                                               }
                                                            } else {
                                                               var79 = 1;
                                                               var76 -= var144;
                                                            }
                                                         }
                                                      }
                                                   }
                                                } else {
                                                   var79 = 1;
                                                   var75 -= var144;
                                                   if (var7) {
                                                      if (var78 - var74 > var145) {
                                                         var80 = 1;
                                                         var78 -= var144;
                                                         if (var7 && var145 < -var78 + var74) {
                                                            var80 = 2;
                                                            var78 += var144;
                                                         }
                                                      } else if (var145 < -var78 + var74) {
                                                         var80 = 2;
                                                         var78 += var144;
                                                      }

                                                      if (!(var145 < -var74 + var76)) {
                                                         if (var145 < -var76 + var74) {
                                                            var76 += var144;
                                                            var79 = 2;
                                                            if (var7) {
                                                               var79 = 1;
                                                               var76 -= var144;
                                                            }
                                                         }
                                                      } else {
                                                         var79 = 1;
                                                         var76 -= var144;
                                                      }
                                                   }
                                                }
                                             } else {
                                                if (var78 - var74 > var145) {
                                                   var80 = 1;
                                                   var78 -= var144;
                                                   if (var7 && var145 < -var78 + var74) {
                                                      var80 = 2;
                                                      var78 += var144;
                                                   }
                                                } else if (var145 < -var78 + var74) {
                                                   var80 = 2;
                                                   var78 += var144;
                                                }

                                                if (!(var145 < -var74 + var76)) {
                                                   if (var145 < -var76 + var74) {
                                                      var76 += var144;
                                                      var79 = 2;
                                                      if (var7) {
                                                         var79 = 1;
                                                         var76 -= var144;
                                                      }
                                                   }
                                                } else {
                                                   var79 = 1;
                                                   var76 -= var144;
                                                }
                                             }
                                          }
                                       }
                                    }

                                    if (arg1.field8318 == null) {
                                       var146 = 0;
                                       if (var7) {
                                          var146 = arg1.field8318[var67];
                                       }
                                    } else {
                                       var146 = arg1.field8318[var67];
                                    }

                                    if (~var146 != -1) {
                                       if (var146 == 1) {
                                          var147 = var44[var67];
                                          var148 = ((long)(var68 << 8) + (long)(var81 << 24) - -((long)var70) << 32) + (long)((var147.field9198 + 256 << 12) + (~var147.field9191 < -1 ? 1024 : 2048) + (var147.field9192 + 256 << 22) + (var69 << 2));
                                          this.field1107[var46] = this.method787(var147.field9192, (byte)-111, var148, var147.field9198, arg1.field8342[var67], var74, arg1, 0, var147.field9191, var73);
                                          this.field1084[var46] = this.method787(var147.field9192, (byte)42, (long)var79 + var148, var147.field9198, arg1.field8341[var67], var76, arg1, 0, var147.field9191, var75);
                                          this.field1079[var46] = this.method787(var147.field9192, (byte)-94, (long)var80 + var148, var147.field9198, arg1.field8323[var67], var78, arg1, 0, var147.field9191, var77);
                                          if (var7) {
                                             var150 = ((long)(var81 << 24) - -((long)(var68 << 8)) + (long)var70 << 32) + (long)(var69 << 2);
                                             var152 = arg1.field8342[var67];
                                             var153 = arg1.field8341[var67];
                                             var154 = arg1.field8323[var67];
                                             var155 = var32[var152];
                                             this.field1107[var46] = this.method787(var155.field10677, (byte)60, var150, var155.field10678, var152, var74, arg1, var155.field10680, var155.field10675, var73);
                                             var156 = var32[var153];
                                             this.field1084[var46] = this.method787(var156.field10677, (byte)108, (long)var79 + var150, var156.field10678, var153, var76, arg1, var156.field10680, var156.field10675, var75);
                                             var157 = var32[var154];
                                             this.field1079[var46] = this.method787(var157.field10677, (byte)-66, (long)var80 + var150, var157.field10678, var154, var78, arg1, var157.field10680, var157.field10675, var77);
                                             if (arg1.field8353 != null) {
                                                this.field1155[var46] = arg1.field8353[var67];
                                             }

                                             if (arg1.field8335 != null) {
                                                this.field1117[var46] = arg1.field8335[var67];
                                             }

                                             this.field1106[var46] = arg1.field8317[var67];
                                             this.field1074[var46] = var71;
                                             ++var46;
                                          } else {
                                             if (arg1.field8353 != null) {
                                                this.field1155[var46] = arg1.field8353[var67];
                                             }

                                             if (arg1.field8335 != null) {
                                                this.field1117[var46] = arg1.field8335[var67];
                                             }

                                             this.field1106[var46] = arg1.field8317[var67];
                                             this.field1074[var46] = var71;
                                             ++var46;
                                          }
                                       } else {
                                          if (arg1.field8353 != null) {
                                             this.field1155[var46] = arg1.field8353[var67];
                                          }

                                          if (arg1.field8335 != null) {
                                             this.field1117[var46] = arg1.field8335[var67];
                                          }

                                          this.field1106[var46] = arg1.field8317[var67];
                                          this.field1074[var46] = var71;
                                          ++var46;
                                       }
                                    } else {
                                       var150 = ((long)(var81 << 24) - -((long)(var68 << 8)) + (long)var70 << 32) + (long)(var69 << 2);
                                       var152 = arg1.field8342[var67];
                                       var153 = arg1.field8341[var67];
                                       var154 = arg1.field8323[var67];
                                       var155 = var32[var152];
                                       this.field1107[var46] = this.method787(var155.field10677, (byte)60, var150, var155.field10678, var152, var74, arg1, var155.field10680, var155.field10675, var73);
                                       var156 = var32[var153];
                                       this.field1084[var46] = this.method787(var156.field10677, (byte)108, (long)var79 + var150, var156.field10678, var153, var76, arg1, var156.field10680, var156.field10675, var75);
                                       var157 = var32[var154];
                                       this.field1079[var46] = this.method787(var157.field10677, (byte)-66, (long)var80 + var150, var157.field10678, var154, var78, arg1, var157.field10680, var157.field10675, var77);
                                       if (arg1.field8353 != null) {
                                          this.field1155[var46] = arg1.field8353[var67];
                                       }

                                       if (arg1.field8335 != null) {
                                          this.field1117[var46] = arg1.field8335[var67];
                                       }

                                       this.field1106[var46] = arg1.field8317[var67];
                                       this.field1074[var46] = var71;
                                       ++var46;
                                    }

                                    if (~this.field1066 >= ~var46) {
                                       var67 = 0;
                                       var68 = -10000;
                                       var158 = 0;
                                       if (!var7) {
                                          if (var7) {
                                             var159 = this.field1074[var158];
                                             if (var68 != var159) {
                                                ++var67;
                                                var68 = var159;
                                             }

                                             ++var158;
                                          }

                                          while(true) {
                                             if (~var158 <= ~this.field1077) {
                                                this.field1123 = new int[var67 + 1];
                                                var67 = 0;
                                                var68 = -10000;
                                                var170 = 0;
                                                if (!var7) {
                                                   if (var7) {
                                                      var160 = this.field1074[var170];
                                                      if (~var68 != ~var160) {
                                                         this.field1123[var67++] = var170;
                                                         var68 = var160;
                                                      }

                                                      ++var170;
                                                   }

                                                   while(true) {
                                                      if (this.field1077 <= var170) {
                                                         this.field1123[var67] = this.field1077;
                                                         class724.field10350 = null;
                                                         this.field1043 = class147.method1437(this.field1059, this.field1043, false);
                                                         this.field1095 = class147.method1437(this.field1059, this.field1095, false);
                                                         this.field1109 = class147.method1437(this.field1059, this.field1109, false);
                                                         this.field1052 = class284.method2377(43, this.field1052, this.field1059);
                                                         this.field1144 = class499.method3778(this.field1144, (byte)-50, this.field1059);
                                                         var173 = this;
                                                         if (!var7) {
                                                            this.field1101 = class499.method3778(this.field1101, (byte)-50, this.field1059);
                                                            if (arg1.field8329 != null && class570.method4223(-24229, arg2, this.field1129)) {
                                                               this.field1058 = arg1.method4333(false, (byte)29);
                                                            }

                                                            if (arg1.field8343 != null && class268.method2291(arg2, this.field1129, 82)) {
                                                               this.field1124 = arg1.method4336(0);
                                                            }

                                                            if (arg1.field8310 != null && class533.method3988(arg2, 77, this.field1129)) {
                                                               var161 = 0;
                                                               var162 = new int[256];
                                                               var163 = 0;
                                                               if (var7) {
                                                                  var164 = arg1.field8310[var9[var163]];
                                                                  if (~var164 <= -1) {
                                                                     var10002 = var162[var164]++;
                                                                     if (var164 > var161) {
                                                                        var161 = var164;
                                                                     }
                                                                  }

                                                                  ++var163;
                                                               }

                                                               while(true) {
                                                                  if (~this.field1066 >= ~var163) {
                                                                     this.field1035 = new int[var161 + 1][];
                                                                     var164 = 0;
                                                                     if (!var7) {
                                                                        if (var7) {
                                                                           this.field1035[var164] = new int[var162[var164]];
                                                                           var162[var164] = 0;
                                                                           ++var164;
                                                                        }

                                                                        while(true) {
                                                                           while(~var164 >= ~var161) {
                                                                              this.field1035[var164] = new int[var162[var164]];
                                                                              var162[var164] = 0;
                                                                              ++var164;
                                                                           }

                                                                           var165 = 0;
                                                                           if (!var7) {
                                                                              if (!var7 && ~var165 <= ~this.field1066) {
                                                                                 return;
                                                                              }

                                                                              do {
                                                                                 var166 = arg1.field8310[var9[var165]];
                                                                                 if (~var166 <= -1) {
                                                                                    this.field1035[var166][var162[var166]++] = var165;
                                                                                 }

                                                                                 ++var165;
                                                                              } while(~var165 > ~this.field1066);

                                                                              return;
                                                                           }

                                                                           ++var164;
                                                                        }
                                                                     }
                                                                  } else {
                                                                     var164 = arg1.field8310[var9[var163]];
                                                                  }

                                                                  if (~var164 <= -1) {
                                                                     var10002 = var162[var164]++;
                                                                     if (var164 > var161) {
                                                                        var161 = var164;
                                                                     }
                                                                  }

                                                                  ++var163;
                                                               }
                                                            }

                                                            return;
                                                         }
                                                      } else {
                                                         var173 = this;
                                                      }

                                                      var160 = var173.field1074[var170];
                                                      if (~var68 != ~var160) {
                                                         this.field1123[var67++] = var170;
                                                         var68 = var160;
                                                      }

                                                      ++var170;
                                                   }
                                                }
                                             } else {
                                                var170 = this.field1074[var158];
                                             }

                                             if (var68 != var170) {
                                                ++var67;
                                                var68 = var170;
                                             }

                                             ++var158;
                                          }
                                       }
                                    } else {
                                       var67 = var9[var46];
                                       var68 = 65535 & arg1.field8317[var67];
                                    }

                                    if (arg1.field8348 != null) {
                                       var69 = arg1.field8348[var67];
                                       if (var7) {
                                          var69 = -1;
                                       }
                                    } else {
                                       var69 = -1;
                                    }

                                    if (arg1.field8353 == null) {
                                       var70 = 0;
                                       if (var7) {
                                          var70 = 255 & arg1.field8353[var67];
                                       }
                                    } else {
                                       var70 = 255 & arg1.field8353[var67];
                                    }

                                    var71 = arg1.field8304 != null ? arg1.field8304[var67] : -1;
                                    if (var71 != -1 && ~(this.field1129 & 64) != -1) {
                                       var72 = var8.method2043(-66, var71 & 65535);
                                       if (var72.field5670) {
                                          var71 = -1;
                                       }
                                    }
                                 }
                              }
                           } else {
                              var10000 = this.field1038[var41];
                           }

                           var42 = var10000;
                           this.field1038[var41] = var40;
                           var40 += var42;
                           var32[var41] = new class752();
                           ++var41;
                        }
                     }
                  } else {
                     var171 = arg1;
                  }
               }
            }

            if (var10000 != 0) {
               var11 = var8.method2043(-73, arg1.field8304[var10] & 65535);
               if ((64 & this.field1129) != 0) {
                  if (!var11.field5670) {
                     if (var11.field5684) {
                        if (var7) {
                           var9[this.field1066++] = var10;
                           ++this.field1038[arg1.field8342[var10]];
                           ++this.field1038[arg1.field8341[var10]];
                           ++this.field1038[arg1.field8323[var10]];
                           ++var10;
                        } else {
                           ++var10;
                        }
                     } else {
                        var9[this.field1066++] = var10;
                        ++this.field1038[arg1.field8342[var10]];
                        ++this.field1038[arg1.field8341[var10]];
                        ++this.field1038[arg1.field8323[var10]];
                        ++var10;
                     }
                  } else {
                     var9[this.field1066++] = var10;
                     ++this.field1038[arg1.field8342[var10]];
                     ++this.field1038[arg1.field8341[var10]];
                     ++this.field1038[arg1.field8323[var10]];
                     ++var10;
                  }
               } else if (var11.field5684) {
                  if (var7) {
                     var9[this.field1066++] = var10;
                     ++this.field1038[arg1.field8342[var10]];
                     ++this.field1038[arg1.field8341[var10]];
                     ++this.field1038[arg1.field8323[var10]];
                     ++var10;
                  } else {
                     ++var10;
                  }
               } else {
                  var9[this.field1066++] = var10;
                  ++this.field1038[arg1.field8342[var10]];
                  ++this.field1038[arg1.field8341[var10]];
                  ++this.field1038[arg1.field8323[var10]];
                  ++var10;
               }
            } else {
               var9[this.field1066++] = var10;
               ++this.field1038[arg1.field8342[var10]];
               ++this.field1038[arg1.field8341[var10]];
               ++this.field1038[arg1.field8323[var10]];
               ++var10;
            }
         }
      } catch (RuntimeException var168) {
         throw class612.method4503(var168, field1160[47] + (arg0 != null ? field1160[4] : field1160[2]) + ',' + (arg1 != null ? field1160[4] : field1160[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method813(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 55);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method814(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 6;
            break;
         case 1:
            var10005 = 108;
            break;
         case 2:
            var10005 = 60;
            break;
         case 3:
            var10005 = 56;
            break;
         default:
            var10005 = 55;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
