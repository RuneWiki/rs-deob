import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class182 extends class191 {
   @OriginalMember(
      owner = "client!lt",
      name = "m",
      descriptor = "I"
   )
   private int field2676 = -1;
   @OriginalMember(
      owner = "client!lt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2681 = new String[]{method1650(method1649(" I\u0010%`")), method1650(method1649(" I\u0010'`")), method1650(method1649(" I\u0010$`")), method1650(method1649("\"HR\r")), method1650(method1649("7\u0013\u0010O5")), method1650(method1649(" I\u0010\"`")), method1650(method1649(" I\u0010#`"))};
   @OriginalMember(
      owner = "client!lt",
      name = "l",
      descriptor = "[[I"
   )
   public static int[][] field2674 = new int[128][128];
   @OriginalMember(
      owner = "client!lt",
      name = "o",
      descriptor = "[I"
   )
   public static int[] field2678 = new int[4096];
   @OriginalMember(
      owner = "client!lt",
      name = "n",
      descriptor = "I"
   )
   public static int field2675;
   @OriginalMember(
      owner = "client!lt",
      name = "q",
      descriptor = "I"
   )
   public static int field2677;
   @OriginalMember(
      owner = "client!lt",
      name = "r",
      descriptor = "I"
   )
   public static int field2679;
   @OriginalMember(
      owner = "client!lt",
      name = "p",
      descriptor = "I"
   )
   public static int field2680;

   @OriginalMember(
      owner = "client!lt",
      name = "a",
      descriptor = "(BLea;)V"
   )
   public final void method342(byte arg0, class456 arg1) {
      try {
         ++field2680;
         if (arg0 > -106) {
            field2674 = null;
         }

         arg1.method3521(this.field2676, false);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2681[6] + arg0 + ',' + (arg1 != null ? field2681[4] : field2681[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lt",
      name = "a",
      descriptor = "(Lcu;I)V"
   )
   public final void method346(class65 arg0, int arg1) {
      try {
         this.field2676 = arg0.method685(-2);
         ++field2677;
         if (arg1 >= -97) {
            field2674 = null;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2681[5] + (arg0 != null ? field2681[4] : field2681[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lt",
      name = "a",
      descriptor = "(IB)V"
   )
   public static final void method1646(int arg0, byte arg1) {
      try {
         if (arg1 != -118) {
            method1648((byte)-70);
         }

         ++field2675;
         class111 var2 = class796.method5734(2, (long)arg0, (byte)-126);
         var2.method1083(-67);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2681[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lt",
      name = "a",
      descriptor = "(ZI)V"
   )
   public static final void method1647(boolean arg0, int arg1) {
      try {
         label42: {
            if (!arg0 || class651.field9204 == null) {
               class589.field8273 = -1;
               if (!client.field10022) {
                  break label42;
               }
            }

            class589.field8273 = class651.field9204.field827;
         }

         ++field2679;
         class651.field9204 = null;
         class418.field6115 = null;
         class778.field11352 = null;
         class484.field6932 = 0;
         class651.method4765();
         class651.field9217.method2237(104);
         class108.field1682 = null;
         class644.field9063 = -1;
         class768.field11027 = null;
         class168.field2518 = null;
         class84.field1304 = null;
         class259.field3963 = null;
         class365.field5414 = null;
         class348.field5114 = -1;
         class227.field3527 = null;
         if (arg1 == -18228) {
            class274.field4173 = null;
            class651.field9211 = null;
            class598.field8417 = null;
            if (class651.field9200 != null) {
               class651.field9200.method1753(-7404);
               class651.field9200.method1754(true, 64, 128);
            }

            if (class651.field9202 != null) {
               class651.field9202.method2364(64, 64, (byte)65);
            }

            if (class651.field9206 != null) {
               class651.field9206.method3851(64, arg1 ^ 25573);
            }

            class225.field3194.method2715(64, 111);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2681[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lt",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1648(byte arg0) {
      try {
         if (arg0 != 61) {
            field2674 = null;
         }

         field2678 = null;
         field2674 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2681[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1649(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 72);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1650(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 76;
            break;
         case 1:
            var10005 = 61;
            break;
         case 2:
            var10005 = 62;
            break;
         case 3:
            var10005 = 97;
            break;
         default:
            var10005 = 72;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
