import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class13 extends class377 {
   @OriginalMember(
      owner = "client!kv",
      name = "n",
      descriptor = "I"
   )
   public int field189;
   @OriginalMember(
      owner = "client!kv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field197 = new String[]{method113(method112("F\u001aBS\u0004")), method113(method112("C\u0019\u0000x")), method113(method112("F\u001aB(EC\u0005\u0018*\u0004")), method113(method112("VBB:Q")), method113(method112("F\u001aBR\u0004")), method113(method112("F\u001aBU\u0004")), method113(method112("F\u001aB\\\u0004"))};
   @OriginalMember(
      owner = "client!kv",
      name = "k",
      descriptor = "Lhn;"
   )
   public static class357 field193 = new class357(method113(method112("z8;]|")), method113(method112("B\n\n}OH")), method113(method112("r\u001b\u0005d")), 3);
   @OriginalMember(
      owner = "client!kv",
      name = "q",
      descriptor = "Z"
   )
   public static boolean field194 = false;
   @OriginalMember(
      owner = "client!kv",
      name = "r",
      descriptor = "[B"
   )
   public static byte[] field196 = new byte[2048];
   @OriginalMember(
      owner = "client!kv",
      name = "o",
      descriptor = "I"
   )
   public static int field190;
   @OriginalMember(
      owner = "client!kv",
      name = "p",
      descriptor = "I"
   )
   public static int field191;
   @OriginalMember(
      owner = "client!kv",
      name = "m",
      descriptor = "I"
   )
   public static int field192;
   @OriginalMember(
      owner = "client!kv",
      name = "l",
      descriptor = "Lsa;"
   )
   public static class39 field195;

   @OriginalMember(
      owner = "client!kv",
      name = "d",
      descriptor = "(I)V"
   )
   public static final void method107(int arg0) {
      if (arg0 == 0) {
         if (class734.field10434 == 2) {
            class468.field6786[0].method975(class164.field2483[0]);
            class468.field6786[1].method975(class164.field2483[1]);
         } else if (class734.field10434 == 3) {
            class468.field6786[0].method975(class164.field2483[0]);
            class468.field6786[1].method975(class164.field2483[1]);
            class468.field6786[2].method975(class164.field2483[2]);
         } else {
            class468.field6786[0].method975(class164.field2483[0]);
            class468.field6786[1].method975(class164.field2483[1]);
            class468.field6786[2].method975(class164.field2483[2]);
            class468.field6786[3].method975(class164.field2483[3]);
         }
      } else if (arg0 == 1) {
         if (class734.field10434 == 2) {
            class468.field6786[0].method975(class164.field2483[2]);
         } else if (class734.field10434 == 3) {
            class468.field6786[0].method975(class164.field2483[3]);
            class468.field6786[1].method975(class164.field2483[4]);
         } else {
            class468.field6786[0].method975(class164.field2483[4]);
            class468.field6786[1].method975(class164.field2483[5]);
            class468.field6786[2].method975(class164.field2483[6]);
         }
      } else {
         if (arg0 == 2) {
            if (class734.field10434 == 2) {
               class468.field6786[0].method975(class164.field2483[3]);
               return;
            }

            if (class734.field10434 == 3) {
               class468.field6786[0].method975(class164.field2483[5]);
               return;
            }

            class468.field6786[0].method975(class164.field2483[7]);
         }

      }
   }

   @OriginalMember(
      owner = "client!kv",
      name = "a",
      descriptor = "(B)Ldi;"
   )
   public final class577 method108(byte arg0) {
      try {
         ++field190;
         if (arg0 >= -70) {
            field193 = null;
         }

         return class776.field11331;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field197[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kv",
      name = "<init>",
      descriptor = "(ILeu;Lmj;III)V"
   )
   public class13(int arg0, class634 arg1, class730 arg2, int arg3, int arg4, int arg5) {
      super(arg0, arg1, arg2, arg3, arg4);

      try {
         this.field189 = arg5;
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field197[2] + arg0 + ',' + (arg1 != null ? field197[3] : field197[1]) + ',' + (arg2 != null ? field197[3] : field197[1]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kv",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method109(int arg0) {
      boolean var1 = client.field10022;

      try {
         if (arg0 > 67) {
            ++field192;
            int var2 = 0;
            if (var1 || ~class644.field9070.length < ~var2) {
               do {
                  int var3 = 0;
                  if (var1 || var3 < class644.field9070[0].length) {
                     do {
                        int var4 = 0;
                        if (var1) {
                           class644.field9070[var2][var3][var4] = 0;
                           ++var4;
                        }

                        while(true) {
                           while(var4 < class644.field9070[0][0].length) {
                              class644.field9070[var2][var3][var4] = 0;
                              ++var4;
                           }

                           if (!var1) {
                              ++var3;
                              break;
                           }

                           ++var4;
                        }
                     } while(var3 < class644.field9070[0].length);
                  }

                  ++var2;
               } while(~class644.field9070.length < ~var2);

            }
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field197[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kv",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method110(int arg0) {
      try {
         if (arg0 >= 61) {
            field193 = null;
            field195 = null;
            field196 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field197[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kv",
      name = "b",
      descriptor = "(B)Lie;"
   )
   public static final class639 method111(byte arg0) {
      try {
         ++field191;
         if (arg0 != 114) {
            method110(-99);
         }

         return class616.field8759.length > class111.field1731 ? class616.field8759[class111.field1731++] : null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field197[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method112(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 44);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method113(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 45;
            break;
         case 1:
            var10005 = 108;
            break;
         case 2:
            var10005 = 108;
            break;
         case 3:
            var10005 = 20;
            break;
         default:
            var10005 = 44;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
