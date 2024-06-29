import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class493 extends class775 {
   @OriginalMember(
      owner = "client!oq",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7458 = new String[]{method3817(method3816("\u001d#\u0010a")), method3817(method3816("\u001c'RI6")), method3817(method3816("\bxR#c")), method3817(method3816("\u001c'RL6")), method3817(method3816("\u001c'RO6")), method3817(method3816("\u001c'RN6"))};
   @OriginalMember(
      owner = "client!oq",
      name = "u",
      descriptor = "I"
   )
   public static int field7449 = -1;
   @OriginalMember(
      owner = "client!oq",
      name = "t",
      descriptor = "I"
   )
   public static int field7455 = 0;
   @OriginalMember(
      owner = "client!oq",
      name = "B",
      descriptor = "I"
   )
   public static int field7450;
   @OriginalMember(
      owner = "client!oq",
      name = "A",
      descriptor = "I"
   )
   public static int field7451;
   @OriginalMember(
      owner = "client!oq",
      name = "y",
      descriptor = "I"
   )
   public static int field7453;
   @OriginalMember(
      owner = "client!oq",
      name = "x",
      descriptor = "I"
   )
   public static int field7454;
   @OriginalMember(
      owner = "client!oq",
      name = "z",
      descriptor = "I"
   )
   public static int field7456;
   @OriginalMember(
      owner = "client!oq",
      name = "v",
      descriptor = "I"
   )
   private int field7457;
   @OriginalMember(
      owner = "client!oq",
      name = "w",
      descriptor = "J"
   )
   private long field7452;

   @OriginalMember(
      owner = "client!oq",
      name = "a",
      descriptor = "(Lc;IB[II[I)Ltga;",
      line = 4
   )
   public static final class639 method3814(class652 arg0, int arg1, byte arg2, int[] arg3, int arg4, int[] arg5) {
      boolean var6 = client.field1786;

      try {
         ++field7450;
         byte[] var7 = new byte[arg1 * arg4];
         int var8 = 0;
         int var9;
         int var10;
         if (var6) {
            var9 = arg1 * var8 + arg5[var8];
            var10 = 0;
            if (var6) {
               var7[var9++] = -1;
               ++var10;
            }
         } else {
            if (var8 >= arg4) {
               var9 = -32 / ((-74 - arg2) / 39);
               if (!var6) {
                  return new class639(arg0, arg1, arg4, var7);
               }
            } else {
               var9 = arg1 * var8 + arg5[var8];
            }

            var10 = 0;
            if (var6) {
               var7[var9++] = -1;
               ++var10;
            }
         }

         while(true) {
            while(~arg3[var8] < ~var10) {
               var7[var9++] = -1;
               ++var10;
            }

            if (!var6) {
               ++var8;
               if (var8 >= arg4) {
                  var9 = -32 / ((-74 - arg2) / 39);
                  if (!var6) {
                     return new class639(arg0, arg1, arg4, var7);
                  }
               } else {
                  var9 = arg1 * var8 + arg5[var8];
               }

               var10 = 0;
               if (var6) {
                  var7[var9++] = -1;
                  ++var10;
               }
            } else {
               ++var10;
            }
         }
      } catch (RuntimeException var12) {
         throw class482.method3757(var12, field7458[1] + (arg0 != null ? field7458[2] : field7458[0]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field7458[2] : field7458[0]) + ',' + arg4 + ',' + (arg5 != null ? field7458[2] : field7458[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!oq",
      name = "a",
      descriptor = "(Z)V",
      line = 35
   )
   public static final void method3815(boolean arg0) {
      try {
         if (!arg0) {
            ++field7456;
            class561.field8338.method3149(-119);
            class563.field8365.method3149(-121);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field7458[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oq",
      name = "a",
      descriptor = "(Lica;B)V",
      line = 52
   )
   public final void method1189(class354 arg0, byte arg1) {
      try {
         int var3 = 77 / ((-84 - arg1) / 34);
         this.field7457 = arg0.method2894(99);
         ++field7451;
         this.field7452 = arg0.method2898(32109);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field7458[5] + (arg0 != null ? field7458[2] : field7458[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oq",
      name = "a",
      descriptor = "(Lsda;I)V",
      line = 64
   )
   public final void method1190(class223 arg0, int arg1) {
      try {
         int var3 = 124 % ((arg1 - -23) / 45);
         arg0.method1927(this.field7452, this.field7457, 9555);
         ++field7454;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field7458[3] + (arg0 != null ? field7458[2] : field7458[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3816(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 30);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3817(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 115;
            break;
         case 1:
            var10005 = 86;
            break;
         case 2:
            var10005 = 124;
            break;
         case 3:
            var10005 = 13;
            break;
         default:
            var10005 = 30;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
