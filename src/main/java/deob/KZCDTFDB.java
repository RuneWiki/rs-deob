package deob;

@ObfuscatedName("KZCDTFDB")
public class KZCDTFDB {

	@ObfuscatedName("KZCDTFDB.i")
	public int field1053 = 0;

	@ObfuscatedName("KZCDTFDB.j")
	public int field1054 = 0;

	@ObfuscatedName("KZCDTFDB.k")
	public int field1055;

	@ObfuscatedName("KZCDTFDB.l")
	public int field1056;

	@ObfuscatedName("KZCDTFDB.m")
	public int[][] field1057;

	public KZCDTFDB(int arg0, int arg1) {
		field1055 = arg1;
		field1056 = arg0;
		field1057 = new int[field1055][field1056];
		method407();
	}

	@ObfuscatedName("KZCDTFDB.a()V")
	public void method407() {
		for (int var1 = 0; var1 < field1055; var1++) {
			for (int var2 = 0; var2 < field1056; var2++) {
				if (var1 == 0 || var2 == 0 || field1055 - 1 == var1 || field1056 - 1 == var2) {
					field1057[var1][var2] = 0xFFFFFF;
				} else {
					field1057[var1][var2] = 0x1000000;
				}
			}
		}
	}

	@ObfuscatedName("KZCDTFDB.a(ZIIIII)V")
	public void method408(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
		arg1 -= field1053;
		arg2 -= field1054;
		if (arg4 == 0) {
			if (arg3 == 0) {
				method411(arg1, arg2, 128);
				method411(arg1 - 1, arg2, 8);
			}

			if (arg3 == 1) {
				method411(arg1, arg2, 2);
				method411(arg1, arg2 + 1, 32);
			}

			if (arg3 == 2) {
				method411(arg1, arg2, 8);
				method411(arg1 + 1, arg2, 128);
			}

			if (arg3 == 3) {
				method411(arg1, arg2, 32);
				method411(arg1, arg2 - 1, 2);
			}
		}

		if (arg4 == 1 || arg4 == 3) {
			if (arg3 == 0) {
				method411(arg1, arg2, 1);
				method411(arg1 - 1, arg2 + 1, 16);
			}

			if (arg3 == 1) {
				method411(arg1, arg2, 4);
				method411(arg1 + 1, arg2 + 1, 64);
			}

			if (arg3 == 2) {
				method411(arg1, arg2, 16);
				method411(arg1 + 1, arg2 - 1, 1);
			}

			if (arg3 == 3) {
				method411(arg1, arg2, 64);
				method411(arg1 - 1, arg2 - 1, 4);
			}
		}

		if (arg4 == 2) {
			if (arg3 == 0) {
				method411(arg1, arg2, 130);
				method411(arg1 - 1, arg2, 8);
				method411(arg1, arg2 + 1, 32);
			}

			if (arg3 == 1) {
				method411(arg1, arg2, 10);
				method411(arg1, arg2 + 1, 32);
				method411(arg1 + 1, arg2, 128);
			}

			if (arg3 == 2) {
				method411(arg1, arg2, 40);
				method411(arg1 + 1, arg2, 128);
				method411(arg1, arg2 - 1, 2);
			}

			if (arg3 == 3) {
				method411(arg1, arg2, 160);
				method411(arg1, arg2 - 1, 2);
				method411(arg1 - 1, arg2, 8);
			}
		}

		if (arg0) {
			if (arg4 == 0) {
				if (arg3 == 0) {
					method411(arg1, arg2, 0x10000);
					method411(arg1 - 1, arg2, 4096);
				}

				if (arg3 == 1) {
					method411(arg1, arg2, 1024);
					method411(arg1, arg2 + 1, 16384);
				}

				if (arg3 == 2) {
					method411(arg1, arg2, 4096);
					method411(arg1 + 1, arg2, 0x10000);
				}

				if (arg3 == 3) {
					method411(arg1, arg2, 16384);
					method411(arg1, arg2 - 1, 1024);
				}
			}

			if (arg4 == 1 || arg4 == 3) {
				if (arg3 == 0) {
					method411(arg1, arg2, 512);
					method411(arg1 - 1, arg2 + 1, 8192);
				}

				if (arg3 == 1) {
					method411(arg1, arg2, 2048);
					method411(arg1 + 1, arg2 + 1, 32768);
				}

				if (arg3 == 2) {
					method411(arg1, arg2, 8192);
					method411(arg1 + 1, arg2 - 1, 512);
				}

				if (arg3 == 3) {
					method411(arg1, arg2, 32768);
					method411(arg1 - 1, arg2 - 1, 2048);
				}
			}

			if (arg4 == 2) {
				if (arg3 == 0) {
					method411(arg1, arg2, 66560);
					method411(arg1 - 1, arg2, 4096);
					method411(arg1, arg2 + 1, 16384);
				}

				if (arg3 == 1) {
					method411(arg1, arg2, 5120);
					method411(arg1, arg2 + 1, 16384);
					method411(arg1 + 1, arg2, 0x10000);
				}

				if (arg3 == 2) {
					method411(arg1, arg2, 20480);
					method411(arg1 + 1, arg2, 0x10000);
					method411(arg1, arg2 - 1, 1024);
				}

				if (arg3 == 3) {
					method411(arg1, arg2, 81920);
					method411(arg1, arg2 - 1, 1024);
					method411(arg1 - 1, arg2, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("KZCDTFDB.a(IIIIIIZ)V")
	public void method409(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		int var7 = 256;
		if (arg5) {
			var7 += 0x20000;
		}

		arg4 -= field1053;
		arg2 -= field1054;

		if (arg3 == 1 || arg3 == 3) {
			int var8 = arg0;
			arg0 = arg1;
			arg1 = var8;
		}

		for (int var9 = arg4; var9 < arg0 + arg4; var9++) {
			if (var9 >= 0 && var9 < field1055) {
				for (int var10 = arg2; var10 < arg1 + arg2; var10++) {
					if (var10 >= 0 && var10 < field1056) {
						method411(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("KZCDTFDB.a(III)V")
	public void method410(int arg0, int arg1) {
		arg0 -= field1053;
		arg1 -= field1054;
		field1057[arg0][arg1] |= 0x200000;
	}

	@ObfuscatedName("KZCDTFDB.b(III)V")
	public void method411(int arg0, int arg1, int arg2) {
		field1057[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("KZCDTFDB.a(ZIIIZI)V")
	public void method412(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
		arg3 -= field1053;
		arg1 -= field1054;
		if (arg4 == 0) {
			if (arg2 == 0) {
				method414(arg1, 128, arg3);
				method414(arg1, 8, arg3 - 1);
			}

			if (arg2 == 1) {
				method414(arg1, 2, arg3);
				method414(arg1 + 1, 32, arg3);
			}

			if (arg2 == 2) {
				method414(arg1, 8, arg3);
				method414(arg1, 128, arg3 + 1);
			}

			if (arg2 == 3) {
				method414(arg1, 32, arg3);
				method414(arg1 - 1, 2, arg3);
			}
		}

		if (arg4 == 1 || arg4 == 3) {
			if (arg2 == 0) {
				method414(arg1, 1, arg3);
				method414(arg1 + 1, 16, arg3 - 1);
			}

			if (arg2 == 1) {
				method414(arg1, 4, arg3);
				method414(arg1 + 1, 64, arg3 + 1);
			}

			if (arg2 == 2) {
				method414(arg1, 16, arg3);
				method414(arg1 - 1, 1, arg3 + 1);
			}

			if (arg2 == 3) {
				method414(arg1, 64, arg3);
				method414(arg1 - 1, 4, arg3 - 1);
			}
		}

		if (arg4 == 2) {
			if (arg2 == 0) {
				method414(arg1, 130, arg3);
				method414(arg1, 8, arg3 - 1);
				method414(arg1 + 1, 32, arg3);
			}

			if (arg2 == 1) {
				method414(arg1, 10, arg3);
				method414(arg1 + 1, 32, arg3);
				method414(arg1, 128, arg3 + 1);
			}

			if (arg2 == 2) {
				method414(arg1, 40, arg3);
				method414(arg1, 128, arg3 + 1);
				method414(arg1 - 1, 2, arg3);
			}

			if (arg2 == 3) {
				method414(arg1, 160, arg3);
				method414(arg1 - 1, 2, arg3);
				method414(arg1, 8, arg3 - 1);
			}
		}

		if (arg0) {
			if (arg4 == 0) {
				if (arg2 == 0) {
					method414(arg1, 0x10000, arg3);
					method414(arg1, 4096, arg3 - 1);
				}

				if (arg2 == 1) {
					method414(arg1, 1024, arg3);
					method414(arg1 + 1, 16384, arg3);
				}

				if (arg2 == 2) {
					method414(arg1, 4096, arg3);
					method414(arg1, 0x10000, arg3 + 1);
				}

				if (arg2 == 3) {
					method414(arg1, 16384, arg3);
					method414(arg1 - 1, 1024, arg3);
				}
			}

			if (arg4 == 1 || arg4 == 3) {
				if (arg2 == 0) {
					method414(arg1, 512, arg3);
					method414(arg1 + 1, 8192, arg3 - 1);
				}

				if (arg2 == 1) {
					method414(arg1, 2048, arg3);
					method414(arg1 + 1, 32768, arg3 + 1);
				}

				if (arg2 == 2) {
					method414(arg1, 8192, arg3);
					method414(arg1 - 1, 512, arg3 + 1);
				}

				if (arg2 == 3) {
					method414(arg1, 32768, arg3);
					method414(arg1 - 1, 2048, arg3 - 1);
				}
			}

			if (arg4 == 2) {
				if (arg2 == 0) {
					method414(arg1, 66560, arg3);
					method414(arg1, 4096, arg3 - 1);
					method414(arg1 + 1, 16384, arg3);
				}

				if (arg2 == 1) {
					method414(arg1, 5120, arg3);
					method414(arg1 + 1, 16384, arg3);
					method414(arg1, 0x10000, arg3 + 1);
				}

				if (arg2 == 2) {
					method414(arg1, 20480, arg3);
					method414(arg1, 0x10000, arg3 + 1);
					method414(arg1 - 1, 1024, arg3);
				}

				if (arg2 == 3) {
					method414(arg1, 81920, arg3);
					method414(arg1 - 1, 1024, arg3);
					method414(arg1, 4096, arg3 - 1);
					return;
				}
			}
		}
	}

	@ObfuscatedName("KZCDTFDB.a(ZIIIIII)V")
	public void method413(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg0) {
			var7 += 0x20000;
		}

		arg1 -= field1053;
		arg2 -= field1054;

		if (arg3 == 1 || arg3 == 3) {
			int var8 = arg5;
			arg5 = arg4;
			arg4 = var8;
		}

		for (int var9 = arg1; var9 < arg1 + arg5; var9++) {
			if (var9 >= 0 && var9 < field1055) {
				for (int var10 = arg2; var10 < arg2 + arg4; var10++) {
					if (var10 >= 0 && var10 < field1056) {
						method414(var10, var7, var9);
					}
				}
			}
		}
	}

	@ObfuscatedName("KZCDTFDB.a(IIII)V")
	public void method414(int arg0, int arg1, int arg2) {
		field1057[arg2][arg0] &= 0xFFFFFF - arg1;
	}

	@ObfuscatedName("KZCDTFDB.a(IIZ)V")
	public void method415(int arg0, int arg1) {
		arg0 -= field1053;
		arg1 -= field1054;
		field1057[arg0][arg1] &= 0xDFFFFF;
	}

	@ObfuscatedName("KZCDTFDB.a(BIIIIII)Z")
	public boolean method416(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg2 == arg3 && arg4 == arg5) {
			return true;
		}

		arg3 -= field1053;
		arg5 -= field1054;
		arg2 -= field1053;
		arg4 -= field1054;
		if (arg0 == 0) {
			if (arg1 == 0) {
				if (arg2 - 1 == arg3 && arg4 == arg5) {
					return true;
				}

				if (arg2 == arg3 && arg4 + 1 == arg5 && (field1057[arg3][arg5] & 0x1280120) == 0) {
					return true;
				}

				if (arg2 == arg3 && arg4 - 1 == arg5 && (field1057[arg3][arg5] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (arg2 == arg3 && arg4 + 1 == arg5) {
					return true;
				}

				if (arg2 - 1 == arg3 && arg4 == arg5 && (field1057[arg3][arg5] & 0x1280108) == 0) {
					return true;
				}

				if (arg2 + 1 == arg3 && arg4 == arg5 && (field1057[arg3][arg5] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (arg2 + 1 == arg3 && arg4 == arg5) {
					return true;
				}

				if (arg2 == arg3 && arg4 + 1 == arg5 && (field1057[arg3][arg5] & 0x1280120) == 0) {
					return true;
				}

				if (arg2 == arg3 && arg4 - 1 == arg5 && (field1057[arg3][arg5] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 3) {
				if (arg2 == arg3 && arg4 - 1 == arg5) {
					return true;
				}

				if (arg2 - 1 == arg3 && arg4 == arg5 && (field1057[arg3][arg5] & 0x1280108) == 0) {
					return true;
				}

				if (arg2 + 1 == arg3 && arg4 == arg5 && (field1057[arg3][arg5] & 0x1280180) == 0) {
					return true;
				}
			}
		}

		if (arg0 == 2) {
			if (arg1 == 0) {
				if (arg2 - 1 == arg3 && arg4 == arg5) {
					return true;
				}

				if (arg2 == arg3 && arg4 + 1 == arg5) {
					return true;
				}

				if (arg2 + 1 == arg3 && arg4 == arg5 && (field1057[arg3][arg5] & 0x1280180) == 0) {
					return true;
				}

				if (arg2 == arg3 && arg4 - 1 == arg5 && (field1057[arg3][arg5] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (arg2 - 1 == arg3 && arg4 == arg5 && (field1057[arg3][arg5] & 0x1280108) == 0) {
					return true;
				}

				if (arg2 == arg3 && arg4 + 1 == arg5) {
					return true;
				}

				if (arg2 + 1 == arg3 && arg4 == arg5) {
					return true;
				}

				if (arg2 == arg3 && arg4 - 1 == arg5 && (field1057[arg3][arg5] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (arg2 - 1 == arg3 && arg4 == arg5 && (field1057[arg3][arg5] & 0x1280108) == 0) {
					return true;
				}

				if (arg2 == arg3 && arg4 + 1 == arg5 && (field1057[arg3][arg5] & 0x1280120) == 0) {
					return true;
				}

				if (arg2 + 1 == arg3 && arg4 == arg5) {
					return true;
				}

				if (arg2 == arg3 && arg4 - 1 == arg5) {
					return true;
				}
			} else if (arg1 == 3) {
				if (arg2 - 1 == arg3 && arg4 == arg5) {
					return true;
				}

				if (arg2 == arg3 && arg4 + 1 == arg5 && (field1057[arg3][arg5] & 0x1280120) == 0) {
					return true;
				}

				if (arg2 + 1 == arg3 && arg4 == arg5 && (field1057[arg3][arg5] & 0x1280180) == 0) {
					return true;
				}

				if (arg2 == arg3 && arg4 - 1 == arg5) {
					return true;
				}
			}
		}

		if (arg0 == 9) {
			if (arg2 == arg3 && arg4 + 1 == arg5 && (field1057[arg3][arg5] & 0x20) == 0) {
				return true;
			}

			if (arg2 == arg3 && arg4 - 1 == arg5 && (field1057[arg3][arg5] & 0x2) == 0) {
				return true;
			}

			if (arg2 - 1 == arg3 && arg4 == arg5 && (field1057[arg3][arg5] & 0x8) == 0) {
				return true;
			}

			if (arg2 + 1 == arg3 && arg4 == arg5 && (field1057[arg3][arg5] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("KZCDTFDB.b(IIIIIIZ)Z")
	public boolean method417(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg2 == arg5 && arg0 == arg4) {
			return true;
		}

		arg5 -= field1053;
		arg0 -= field1054;
		arg2 -= field1053;
		arg4 -= field1054;
		if (arg1 == 6 || arg1 == 7) {
			if (arg1 == 7) {
				arg3 = arg3 + 2 & 0x3;
			}

			if (arg3 == 0) {
				if (arg2 + 1 == arg5 && arg0 == arg4 && (field1057[arg5][arg0] & 0x80) == 0) {
					return true;
				}

				if (arg2 == arg5 && arg4 - 1 == arg0 && (field1057[arg5][arg0] & 0x2) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (arg2 - 1 == arg5 && arg0 == arg4 && (field1057[arg5][arg0] & 0x8) == 0) {
					return true;
				}

				if (arg2 == arg5 && arg4 - 1 == arg0 && (field1057[arg5][arg0] & 0x2) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (arg2 - 1 == arg5 && arg0 == arg4 && (field1057[arg5][arg0] & 0x8) == 0) {
					return true;
				}

				if (arg2 == arg5 && arg4 + 1 == arg0 && (field1057[arg5][arg0] & 0x20) == 0) {
					return true;
				}
			} else if (arg3 == 3) {
				if (arg2 + 1 == arg5 && arg0 == arg4 && (field1057[arg5][arg0] & 0x80) == 0) {
					return true;
				}

				if (arg2 == arg5 && arg4 + 1 == arg0 && (field1057[arg5][arg0] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg1 == 8) {
			if (arg2 == arg5 && arg4 + 1 == arg0 && (field1057[arg5][arg0] & 0x20) == 0) {
				return true;
			}

			if (arg2 == arg5 && arg4 - 1 == arg0 && (field1057[arg5][arg0] & 0x2) == 0) {
				return true;
			}

			if (arg2 - 1 == arg5 && arg0 == arg4 && (field1057[arg5][arg0] & 0x8) == 0) {
				return true;
			}

			if (arg2 + 1 == arg5 && arg0 == arg4 && (field1057[arg5][arg0] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("KZCDTFDB.a(BIIIIIII)Z")
	public boolean method418(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg0 + arg2 - 1;
		int var9 = arg1 + arg5 - 1;
		if (arg3 >= arg2 && arg3 <= var8 && arg6 >= arg5 && arg6 <= var9) {
			return true;
		}

		if (arg2 - 1 == arg3 && arg6 >= arg5 && arg6 <= var9 && (field1057[arg3 - field1053][arg6 - field1054] & 0x8) == 0 && (arg4 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg3 && arg6 >= arg5 && arg6 <= var9 && (field1057[arg3 - field1053][arg6 - field1054] & 0x80) == 0 && (arg4 & 0x2) == 0) {
			return true;
		}

		if (arg5 - 1 == arg6 && arg3 >= arg2 && arg3 <= var8 && (field1057[arg3 - field1053][arg6 - field1054] & 0x2) == 0 && (arg4 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg6 && arg3 >= arg2 && arg3 <= var8 && (field1057[arg3 - field1053][arg6 - field1054] & 0x20) == 0 && (arg4 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
