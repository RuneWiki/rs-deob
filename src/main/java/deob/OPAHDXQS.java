package deob;

@ObfuscatedName("OPAHDXQS")
public class OPAHDXQS {

	@ObfuscatedName("OPAHDXQS.i")
	public int field1010 = 0;

	@ObfuscatedName("OPAHDXQS.j")
	public int field1011 = 0;

	@ObfuscatedName("OPAHDXQS.k")
	public int field1012;

	@ObfuscatedName("OPAHDXQS.l")
	public int field1013;

	@ObfuscatedName("OPAHDXQS.m")
	public int[][] field1014;

	public OPAHDXQS(int arg0, int arg1) {
		field1012 = arg1;
		field1013 = arg0;
		field1014 = new int[field1012][field1013];
		method371();
	}

	@ObfuscatedName("OPAHDXQS.a()V")
	public void method371() {
		for (int var1 = 0; var1 < field1012; var1++) {
			for (int var2 = 0; var2 < field1013; var2++) {
				if (var1 == 0 || var2 == 0 || field1012 - 1 == var1 || field1013 - 1 == var2) {
					field1014[var1][var2] = 0xFFFFFF;
				} else {
					field1014[var1][var2] = 0x1000000;
				}
			}
		}
	}

	@ObfuscatedName("OPAHDXQS.a(IIZIII)V")
	public void method372(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
		arg2 -= field1010;
		arg3 -= field1011;
		if (arg4 == 0) {
			if (arg0 == 0) {
				method375(arg2, arg3, 128);
				method375(arg2 - 1, arg3, 8);
			}

			if (arg0 == 1) {
				method375(arg2, arg3, 2);
				method375(arg2, arg3 + 1, 32);
			}

			if (arg0 == 2) {
				method375(arg2, arg3, 8);
				method375(arg2 + 1, arg3, 128);
			}

			if (arg0 == 3) {
				method375(arg2, arg3, 32);
				method375(arg2, arg3 - 1, 2);
			}
		}

		if (arg4 == 1 || arg4 == 3) {
			if (arg0 == 0) {
				method375(arg2, arg3, 1);
				method375(arg2 - 1, arg3 + 1, 16);
			}

			if (arg0 == 1) {
				method375(arg2, arg3, 4);
				method375(arg2 + 1, arg3 + 1, 64);
			}

			if (arg0 == 2) {
				method375(arg2, arg3, 16);
				method375(arg2 + 1, arg3 - 1, 1);
			}

			if (arg0 == 3) {
				method375(arg2, arg3, 64);
				method375(arg2 - 1, arg3 - 1, 4);
			}
		}

		if (arg4 == 2) {
			if (arg0 == 0) {
				method375(arg2, arg3, 130);
				method375(arg2 - 1, arg3, 8);
				method375(arg2, arg3 + 1, 32);
			}

			if (arg0 == 1) {
				method375(arg2, arg3, 10);
				method375(arg2, arg3 + 1, 32);
				method375(arg2 + 1, arg3, 128);
			}

			if (arg0 == 2) {
				method375(arg2, arg3, 40);
				method375(arg2 + 1, arg3, 128);
				method375(arg2, arg3 - 1, 2);
			}

			if (arg0 == 3) {
				method375(arg2, arg3, 160);
				method375(arg2, arg3 - 1, 2);
				method375(arg2 - 1, arg3, 8);
			}
		}

		if (arg1) {
			if (arg4 == 0) {
				if (arg0 == 0) {
					method375(arg2, arg3, 0x10000);
					method375(arg2 - 1, arg3, 4096);
				}

				if (arg0 == 1) {
					method375(arg2, arg3, 1024);
					method375(arg2, arg3 + 1, 16384);
				}

				if (arg0 == 2) {
					method375(arg2, arg3, 4096);
					method375(arg2 + 1, arg3, 0x10000);
				}

				if (arg0 == 3) {
					method375(arg2, arg3, 16384);
					method375(arg2, arg3 - 1, 1024);
				}
			}

			if (arg4 == 1 || arg4 == 3) {
				if (arg0 == 0) {
					method375(arg2, arg3, 512);
					method375(arg2 - 1, arg3 + 1, 8192);
				}

				if (arg0 == 1) {
					method375(arg2, arg3, 2048);
					method375(arg2 + 1, arg3 + 1, 32768);
				}

				if (arg0 == 2) {
					method375(arg2, arg3, 8192);
					method375(arg2 + 1, arg3 - 1, 512);
				}

				if (arg0 == 3) {
					method375(arg2, arg3, 32768);
					method375(arg2 - 1, arg3 - 1, 2048);
				}
			}

			if (arg4 == 2) {
				if (arg0 == 0) {
					method375(arg2, arg3, 66560);
					method375(arg2 - 1, arg3, 4096);
					method375(arg2, arg3 + 1, 16384);
				}

				if (arg0 == 1) {
					method375(arg2, arg3, 5120);
					method375(arg2, arg3 + 1, 16384);
					method375(arg2 + 1, arg3, 0x10000);
				}

				if (arg0 == 2) {
					method375(arg2, arg3, 20480);
					method375(arg2 + 1, arg3, 0x10000);
					method375(arg2, arg3 - 1, 1024);
				}

				if (arg0 == 3) {
					method375(arg2, arg3, 81920);
					method375(arg2, arg3 - 1, 1024);
					method375(arg2 - 1, arg3, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("OPAHDXQS.a(IZIBIII)V")
	public void method373(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg1) {
			var7 += 0x20000;
		}

		arg5 -= field1010;
		arg0 -= field1011;

		if (arg2 == 1 || arg2 == 3) {
			int var8 = arg4;
			arg4 = arg3;
			arg3 = var8;
		}

		for (int var9 = arg5; var9 < arg4 + arg5; var9++) {
			if (var9 >= 0 && var9 < field1012) {
				for (int var10 = arg0; var10 < arg0 + arg3; var10++) {
					if (var10 >= 0 && var10 < field1013) {
						method375(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("OPAHDXQS.a(III)V")
	public void method374(int arg0, int arg1) {
		arg0 -= field1010;
		arg1 -= field1011;
		field1014[arg0][arg1] |= 0x200000;
	}

	@ObfuscatedName("OPAHDXQS.b(III)V")
	public void method375(int arg0, int arg1, int arg2) {
		field1014[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("OPAHDXQS.b(IIZIII)V")
	public void method376(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
		arg3 -= field1010;
		arg0 -= field1011;
		if (arg2 == 0) {
			if (arg4 == 0) {
				method378(128, arg3, arg0);
				method378(8, arg3 - 1, arg0);
			}

			if (arg4 == 1) {
				method378(2, arg3, arg0);
				method378(32, arg3, arg0 + 1);
			}

			if (arg4 == 2) {
				method378(8, arg3, arg0);
				method378(128, arg3 + 1, arg0);
			}

			if (arg4 == 3) {
				method378(32, arg3, arg0);
				method378(2, arg3, arg0 - 1);
			}
		}

		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				method378(1, arg3, arg0);
				method378(16, arg3 - 1, arg0 + 1);
			}

			if (arg4 == 1) {
				method378(4, arg3, arg0);
				method378(64, arg3 + 1, arg0 + 1);
			}

			if (arg4 == 2) {
				method378(16, arg3, arg0);
				method378(1, arg3 + 1, arg0 - 1);
			}

			if (arg4 == 3) {
				method378(64, arg3, arg0);
				method378(4, arg3 - 1, arg0 - 1);
			}
		}

		if (arg2 == 2) {
			if (arg4 == 0) {
				method378(130, arg3, arg0);
				method378(8, arg3 - 1, arg0);
				method378(32, arg3, arg0 + 1);
			}

			if (arg4 == 1) {
				method378(10, arg3, arg0);
				method378(32, arg3, arg0 + 1);
				method378(128, arg3 + 1, arg0);
			}

			if (arg4 == 2) {
				method378(40, arg3, arg0);
				method378(128, arg3 + 1, arg0);
				method378(2, arg3, arg0 - 1);
			}

			if (arg4 == 3) {
				method378(160, arg3, arg0);
				method378(2, arg3, arg0 - 1);
				method378(8, arg3 - 1, arg0);
			}
		}

		if (arg1) {
			if (arg2 == 0) {
				if (arg4 == 0) {
					method378(0x10000, arg3, arg0);
					method378(4096, arg3 - 1, arg0);
				}

				if (arg4 == 1) {
					method378(1024, arg3, arg0);
					method378(16384, arg3, arg0 + 1);
				}

				if (arg4 == 2) {
					method378(4096, arg3, arg0);
					method378(0x10000, arg3 + 1, arg0);
				}

				if (arg4 == 3) {
					method378(16384, arg3, arg0);
					method378(1024, arg3, arg0 - 1);
				}
			}

			if (arg2 == 1 || arg2 == 3) {
				if (arg4 == 0) {
					method378(512, arg3, arg0);
					method378(8192, arg3 - 1, arg0 + 1);
				}

				if (arg4 == 1) {
					method378(2048, arg3, arg0);
					method378(32768, arg3 + 1, arg0 + 1);
				}

				if (arg4 == 2) {
					method378(8192, arg3, arg0);
					method378(512, arg3 + 1, arg0 - 1);
				}

				if (arg4 == 3) {
					method378(32768, arg3, arg0);
					method378(2048, arg3 - 1, arg0 - 1);
				}
			}

			if (arg2 == 2) {
				if (arg4 == 0) {
					method378(66560, arg3, arg0);
					method378(4096, arg3 - 1, arg0);
					method378(16384, arg3, arg0 + 1);
				}

				if (arg4 == 1) {
					method378(5120, arg3, arg0);
					method378(16384, arg3, arg0 + 1);
					method378(0x10000, arg3 + 1, arg0);
				}

				if (arg4 == 2) {
					method378(20480, arg3, arg0);
					method378(0x10000, arg3 + 1, arg0);
					method378(1024, arg3, arg0 - 1);
				}

				if (arg4 == 3) {
					method378(81920, arg3, arg0);
					method378(1024, arg3, arg0 - 1);
					method378(4096, arg3 - 1, arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("OPAHDXQS.a(ZIBIIII)V")
	public void method377(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg0) {
			var7 += 0x20000;
		}

		arg1 -= field1010;
		arg5 -= field1011;

		if (arg4 == 1 || arg4 == 3) {
			int var8 = arg2;
			arg2 = arg3;
			arg3 = var8;
		}

		for (int var9 = arg1; var9 < arg1 + arg2; var9++) {
			if (var9 >= 0 && var9 < field1012) {
				for (int var10 = arg5; var10 < arg3 + arg5; var10++) {
					if (var10 >= 0 && var10 < field1013) {
						method378(var7, var9, var10);
					}
				}
			}
		}
	}

	@ObfuscatedName("OPAHDXQS.a(IIII)V")
	public void method378(int arg0, int arg1, int arg2) {
		field1014[arg1][arg2] &= 0xFFFFFF - arg0;
	}

	@ObfuscatedName("OPAHDXQS.c(III)V")
	public void method379(int arg0, int arg1) {
		arg0 -= field1010;
		arg1 -= field1011;
		field1014[arg0][arg1] &= 0xDFFFFF;
	}

	@ObfuscatedName("OPAHDXQS.a(IIIIIII)Z")
	public boolean method380(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg2 && arg3 == arg5) {
			return true;
		}

		arg0 -= field1010;
		arg3 -= field1011;
		arg2 -= field1010;
		arg5 -= field1011;
		if (arg1 == 0) {
			if (arg4 == 0) {
				if (arg2 - 1 == arg0 && arg3 == arg5) {
					return true;
				}

				if (arg0 == arg2 && arg5 + 1 == arg3 && (field1014[arg0][arg3] & 0x1280120) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg5 - 1 == arg3 && (field1014[arg0][arg3] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (arg0 == arg2 && arg5 + 1 == arg3) {
					return true;
				}

				if (arg2 - 1 == arg0 && arg3 == arg5 && (field1014[arg0][arg3] & 0x1280108) == 0) {
					return true;
				}

				if (arg2 + 1 == arg0 && arg3 == arg5 && (field1014[arg0][arg3] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (arg2 + 1 == arg0 && arg3 == arg5) {
					return true;
				}

				if (arg0 == arg2 && arg5 + 1 == arg3 && (field1014[arg0][arg3] & 0x1280120) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg5 - 1 == arg3 && (field1014[arg0][arg3] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 3) {
				if (arg0 == arg2 && arg5 - 1 == arg3) {
					return true;
				}

				if (arg2 - 1 == arg0 && arg3 == arg5 && (field1014[arg0][arg3] & 0x1280108) == 0) {
					return true;
				}

				if (arg2 + 1 == arg0 && arg3 == arg5 && (field1014[arg0][arg3] & 0x1280180) == 0) {
					return true;
				}
			}
		}

		if (arg1 == 2) {
			if (arg4 == 0) {
				if (arg2 - 1 == arg0 && arg3 == arg5) {
					return true;
				}

				if (arg0 == arg2 && arg5 + 1 == arg3) {
					return true;
				}

				if (arg2 + 1 == arg0 && arg3 == arg5 && (field1014[arg0][arg3] & 0x1280180) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg5 - 1 == arg3 && (field1014[arg0][arg3] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (arg2 - 1 == arg0 && arg3 == arg5 && (field1014[arg0][arg3] & 0x1280108) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg5 + 1 == arg3) {
					return true;
				}

				if (arg2 + 1 == arg0 && arg3 == arg5) {
					return true;
				}

				if (arg0 == arg2 && arg5 - 1 == arg3 && (field1014[arg0][arg3] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (arg2 - 1 == arg0 && arg3 == arg5 && (field1014[arg0][arg3] & 0x1280108) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg5 + 1 == arg3 && (field1014[arg0][arg3] & 0x1280120) == 0) {
					return true;
				}

				if (arg2 + 1 == arg0 && arg3 == arg5) {
					return true;
				}

				if (arg0 == arg2 && arg5 - 1 == arg3) {
					return true;
				}
			} else if (arg4 == 3) {
				if (arg2 - 1 == arg0 && arg3 == arg5) {
					return true;
				}

				if (arg0 == arg2 && arg5 + 1 == arg3 && (field1014[arg0][arg3] & 0x1280120) == 0) {
					return true;
				}

				if (arg2 + 1 == arg0 && arg3 == arg5 && (field1014[arg0][arg3] & 0x1280180) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg5 - 1 == arg3) {
					return true;
				}
			}
		}

		if (arg1 == 9) {
			if (arg0 == arg2 && arg5 + 1 == arg3 && (field1014[arg0][arg3] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg2 && arg5 - 1 == arg3 && (field1014[arg0][arg3] & 0x2) == 0) {
				return true;
			}

			if (arg2 - 1 == arg0 && arg3 == arg5 && (field1014[arg0][arg3] & 0x8) == 0) {
				return true;
			}

			if (arg2 + 1 == arg0 && arg3 == arg5 && (field1014[arg0][arg3] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("OPAHDXQS.b(IIIIIII)Z")
	public boolean method381(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg3 == arg5 && arg2 == arg4) {
			return true;
		}

		arg3 -= field1010;
		arg4 -= field1011;
		arg5 -= field1010;
		arg2 -= field1011;
		if (arg1 == 6 || arg1 == 7) {
			if (arg1 == 7) {
				arg0 = arg0 + 2 & 0x3;
			}

			if (arg0 == 0) {
				if (arg5 + 1 == arg3 && arg2 == arg4 && (field1014[arg3][arg4] & 0x80) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg2 - 1 == arg4 && (field1014[arg3][arg4] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (arg5 - 1 == arg3 && arg2 == arg4 && (field1014[arg3][arg4] & 0x8) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg2 - 1 == arg4 && (field1014[arg3][arg4] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (arg5 - 1 == arg3 && arg2 == arg4 && (field1014[arg3][arg4] & 0x8) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg2 + 1 == arg4 && (field1014[arg3][arg4] & 0x20) == 0) {
					return true;
				}
			} else if (arg0 == 3) {
				if (arg5 + 1 == arg3 && arg2 == arg4 && (field1014[arg3][arg4] & 0x80) == 0) {
					return true;
				}

				if (arg3 == arg5 && arg2 + 1 == arg4 && (field1014[arg3][arg4] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg1 == 8) {
			if (arg3 == arg5 && arg2 + 1 == arg4 && (field1014[arg3][arg4] & 0x20) == 0) {
				return true;
			}

			if (arg3 == arg5 && arg2 - 1 == arg4 && (field1014[arg3][arg4] & 0x2) == 0) {
				return true;
			}

			if (arg5 - 1 == arg3 && arg2 == arg4 && (field1014[arg3][arg4] & 0x8) == 0) {
				return true;
			}

			if (arg5 + 1 == arg3 && arg2 == arg4 && (field1014[arg3][arg4] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("OPAHDXQS.a(IIIIIIII)Z")
	public boolean method382(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg0 + arg6 - 1;
		int var9 = arg1 + arg4 - 1;
		if (arg5 >= arg6 && arg5 <= var8 && arg2 >= arg1 && arg2 <= var9) {
			return true;
		}

		if (arg6 - 1 == arg5 && arg2 >= arg1 && arg2 <= var9 && (field1014[arg5 - field1010][arg2 - field1011] & 0x8) == 0 && (arg3 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg5 && arg2 >= arg1 && arg2 <= var9 && (field1014[arg5 - field1010][arg2 - field1011] & 0x80) == 0 && (arg3 & 0x2) == 0) {
			return true;
		}

		if (arg1 - 1 == arg2 && arg5 >= arg6 && arg5 <= var8 && (field1014[arg5 - field1010][arg2 - field1011] & 0x2) == 0 && (arg3 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg2 && arg5 >= arg6 && arg5 <= var8 && (field1014[arg5 - field1010][arg2 - field1011] & 0x20) == 0 && (arg3 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
