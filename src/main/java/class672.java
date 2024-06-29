import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class672 {
   @OriginalMember(
      owner = "client!lc",
      name = "j",
      descriptor = "I"
   )
   public int field9854 = -1;
   @OriginalMember(
      owner = "client!lc",
      name = "l",
      descriptor = "I"
   )
   public int field9861 = -1;
   @OriginalMember(
      owner = "client!lc",
      name = "b",
      descriptor = "I"
   )
   public int field9860 = -1;
   @OriginalMember(
      owner = "client!lc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9869 = new String[]{method4920(method4919("2Ux\u001b\u0014")), method4920(method4919("%\u0018xtA")), method4920(method4919("0C:6")), method4920(method4919("2Ux\u0018\u0014")), method4920(method4919("s\u001bhz")), method4920(method4919("2Ux\u001e\u0014")), method4920(method4919("\n\u0004vw\u001c")), method4920(method4919("~\u001bv")), method4920(method4919("2Ux\u0019\u0014"))};
   @OriginalMember(
      owner = "client!lc",
      name = "e",
      descriptor = "F"
   )
   public static float field9857;
   @OriginalMember(
      owner = "client!lc",
      name = "k",
      descriptor = "I"
   )
   public int field9855;
   @OriginalMember(
      owner = "client!lc",
      name = "f",
      descriptor = "I"
   )
   public int field9856;
   @OriginalMember(
      owner = "client!lc",
      name = "m",
      descriptor = "I"
   )
   public int field9858;
   @OriginalMember(
      owner = "client!lc",
      name = "i",
      descriptor = "I"
   )
   public int field9859;
   @OriginalMember(
      owner = "client!lc",
      name = "a",
      descriptor = "I"
   )
   public static int field9862;
   @OriginalMember(
      owner = "client!lc",
      name = "h",
      descriptor = "I"
   )
   public int field9863;
   @OriginalMember(
      owner = "client!lc",
      name = "g",
      descriptor = "I"
   )
   public static int field9864;
   @OriginalMember(
      owner = "client!lc",
      name = "o",
      descriptor = "I"
   )
   public static int field9865;
   @OriginalMember(
      owner = "client!lc",
      name = "n",
      descriptor = "I"
   )
   public int field9866;
   @OriginalMember(
      owner = "client!lc",
      name = "c",
      descriptor = "I"
   )
   public static int field9867;
   @OriginalMember(
      owner = "client!lc",
      name = "d",
      descriptor = "I"
   )
   public static int field9868;

   @OriginalMember(
      owner = "client!lc",
      name = "a",
      descriptor = "(Ljava/lang/String;BZZLjava/lang/String;)V"
   )
   public static final void method4915(String arg0, byte arg1, boolean arg2, boolean arg3, String arg4) {
      try {
         class386.field5693 = arg4;
         class596.field8594 = arg3;
         ++field9865;
         if (!arg3) {
            class733.field10535 = -1;
         }

         class741.field10672 = arg0;
         class255.field3621 = arg2;
         if (class596.field8594 || !class386.field5693.equals("") && !class741.field10672.equals("")) {
            class232.field3401 = false;
            if (~class743.field10700 != -2) {
               class418.field6110 = 0;
               class530.field7720 = -1;
            }

            int var5 = -24 % ((-64 - arg1) / 48);
            class359.method2826((byte)-118, -3);
            class241.field3483 = 1;
            class462.field6750 = 0;
            class6.field60 = 0;
         } else {
            class359.method2826((byte)-120, 3);
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field9869[3] + (arg0 != null ? field9869[1] : field9869[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field9869[1] : field9869[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lc",
      name = "a",
      descriptor = "(Lhw;B)V"
   )
   public static final void method4916(class141 arg0, byte arg1) {
      try {
         if (arg1 == 51) {
            ++field9862;
            class123.field1968 = arg0;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9869[0] + (arg0 != null ? field9869[1] : field9869[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lc",
      name = "a",
      descriptor = "(I)Z"
   )
   public static final boolean method4917(int arg0) {
      boolean var1 = client.field4564;

      try {
         ++field9867;

         try {
            if (arg0 != -1) {
               field9857 = 0.29088938F;
            }

            return class596.method4407((byte)-72);
         } catch (IOException var6) {
            class116.method1110((byte)-16);
            return true;
         } catch (Exception var7) {
            int var10000;
            int var10001;
            label60: {
               String var3;
               label59: {
                  var3 = field9869[6] + (class459.field6728 == null ? -1 : class459.field6728.method4241(103)) + "," + (class640.field9321 == null ? -1 : class640.field9321.method4241(124)) + "," + (class572.field8267 == null ? -1 : class572.field8267.method4241(arg0 ^ -126)) + field9869[7] + class650.field9423 + "," + (class304.field4398.field11313[0] + class347.field4939) + "," + (class753.field10887 - -class304.field4398.field11322[0]) + field9869[7];
                  int var4 = 0;
                  if (!var1) {
                     if (~var4 <= ~class650.field9423) {
                        break label59;
                     }

                     var10000 = var4;
                     var10001 = 50;
                     if (var1) {
                        break label60;
                     }

                     if (var4 >= 50) {
                        break label59;
                     }
                  }

                  do {
                     var3 = var3 + class346.field4923.field6889[var4] + ",";
                     ++var4;
                     if (~var4 <= ~class650.field9423) {
                        break;
                     }

                     var10000 = var4;
                     var10001 = 50;
                     if (var1) {
                        break label60;
                     }
                  } while(var4 < 50);
               }

               class17.method127((byte)-99, var7, var3);
               var10000 = 0;
               var10001 = ~arg0;
            }

            class533.method3991((boolean)var10000, var10001);
            return true;
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field9869[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lc",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method4918(boolean arg0) {
      boolean var1 = client.field4564;

      try {
         ++field9864;
         if (!arg0) {
            field9868 = 38;
         }

         if (class718.field10373 <= 0) {
            class304.field4406 = "";
         } else {
            int var2 = 0;
            int var3 = 0;
            int var10000;
            if (var1) {
               if (~class745.field10758[var3].indexOf(field9869[4]) != 0) {
                  var10000 = ~class718.field10373;
                  ++var2;
                  if (var10000 == ~var2) {
                     class304.field4406 = class745.field10758[var3].substring(2 + class745.field10758[var3].indexOf(">"));
                     return;
                  }
               }

               ++var3;
            }

            while(true) {
               while(var3 < class745.field10758.length) {
                  if (~class745.field10758[var3].indexOf(field9869[4]) != 0) {
                     var10000 = ~class718.field10373;
                     ++var2;
                     if (var10000 == ~var2) {
                        class304.field4406 = class745.field10758[var3].substring(2 + class745.field10758[var3].indexOf(">"));
                        return;
                     }
                  }

                  ++var3;
               }

               if (!var1) {
                  return;
               }

               ++var3;
            }
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field9869[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lc",
      name = "<init>",
      descriptor = "(Loha;)V"
   )
   public class672(class771 arg0) {
   }

   @OriginalMember(
      owner = "client!lc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4919(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 60);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4920(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 94;
            break;
         case 1:
            var10005 = 54;
            break;
         case 2:
            var10005 = 86;
            break;
         case 3:
            var10005 = 90;
            break;
         default:
            var10005 = 60;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
