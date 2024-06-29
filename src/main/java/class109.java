import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public class class109 extends class345 {
   @OriginalMember(
      owner = "client!eda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1792 = new String[]{method1047(method1046("ceE&n.")), method1047(method1046("ceE&k.")), method1047(method1046("ceE&b.")), method1047(method1046("ceE&m.")), method1047(method1046("ceE&h.")), method1047(method1046("ceE&i.")), method1047(method1046("htHd")), method1047(method1046("}/\n&W")), method1047(method1046("ceE&o.")), method1047(method1046("ceE&l."))};
   @OriginalMember(
      owner = "client!eda",
      name = "l",
      descriptor = "I"
   )
   public static int field1783;
   @OriginalMember(
      owner = "client!eda",
      name = "o",
      descriptor = "I"
   )
   public static int field1784;
   @OriginalMember(
      owner = "client!eda",
      name = "m",
      descriptor = "I"
   )
   public static int field1785;
   @OriginalMember(
      owner = "client!eda",
      name = "i",
      descriptor = "I"
   )
   public static int field1786;
   @OriginalMember(
      owner = "client!eda",
      name = "n",
      descriptor = "I"
   )
   public static int field1788;
   @OriginalMember(
      owner = "client!eda",
      name = "p",
      descriptor = "I"
   )
   public static int field1789;
   @OriginalMember(
      owner = "client!eda",
      name = "q",
      descriptor = "I"
   )
   public static int field1790;
   @OriginalMember(
      owner = "client!eda",
      name = "k",
      descriptor = "I"
   )
   public static int field1791;
   @OriginalMember(
      owner = "client!eda",
      name = "j",
      descriptor = "Ljava/lang/String;"
   )
   public static String field1787;

   @OriginalMember(
      owner = "client!eda",
      name = "a",
      descriptor = "(II[BBII)V"
   )
   public static final void method1042(int arg0, int arg1, byte[] arg2, byte arg3, int arg4, int arg5) {
      boolean var6 = client.field4564;

      try {
         int var7 = -76 / ((arg3 - -72) / 49);
         ++field1791;
         if (arg0 < arg5) {
            arg4 += arg0;
            arg1 = -arg0 + arg5 >> 2;
            int var10;
            if (var6) {
               var10 = arg4 + 1;
               arg2[arg4] = 1;
               int var11 = var10 + 1;
               arg2[var10] = 1;
               int var12 = var11 + 1;
               arg2[var11] = 1;
               arg4 = var12 + 1;
               arg2[var12] = 1;
            }

            while(true) {
               while(true) {
                  --arg1;
                  if (arg1 < 0) {
                     arg1 = 3 & -arg0 + arg5;
                     if (!var6) {
                        if (var6) {
                           arg2[arg4++] = 1;
                        }

                        while(true) {
                           --arg1;
                           if (~arg1 > -1) {
                              return;
                           }

                           arg2[arg4++] = 1;
                        }
                     }

                     arg2[arg4++] = 1;
                  } else {
                     var10 = arg4 + 1;
                     arg2[arg4] = 1;
                     arg2[var10++] = 1;
                     arg2[var10++] = 1;
                     arg4 = var10 + 1;
                     arg2[var10] = 1;
                  }
               }
            }
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field1792[8] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1792[7] : field1792[6]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eda",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method51(int arg0) {
      try {
         if (arg0 != 0) {
            method1045(-59);
         }

         ++field1786;
         if (~super.field4913 > -1 || super.field4913 > 4) {
            super.field4913 = this.method53(false);
         }

      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1792[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eda",
      name = "b",
      descriptor = "(Z)I"
   )
   public final int method1043(boolean arg0) {
      try {
         if (arg0) {
            field1783 = 56;
         }

         ++field1784;
         return super.field4913;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1792[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eda",
      name = "<init>",
      descriptor = "(ILob;)V"
   )
   public class109(int arg0, class768 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!eda",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method54(int arg0, byte arg1) {
      try {
         ++field1788;
         if (arg1 >= 99) {
            super.field4913 = arg0;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field1792[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eda",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method1044(int arg0, int arg1, int arg2) {
      try {
         if (arg1 <= 91) {
            method1045(-97);
         }

         ++field1785;
         return ~(arg0 & 32) != -1;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field1792[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eda",
      name = "a",
      descriptor = "(BI)I"
   )
   public final int method52(byte arg0, int arg1) {
      try {
         if (arg0 >= -45) {
            return -77;
         } else {
            ++field1790;
            return 1;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field1792[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eda",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method1045(int arg0) {
      try {
         if (arg0 != -13722) {
            method1045(-75);
         }

         field1787 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field1792[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eda",
      name = "<init>",
      descriptor = "(Lob;)V"
   )
   public class109(class768 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!eda",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method53(boolean arg0) {
      try {
         ++field1789;
         if (arg0) {
            this.method53(false);
         }

         return 3;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1792[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1046(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 42);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1047(char[] arg0) {
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
            var10005 = 1;
            break;
         case 2:
            var10005 = 36;
            break;
         case 3:
            var10005 = 8;
            break;
         default:
            var10005 = 42;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
