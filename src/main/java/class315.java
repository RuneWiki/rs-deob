import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class315 extends class345 {
   @OriginalMember(
      owner = "client!mu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4538 = new String[]{method2447(method2446("h[\u0014\u000e\u0013")), method2447(method2446(">X\u0017E\u0000w\u0012JPC>X")), method2447(method2446("~\u0000\u0014iF")), method2447(method2446("3\u0005II\u0014vO")), method2447(method2446("t\u0005S\u0011Nc\u001aI\u001a")), method2447(method2446("}\u0000VL")), method2447(method2446("~\u0000\u0014hF")), method2447(method2446("~\u0000\u0014gF")), method2447(method2446("~\u0000\u0014dF")), method2447(method2446("~\u0000\u0014eF")), method2447(method2446("~\u0000\u0014cF")), method2447(method2446("~\u0000\u0014bF")), method2447(method2446("~\u0000\u0014aF")), method2447(method2446("~\u0000\u0014fF")), method2447(method2446("~\u0000\u0014jF"))};
   @OriginalMember(
      owner = "client!mu",
      name = "q",
      descriptor = "B"
   )
   public static byte field4522 = -6;
   @OriginalMember(
      owner = "client!mu",
      name = "i",
      descriptor = "Lgh;"
   )
   public static class572 field4530 = new class572(127, 1);
   @OriginalMember(
      owner = "client!mu",
      name = "m",
      descriptor = "I"
   )
   public static int field4534 = -1;
   @OriginalMember(
      owner = "client!mu",
      name = "k",
      descriptor = "Leb;"
   )
   public static class650 field4535 = new class650(9, -1);
   @OriginalMember(
      owner = "client!mu",
      name = "j",
      descriptor = "Llha;"
   )
   public static class649 field4537 = new class649();
   @OriginalMember(
      owner = "client!mu",
      name = "o",
      descriptor = "I"
   )
   public static int field4523;
   @OriginalMember(
      owner = "client!mu",
      name = "l",
      descriptor = "I"
   )
   public static int field4524;
   @OriginalMember(
      owner = "client!mu",
      name = "s",
      descriptor = "I"
   )
   public static int field4525;
   @OriginalMember(
      owner = "client!mu",
      name = "t",
      descriptor = "I"
   )
   public static int field4526;
   @OriginalMember(
      owner = "client!mu",
      name = "r",
      descriptor = "I"
   )
   public static int field4527;
   @OriginalMember(
      owner = "client!mu",
      name = "p",
      descriptor = "I"
   )
   public static int field4528;
   @OriginalMember(
      owner = "client!mu",
      name = "v",
      descriptor = "I"
   )
   public static int field4529;
   @OriginalMember(
      owner = "client!mu",
      name = "u",
      descriptor = "I"
   )
   public static int field4532;
   @OriginalMember(
      owner = "client!mu",
      name = "x",
      descriptor = "I"
   )
   public static int field4533;
   @OriginalMember(
      owner = "client!mu",
      name = "w",
      descriptor = "I"
   )
   public static int field4536;
   @OriginalMember(
      owner = "client!mu",
      name = "n",
      descriptor = "Ljaa;"
   )
   public static class639 field4531;

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(B)Z"
   )
   public static final boolean method2440(byte arg0) {
      boolean var1 = client.field4564;

      try {
         ++field4528;
         boolean var2 = true;
         if (class773.field11327 == null) {
            label67: {
               if (!class392.field5782.method1335((byte)115, class60.field1145)) {
                  var2 = false;
                  if (!var1) {
                     break label67;
                  }
               }

               class773.field11327 = class94.method919(class392.field5782, class60.field1145);
            }
         }

         if (arg0 < 126) {
            method2443((class200)null, (byte)27, 5);
         }

         if (class52.field1080 == null) {
            label60: {
               if (!class392.field5782.method1335((byte)115, class220.field3313)) {
                  var2 = false;
                  if (!var1) {
                     break label60;
                  }
               }

               class52.field1080 = class94.method919(class392.field5782, class220.field3313);
            }
         }

         if (class710.field10320 == null) {
            label54: {
               if (class392.field5782.method1335((byte)115, class424.field6169)) {
                  class710.field10320 = class94.method919(class392.field5782, class424.field6169);
                  if (!var1) {
                     break label54;
                  }
               }

               var2 = false;
            }
         }

         if (class444.field6468 == null) {
            label48: {
               if (!class329.field4702.method1335((byte)115, class152.field2428)) {
                  var2 = false;
                  if (!var1) {
                     break label48;
                  }
               }

               class444.field6468 = class85.method843(class329.field4702, class152.field2428, (byte)-89);
            }
         }

         if (class441.field6444 == null) {
            if (class392.field5782.method1335((byte)115, class152.field2428)) {
               class441.field6444 = class94.method907(class392.field5782, class152.field2428);
               if (!var1) {
                  return var2;
               }
            }

            var2 = false;
         }

         return var2;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4538[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "<init>",
      descriptor = "(Lob;)V"
   )
   public class315(class768 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method53(boolean arg0) {
      try {
         if (arg0) {
            field4536 = 121;
         }

         ++field4529;
         return 0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4538[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "b",
      descriptor = "(IB)V"
   )
   public static final void method2441(int arg0, byte arg1) {
      try {
         class179 var2 = class734.field10556;
         synchronized(class734.field10556) {
            class734.field10556.method1579(-38, arg0);
         }

         ++field4525;
         class179 var3 = class641.field9350;
         synchronized(class641.field9350) {
            class641.field9350.method1579(123, arg0);
            if (arg1 < 10) {
               method2444(57);
            }

         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field4538[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "<init>",
      descriptor = "(ILob;)V"
   )
   public class315(int arg0, class768 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method54(int arg0, byte arg1) {
      try {
         ++field4533;
         super.field4913 = arg0;
         if (arg1 < 99) {
            method2441(-21, (byte)-87);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4538[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(FIIF[BFIFLiha;IIBFI)V"
   )
   public static final void method2442(float param0, int param1, int param2, float param3, byte[] param4, float param5, int param6, float param7, class32 param8, int param9, int param10, byte param11, float param12, int param13) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(Lkk;BI)V"
   )
   public static final void method2443(class200 arg0, byte arg1, int arg2) {
      try {
         class60.field1142 = false;
         ++field4524;
         class477.field6954 = 0;
         class424.method3216((byte)-51, arg0);
         class17.method126(arg0, -180160504);
         if (arg1 != 65) {
            method2444(58);
         }

         if (class60.field1142) {
            System.out.println(field4538[1]);
         }

         if (~arg0.field6907 != ~arg2) {
            throw new RuntimeException(field4538[4] + arg0.field6907 + field4538[3] + arg2);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4538[2] + (arg0 != null ? field4538[0] : field4538[5]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method2444(int arg0) {
      try {
         field4535 = null;
         field4530 = null;
         if (arg0 == 12055) {
            field4531 = null;
            field4537 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field4538[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method51(int arg0) {
      try {
         if (arg0 == 0) {
            if (~super.field4913 > -1 || super.field4913 > 4) {
               super.field4913 = this.method53(false);
            }

            ++field4532;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4538[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "b",
      descriptor = "(Z)I"
   )
   public final int method2445(boolean arg0) {
      try {
         if (arg0) {
            field4522 = 72;
         }

         ++field4523;
         return super.field4913;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4538[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "a",
      descriptor = "(BI)I"
   )
   public final int method52(byte arg0, int arg1) {
      try {
         ++field4527;
         if (arg0 >= -45) {
            field4522 = 55;
         }

         return 1;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4538[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2446(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 110);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2447(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 19;
            break;
         case 1:
            var10005 = 117;
            break;
         case 2:
            var10005 = 58;
            break;
         case 3:
            var10005 = 32;
            break;
         default:
            var10005 = 110;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
