import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public class class262 {
   @OriginalMember(
      owner = "client!kw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3623 = new String[]{method2005(method2004("\u0002B1-\u0010XG8'KX\u001f")), method2005(method2004("E\u000fpoP")), method2005(method2004("UVp\u0000\u0005")), method2005(method2004("PT2-")), method2005(method2004("\u0002B1-\u0010]B=\"N]\u001f")), method2005(method2004("\u001e\t")), method2005(method2004("\u001e\f`a\u0011]N2|KXG8'K\u0000")), method2005(method2004("\u001erda")), method2005(method2004("UVp\u0002\u0005")), method2005(method2004("UVp\u0005\u0005")), method2005(method2004("UVp\u0003\u0005")), method2005(method2004("UVp\u0004\u0005"))};
   @OriginalMember(
      owner = "client!kw",
      name = "e",
      descriptor = "I"
   )
   public static int field3618;
   @OriginalMember(
      owner = "client!kw",
      name = "c",
      descriptor = "I"
   )
   public static int field3619;
   @OriginalMember(
      owner = "client!kw",
      name = "d",
      descriptor = "I"
   )
   public static int field3620;
   @OriginalMember(
      owner = "client!kw",
      name = "a",
      descriptor = "I"
   )
   public static int field3621;
   @OriginalMember(
      owner = "client!kw",
      name = "b",
      descriptor = "I"
   )
   public static int field3622;

   @OriginalMember(
      owner = "client!kw",
      name = "a",
      descriptor = "(BLlia;)I"
   )
   public static final int method1999(byte arg0, class506 arg1) {
      boolean var2 = client.field4360;

      try {
         if (arg0 != -89) {
            method2001(-116, (byte)72, 109, (class475)null);
         }

         ++field3618;
         class745 var3 = arg1.field7333;
         if (var3.field10912 != null) {
            var3 = var3.method5405(class21.field248, 13);
            if (var3 == null) {
               return -1;
            }
         }

         int var4 = var3.field10905;
         class425 var5 = arg1.method2119(false);
         if (~arg1.field3879 == 0 || arg1.field3791) {
            var4 = var3.field10876;
            if (!var2) {
               return var4;
            }
         }

         if (~arg1.field3879 == ~var5.field6066 || arg1.field3879 == var5.field6095 || ~arg1.field3879 == ~var5.field6093 || ~arg1.field3879 == ~var5.field6060) {
            var4 = var3.field10906;
            if (!var2) {
               return var4;
            }
         }

         if (arg1.field3879 == var5.field6069 || arg1.field3879 == var5.field6059 || arg1.field3879 == var5.field6097 || ~arg1.field3879 == ~var5.field6074) {
            var4 = var3.field10897;
         }

         return var4;
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field3623[10] + arg0 + ',' + (arg1 != null ? field3623[1] : field3623[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kw",
      name = "a",
      descriptor = "(II)[B"
   )
   public static final synchronized byte[] method2000(int arg0, int arg1) {
      try {
         ++field3619;
         if (arg0 == 100 && ~class468.field6730 < -1) {
            byte[] var2 = class615.field9039[--class468.field6730];
            class615.field9039[class468.field6730] = null;
            return var2;
         } else if (~arg0 == -5001 && ~class378.field5456 < -1) {
            byte[] var3 = class521.field7498[--class378.field5456];
            class521.field7498[class378.field5456] = null;
            return var3;
         } else if (arg1 != 2449) {
            return null;
         } else if (arg0 == 30000 && class603.field8875 > 0) {
            byte[] var4 = class318.field4335[--class603.field8875];
            class318.field4335[class603.field8875] = null;
            return var4;
         } else {
            if (class661.field9632 != null) {
               for(int var5 = 0; var5 < class661.field9625.length; ++var5) {
                  if (~class661.field9625[var5] == ~arg0 && ~class536.field7671[var5] < -1) {
                     byte[] var6 = class661.field9632[var5][--class536.field7671[var5]];
                     class661.field9632[var5][class536.field7671[var5]] = null;
                     return var6;
                  }
               }
            }

            return new byte[arg0];
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field3623[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kw",
      name = "a",
      descriptor = "(IBILqd;)Lgs;"
   )
   public static final class49 method2001(int arg0, byte arg1, int arg2, class475 arg3) {
      try {
         ++field3620;
         int var4 = arg3.field6831 | arg0 << 10;
         if (arg1 < 117) {
            return null;
         } else {
            class49 var5 = (class49)class328.field4478.method5069((byte)-98, (long)var4 << 16);
            if (var5 != null) {
               return var5;
            } else {
               byte[] var6 = class595.field8745.method2061((byte)-79, class595.field8745.method2047(var4, -3));
               if (var6 != null) {
                  if (var6.length <= 1) {
                     return null;
                  } else {
                     class49 var7;
                     try {
                        var7 = class377.method2856(var6, (byte)102);
                     } catch (Exception var20) {
                        throw new RuntimeException(var20.getMessage() + field3623[7] + var4);
                     }

                     var7.field645 = arg3;
                     class328.field4478.method5068((long)var4 << 16, var7, -116);
                     return var7;
                  }
               } else {
                  int var9 = arg3.field6831 | arg2 - -65536 << 10;
                  class49 var10 = (class49)class328.field4478.method5069((byte)-86, (long)var9 << 16);
                  if (var10 != null) {
                     return var10;
                  } else {
                     byte[] var11 = class595.field8745.method2061((byte)-105, class595.field8745.method2047(var9, -3));
                     if (var11 != null) {
                        if (var11.length <= 1) {
                           return null;
                        } else {
                           class49 var12;
                           try {
                              var12 = class377.method2856(var11, (byte)106);
                           } catch (Exception var21) {
                              throw new RuntimeException(var21.getMessage() + field3623[7] + var9);
                           }

                           var12.field645 = arg3;
                           class328.field4478.method5068((long)var9 << 16, var12, -105);
                           return var12;
                        }
                     } else {
                        int var14 = arg3.field6831 | 67107840;
                        class49 var15 = (class49)class328.field4478.method5069((byte)-117, (long)var14 << 16);
                        if (var15 != null) {
                           return var15;
                        } else {
                           byte[] var16 = class595.field8745.method2061((byte)103, class595.field8745.method2047(var14, -3));
                           if (var16 != null) {
                              if (var16.length <= 1) {
                                 return null;
                              } else {
                                 class49 var17;
                                 try {
                                    var17 = class377.method2856(var16, (byte)127);
                                 } catch (Exception var22) {
                                    throw new RuntimeException(var22.getMessage() + field3623[7] + var14);
                                 }

                                 var17.field645 = arg3;
                                 class328.field4478.method5068((long)var14 << 16, var17, -84);
                                 return var17;
                              }
                           } else {
                              return null;
                           }
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var23) {
         throw class237.method1823(var23, field3623[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field3623[1] : field3623[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kw",
      name = "a",
      descriptor = "(B[B)V"
   )
   public static final synchronized void method2002(byte param0, byte[] param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!kw",
      name = "a",
      descriptor = "(ZLrv;I)V"
   )
   public static final void method2003(boolean param0, class121 param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!kw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2004(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 45);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2005(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 62;
            break;
         case 1:
            var10005 = 33;
            break;
         case 2:
            var10005 = 94;
            break;
         case 3:
            var10005 = 65;
            break;
         default:
            var10005 = 45;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
