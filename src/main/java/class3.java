import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public class class3 {
   @OriginalMember(
      owner = "client!haa",
      name = "b",
      descriptor = "I"
   )
   public int field31;
   @OriginalMember(
      owner = "client!haa",
      name = "a",
      descriptor = "I"
   )
   public int field34;
   @OriginalMember(
      owner = "client!haa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field35 = new String[]{method17(method16("9TWu\u0005y")), method17(method16("9TWu{8[_/yy")), method17(method16("9TWu\u0006y")), method17(method16("?@Z7")), method17(method16("*\u001b\u0018u:")), method17(method16("9TWu\u0004y")), method17(method16("9TWu\u0003y"))};
   @OriginalMember(
      owner = "client!haa",
      name = "f",
      descriptor = "I"
   )
   public static int field23 = 0;
   @OriginalMember(
      owner = "client!haa",
      name = "l",
      descriptor = "I"
   )
   public static int field22;
   @OriginalMember(
      owner = "client!haa",
      name = "j",
      descriptor = "I"
   )
   public static int field24;
   @OriginalMember(
      owner = "client!haa",
      name = "c",
      descriptor = "I"
   )
   public int field25;
   @OriginalMember(
      owner = "client!haa",
      name = "m",
      descriptor = "I"
   )
   public static int field26;
   @OriginalMember(
      owner = "client!haa",
      name = "g",
      descriptor = "I"
   )
   public int field27;
   @OriginalMember(
      owner = "client!haa",
      name = "e",
      descriptor = "I"
   )
   public int field30;
   @OriginalMember(
      owner = "client!haa",
      name = "k",
      descriptor = "I"
   )
   public static int field32;
   @OriginalMember(
      owner = "client!haa",
      name = "h",
      descriptor = "I"
   )
   public static int field33;
   @OriginalMember(
      owner = "client!haa",
      name = "i",
      descriptor = "Lhaa;"
   )
   public class3 field29;
   @OriginalMember(
      owner = "client!haa",
      name = "d",
      descriptor = "Lgga;"
   )
   public class502 field28;

   @OriginalMember(
      owner = "client!haa",
      name = "a",
      descriptor = "(B)Lrf;"
   )
   public final class34 method12(byte arg0) {
      try {
         ++field32;
         return arg0 != -93 ? null : class777.method5614(arg0 ^ -51, this.field34);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field35[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!haa",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method13(int arg0, int arg1, int arg2) {
      boolean var3 = client.field10022;

      try {
         ++field26;
         if (!class678.field9669) {
            return false;
         } else {
            if (arg2 < 3) {
               method13(94, -13, 23);
            }

            int var4 = arg0 >> 16;
            int var5 = 65535 & arg0;
            if (class315.field4719[var4] != null && class315.field4719[var4][var5] != null) {
               int var10000;
               class91 var6;
               class272 var7;
               label194: {
                  var6 = class315.field4719[var4][var5];
                  if (arg1 != -1 || ~var6.field1403 != -1) {
                     var7 = (class272)class594.field8377.method2245((byte)-94);
                     if (var3) {
                        if (~var7.field4163 == ~arg1 && ~var6.field1356 == ~var7.field4151 && (var7.field4159 == 8 || var7.field4159 == 1003 || var7.field4159 == 46 || ~var7.field4159 == -20 || var7.field4159 == 6)) {
                           return true;
                        }

                        var7 = (class272)class594.field8377.method2239((byte)117);
                     }

                     while(true) {
                        while(var7 != null) {
                           if (~var7.field4163 == ~arg1 && ~var6.field1356 == ~var7.field4151 && (var7.field4159 == 8 || var7.field4159 == 1003 || var7.field4159 == 46 || ~var7.field4159 == -20 || var7.field4159 == 6)) {
                              return true;
                           }

                           var7 = (class272)class594.field8377.method2239((byte)117);
                        }

                        if (!var3) {
                           if (!var3) {
                              var10000 = 0;
                              if (!var3) {
                                 return false;
                              }
                              break label194;
                           }
                           break;
                        }

                        var7 = (class272)class594.field8377.method2239((byte)117);
                     }
                  }

                  var7 = (class272)class594.field8377.method2245((byte)-94);
                  if (var3) {
                     var10000 = var7.field4159;
                  } else if (var7 == null) {
                     var10000 = 0;
                     if (!var3) {
                        return false;
                     }
                  } else {
                     var10000 = var7.field4159;
                  }
               }

               while(true) {
                  if (var10000 != 8 && var7.field4159 != 1003 && ~var7.field4159 != -47 && var7.field4159 != 19 && var7.field4159 != 6) {
                     var7 = (class272)class594.field8377.method2239((byte)113);
                  } else {
                     class91 var8 = class460.method3554(-83, var7.field4151);
                     if (var3) {
                        if (~var6.field1356 == ~var8.field1356) {
                           return true;
                        }

                        var8 = class363.method2853(var8, (byte)12);
                     }

                     while(var8 != null) {
                        if (~var6.field1356 == ~var8.field1356) {
                           return true;
                        }

                        var8 = class363.method2853(var8, (byte)12);
                     }

                     var7 = (class272)class594.field8377.method2239((byte)113);
                  }

                  if (var7 == null) {
                     var10000 = 0;
                     if (!var3) {
                        return false;
                     }
                  } else {
                     var10000 = var7.field4159;
                  }
               }
            } else {
               return false;
            }
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field35[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!haa",
      name = "a",
      descriptor = "(II)Lhaa;"
   )
   public final class3 method14(int arg0, int arg1) {
      try {
         ++field33;
         if (arg0 < 74) {
            this.field27 = 47;
         }

         return new class3(this.field34, arg1);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field35[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!haa",
      name = "a",
      descriptor = "(BZLjava/lang/String;Ljava/lang/String;I)V"
   )
   public static final void method15(byte arg0, boolean arg1, String arg2, String arg3, int arg4) {
      try {
         if (arg0 < 15) {
            field23 = 29;
         }

         ++field24;
         class414.method3237(arg1, -1, arg2, true, true, arg3, arg4);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field35[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field35[4] : field35[3]) + ',' + (arg3 != null ? field35[4] : field35[3]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!haa",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class3(int arg0, int arg1) {
      try {
         this.field31 = arg1;
         this.field34 = arg0;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field35[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!haa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method16(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 71);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!haa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method17(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 81;
            break;
         case 1:
            var10005 = 53;
            break;
         case 2:
            var10005 = 54;
            break;
         case 3:
            var10005 = 91;
            break;
         default:
            var10005 = 71;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
